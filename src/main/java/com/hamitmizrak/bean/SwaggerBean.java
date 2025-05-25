package com.hamitmizrak.bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerBean {

    // Swagger/OpenAPI Konfigürasyonu
    @Bean
    public OpenAPI getOpenAPIMethod() {
        return new OpenAPI()
                .info(new Info()
                        .title("Master Computer Engineer Hamit Mızrak")
                        .version("V1.0.0")
                        .description("Spring Boot & React Js & DevOps ile geliştirilmiş REST API projesi")
                        .termsOfService("https://software.inc/terms")
                        .contact(new Contact()
                                .name("Hamit Mızrak")
                                .email("hamitmizrak@gmail.com")
                                .url("https://github.com/HamitMizrak")
                        )
                        .license(new License()
                                .name("License INC XYZ")
                                .url("https://github.com/HamitMizrak")
                        )
                )

                // Güvenlik gereksinimleri (JWT için)
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))

                // Güvenlik şeması (JWT Bearer Token için)
                .components(new Components()
                        .addSecuritySchemes("bearerAuth",
                                new SecurityScheme()
                                        .name("bearerAuth")
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                        )
                );
    }
} //end SwaggerBean
