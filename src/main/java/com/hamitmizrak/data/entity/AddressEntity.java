package com.hamitmizrak.data.entity;

import com.hamitmizrak.audit.AuditingAwareBaseEntity;
import com.hamitmizrak.data.embeddable.AddressEntityEmbeddable;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// Entity
@Entity(name="Addreses") // JPQL için kullanılacak varlıkları özelleştirmek için
@Table(name = "addresses") // Database Tablo adı

// Address(1) - Customer(1)
public class AddressEntity extends AuditingAwareBaseEntity implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID=1L;

    // FIELD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Embedded
    @Embedded
    private AddressEntityEmbeddable addressEntityEmbeddable;


    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="system_created_date")
    private Date systemCreatedDate;

    // RELATION

} //end  AddressDto