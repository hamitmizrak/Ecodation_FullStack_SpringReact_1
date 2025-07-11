# 2025 Backend-1 Spring Boot
[GitHub Address](https://github.com/hamitmizrak/techcareer_2025_backend_1.git)
---

`@Column` anotasyonu içinde doğrudan bir varsayılan değer tanımlamak için, veritabanında kullanılan **SQL default değeri** belirtilebilir. Ancak, JPA'nın kendisi Java alanına doğrudan bir varsayılan değer atanmasını desteklemez. Bunun yerine, **veritabanı seviyesinde** varsayılan bir değer tanımlayabilirsiniz.

Aşağıda `@Column` içinde varsayılan değer kullanımı gösterilmiştir:

---

### Veritabanı Seviyesinde Varsayılan Değer Atama

```java
import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'Default description'")
    private String description;

    // Varsayılan yapıcı
    public AddressEntity() {}

    // Getter ve Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
```

---

### Açıklamalar

- **`columnDefinition`**:
    - `columnDefinition` özelliği, sütunun veritabanında nasıl oluşturulacağını belirtir.
    - Bu örnekte, `description` alanı için varsayılan değer `"Default description"` olarak tanımlandı.

- **Veritabanı Üzerinde Oluşturulan SQL**:
    - JPA bu alan için veritabanında şu SQL sorgusunu oluşturur:
      ```sql
      CREATE TABLE addresses (
          id BIGINT AUTO_INCREMENT NOT NULL,
          description VARCHAR(255) DEFAULT 'Default description',
          PRIMARY KEY (id)
      );
      ```

- **Dikkat Edilmesi Gerekenler**:
    - `columnDefinition` kullanımı veritabanına bağlıdır. Örneğin, MySQL, PostgreSQL veya başka bir veritabanı motoru kullanıyorsanız, `DEFAULT` ifadesinin desteklenip desteklenmediğini kontrol etmelisiniz.
    - Java kodunda varsayılan değeri değiştirdiğinizde, bu değişiklik veritabanına otomatik olarak yansımayabilir. Bu nedenle, **schema migration** araçları (ör. Flyway, Liquibase) kullanmanız önerilir.

---

### Java Seviyesinde Varsayılan Değerle Kombinasyon

Eğer hem Java seviyesinde hem de veritabanı seviyesinde varsayılan değer kullanmak istiyorsanız, şu şekilde birleştirebilirsiniz:

```java
import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'Default description'")
    private String description = "Default description"; // Java seviyesi varsayılan

    // Varsayılan yapıcı
    public AddressEntity() {}

    @PrePersist
    private void setDefaultDescription() {
        if (this.description == null || this.description.isEmpty()) {
            this.description = "Default description"; // @PrePersist ile kontrol
        }
    }

    // Getter ve Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
```

---

### Çalışma Prensibi

- **Java Seviyesi**:
    - Java'da `description` alanına bir değer atanmazsa, varsayılan olarak `"Default description"` değeri atanır.
- **Veritabanı Seviyesi**:
    - Eğer `description` sütununa bir değer belirtilmeden kayıt oluşturulursa, veritabanı `"Default description"` değerini kullanır.

---

### Örnek Kullanım

```java
AddressEntity address = new AddressEntity();
System.out.println(address.getDescription()); // "Default description"
```

---

### Özet

- **@Column** ile `columnDefinition` kullanarak veritabanında varsayılan değer belirtebilirsiniz.
- Java seviyesinde varsayılan değer tanımlayarak, uygulama seviyesinde tutarlılık sağlayabilirsiniz.
- Her iki yöntemin bir arada kullanımı, hem uygulama hem de veritabanı tarafında varsayılan değerlerin yönetimini kolaylaştırır.

---
### **@PrePersist** Anotasyonu Nedir?

`@PrePersist`, bir **Entity** veritabanına ilk kez kaydedilmeden önce çağrılan bir JPA yaşam döngüsü (lifecycle) olayını temsil eder. Bu anotasyon, bir **Entity** nesnesi üzerinde belirli işlemleri otomatik olarak gerçekleştirmek için kullanılır. Özellikle, bir kaydın oluşturulmasından hemen önce, bazı alanların varsayılan değerlerle doldurulması veya iş kurallarına göre ayarlanması gerektiğinde kullanılır.

---

### **@PrePersist** Nasıl Çalışır?

- **Çalışma Zamanı**:
   - `@PrePersist` anotasyonu ile işaretlenen bir yöntem, `EntityManager.persist()` çağrıldığında ve veritabanına kaydedilmeden hemen önce otomatik olarak tetiklenir.

- **Amaç**:
   - Varsayılan değerlerin atanması.
   - İş kuralları doğrultusunda bazı alanların dinamik olarak doldurulması.
   - Audit (oluşturulma tarihi veya kullanıcı bilgisi gibi) verilerinin otomatik eklenmesi.

---

### **@PrePersist Kullanım Adımları**

#### 1. **Yöntem Tanımlama**
- `@PrePersist` ile işaretlenen bir yöntem, `private`, `protected` veya `public` olabilir.
- Bu yöntem hiçbir parametre almaz ve `void` türünde olmalıdır.

#### 2. **Varsayılan Değer Atama**
Bir Entity'deki alanların varsayılan değerlerini ayarlamak için kullanılır.

---

### **Örnek: `@PrePersist` ile Varsayılan `country` Alanı**

Aşağıda `private String country` alanı için bir varsayılan değer atanmasını gösteren bir örnek bulunmaktadır:

#### **Entity Tanımı**

```java
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "addresses")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'Default description'")
    private String description;

    @Column(name = "country", nullable = false)
    private String country; // Varsayılan olarak "Unknown" atanacak

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    // Varsayılan Yapıcı
    public AddressEntity() {}

    // @PrePersist ile Varsayılan Değer Atama
    @PrePersist
    private void prePersistDefaults() {
        // Varsayılan değer atama
        if (this.country == null || this.country.isEmpty()) {
            this.country = "Unknown";
        }

        // Oluşturulma zamanını ayarla
        if (this.createdAt == null) {
            this.createdAt = LocalDateTime.now();
        }
    }

    // Getter ve Setter Metotları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
```

---

### **Bu Örnekte `@PrePersist` Ne Yapar?**

1. **`country` Alanı İçin Varsayılan Değer Atama**:
   - Eğer `country` alanı `null` veya boş (`""`) ise, varsayılan olarak `"Unknown"` atanır.

2. **`createdAt` Alanı İçin Varsayılan Değer Atama**:
   - `createdAt` alanı, kayıt oluşturulmadan hemen önce mevcut zaman damgasıyla doldurulur.

---

### **Çalışma Senaryosu**

#### Örnek Kullanım

```java
public class MainApp {
    public static void main(String[] args) {
        AddressEntity address = new AddressEntity();
        address.setDescription("My Address");

        // 'country' set edilmezse varsayılan değer atanır
        System.out.println("Country before persist: " + address.getCountry());

        // Entity veritabanına kaydediliyor
        // EntityManager.persist(address);

        System.out.println("Country after persist: " + address.getCountry());
    }
}
```

#### Çıktı:

```plaintext
Country before persist: null
Country after persist: Unknown
```

---

### **`@PrePersist` Kullanmanın Avantajları**

1. **Kod Tekrarını Azaltır**:
   - Varsayılan değerlerin manuel olarak her nesne oluşturulduğunda atanması gerekmez.

2. **Otomasyon Sağlar**:
   - Veritabanına ekleme işleminden önce dinamik değerler ayarlanır.

3. **Standartlaştırılmış İş Kuralları**:
   - Aynı varsayılan değerlerin her zaman atanmasını sağlar.

4. **Audit İşlemlerini Kolaylaştırır**:
   - Oluşturulma zamanı veya kullanıcı bilgisi gibi alanlar otomatik olarak doldurulabilir.

---

### **Daha Gelişmiş Kullanımlar**

#### 1. **Spring Security ile Entegrasyon**
Eğer kullanıcı bilgisi almak gerekiyorsa (örneğin, `createdBy` alanı), Spring Security ile entegre edilebilir:

```java
@PrePersist
private void setCreatedBy() {
    this.createdBy = SecurityContextHolder.getContext().getAuthentication().getName();
}
```

#### 2. **UUID ile Varsayılan ID Atama**
UUID kullanarak benzersiz bir ID atanabilir:
```java
@PrePersist
private void setUniqueId() {
    if (this.id == null) {
        this.id = UUID.randomUUID().toString();
    }
}
```

---

### **Sonuç**

- `@PrePersist`, bir Entity'nin veritabanına eklenmeden önce belirli alanların ayarlanmasını sağlayan güçlü bir araçtır.
- Özellikle varsayılan değerlerin atanması, zaman damgalarının eklenmesi veya iş kurallarına uygun doğrulama yapılması gerektiğinde kullanılır.
- Spring Security, UUID gibi diğer mekanizmalarla birleştirildiğinde çok daha esnek ve güçlü bir hale gelir.