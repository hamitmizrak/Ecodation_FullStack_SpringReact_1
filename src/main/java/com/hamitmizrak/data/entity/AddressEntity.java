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
@Entity(name = "Addresses") // name="Addresses" => Relation için name yazdım
@Table(
        name = "addresses" // name="addresses" => Database tablo adı için ekledim
        /*
        ,
        schema = "public", // Postgresql vb yapılarında şema yapısını destekleten veri tablarında tabloya erişim için kullanılır.
        catalog = "blog", //  Mysql vb gibi veritabanlarında kullanırız.
        indexes = {  // Sık sorgulanan sutunlarda indeksleme yaparak veritabanı sorgu performansını artırır.
                @Index(name = "idx_address_city", columnList = "city", unique = false),
                @Index(name = "idx_address_state", columnList = "state", unique = false), //default:false ancak true yaparsak: Indeksin benzersiz olmasını sağlar
        },
        uniqueConstraints = { //
                @UniqueConstraint(columnNames = {"address_qr_code"}) //=> benzersiz sutun verisi için
        }
        */
)

// AddressEntity(1) - CustomerEntity(1)
public class AddressEntity extends AuditingAwareBaseEntity {

    // FIELD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Embedded
    // Dikkat: IRepository Delivered Query için `addressEntityEmbeddable.address` şeklinde yazalır.
    @Embedded
    private AddressEntityEmbeddable addressEntityEmbeddable;

    // Soft Delete (Yumuşak Silme)
    // Verileri silmek database çok doğru bir davranış değildir.
    // Bunun yerine kullanıcıya silindiği gösterip database
    @Builder.Default
    private Boolean isDeleted = false;

    // Database tablosundaki sutunlarda olmasın ancak Java Class'larında olsun
    @Transient
    private String temporaryData;

    // Optimitistik Kilitlenme (Optimistic Locking)
    // Entity'timizin versiyonlararak saklanması
    /*
     Transaction çok uzun süre zarfında açık kalmışsa bu noktada, Version ile çözmeyere çalışırız.
     Optimistic Locking: Veri tabanında kaydın güncellenmesi sırasında veri tutarlılığını sağlamak istiyorsak
     buradan @Version kullanırız. Eğer bu kayıdın işlem başlandı ve eşlenme devam etmiyorsa güncelleme reddecek ve bir hata
     fırlatacak: OptimistikcLockException

     Çözüm olarak: Optimistic Locking kullanarak temel mekanizmamızda Entity üzerinde yazdığımız @Version alanında tanımlananan,
     güncelleme işlemlerinde her zaman değeri otomatik artırım sağlarak çözümlenir.

     Select * From Addresses Where id=1;
     update Addresses SET city="Malatya", version=version+1 where id=1 AND version =1;
    */
    @Version
    private int version;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "system_created_date")
    private Date systemCreatedDate;

    // RELATION
    // Address(1) - Customer(1)
    @OneToOne(mappedBy = "addressCustomerEntity",fetch =FetchType.LAZY)
    private CustomerEntity customerEntity;

} //end  AddressEntity
