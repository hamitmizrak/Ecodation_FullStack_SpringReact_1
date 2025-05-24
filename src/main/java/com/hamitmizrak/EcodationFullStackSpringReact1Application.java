package com.hamitmizrak;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.TimeZone;

// Mongo aktif etmek ici
// @EnableMongoRepositories

// Aspect aktif etmek icin
// @EnableAspectJAutoProxy(proxyTargetClass = true)

// Asenkron açmak icin
// @EnableAsync

// SCAN
//@EntityScan(basePackages = "com.hamitmizrak.techcareer_2025_backend_1.data.entity")//Entity bulamadığı zaman
//@EnableJpaRepositories(basePackages = "com.hamitmizrak.techcareer_2025_backend_1.data.repository") //Repository bulamadığı zaman
//@ComponentScan("com")

// Spring Cache aktif etmek gerekiyor.
// @EnableCaching

// Auditing Aktif etmek
// Dikkat: public class AuditingAwareBean içindeki method ismi:auditorAwareBeanMethod
@EnableJpaAuditing(auditorAwareRef = "auditingAwareBeanMethod")

// Spring Security: Şimdilik dahil etme, çünkü Bcrypted kullancağım ancak Spring security için gerekli kütüphaneleri dahil
// Buradaki exclude ne zaman kapatmam gerekiyor ? cevap: Spring Security ile çalıştığımız zaman kapat
@SpringBootApplication(exclude = {
        // Spring Security Dahil etme
        //SecurityAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class

        // JWT
        // Spring Security JWT kullanmak için exclude yapmamalıyız.......
        // org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        // org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class,

        // REDIS
        // Eğer Redis bağımlılığını kaldırmak istemiyorsanız ancak Redis yapılandırmasını devre dışı bırakmak istiyorsanız
        // RedisAutoConfiguration.class,
}
)
//@SpringBootApplication
public class EcodationFullStackSpringReact1Application {

    // Normal Constructor
    public EcodationFullStackSpringReact1Application() {
        System.out.println("@SpringBootApplication => Constructor");
    }

    // PostConstruct
    // Örneğin, veri hazırlığı, bağlantı oluşturma, bir değişkenin başlatılması gibi işlemler burada yapılabilir.
    // Bu metod, sınıfın constructor'ından sonra, ancak herhangi bir metodun çağrılmasından önce çalışır.
    @PostConstruct
    public void examplePostConstruct() {
        System.out.println("@SpringBootApplication => PostConstruct");
    }

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }


    public static void main(String[] args) {

        // devtools active isActive
        //System.setProperty("spring.devtools.restart.enabled","true");

        // PORT Ayarlamak
        /*
        SpringApplication app = new SpringApplication(ThySpringbootRedisApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "4444"));
        app.run(args);
         */

        // JOptional pane aktif etmek
        System.setProperty("java.awt.headless", "false");

        // Main
        SpringApplication.run(EcodationFullStackSpringReact1Application.class, args);
    }
}
