package com.hamitmizrak.data.entity;

import com.hamitmizrak.audit.AuditingAwareBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
//@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// ENTITY
@Entity(name = "Blogs") // Sql JOIN için yazdım
@Table(name = "blog")

// Blog(N)  Category(1)
public class BlogEntity extends AuditingAwareBaseEntity implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID = 1L;

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="blog_id",unique = true,nullable = false,insertable = true,updatable = false)
    private Long blogId;


    // HEADER
    @Column(
            name = "header",
            nullable = false,
            unique = true,
            length = 500,
            insertable = true,
            updatable = true,
            columnDefinition = "varchar(255) default 'blog için başlık girilmedi'")
    private String header;

    // CONTENT
    @Lob
    @Column(name = "content", columnDefinition = "varchar(255) default 'blog için içerik girilmedi'")
    private String content;

    // TITLE
    private String title;

    // IMAGE
    private String image;

   /*
   Javada olsun Database(Entity) olmasının
   @Transient
    private Object specialData;
    */

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemCreatedDate;

    //  RELATION
    // Blog(N)  Category(1)
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="category_id",nullable = false)
    private BlogCategoryEntity blogCategoryBlogEntity;

} //end class
