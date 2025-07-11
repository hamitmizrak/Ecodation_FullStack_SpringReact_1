package com.hamitmizrak.data.entity;

import com.hamitmizrak.audit.AuditingAwareBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// LOMBOK
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

// ENTITY
@Entity(name = "BlogCategories") // Sql JOIN için yazdım
@Table(name = "blogCategory")

// Category(1) Blog(N)
public class BlogCategoryEntity extends AuditingAwareBaseEntity implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID = 1L;

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id",unique = true,nullable = false,insertable = true,updatable = false)
    private Long categoryId;

    // CATEGORY NAME
    @Column(name = "category_name")
    private String categoryName;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemCreatedDate;

    // Constructor (parametreli)
    public BlogCategoryEntity(String categoryName) {
        this.categoryName = categoryName;
    }

    // Constructor (parametreli)
    public BlogCategoryEntity(String categoryName, List<BlogEntity> relationBlogEntityList) {
        this.categoryName = categoryName;
        this.blogCategoryBlogEntityList = relationBlogEntityList;
    }

    //////////////////////////////////////////////////////////////////////////////////////
    // COMPOSITION
    // RELATION
    // BlogCategory(1) - Blog(N)
    @OneToMany(mappedBy = "blogCategoryBlogEntity",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<BlogEntity> blogCategoryBlogEntityList;

} //end class
