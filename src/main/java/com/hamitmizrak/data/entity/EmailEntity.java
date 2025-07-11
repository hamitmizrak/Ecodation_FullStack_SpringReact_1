package com.hamitmizrak.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

// LOMBOK
@Data // @Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
//@SneakyThrows
// RoleDto

// ENTITY
@Entity(name = "Emails")
@Table(name = "email")
// Email(1) Register(1)
public class EmailEntity extends BaseEntity implements Serializable {

    // SERILESTIRME
    public static final Long serialVersionUID = 1L;

    // Kime
    @Column(name = "email_to")
    private String emailTo;

    // Kimden (Gönderen)
    @Column(name = "email_from")
    private String emailFrom;

    // Konu
    @Column(name = "email_subject")
    private String emailSubject;

    // İçerik
    @Column(name = "email_text")
    private String emailText;

    // CC: public
    @Column(name = "email_cc")
    private String emailCc;

    // BCC: private
    @Column(name = "email_bcc")
    private String emailBcc;

    // Resim
    @Lob //Büyük nesneler için kullandım
    private String image="image.png";

    // URL
    @Column(name = "url")
    private String URL="http://localhost:4444/";
} // end class EmailEntity