package com.hamitmizrak.examples.javacore.project.controller;

import com.hamitmizrak.controller.TeacherController;
import com.hamitmizrak.dao.RegisterDao;
import com.hamitmizrak.dao.StudentDao;
import com.hamitmizrak.dao.TeacherDao;
import com.hamitmizrak.dto.*;
import com.hamitmizrak.utils.SpecialColor;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

// Login Register
public class LoginRegisterController {

    // ✅ Loglama
    private static final Logger logger = Logger.getLogger(LoginRegisterController.class.getName());

    // ✅ Field
    private final Scanner scanner = new Scanner(System.in);

    // ✅ Injection
    private final RegisterDao registerDao;
    private final StudentDao studentDao;
    private final TeacherDao teacherDao;
    private final StudentController studentController;
    private final TeacherController teacherController;

    // ✅ Parametresiz Constructor
    public LoginRegisterController() {
        registerDao = new RegisterDao();
        studentDao = new StudentDao();
        teacherDao = new TeacherDao();
        studentController = new StudentController();
        teacherController = new TeacherController();
    }

    // ✅ is User Role
    public void isUserRole(RegisterDto registerDto) {
        switch (registerDto.getRole()) {
            case "STUDENT" -> studentController.choose();
            case "TEACHER" -> teacherController.choose();
            default -> System.out.println("Yetkilendirilme yapılmamıştır. Yönetici ile iletişime geçin.");
        }
    }

    // ✅ Login
    // hamitmizrak@gmail.com root
    public void login() {
        int maxAttempts = 3;
        Map<String, Integer> loginAttempts = new HashMap<>();

        while (true) {
            System.out.println("\n==== GİRİŞ EKRANI ====");
            System.out.print("Email: ");
            String email = scanner.nextLine().trim();
            System.out.print("Şifre: ");
            String password = scanner.nextLine().trim();


            //hamitmizrak@gmail.com  root
            Optional<RegisterDto> findIsEmail = registerDao.findByEmail(email);
            if (findIsEmail.isPresent()) {
                RegisterDto user = findIsEmail.get();

                // Hesabınız Kilitli
                if (user.isLocked()) {
                    System.out.println("Hesabınız kilitli.");
                    return;
                }

                // Şifre
                System.out.println("Kullanıcı şifre: " + RegisterDto.encryptPassword(password));
                System.out.println("1.alan: " + user.getPassword());
                System.out.println("2.alan: " + user.validatePassword(password));

                // Database kontrol
                System.out.println();
                if (user.getEmailAddress().equals(email) && user.validatePassword(password)) {
                    System.out.println(SpecialColor.GREEN + "✅ Başarıyla giriş yaptınız " + SpecialColor.RESET);
                    isUserRole(user);
                    break;
                } else {
                    loginAttempts.put(email, loginAttempts.getOrDefault(email, 0) + 1);
                    int remaining = maxAttempts - loginAttempts.get(email);
                    System.out.println("Hata: Kullanıcı adı veya şifre yanlış. Kalan hakkınız: " + remaining);

                    if (remaining == 0) {
                        user.setLocked(true);
                        registerDao.update(user.getId(), user);
                        System.out.println("Hata: 3 yanlış giriş nedeniyle hesap kilitlendi.");
                        return;
                    }
                }
            } else {
                System.out.println("Kullanıcı bulunamadı! Önce kayıt olmalısınız.");
                register();
            }
        }
    }

    // ✅ Register
    private void register() {
        System.out.println("\n" + SpecialColor.BLUE + " Yeni Kullanıcı Kaydı" + SpecialColor.RESET);
        String name, surname, email, nickname, password;
        LocalDate birthDate;
        ERole role;

        System.out.print("Name: ");
        name = scanner.nextLine().trim();
        System.out.print("Surname: ");
        surname = scanner.nextLine().trim();
        System.out.print("Nickname: ");
        nickname = scanner.nextLine().trim();
        System.out.print("Email: ");
        email = scanner.nextLine().trim();
        System.out.print("Şifre: ");
        password = scanner.nextLine().trim();

        while (true) {
            try {
                System.out.print("Role giriniz (STUDENT, TEACHER): ");
                role = ERole.valueOf(scanner.nextLine().trim().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Hatalı giriş! Lütfen doğru rolü girin (STUDENT, TEACHER).");
            }
        }

        while (true) {
            try {
                System.out.print("Doğum Tarihi (YYYY-MM-DD) : ");
                birthDate = LocalDate.parse(scanner.nextLine().trim());
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Hatalı tarih formatı! Lütfen tekrar deneyin (YYYY-MM-DD).");
            }
        }

        int generatedId = registerDao.generateNewId();
        RegisterDto register;
        if (role == ERole.STUDENT) {
            System.out.print("Öğrenci Türünüz (UNDERGRADUATE, GRADUATE, PHD, OTHER): ");
            EStudentType studentType = EStudentType.valueOf(scanner.nextLine().trim().toUpperCase());
            StudentDto student = new StudentDto(generatedId, name, surname, birthDate, studentType, role);

            // ✅ Şifre düz hali gönderiliyor, şifreleme içeride yapılacak
            register = new RegisterDto(generatedId, nickname, email, password, "STUDENT", false, student, null, false);
            studentDao.create(student);
        } else {
            System.out.print("Uzmanlık Alanınız (MATHEMATICS, CHEMISTRY, BIOLOGY, HISTORY, COMPUTER_SCIENCE, OTHER): ");
            ETeacherSubject eTeacherSubject = ETeacherSubject.valueOf(scanner.nextLine().trim().toUpperCase());
            System.out.print("Deneyim yılınızı giriniz: ");
            int yearsOfExperience = scanner.nextInt();
            System.out.print("Maaş bilginizi giriniz: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            TeacherDto teacher = new TeacherDto(generatedId, name, surname, birthDate, eTeacherSubject, yearsOfExperience, false, salary);

            // ✅ Şifre düz hali gönderiliyor, şifreleme içeride yapılacak
            register = new RegisterDto(generatedId, nickname, email, password, "TEACHER", false, null, teacher, false);
            teacherDao.create(teacher);
        }

        registerDao.create(register);
        System.out.println("Kayıt İşlemi başarılı! Giriş yapabilirsiniz.");
        System.out.println();
    }
}