package com.hamitmizrak.data.entity;

import com.hamitmizrak.audit.AuditingAwareBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// ENTITY
@Entity(name = "Products") // JPQL için kullanılacak varlıklar için özelleştirme için
@Table(name = "product") // Database tablo adı

// Product(N) - Order(M)
public class ProductEntity extends AuditingAwareBaseEntity {

    // FIELD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // FIRST NAME
    private String name;

    // LASTNAME
    private String code;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "system_created_date")
    private Date systemCreatedDate;

    ///////////////////////////////////////////////////////////////////////////
    // RELATION
    @ManyToMany(mappedBy = "orderProductEntityList",fetch = FetchType.LAZY)
    List<OrderEntity> productOrderEntityList;

} //end  ProductEntity

