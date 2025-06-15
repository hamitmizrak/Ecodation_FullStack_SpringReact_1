package com.hamitmizrak.data.entity;

import com.hamitmizrak.audit.AuditingAwareBaseEntity;
import com.hamitmizrak.business.dto.OrderDto;
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


// @NamedQuery anotasyonu ile tanımlanan statik sorgulardır.
@NamedQueries({
        @NamedQuery(name = "CustomerEntity.findAllCustomers", query = "SELECT c FROM Customers c"),
        @NamedQuery(name = "CustomerEntity.findBylastName", query = "SELECT c FROM Customers c WHERE c.lastName = :lastName"),
        @NamedQuery(name = "CustomerEntity.findWithNotes", query = "SELECT c FROM Customers c WHERE c.notes LIKE :notes")
})

// ENTITY
@Entity(name = "Customers") // name="Customers" => Relation için name yazdım
@Table(
        name = "customers" // name="customers" => Database tablo adı için ekledim
        /*
        ,
        schema = "public", // Postgresql vb yapılarında şema yapısını destekleten veri tablarında tabloya erişim için kullanılır.
        catalog = "blog", //  Mysql vb gibi veritabanlarında kullanırız.
        indexes = {  // Sık sorgulanan sutunlarda indeksleme yaparak veritabanı sorgu performansını artırır.
                @Index(name = "idx_lastName", columnList = "city", unique = false),
                @Index(name = "idx_lastName", columnList = "state", unique = false), //default:false ancak true yaparsak: Indeksin benzersiz olmasını sağlar
        },
        uniqueConstraints = { //
                @UniqueConstraint(columnNames = {"lastName"}) //=> benzersiz sutun verisi için
        }
        */
)
// Customer(1) - Address(1)
public class CustomerEntity extends AuditingAwareBaseEntity {

    // FIELD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // FIRST NAME
    @Column(name = "first_name")
    private String firstName;

    // LASTNAME
    @Column(name = "last_name")
    private String lastName;

    // NOTES
    @Column(name = "notes")
    private String notes;

    // Optimitistik Kilitlenme (Optimistic Locking)
    // Entity'timizin versiyonlararak saklanması
    /*
     Transaction çok uzun süre zarfında açık kalmışsa bu noktada, Version ile çözmeyere çalışırız.
     Optimistic Locking: Veri tabanında kaydın güncellenmesi sırasında veri tutarlılığını sağlamak istiyorsak
     buradan @Version kullanırız. Eğer bu kayıdın işlem başlandı ve eşlenme devam etmiyorsa güncelleme reddecek ve bir hata
     fırlatacak: OptimistikcLockException

     Çözüm olarak: Optimistic Locking kullanarak temel mekanizmamızda Entity üzerinde yazdığımız @Version alanında tanımlananan,
     güncelleme işlemlerinde her zaman değeri otomatik artırım sağlarak çözümlenir.

     Select * From Customers Where id=1;
     update Customers SET lastname="Mızrak", version=version+1 where id=1 AND version =1;
    */
    @Version
    private int version;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "system_created_date")
    private Date systemCreatedDate;

    // RELATION
    // Customer(1) - Adress(1)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id", referencedColumnName = "id",unique=true)
    private AddressEntity addressCustomerEntity;

    ////////////////////////////////////////////////////////////////////////////
    // RELATION
    // COMPOSITION
    // Customer(1) - Order(N)
    @OneToMany(mappedBy = "customerOrderEntity", fetch = FetchType.LAZY)
    private List<OrderEntity> orderCustomerEntityList;

} //end  CustomerEntity

