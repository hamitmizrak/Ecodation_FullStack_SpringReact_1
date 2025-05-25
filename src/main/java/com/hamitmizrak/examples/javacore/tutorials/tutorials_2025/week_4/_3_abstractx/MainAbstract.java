package com.hamitmizrak.examples.javacore.tutorials.tutorials_2025.week_4._3_abstractx;

public class MainAbstract {

    public static void main(String[] args) {
        // (instance: Örnekler)
        System.out.println("** STUDENT **");
        StudentDto studentDto2 = new StudentDto(1, "Ahmet", "Yılmaz");
        studentDto2.fullName();
        System.out.println(studentDto2);

        System.out.println("** TEACHER **");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setId(1);
        teacherDto.setName("Hamit");
        studentDto2.fullName();
        System.out.println(teacherDto);

        // NORMAL ŞARTLARDA EĞER INHERITANCE OLSAYDI YAPABİLİRDİK ANCAK ABSTRACT OLMAZ
        Person person= new StudentDto(); //polymorhism

        StudentDto student= new StudentDto();// ınstance
        //student.getStudentCode()

    }
}
