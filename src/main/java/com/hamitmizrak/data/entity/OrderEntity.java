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
@Entity(name = "Orders") // JPQL için kullanılacak varlıklar için özelleştirme için
@Table(name = "orders") // Database tablo adı

// Customer(1) - Address(1)
// Order(N) - Product(M)
public class OrderEntity extends AuditingAwareBaseEntity {

    // FIELD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // FIRST NAME
    private String name;

    // LASTNAME
    private String price;

    // NOTES
    private String notes;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "system_created_date")
    private Date systemCreatedDate;

    // RELATION
    // Order(N) - Customer(1)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id", referencedColumnName = "id",unique=true)
    private CustomerEntity customerOrderEntity;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(  // Eğer ManyToMany ilişkisi olan verilerimiz varsa 1 tane daha tabloya ihtiyacımız vardır
            name = "order_product",
            joinColumns = @JoinColumn(name="order_id"),
            inverseJoinColumns = @JoinColumn(name="product_id")
    )
    private List<ProductEntity> orderProductEntityList;

} //end  CustomerEntity

