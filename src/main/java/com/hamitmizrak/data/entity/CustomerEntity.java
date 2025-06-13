package com.hamitmizrak.data.entity;

import com.hamitmizrak.audit.AuditingAwareBaseEntity;
import com.hamitmizrak.data.embeddable.AddressEntityEmbeddable;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// ENTITY
@Entity(name = "Customers") // JPQL için kullanılacak varlıklar için özelleştirme için
@Table(name = "customers") // Database tablo adı

// Customer(1) - Address(1)
public class CustomerEntity extends AuditingAwareBaseEntity {

    // FIELD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // FIRSTNAME
    @Column(name="first_name")
    private String firstName;

    // LASTNAME
    @Column(name="last_name")
    private String lastName;

    // NOTES
    private String notes;


    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "system_created_date")
    private Date systemCreatedDate;

    // RELATION
    // Customer(1) - Address(1)
    @OneToOne(cascade =CascadeType.ALL )
    @JoinColumn(name = "address_id", referencedColumnName ="id", unique = true )
    private AddressEntity addressCustomerRelationEntiy;


} //end  AddressEntity
