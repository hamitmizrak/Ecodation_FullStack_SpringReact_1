# Java Ecodation Full Stack-1 Spring Boot
**Spring Boot**
---

[GitHub](https://github.com/hamitmizrak/Ecodation_FullStack_SpringReact_1)

## Project GitHub clone 
```sh
git clone https://github.com/hamitmizrak/Ecodation_FullStack_SpringReact_1
```
---

## Version
```sh
git -v
java --version
javac --version
mvn -v
docker version
docker -v
docker-compose version
```
---


## Git Init
```sh 
git init
git add .
git commit -m "spring boot init"
git remote add origin URL
git push -u origin master

git clone https://github.com/hamitmizrak/Ecodation_FullStack_SpringReact_1
```
---

## Git Codes
```sh
git status
git logs

```


### Örnek Kodu Açıklaması:
```java
private ApiResult apiResult;
@PostConstruct
public void springData() {
    apiResult = new ApiResult();
}
```
## Spring Framework Nedir ?
```sh 

```
---

Spring Framework, Java platformu üzerinde kurulu, açık kaynaklı ve popüler bir uygulama geliştirme çerçevesidir. Spring, özellikle kurumsal uygulamaların geliştirilmesini basitleştirmeyi hedefler. Bu çerçeve, uygulamalarda bağımlılık yönetimini ve uygulama mantığının modüler bir şekilde geliştirilmesini sağlar. Spring Framework, IoC (Inversion of Control - Denetim Ters Çevirme) ve DI (Dependency Injection - Bağımlılık Enjeksiyonu) gibi çekirdek özellikler üzerine kuruludur. Bu özellikler, geliştiricilerin yazılım bileşenlerini daha rahat bir şekilde yönetmelerine ve bağımlılıkları daha esnek bir şekilde tanımlamalarına olanak tanır.

### Spring Framework'ün Özellikleri

Spring Framework birçok modülden oluşur ve her modül, belirli bir işlevselliği sağlamaya yönelik tasarlanmıştır. Bu modüller, geliştiricilere uygulamanın çeşitli katmanlarını ele almada yardımcı olur. Başlıca özellikleri ve modülleri şunlardır:

1. **IoC (Inversion of Control) ve DI (Dependency Injection)**: Spring’in en temel özelliklerinden biri IoC prensibidir. IoC, nesnelerin bağımlılıklarının kendilerinin oluşturulması yerine dışarıdan yönetilmesi anlamına gelir. DI, bağımlılıkların nesneye dışarıdan verilmesi sürecidir. Bu sayede bağımlılıklar kolayca yönetilir ve test edilebilirlik artar.

2. **Aspect-Oriented Programming (AOP)**: AOP, çapraz kesen endişeleri ele almak için kullanılır. Örneğin, loglama, güvenlik gibi işlevler, AOP ile modüler hale getirilebilir. AOP, belirli görevleri (örneğin güvenlik veya loglama) uygulama mantığından ayırarak, bu görevlerin uygulamaya enjekte edilmesine olanak tanır. Spring’in AOP desteği, kullanıcıların özelleştirilebilir yöntemleri kullanarak uygulamaları daha yönetilebilir hale getirmelerini sağlar.

3. **Transaction Management (İşlem Yönetimi)**: Spring, veri tutarlılığını sağlamak için işlem yönetimi sağlar. Bu, özellikle veri tabanları ve diğer kaynaklarla yapılan işlemlerde oldukça önemlidir. Spring’in işlem yönetimi, programcıların işlem yönetimini kodlara fazla müdahale etmeden ele almalarına imkan tanır.

4. **Spring MVC (Model-View-Controller)**: Web tabanlı uygulamaların geliştirilmesi için kullanılan bir modüldür. MVC mimarisi üzerine kuruludur ve geliştiricilere hem basit hem de karmaşık web uygulamaları geliştirme imkanı tanır. Spring MVC, isteklere yanıt veren denetleyiciler, model-veri yönetimi ve görünüm şablonlarıyla güçlü bir yapı sunar.

5. **Spring Data**: Veritabanı işlemlerini basitleştiren bir modüldür. ORM (Object-Relational Mapping) araçlarıyla entegrasyonu sağlar (örneğin Hibernate ile). Spring Data, veritabanı işlemlerinde temel CRUD (Create, Read, Update, Delete) işlemlerini kolaylaştırır ve veri erişim katmanında tekrarlayan kodları minimize eder.

6. **Spring Boot**: Spring Framework’ün daha hızlı ve kolay kullanımını sağlamak için geliştirilmiş bir modüldür. Spring Boot, sıfırdan bir uygulama başlatmayı ve ayarlamayı çok kolay hale getirir. Otomatik yapılandırma özelliği sayesinde, birçok ayar dosyasını manuel olarak oluşturmanıza gerek kalmaz. Spring Boot aynı zamanda bağımsız çalışabilen bir jar dosyası oluşturma yeteneği sunar ve bu sayede uygulama dağıtımı oldukça kolaylaşır.

7. **Spring Security**: Uygulamalarda güvenliği sağlamak için kullanılan bir modüldür. Kimlik doğrulama ve yetkilendirme işlemlerini kolayca yönetmeyi sağlar. Spring Security, web tabanlı uygulamalarda oturum yönetimi, kimlik doğrulama, kullanıcı rolleri, erişim kontrolü gibi güvenlik özelliklerini sağlar.

8. **Spring Cloud**: Mikroservis mimarisi için özel olarak tasarlanmış bir modüldür. Mikroservisler arasındaki iletişim, yapılandırma yönetimi, yük dengeleme, hata toleransı gibi konularda çözüm sunar. Spring Cloud, mikroservis tabanlı uygulamalar için konfigürasyon yönetimi, servis keşfi, devre kesici (circuit breaker) gibi özellikler sunar.

9. **Spring Batch**: Batch (toplu) işlemleri yönetmek için kullanılan bir modüldür. Özellikle büyük veri işleme görevlerinde ve arka planda çalışan toplu işlerin yönetiminde kullanılır. Spring Batch, toplu işlemleri zamanlayarak ve iş akışlarını düzenleyerek veri işleme süreçlerini daha verimli hale getirir.

10. **Spring Integration**: Kurumsal entegrasyon desenlerini (EIP) destekleyen bir modüldür. Sistemler arası mesajlaşma, veri senkronizasyonu gibi işlemleri kolaylaştırır. Spring Integration, uygulamaların başka sistemlerle entegre çalışmasını sağlamak için güçlü bir yapı sunar.

### Spring Framework’ün Faydaları

- **Test Edilebilirlik**: Spring, DI ve IoC kullanarak nesneler arasındaki bağımlılıkları yönetir. Bu sayede nesneler bağımsız olarak test edilebilir hale gelir.
- **Modülerlik ve Esneklik**: Spring’in modüler yapısı, sadece ihtiyaç duyulan modüllerin kullanılmasına imkan tanır.
- **Açık Kaynak ve Topluluk Desteği**: Spring, açık kaynak kodlu bir çerçeve olduğundan sürekli güncellenir ve geniş bir topluluğa sahiptir.
- **Performans ve Verimlilik**: Spring Framework, işlem yönetimi ve veri erişim katmanı gibi birçok alanı optimize eder, bu da daha yüksek performans sağlar.
- **Kurumsal Düzeyde Uygulama Desteği**: Spring, büyük ölçekli kurumsal uygulamaların geliştirilmesinde yaygın olarak kullanılır. Özellikle Spring Cloud ve Spring Batch gibi modüller, büyük veri işlemlerinde ve mikroservis mimarilerinde iş yükünü azaltır.

### Örnek Kullanım Senaryosu

Bir e-ticaret uygulaması geliştirdiğinizi düşünelim. Bu uygulamada Spring Framework’ün sunduğu özellikler şu şekillerde kullanılabilir:

1. **Dependency Injection**: Uygulamadaki bileşenler arasındaki bağımlılıklar, DI sayesinde daha kolay yönetilir. Örneğin, bir ürün servisi (ProductService) ve bir veri erişim katmanı (ProductRepository) arasındaki bağımlılık DI ile sağlanabilir.

2. **Spring MVC**: Web tabanlı bir yapı olduğu için, Spring MVC kullanarak kullanıcıların ürünleri listeleyebileceği, sepete ekleyebileceği ve satın alabileceği bir arayüz oluşturulabilir.

3. **Spring Data**: Ürün, müşteri ve sipariş verileri bir veritabanında saklanabilir. Spring Data, bu veriler üzerinde CRUD işlemlerini basitleştirir.

4. **Spring Security**: Kullanıcı kimlik doğrulama ve yetkilendirme işlemleri için kullanılabilir. Örneğin, yalnızca yetkili kullanıcıların sipariş verebilmesini sağlamak için Spring Security ile güvenlik katmanı eklenebilir.

5. **Spring Cloud**: Mikroservis mimarisi tercih ediliyorsa, her hizmeti bağımsız servisler olarak geliştirmek için Spring Cloud modülleri kullanılabilir. Örneğin, ürün ve sipariş servisi ayrı ayrı mikroservisler olarak geliştirilebilir.

6. **Spring Batch**: Belirli zamanlarda çalıştırılması gereken veri işleme görevleri varsa (örneğin, günlük satış raporu oluşturmak gibi), Spring Batch ile bu işlemler otomatik olarak zamanlanabilir.

### Spring Framework’ün Mimari Bileşenleri

Spring Framework’ün çekirdeğinde IoC kapsayıcısı (container) bulunur. Bu kapsayıcı, uygulamadaki nesnelerin yaşam döngüsünü yönetir. IoC kapsayıcısı, XML tabanlı konfigürasyonlar, anotasyonlar veya Java tabanlı konfigürasyonlar ile yapılandırılabilir. Spring’in IoC kapsayıcısı, uygulama içinde kullanılan nesneleri otomatik olarak enjekte eder ve bu nesneler arasındaki bağımlılıkları yönetir.

### Sonuç

Spring Framework, Java tabanlı uygulamalar geliştirmek için güçlü ve esnek bir çerçevedir. Çekirdek modülleri ve kapsamlı modüler yapısıyla, hem küçük ölçekli hem de büyük ölçekli kurumsal uygulamalarda kullanılabilir. IoC ve DI gibi modern yazılım geliştirme ilkelerini benimsemesi, uygulamaların daha kolay yönetilebilir, genişletilebilir ve test edilebilir olmasını sağlar. Spring, geniş topluluk desteği ve güçlü ekosistemi ile, yazılım geliştirme sürecini hızlandırır ve geliştiricilere esnek bir yapı sunar.

Daha fazla bilgiye ihtiyacınız varsa veya herhangi bir modül hakkında ayrıntılı bir açıklama isterseniz, yardımcı olmaktan memnuniyet duyarım.

## Spring Bean Kavramı
```sh 

```
---

## 🔧 `@Bean` Anotasyonu Özellikleri

Spring Framework’te `@Bean` anotasyonu, bir metodun dönüş değerinin Spring IoC Container’a bir bean olarak kaydedileceğini belirtir. `@Bean`, aşağıdaki özellikleri alabilir:

| Özellik         | Açıklama                                                                              |
| --------------- | ------------------------------------------------------------------------------------- |
| `name`          | Bean’in ismini özelleştirmek için kullanılır. Aksi halde metodun ismi bean ismi olur. |
| `initMethod`    | Bean oluşturulduktan hemen sonra çalıştırılacak metodu tanımlar.                      |
| `destroyMethod` | Uygulama kapanırken bean yok edilmeden önce çalıştırılacak metodu tanımlar.           |
| `autowire`      | (Eski) Otomatik bağımlılık çözümleme stratejisini belirtir (genellikle kullanılmaz).  |

---

## ✅ Örnek Kullanım – Özellikleriyle Birlikte

Aşağıda `@Bean` anotasyonu tüm özellikleriyle kullanılmış bir örnek:

```java
@Bean(
    name = "customModelMapper",
    initMethod = "customInit",
    destroyMethod = "customDestroy"
)
public ModelMapper modelMapperMethod() {
    return new ModelMapper();
}
```

Ve aynı sınıf içinde aşağıdaki destekleyici metotlar bulunabilir:

```java
public void customInit() {
    System.out.println("ModelMapper init edildi.");
}

public void customDestroy() {
    System.out.println("ModelMapper yok edilirken çalıştı.");
}
```

> 💡 `name` yerine `@Bean("customModelMapper")` şeklinde de kullanılabilir.

---

## 🔍 Bean Yaşam Döngüsüne Etkisi

* `initMethod`: Bean oluşturulup container'a eklendikten hemen sonra çalışır.
* `destroyMethod`: Bean yok edilmeden hemen önce çalışır (özellikle `@Scope("singleton")` ise önemlidir).
* Spring Boot uygulamasında çoğu zaman bunlara gerek kalmaz ama özel durumlarda çok işe yarar (örneğin kaynak açma/kapama işlemleri gibi).

---

## Örneğin: ModelMapperBean

```java
@Configuration
public class ModelMapperBean {

    @Bean(name = "modelMapper", initMethod = "onInit", destroyMethod = "onDestroy")
    public ModelMapper modelMapperMethod() {
        return new ModelMapper();
    }

    public void onInit() {
        System.out.println("ModelMapper initialized.");
    }

    public void onDestroy() {
        System.out.println("ModelMapper destroyed.");
    }
}
```


package com.hamitmizrak.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperBean {

    /**
     * ModelMapper nesnesini Spring Context'e bean olarak tanımlar.
     * Bean ismi: "modelMapper"
     * initMethod: Bean oluşturulduktan hemen sonra çalışır
     * destroyMethod: Uygulama kapanırken çalışır
     */
    @Bean(name = "modelMapper", initMethod = "onInit", destroyMethod = "onDestroy")
    public ModelMapper modelMapperMethod() {
        return new ModelMapper();
    }

    /**
     * Bean oluşturulduğunda çalışacak metod
     */
    public void onInit() {
        System.out.println("✅ ModelMapper bean initialized.");
    }

    /**
     * Bean yok edilmeden önce çalışacak metod
     */
    public void onDestroy() {
        System.out.println("🧹 ModelMapper bean destroyed.");
    }
}



## Spring Data Nedir ?
```sh 

```
---
Spring Data, Spring Framework’ün bir parçası olup, veritabanı işlemlerini kolaylaştırmak ve veri erişim katmanında tutarlılığı sağlamak için tasarlanmış bir modüldür. Spring Data, farklı veri depoları ile (örneğin, ilişkisel veritabanları, NoSQL veritabanları, anahtar-değer depoları, grafik veritabanları) kolayca etkileşim kurulmasını sağlar ve bu veritabanları ile veri işlemlerini standartlaştırır.

Spring Data’nın temel amacı, veri erişim katmanında tekrarlayan kodları azaltmak ve veri işlemlerini daha kolay hale getirmektir. Spring Data, özellikle CRUD (Create, Read, Update, Delete) işlemlerini daha az kod yazarak gerçekleştirmeye olanak tanır ve veri erişim katmanının daha modüler ve yönetilebilir hale gelmesini sağlar.

### Spring Data’nın Faydaları ve Amacı

1. **Tekrarlayan Kodları Azaltır**: Veritabanı işlemleri için her defasında aynı CRUD kodlarını yazmak yerine, Spring Data bu işlemleri otomatik olarak oluşturur ve kod tekrarını en aza indirir.

2. **Çeşitli Veri Depolarıyla Uyumlu**: Spring Data, ilişkisel ve NoSQL veritabanları ile çalışabilen bir yapıya sahiptir. Bu, uygulamaların çok farklı veri depolarına kolayca entegre olmasını sağlar.

3. **Veritabanı İşlemlerini Basitleştirir**: Spring Data, depo (repository) arayüzleri aracılığıyla veri işlemlerini sadeleştirir. Veri işlemlerini daha okunabilir ve anlaşılır hale getiren metotlarla veri depolarına erişim sağlar.

4. **Dinamik Sorgular Oluşturur**: Spring Data, arayüz tanımlamaları aracılığıyla belirli kurallara dayalı olarak otomatik sorgular oluşturur. Örneğin, metot adlarına göre sorgular oluşturulabilir (Query Creation by Method Name).

5. **Transparan Veri Erişimi**: Spring Data, veri işlemleri sırasında hangi veritabanı teknolojisinin kullanıldığını kullanıcıdan gizler ve bu sayede, veri erişim işlemleri daha kolay ve standart hale gelir.

### Spring Data Modülleri

Spring Data, farklı veri türlerini ve veri yönetimi senaryolarını ele almak için çeşitli alt modüller içerir. Bu modüller, farklı veri depoları ile çalışmayı kolaylaştırır.

1. **Spring Data JPA**: Spring Data’nın en popüler modüllerinden biridir. Java Persistence API (JPA) üzerinde çalışan bir modüldür ve ilişkisel veritabanlarında ORM (Object-Relational Mapping) işlemlerini kolaylaştırır. Hibernate gibi JPA sağlayıcılarıyla entegre çalışır.

2. **Spring Data MongoDB**: NoSQL veritabanı olan MongoDB ile çalışmayı sağlar. MongoDB’nin özelliklerine özel olarak geliştirilmiş sınıflar ve işlemler içerir.

3. **Spring Data Redis**: Redis anahtar-değer veri deposuyla entegre çalışır. Redis, özellikle hızlı veri erişimi gereken durumlarda popülerdir ve Spring Data Redis, Redis ile hızlı ve kolay etkileşimi sağlar.

4. **Spring Data Cassandra**: Büyük veri uygulamaları için kullanılan Cassandra veritabanıyla entegre çalışır. Cassandra, yüksek ölçeklenebilirlik ve yüksek erişilebilirlik sunan bir NoSQL veritabanıdır.

5. **Spring Data Elasticsearch**: Elasticsearch arama ve analiz motoruyla çalışmak için geliştirilmiştir. Bu modül, hızlı arama ve analiz gereksinimleri olan uygulamalarda kullanılır.

6. **Spring Data JDBC**: JPA kullanmak istemeyen veya daha doğrudan SQL işlemleri yapmak isteyenler için basit bir JDBC tabanlı veri erişim modülüdür.

7. **Spring Data R2DBC**: Reactive Programming (tepkisel programlama) modelini destekleyen bir SQL veritabanı modülüdür. R2DBC, veri işlemlerinin asenkron olarak gerçekleştirilmesini sağlar.

### Spring Data Repository (Depo) Kavramı

Spring Data, veri erişim işlemlerini Repository adı verilen arayüzler üzerinden gerçekleştirir. Bu arayüzler, veri depolarıyla etkileşimi sağlar ve CRUD işlemlerini otomatik hale getirir. Spring Data, depo arayüzleri üzerinden veri erişim işlemlerini yapılandırmanızı sağlar ve karmaşık veri işlemleri için de ek işlevler sunar.

Spring Data Repository’leri üç ana kategoriye ayrılabilir:

1. **CrudRepository**: Temel CRUD işlemlerini destekleyen bir arayüzdür. `save`, `findById`, `findAll`, `deleteById` gibi metotlarla veri işlemlerini sağlar.

2. **JpaRepository**: CrudRepository’den türetilmiş ve ek JPA özellikleri sunan bir arayüzdür. Sayfalandırma (pagination) ve sıralama (sorting) gibi ek özellikler içerir.

3. **PagingAndSortingRepository**: Verilerin sayfalara bölünerek görüntülenmesi ve sıralanması gibi işlemleri destekleyen bir arayüzdür.

### Spring Data Repository Metotları

Spring Data, Repository arayüzlerine özel isimlendirme kuralları sayesinde sorguları dinamik olarak oluşturabilir. Örneğin, `findByFirstName(String firstName)` metodu, `firstName` alanına göre arama yapar. Metot adıyla sorgu oluşturma işlemi oldukça geniştir ve farklı işlemleri destekler:

- `findBy` ile başlayan metotlar: Veriyi koşula göre arama yapar.
- `countBy` ile başlayan metotlar: Verinin sayısını hesaplar.
- `deleteBy` ile başlayan metotlar: Belirli bir koşula göre veriyi siler.

Örneğin, bir müşteri deposu (CustomerRepository) için şu metotlar kullanılabilir:

```java
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    Customer findByEmail(String email);
    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
```

Bu metotlar sayesinde SQL sorgusu yazmaya gerek kalmadan veri işlemleri yapılabilir.

## Spring Data (deliveredQuery, named query, JPQL, native SQL)
```sh 

```
---

Bu dosyalardaki yapıyı kullanarak `deliveredQuery`, `named query`, `JPQL`, ve `native SQL` örnekleri oluşturabiliriz. İlgili örnekleri dosyalarınızdaki mevcut sınıflar üzerinden oluşturacağım.

### 1. Delivered Query
`Spring Data JPA` ile, metod isimlendirme kurallarına uyarak doğrudan yöntemler tanımlanabilir. Örneğin `IAddressRepository` arayüzünde bir adresin şehre göre aranmasını sağlayan bir `delivered query` tanımlayalım.

```java
public interface IAddressRepository extends JpaRepository<AddressEntity, Long> {
    
    // Şehre göre adresleri bulur
    List<AddressEntity> findByCity(String city);
}
```

Bu metod, otomatik olarak `city` alanına göre bir sorgu oluşturur.

### 2. Named Query
`@NamedQuery` ile tanımlanmış bir JPQL sorgusunu `AddressEntity` sınıfında tanımlayabiliriz. Örneğin, bir `named query` kullanarak `city` ve `postalCode` alanlarına göre arama yapalım.

`AddressEntity.java` dosyasına ekleyeceğimiz `@NamedQuery` örneği:

```java
@Entity
@NamedQuery(
    name = "AddressEntity.findByCityAndPostalCode",
    query = "SELECT a FROM AddressEntity a WHERE a.city = :city AND a.postalCode = :postalCode"
)
public class AddressEntity {
    // Mevcut alanlar ve diğer kodlar
}
```

Bu named query'i kullanmak için `IAddressRepository` arayüzüne bir metod ekleyebiliriz:

```java
public interface IAddressRepository extends JpaRepository<AddressEntity, Long> {

    @Query(name = "AddressEntity.findByCityAndPostalCode")
    List<AddressEntity> findByCityAndPostalCode(@Param("city") String city, @Param("postalCode") String postalCode);
}
```

### 3. JPQL Query
`JPQL` (Java Persistence Query Language) ile `@Query` anotasyonu kullanarak belirli kriterlere göre sorgular tanımlayabiliriz. Örneğin, tüm `city` alanı `null` olmayan adresleri getirecek bir JPQL sorgusu:

```java
public interface IAddressRepository extends JpaRepository<AddressEntity, Long> {

    @Query("SELECT a FROM AddressEntity a WHERE a.city IS NOT NULL")
    List<AddressEntity> findAllWithNonNullCity();
}
```

Bu yöntem, tüm `city` değeri dolu olan adresleri getirir.

### 4. Native SQL Query
`native SQL` kullanarak doğrudan SQL sorgusu çalıştırmak için `@Query` anotasyonunu `nativeQuery` özelliği ile kullanabiliriz. Örneğin, `city` alanına göre adresleri getiren bir native SQL sorgusu:

```java
public interface IAddressRepository extends JpaRepository<AddressEntity, Long> {

    @Query(value = "SELECT * FROM address_entity WHERE city = :city", nativeQuery = true)
    List<AddressEntity> findByCityNative(@Param("city") String city);
}
```

Bu sorgu doğrudan SQL kullanır ve `address_entity` tablosunda `city` değerine göre filtreleme yapar.

Bu örneklerde:
- `deliveredQuery` otomatik olarak `findBy` ile yapılır.
- `@NamedQuery` kullanarak sorguları doğrudan sınıfın üzerine tanımlayabiliriz.
- `JPQL` ile `@Query` anotasyonunda HQL benzeri sorgular yazabiliriz.
- `native SQL` ile direkt SQL komutları çalıştırabiliriz.

Her bir yöntem, sorgu ihtiyaçlarınıza göre kullanabileceğiniz esnek çözümler sağlar.


## Spring Boot (Delivered Query, Named Queries, JPQL ve Native SQL Nedir)
```sh 

```
---


### Delivered Query, Named Queries, JPQL ve Native SQL Nedir?

Bu kavramlar, Spring Data JPA ve JPA (Java Persistence API) çerçevesinde kullanılan çeşitli sorgulama yöntemleridir. Her birinin belirli özellikleri ve kullanım alanları vardır. Aşağıda, her birini ayrıntılı olarak açıklayarak, aralarındaki farkları ortaya koyacağız.

---

### 1. Delivered Query (Türetilmiş Sorgular)

**Delivered Query** veya **Türetilmiş Sorgular**, Spring Data JPA’nın sağladığı bir özelliktir. Spring Data, repository arayüzünde tanımlanan metod isimlerinden otomatik olarak sorgu oluşturur. Bu özellik, SQL veya JPQL sorgusu yazma ihtiyacını ortadan kaldırır ve metod isimlendirme kurallarına göre sorguları otomatik olarak türetir.

#### Delivered Query Nasıl Çalışır?

Spring Data JPA, repository metod adlarını analiz ederek, metod adındaki anahtar kelimeleri kullanarak bir sorgu oluşturur. Örneğin, metod adı `findByCity` ise, Spring Data, `city` alanına göre bir sorgu türetir.

#### Örnekler

```java
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
    List<AddressEntity> findByCity(String city);
}
```

Bu metod adı, Spring Data tarafından şu SQL sorgusuna dönüştürülür:

```sql
SELECT * FROM address_entity WHERE city = ?;
```

Spring Data ayrıca `And`, `Or`, `GreaterThan`, `LessThan` gibi çeşitli anahtar kelimelerle daha karmaşık sorgular türetebilir:

```java
List<AddressEntity> findByCityAndZipCode(String city, String zipCode);
```

Bu metod, `city` ve `zipCode` alanlarına göre bir sorgu oluşturur ve şu sorguya eşdeğerdir:

```sql
SELECT * FROM address_entity WHERE city = ? AND zip_code = ?;
```

#### Avantajları
- **Kolay Kullanım**: Metod isimlendirmesi ile sorgu oluşturmayı sağlar.
- **Bakımı Kolay**: Kodlar anlaşılır ve bakımı kolaydır.
- **Otomatik Optimizasyon**: Spring Data, türetilen sorguları optimize eder.

#### Dezavantajları
- **Karmaşık Sorgular İçin Kısıtlı**: Karmaşık sorgular türetmek zor olabilir.
- **Performans Kontrolü**: Otomatik olarak türetilen sorguların performansını kontrol etmek zor olabilir.

---

### 2. Named Queries

**Named Query (Adlandırılmış Sorgu)**, JPA'nın sağladığı, bir entity sınıfına bağlı olarak tanımlanan önceden tanımlı SQL veya JPQL sorgularıdır. Named Queries, `@NamedQuery` anotasyonu kullanılarak entity sınıfı üzerinde tanımlanır ve sorgu çalıştırılmak istendiğinde bu adı kullanarak çağrılır.

#### Named Query Tanımlama

`@NamedQuery` anotasyonu, entity sınıfı üzerinde sorguyu tanımlar. Örneğin:

```java
@Entity
@NamedQuery(
    name = "AddressEntity.findByCity",
    query = "SELECT a FROM AddressEntity a WHERE a.city = :city"
)
public class AddressEntity {
    // Alanlar ve metodlar...
}
```

Bu Named Query, `AddressEntity` sınıfına bağlıdır ve `city` parametresine göre sorgu yapar.

#### Named Query Kullanımı

Named Query'yi repository içinde `@Query` anotasyonunu kullanarak çağırabilirsiniz:

```java
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
    
    @Query(name = "AddressEntity.findByCity")
    List<AddressEntity> findAddressesByCity(@Param("city") String city);
}
```

#### Avantajları
- **Kod Tekrarını Azaltır**: Aynı sorguyu birden fazla yerde kullanma olanağı sağlar.
- **Daha Okunabilir Kodlar**: Karmaşık sorgular için daha anlaşılır kod sağlar.
- **Önceden Tanımlanmış Sorgular**: Sorgular önceden tanımlandığı için yönetimi kolaydır.

#### Dezavantajları
- **Performans Yönetimi**: Tüm Named Queries’in bellekte saklanması, performans etkisine neden olabilir.
- **Değiştirilebilirlik**: Sorguyu değiştirmek istediğinizde, entity sınıfında değişiklik yapmanız gerekebilir.

---

### 3. JPQL (Java Persistence Query Language)

**JPQL (Java Persistence Query Language)**, JPA'nın sağladığı, SQL'e benzeyen ama tamamen entity sınıflarına yönelik bir sorgulama dilidir. SQL’den farklı olarak JPQL, doğrudan veri tabanı tablolarına değil, Java sınıflarına ve alanlarına odaklanır.

#### JPQL Kullanımı

JPQL, repository metodları üzerinde `@Query` anotasyonu ile tanımlanabilir. JPQL'de entity sınıfı ve alan adları kullanılır:

```java
@Query("SELECT a FROM AddressEntity a WHERE a.city = :city")
List<AddressEntity> findByCity(@Param("city") String city);
```

Bu JPQL sorgusu, `city` alanına göre `AddressEntity` nesnelerini döndürür.

#### JPQL Operatörleri
JPQL, SQL gibi `SELECT`, `WHERE`, `JOIN`, `GROUP BY` ve `ORDER BY` gibi komutları destekler. JPQL ile ayrıca `IN`, `LIKE`, `BETWEEN`, `IS NULL` gibi operatörler de kullanılabilir.

#### Avantajları
- **Entity Odaklı**: JPQL, entity sınıflarına ve alanlara odaklandığından nesneye yönelik bir yaklaşım sunar.
- **Platform Bağımsız**: Veri tabanı bağımsız çalışır ve her veri tabanına uyum sağlar.

#### Dezavantajları
- **SQL’den Daha Az Esnek**: JPQL, SQL kadar esnek değildir ve bazı veri tabanı özel fonksiyonlarını desteklemeyebilir.
- **Performans Sorunları**: Karmaşık JPQL sorguları performans sorunlarına neden olabilir.

---

### 4. Native SQL

**Native SQL**, JPA'da doğrudan SQL sorguları yazma yöntemidir. Native SQL sorguları veri tabanına özgüdür ve SQL'in tüm özelliklerinden faydalanabilir. Native sorgular, `@Query` anotasyonu içinde `nativeQuery = true` parametresi ile kullanılır.

#### Native SQL Kullanımı

Aşağıda, doğrudan SQL sorgusu kullanan bir örnek verilmiştir:

```java
@Query(value = "SELECT * FROM address_entity WHERE city = ?1", nativeQuery = true)
List<AddressEntity> findByCityNative(String city);
```

Bu sorgu, doğrudan `address_entity` tablosundan `city` alanına göre veri çeker.

#### Avantajları
- **Tam SQL Desteği**: Veri tabanı özel fonksiyonları ve özellikleri kullanılabilir.
- **Performans**: Özelleştirilmiş ve optimize edilmiş sorgularla yüksek performans sağlar.
- **SQL’in Gücü**: SQL'in tüm özelliklerinden faydalanarak daha karmaşık işlemler yapılabilir.

#### Dezavantajları
- **Platform Bağımlılığı**: Native SQL sorguları, veri tabanına bağımlıdır ve taşınabilirlik sorunu oluşturabilir.
- **Kod Anlaşılır Olmayabilir**: SQL kodu, Java kodu ile iç içe geçtiğinde, kodun okunabilirliği azalabilir.

---

### Delivered Query, Named Query, JPQL ve Native SQL Arasındaki Farklar

| Özellik           | Delivered Query                       | Named Query                          | JPQL                                  | Native SQL                           |
|-------------------|--------------------------------------|--------------------------------------|---------------------------------------|--------------------------------------|
| **Tanım**         | Spring Data tarafından metod isimlerine göre türetilen sorgular | Entity sınıfında önceden tanımlanan sorgular | Entity sınıflarına yönelik SQL benzeri sorgu dili | Doğrudan veri tabanı SQL sorgusu |
| **Kullanım**      | Repository metod adı üzerinden       | `@NamedQuery` ile entity sınıfında   | `@Query` anotasyonu ile repository'de | `@Query` ile `nativeQuery=true`      |
| **Veri Tabanı Bağımlılığı** | Bağımsız                             | Bağımsız                             | Bağımsız                              | Veri tabanı bağımlı                  |
| **Esneklik**      | Düşük                                | Orta                                 | Yüksek                                | Çok yüksek                           |
| **Kod Anlaşılır mı?** | Evet                              | Evet                                 | Orta                                  | Hayır                                |
| **Performans**    | Orta                                 | Orta                                 | Orta                                  | Yüksek                               |
| **Uygulama Alanı**| Basit ve hızlı sorgular              | Tekrar eden karmaşık sorgular        | Orta seviye sorgular                  | Karmaşık ve özelleştirilmiş sorgular |

---

### Özet

- **Delivered Query**: Spring Data metod adlarına göre otomatik türetilen sorgular, basit ve hızlı işlemler için idealdir.
- **Named Query**: Entity sınıflarında önceden tanımlanan, tekrarlanan sorgular için kullanılan yapılar.
- **JPQL**: Java sınıflarına yönelik SQL benzeri bir sorgu dilidir. SQL'den farkı, tablo isimleri yerine Java entity sınıflarının kullanılmasıdır. Platform bağımsız çalışır ve SQL gibi `SELECT`, `WHERE`, `JOIN` gibi ifadeleri destekler. Daha nesneye yönelik bir sorgulama sağladığından, JPA’nın sunduğu standart özellikler çerçevesinde kompleks işlemler yapılabilir.
- **Native SQL**: Doğrudan SQL sorgularını kullanmamıza olanak tanır. Bu sayede SQL’in tüm özelliklerinden faydalanabiliriz. Native SQL, veri tabanına özgü sorgular yazmayı mümkün kılar, ancak platform bağımlılığı oluşturabilir. Karmaşık ve optimize edilmesi gereken işlemler için tercih edilir.

---

### Hangi Durumda Hangisini Kullanmalı?

1. **Basit Sorgular İçin**: `Delivered Query` tercih edilmelidir. Metod isimlerine göre türetilen bu sorgular, hızlıca basit işlemler yapmak için idealdir.

2. **Tekrarlayan veya Statik Sorgular İçin**: `Named Query` en uygun seçenektir. Sorguyu bir kere tanımlayıp farklı yerlerde kullanmak için idealdir.

3. **Orta Derecede Karmaşık Sorgular İçin**: `JPQL` daha iyi bir seçimdir. Entity odaklı ve veri tabanı bağımsız çalıştığı için taşınabilirliği yüksektir.

4. **Karmaşık veya Optimize Edilmiş Sorgular İçin**: `Native SQL` en iyi seçenektir. Veri tabanı özelliklerinden tam anlamıyla faydalanmak gerektiğinde ve yüksek performans gereken durumlarda native SQL tercih edilmelidir.

---

### Örnek Senaryo Uygulamaları

Aşağıda, her bir sorgulama yöntemi için örnek bir senaryo yer almaktadır:

#### Delivered Query Örneği

Bir kullanıcı adıyla (username) kullanıcıları listelemek için basit bir sorguya ihtiyaç duyduğunuzu düşünün. Bu durumda, metod ismine göre delivered query kullanabilirsiniz:

```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);
}
```

#### Named Query Örneği

Bir müşteri sınıfında (`CustomerEntity`) çok sık kullanılan bir sorgu olduğunu ve müşteri şehirlerine göre arama yapıldığını varsayalım. Bu sorguyu `CustomerEntity` içinde bir Named Query olarak tanımlayabiliriz:

```java
@Entity
@NamedQuery(
    name = "CustomerEntity.findByCity",
    query = "SELECT c FROM CustomerEntity c WHERE c.city = :city"
)
public class CustomerEntity {
    // Alanlar...
}
```

Daha sonra `CustomerRepository` içinde bu sorguyu şu şekilde kullanabiliriz:

```java
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    @Query(name = "CustomerEntity.findByCity")
    List<CustomerEntity> findByCity(@Param("city") String city);
}
```

#### JPQL Örneği

Bir `Product` entity’sinde fiyat aralığına göre ürünleri listelemek istediğinizi düşünelim. Bu durumda JPQL kullanarak sorguyu repository’de yazabilirsiniz:

```java
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice")
    List<Product> findProductsInPriceRange(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);
}
```

Bu sorgu, belirtilen fiyat aralığındaki ürünleri listeleyecektir.

#### Native SQL Örneği

Doğrudan SQL kullanarak optimize edilmiş bir sorgu yazmanız gerektiğinde Native SQL tercih edilir. Örneğin, bir `Employee` tablosunda en yüksek maaşı alan çalışanı listelemek için şu şekilde bir Native SQL sorgusu kullanılabilir:

```java
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "SELECT * FROM employee WHERE salary = (SELECT MAX(salary) FROM employee)", nativeQuery = true)
    List<Employee> findTopEarningEmployees();
}
```

---

### Sonuç ve Öneriler

Her bir sorgu türü farklı senaryolarda kullanıma uygundur. Uygulamanızın ihtiyaçlarına göre doğru sorgu türünü seçmek performans ve sürdürülebilirlik açısından büyük önem taşır:

- **Basit ve Hızlı Sorgular İçin**: `Delivered Query` tercih edin.
- **Tekrar Eden Sorgular İçin**: `Named Query` ile önceden tanımlanan sorguları kullanın.
- **Platform Bağımsız, Nesneye Yönelik Sorgular İçin**: `JPQL` kullanarak veri tabanı bağımsızlığını koruyun.
- **Optimize Edilmiş ve Karmaşık Sorgular İçin**: `Native SQL` kullanarak veri tabanının gücünden tam olarak faydalanın.

Bu dört sorgu türü sayesinde Spring Data JPA, her türlü veri tabanı sorgulama ihtiyacına esnek ve güçlü çözümler sunar.


## Spring Boot (Custom Queries (Özelleştirilmiş Sorgular))
```sh 

```
---

### Custom Queries (Özelleştirilmiş Sorgular)

Spring Data, bazı karmaşık sorgular için özel sorgular tanımlama imkanı da sunar. Bunun için iki ana yöntem vardır:

1. **@Query Anotasyonu**: Özel sorgular tanımlamak için kullanılan anotasyondur. Native SQL veya JPQL (Java Persistence Query Language) ile sorgular yazılabilir.

   ```java
   @Query("SELECT c FROM Customer c WHERE c.firstName = ?1 AND c.lastName = ?2")
   List<Customer> findByFirstAndLastName(String firstName, String lastName);
   ```

2. **Named Queries**: Entity sınıflarında tanımlanan, sabit isimli sorgulardır. Bu sorgular, genellikle Entity sınıfının başında tanımlanır ve isimlerine göre çağrılabilir.


Spring Boot ve JPA ile çalışırken veritabanına veri sorgulamak veya veri üzerinde işlemler gerçekleştirmek için iki ana sorgu türü kullanılır: **Native SQL** ve **JPQL (Java Persistence Query Language)**. Bu iki sorgu türü, JPA ile veri çekme veya güncelleme işlemlerinde esneklik sağlar, ancak kullanım alanları ve amaçları farklıdır. Aşağıda her iki yöntemin ayrıntılı bir açıklaması bulunmaktadır.

### 1. JPQL (Java Persistence Query Language)

JPQL, JPA ile birlikte kullanılan, nesne odaklı bir sorgulama dilidir. JPQL, doğrudan SQL sorgularına dayanmaz, bunun yerine **entity nesneleri üzerinden çalışır**. Bu, veri tabanındaki tablolarla değil, JPA entity sınıflarıyla etkileşim kurar. JPQL, entity nesneleri ve onların ilişkileri ile nesne yönelimli veri çekme işlemleri için tasarlanmıştır.

#### JPQL’in Özellikleri

- **Nesne Odaklıdır**: JPQL sorguları, veritabanı tabloları yerine Java sınıflarına göre yazılır. Bu nedenle SQL’den farklıdır; veri tabanındaki fiziksel tablo adları yerine Java sınıf adları ve alan adları kullanılır.
- **Veritabanı Bağımsızdır**: JPQL sorguları, JPA tarafından desteklenen herhangi bir veritabanında çalışacak şekilde soyutlanmıştır. JPQL, veritabanı bağımsız bir yapı sunduğundan, farklı veritabanları arasında geçiş yaparken kodda değişiklik yapma gereksinimi azaltır.
- **Kolay ve Güçlü**: JPQL, SQL’e benzer bir söz dizimine sahiptir, ancak nesneye yönelik olarak optimize edilmiştir. SQL sorgularına göre daha sade ve anlaşılırdır, özellikle karmaşık veri çekme işlemlerinde ilişki yönetimini daha kolay hale getirir.

#### JPQL Kullanımı

JPQL sorguları **@Query** anotasyonu ile yazılır veya bir `EntityManager` üzerinden çalıştırılabilir. JPQL'de temel olarak `SELECT`, `UPDATE`, `DELETE` ve `INSERT` komutları bulunur.

##### Örnek 1: JPQL ile Veri Çekme

Varsayalım bir **User** entity sınıfımız var ve bu entity üzerinden kullanıcıları yaşlarına göre çekmek istiyoruz.

```java
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private int age;
    // Getter ve Setter'lar
}
```

JPQL sorgusu ile kullanıcıları yaşlarına göre çekmek:

```java
@Query("SELECT u FROM User u WHERE u.age > :age")
List<User> findUsersOlderThan(@Param("age") int age);
```

Burada **User** entity’si ve **age** alanı doğrudan kullanılmıştır. JPQL sorgusunda tablo adı veya sütun adları yerine entity sınıfının adı ve özellikleri kullanılır.

##### Örnek 2: JPQL ile Güncelleme

JPQL aynı zamanda güncelleme işlemleri için de kullanılabilir.

```java
@Modifying
@Query("UPDATE User u SET u.age = :newAge WHERE u.id = :id")
int updateUserAge(@Param("id") Long id, @Param("newAge") int newAge);
```

Bu örnekte, belirli bir kullanıcı ID’sine sahip olan kaydın yaşını güncellemekteyiz.

#### JPQL’in Avantajları

- **Veritabanı bağımsızlığı**: JPQL sorguları, herhangi bir SQL varyantına bağlı kalmadan çalışabilir.
- **Nesne odaklılık**: Veritabanı tablolarına değil, entity nesnelerine dayanır.
- **Sade yapı**: JPQL, entity ilişkilerini daha sade ve anlaşılır bir şekilde yönetir, bu da daha temiz kod sağlar.

#### JPQL’in Dezavantajları

- **Karmaşık sorgularda sınırlamalar**: JPQL, bazı durumlarda çok karmaşık ve özel veritabanı işlemleri için yeterli olmayabilir.
- **Performans sınırlamaları**: Bazı özel performans gereksinimleri için JPQL yeterli olmayabilir, çünkü veritabanına özgü optimizasyonlardan yoksundur.

---

### 2. Native SQL

**Native SQL** sorguları, doğrudan SQL söz dizimini kullanarak yazılır. Bu sorgular, JPA'nın soyutlama katmanından geçmez, doğrudan veritabanına gönderilir. Native SQL, veritabanına özgü komutları veya optimizasyonları kullanmanıza olanak tanır, bu da karmaşık işlemlerde performans avantajı sağlar.

#### Native SQL’in Özellikleri

- **Veritabanı Odaklıdır**: SQL sorguları doğrudan veritabanı tabloları üzerinde çalışır, bu da karmaşık işlemler veya veritabanına özel komutlar gerektiğinde daha etkilidir.
- **Performans Avantajı Sağlar**: Özellikle büyük veri setleri üzerinde, veritabanına özgü optimizasyonlardan yararlanarak daha hızlı sonuçlar elde edilebilir.
- **SQL Söz Dizimi Kullanılır**: JPQL’in aksine, Native SQL sorguları doğrudan SQL komutları ile yazılır, bu da SQL bilen geliştiriciler için daha tanıdık olabilir.

#### Native SQL Kullanımı

**@Query** anotasyonunun içine **nativeQuery = true** parametresi eklenerek Native SQL sorgusu tanımlanabilir.

##### Örnek 1: Native SQL ile Veri Çekme

Yine **User** entity’sini ele alalım ve kullanıcıları yaşlarına göre çekmek için Native SQL sorgusu yazalım:

```java
@Query(value = "SELECT * FROM users WHERE age > :age", nativeQuery = true)
List<User> findUsersOlderThan(@Param("age") int age);
```

Burada doğrudan **users** tablosu üzerinden SQL komutu ile işlem yapılmaktadır. Veritabanı tablosu adı ve sütun adları doğrudan SQL söz dizimi ile belirtilmiştir.

##### Örnek 2: Native SQL ile Güncelleme

Native SQL ile bir güncelleme işlemi yapalım:

```java
@Modifying
@Query(value = "UPDATE users SET age = :newAge WHERE id = :id", nativeQuery = true)
int updateUserAge(@Param("id") Long id, @Param("newAge") int newAge);
```

Bu sorguda, doğrudan veritabanı tablosu ve sütun adları kullanılarak SQL sorgusu çalıştırılmaktadır.

#### Native SQL’in Avantajları

- **Veritabanına Özgü İşlemler**: Native SQL ile, JPQL’in sınırlarının ötesinde karmaşık sorgular veya veritabanına özel işlemler gerçekleştirebilirsiniz.
- **Performans Optimizasyonu**: Veritabanına özgü optimizasyonları kullanarak daha hızlı sorgular oluşturabilirsiniz.
- **Daha Fazla Esneklik**: Native SQL, JPQL'in sınırlamaları olan karmaşık sorguların üstesinden gelir ve daha esnek bir yapı sunar.

#### Native SQL’in Dezavantajları

- **Veritabanı Bağımlılığı**: Native SQL sorguları, belirli bir veritabanına özgü olduğunda, farklı bir veritabanına geçildiğinde çalışmayabilir.
- **Kod Karmaşıklığı**: SQL sorgularını doğrudan kullanmak, JPQL’e göre kodu daha karmaşık hale getirebilir.
- **Nesne Odaklı Değil**: Native SQL doğrudan tablo adları ve sütunlarla çalıştığı için nesne odaklı mimari ile tamamen uyumlu olmayabilir.

---

### JPQL ve Native SQL Arasındaki Farklar

| Özellik                  | JPQL                                  | Native SQL                             |
|--------------------------|---------------------------------------|----------------------------------------|
| Söz Dizimi               | Nesne odaklı, entity sınıflarına göre | Veritabanı odaklı, tablo ve sütun isimlerine göre |
| Veritabanı Bağımsızlığı  | Evet                                  | Hayır                                  |
| Performans               | Orta                                  | Yüksek (veritabanına özel optimizasyon)|
| Karmaşık Sorgu Desteği   | Sınırlı                               | Geniş                                  |
| Kullanım Kolaylığı       | Daha kolay ve anlaşılır               | SQL bilgisi gerektirir                 |

### Hangi Durumda Hangisini Kullanmalıyız?

- **Nesne Odaklı ve Basit Sorgular**: JPQL tercih edilmelidir. JPQL, nesne odaklı bir yapıya sahip olduğundan daha temiz ve anlaşılır kod sağlar.
- **Karmaşık veya Performans Gerektiren Sorgular**: Native SQL tercih edilebilir. Native SQL, doğrudan SQL sorgularını kullanmanıza izin verir, bu nedenle karmaşık işlemler için daha esnektir.

JPQL ve Native SQL, Spring Boot ve JPA ile çalışırken veritabanı işlemlerini optimize etmek için kullanabileceğiniz güçlü araçlardır. Tercih ettiğiniz yöntem, projenizin ihtiyaçlarına ve veritabanı yapınıza bağlı olarak değişiklik gösterebilir.

## Spring Boot ( Named Queries )
```sh 

```
---

Spring Boot ve JPA ile veri işlemleri gerçekleştirirken, sorguları yönetmek için **Named Queries**, **Native SQL**, ve **JPQL (Java Persistence Query Language)** gibi çeşitli seçenekler mevcuttur. Her biri farklı ihtiyaçlara göre kullanılır ve avantajlar ile dezavantajlar sunar. Bu üç yöntemin arasındaki farkları ve kullanım alanlarını ayrıntılı olarak açıklayacağım.

### Named Queries (Adlandırılmış Sorgular)

Named Queries, JPA ile birlikte tanımlanan ve belirli bir adı olan, tekrar kullanılabilir sorgulardır. Sorgular, genellikle entity sınıfları üzerinde **@NamedQuery** veya **@NamedNativeQuery** anotasyonları ile tanımlanır. Bu sayede, aynı sorgu birden fazla yerde kullanılması gerektiğinde kod tekrarı yapılmadan bu sorguya başvurulabilir.

#### Named Queries’in Özellikleri

- **Tekrar Kullanılabilirlik**: Named Queries, bir kere tanımlandıktan sonra uygulamanın her yerinde kullanılabilir.
- **Kodun Temizlenmesi**: Sorgu tanımları entity sınıfı içinde tanımlandığından, sorgu mantığı doğrudan kod içinde yazılmaz ve böylece daha temiz bir kod yapısı elde edilir.
- **Statik Tanımlama**: Named Queries uygulama başlatıldığında derlenir, bu nedenle çalışma sırasında herhangi bir hata oluşmaz. Sorgu hataları uygulama başlatıldığında fark edilir.
- **Performans**: JPA, Named Queries’i uygulama başlatıldığında derlediği için, çalışma sırasında daha hızlı çalışır.

#### Named Queries Kullanımı

##### JPQL ile Named Query Tanımlama:

```java
@Entity
@NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name")
public class User {
    @Id
    private Long id;
    private String name;
    // Getter ve Setter'lar
}
```

Bu örnekte, **User.findByName** adında bir Named Query tanımlanmıştır. Bu sorgu, `User` entity’sindeki **name** alanına göre veri çekmektedir.

Bu sorguyu bir repository'de kullanmak için:

```java
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(name = "User.findByName")
    List<User> findByName(@Param("name") String name);
}
```

##### Native SQL ile Named Query Tanımlama:

```java
@Entity
@NamedNativeQuery(name = "User.findByAgeNative", query = "SELECT * FROM users WHERE age = :age", resultClass = User.class)
public class User {
    @Id
    private Long id;
    private String name;
    private int age;
    // Getter ve Setter'lar
}
```

Bu sorgu ise **User.findByAgeNative** adında bir Native SQL sorgusudur ve doğrudan SQL ile yazılmıştır.

#### Named Queries Avantajları

- **Tekrar Kullanılabilirlik**: Birden fazla yerde aynı sorguyu tekrar tanımlamadan kullanabilirsiniz.
- **Performans Artışı**: Uygulama başlatıldığında derlendiği için sorgu hataları çalışma sırasında değil, başlangıçta fark edilir.
- **Statik Yapı**: Named Queries uygulama başlatılırken çalıştığından, sorguların geçerliliği önceden kontrol edilir ve çalışma zamanı hatalarının önüne geçilir.

#### Named Queries Dezavantajları

- **Esneklik Eksikliği**: Named Queries, sabit sorgular olarak tanımlanır, bu nedenle dinamik bir sorgu gereksiniminde yeterli esneklik sağlamayabilir.
- **Kod Karmaşası**: Çok fazla Named Query tanımlandığında entity sınıfları karmaşık hale gelebilir.

---

### JPQL (Java Persistence Query Language)

JPQL, JPA ile birlikte çalışan nesne odaklı bir sorgulama dilidir ve doğrudan SQL kullanmadan, Java sınıflarına göre sorgu yazmayı sağlar. JPQL, entity sınıfları üzerinden çalışır ve bu nedenle nesne tabanlıdır.

#### JPQL’in Özellikleri

- **Nesne Odaklı**: JPQL, doğrudan tablo ve sütun adları yerine Java sınıfları ve alanları üzerinde çalışır.
- **Veritabanı Bağımsızlığı**: JPQL sorguları, JPA tarafından desteklenen herhangi bir veritabanında çalışacak şekilde soyutlanmıştır. Bu sayede veritabanı bağımsızlığı sağlar.
- **İlişki Yönetimi**: JPQL, entity sınıfları arasındaki ilişkileri yönetmek için oldukça uygundur, bu da ilişkisel veritabanı işlemlerini daha kolay hale getirir.

#### JPQL Kullanımı

JPQL sorguları **@Query** anotasyonu ile yazılabilir.

```java
@Query("SELECT u FROM User u WHERE u.name = :name")
List<User> findByName(@Param("name") String name);
```

Bu örnekte JPQL, doğrudan User sınıfı üzerinden sorgulama yaparak veritabanında **name** alanına göre veri çeker.

#### JPQL Avantajları

- **Nesne Odaklı ve Veritabanı Bağımsız**: JPQL, nesne yönelimli bir yapı sunar ve veritabanı bağımsızlığı sağlar.
- **Kolay İlişki Yönetimi**: JPQL, entity ilişkilerini yönetmek için kolay bir yol sunar, bu da daha sade ve okunabilir kod sağlar.
- **Temiz Kod**: JPQL, entity sınıfı özelliklerini doğrudan kullanır, bu nedenle SQL komutlarına göre daha temiz ve anlaşılır bir yapı sağlar.

#### JPQL Dezavantajları

- **Veritabanı Özgü Optimizasyonlardan Yoksun**: JPQL, veritabanı bağımsız bir yapıya sahip olduğundan, veritabanına özgü optimizasyonları kullanmaz.
- **Karmaşık Sorgu Desteği Sınırlı**: JPQL, özellikle karmaşık ve veritabanına özgü işlemlerde sınırlıdır.

---

### Native SQL

Native SQL, doğrudan SQL komutları kullanılarak yazılan sorgulardır. Bu tür sorgular, veritabanı bağımsız değildir ve doğrudan veritabanı tabloları ve sütun adları kullanılarak çalıştırılır. Native SQL ile veritabanına özgü özellikleri ve optimizasyonları kullanmak mümkündür.

#### Native SQL’in Özellikleri

- **Veritabanı Bağımlılığı**: Native SQL, belirli bir veritabanına özgü SQL söz dizimini kullanır ve bu nedenle veritabanı bağımlıdır.
- **Karmaşık ve Özel Sorgular İçin Uygundur**: Native SQL, karmaşık ve veritabanına özgü sorgular için idealdir.
- **Performans Avantajı**: Native SQL, veritabanına özgü optimizasyonları kullanarak yüksek performans sağlar.

#### Native SQL Kullanımı

Native SQL sorguları, **@Query** anotasyonunun içinde `nativeQuery = true` parametresi ile belirtilir.

```java
@Query(value = "SELECT * FROM users WHERE age > :age", nativeQuery = true)
List<User> findUsersOlderThan(@Param("age") int age);
```

Bu örnekte doğrudan SQL ile yazılmış bir sorgu kullanılmıştır.

#### Native SQL Avantajları

- **Karmaşık Sorgular için Uygun**: Native SQL, özellikle karmaşık ve veritabanına özgü işlemler için idealdir.
- **Performans Artışı**: Veritabanına özgü optimizasyonları kullanarak daha hızlı sorgular sağlar.
- **Esneklik**: Veritabanı özelliklerinden tam anlamıyla yararlanır, böylece JPQL’in sınırlamalarını aşabilirsiniz.

#### Native SQL Dezavantajları

- **Veritabanı Bağımlılığı**: Native SQL, belirli bir veritabanına özgü olduğundan, başka bir veritabanına geçişte sorunlar oluşturabilir.
- **Kod Karmaşıklığı**: SQL sorgularını doğrudan kullanmak kodu daha karmaşık hale getirebilir.
- **Veritabanı Bağımsızlığı Eksikliği**: Native SQL, belirli bir veritabanına bağımlıdır ve başka bir veritabanına geçildiğinde kodda değişiklik yapılması gerekir.

---

### Named Queries, JPQL ve Native SQL Arasındaki Farklar

| Özellik                  | Named Queries                          | JPQL                                  | Native SQL                              |
|--------------------------|----------------------------------------|---------------------------------------|-----------------------------------------|
| Sorgu Yapısı             | Statik, entity sınıfı üzerinde tanımlanır | Nesne odaklı, entity sınıfları üzerinden | Doğrudan SQL komutları ile yazılır      |
| Tekrar Kullanılabilirlik | Yüksek, birden fazla yerde kullanılabilir | Tekrar kullanılabilir ancak entity sınıfına bağlıdır | Düşük, genelde özel durumlar için      |
| Veritabanı Bağımsızlığı  | Evet (JPQL ile tanımlıysa)             | Evet                                  | Hayır                                   |
| Performans               | Uygulama başlatıldığında derlenir, hızlıdır | Orta, veritabanı bağımsızlığı sağlar | Yüksek, veritabanına

özgü optimizasyonlar kullanır |
| Karmaşık Sorgu Desteği   | Orta, genelde basit sorgular için      | Orta                                  | Yüksek, veritabanına özgü sorgular yapılabilir |
| Kolaylık                 | Kolay, kodda dağılmamış yapı sunar     | Kolay, nesne odaklı yapıya sahip      | SQL bilgisi gerektirir                  |

### Özet ve Hangi Durumda Hangi Yöntem Kullanılmalı?

- **Named Queries**: Tekrar kullanılabilir, statik sorgular gerektiğinde ve aynı sorguyu birden fazla yerde kullanmak gerektiğinde tercih edilmelidir.
- **JPQL**: Nesne odaklı, veritabanı bağımsız sorgular için idealdir. JPA entity ilişkilerini yönetirken ve temel CRUD işlemlerinde daha çok tercih edilmelidir.
- **Native SQL**: Veritabanına özgü sorgular gerektiğinde, karmaşık işlemler ve özel performans ihtiyaçlarında kullanılır.

Her üç yöntemin de kendine özgü avantajları ve kullanım alanları vardır. Projenizin ihtiyaçlarına göre en uygun sorgu yöntemi belirlenmelidir.


## Spring Boot (Sayfalandırma ve Sıralama (Pagination and Sorting))
```sh 

```
---
### Sayfalandırma ve Sıralama (Pagination and Sorting)

Spring Data, büyük veri setlerinde çalışırken verilerin sayfalara bölünerek görüntülenmesini ve sıralanmasını sağlar. `Pageable` ve `Sort` nesneleri sayesinde veriler sayfalara bölünerek belirli bir sırada listelenebilir.

Örneğin:

```java
Pageable pageable = PageRequest.of(0, 10, Sort.by("lastName").descending());
Page<Customer> customers = customerRepository.findAll(pageable);
```

Bu örnekte `Customer` verileri, `lastName` alanına göre azalan bir şekilde ilk 10 kayıt için sayfalama yapılarak getirilir.

### Spring Data ile Transaksiyon Yönetimi

Spring Data, işlem yönetimi (transaction management) desteği de sunar. Birden fazla veri tabanı işleminin tek bir işlem olarak ele alınması durumunda verilerin tutarlılığını sağlamak için `@Transactional` anotasyonu kullanılabilir. Bu sayede bir işlem başarısız olduğunda tüm işlemler geri alınır (rollback yapılır).

```java
@Transactional
public void saveCustomerData(Customer customer, Address address) {
    customerRepository.save(customer);
    addressRepository.save(address);
}
```

### Spring Data Auditing (Denetim)

Spring Data Auditing, veri tabanındaki kayıtlarda oluşturulma ve güncellenme tarihleri gibi verileri otomatik olarak tutar. `@CreatedDate` ve `@LastModifiedDate` anotasyonları ile bu işlemler kolayca yapılabilir.

Örneğin:

```java
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    // diğer alanlar ve getter/setter metodları
}
```

Bu örnek sayesinde, `Customer` kaydı oluşturulduğunda `createdDate`, güncellendiğinde `lastModifiedDate` otomatik olarak güncellenir.

### Spring Data’nın Avantajları ve Dezavantajları

**Avantajları**:

- **Hızlı ve Kolay CRUD İşlemleri**: Repository yapısı sayesinde CRUD işlemleri hızlıca yapılır.
-

**Kod Tekrarını Azaltır**: Sorguların çoğu dinamik olarak oluşturulduğu için kod tekrarı azalır.
- **Veritabanı Bağımsızlığı**: Aynı veri erişim katmanı, farklı veri depolarında kullanılabilir.
- **Sayfalandırma ve Sıralama Desteği**: Verilerin kolayca sayfalanması ve sıralanması mümkündür.

**Dezavantajları**:

- **Öğrenme Eğrisi**: Özellikle yeni başlayanlar için Repository ve Spring Data yapısının öğrenilmesi biraz zaman alabilir.
- **Performans Problemleri**: Karmaşık sorgularda performans sorunları yaşanabilir. Bu durumda özelleştirilmiş sorgular yazılması gerekebilir.

### Sonuç

Spring Data, veri tabanıyla çalışan uygulamalar için büyük kolaylıklar sağlayan, geniş özellik yelpazesine sahip bir modüldür. Farklı veri depolarıyla entegre çalışabilmesi ve standart bir veri erişim katmanı sunması, uygulamaların daha hızlı geliştirilmesini ve daha yönetilebilir hale getirilmesini sağlar. Spring Data, veri işlemlerini modüler ve esnek hale getirirken, yazılımın sürdürülebilirliğini de artırır.

Daha fazla detay isterseniz veya herhangi bir özel konu hakkında örnekler görmek isterseniz, size yardımcı olmaktan memnuniyet duyarım.

## Spring Boot (Delivered Query , Named Queries,  JPQL ve Native SQL Arasındaki Farklar)
```sh 

```
---


Delivered Query , Named Queries,  JPQL ve Native SQL Arasındaki Farklar
## Spring Boot
```sh 

```
---

Spring API, Spring Framework’ün sunduğu programlama arayüzlerini ve araçlarını kapsayan bir yapıdır. Bu API'ler, özellikle RESTful web servisleri oluşturmak, çeşitli uygulama bileşenlerini birbirine bağlamak ve yazılım geliştirme sürecini kolaylaştırmak için kullanılır. Spring API, web tabanlı uygulamaların geliştirilmesi ve yönetilmesi için geniş bir araç seti sunar. Bu araç seti sayesinde geliştiriciler, yüksek performanslı, güvenli ve ölçeklenebilir web servisleri ve API'ler oluşturabilir.

Spring API, özellikle REST API geliştirmede popülerdir ve birçok kurumsal projede kullanılır. RESTful servisler, istemci-sunucu mimarisi temelinde HTTP protokolü üzerinden veri alışverişi yapar ve Spring API bu servislerin hızlı ve etkili bir şekilde oluşturulmasına olanak tanır.

### Spring API'nin Temel Bileşenleri

Spring API, birçok farklı bileşeni içerir. Bu bileşenler, web uygulamaları geliştirme, veri işleme, güvenlik sağlama gibi farklı görevleri yerine getirmek üzere tasarlanmıştır. Başlıca bileşenleri şunlardır:

1. **Spring MVC**: Model-View-Controller mimarisi üzerine kuruludur ve web tabanlı uygulama geliştirmeyi sağlar. Spring MVC, web isteklerini işleyerek yanıtlar, yönlendirme işlemlerini yönetir ve uygulama mantığını model katmanında kapsar. Spring MVC, REST API geliştirmede de büyük rol oynar ve HTTP protokolünü etkin bir şekilde kullanarak veri alışverişi yapılmasını sağlar.

2. **Spring Web**: Bu bileşen, web uygulamaları ve REST API’ler geliştirmek için kullanılan temel bir modüldür. Web üzerinden veri gönderme, alma ve yönlendirme işlemlerini içerir. Özellikle Spring Boot ile birlikte kullanıldığında, Spring Web’in sağladığı basitleştirilmiş yapı, hızlı API geliştirmeyi sağlar.

3. **Spring REST**: REST (Representational State Transfer) standartları üzerine kurulu servisler geliştirmek için kullanılan bir bileşendir. RESTful servisler, HTTP metotları (GET, POST, PUT, DELETE) ile çalışır ve JSON, XML gibi veri formatlarını kullanarak veri alışverişi yapar. Spring REST, Spring MVC ile entegre çalışarak RESTful API geliştirmeyi kolaylaştırır.

4. **Spring Data REST**: Spring Data REST, veri tabanı işlemlerini REST API üzerinden kullanıma sunmayı sağlar. Bu modül, veri tabanı işlemlerini RESTful servisler aracılığıyla otomatikleştirir ve CRUD işlemleri için gerekli API'leri oluşturur. Bu sayede Spring Data ile oluşturulan veri modelleri, Spring Data REST kullanılarak hızlıca API'ler haline getirilebilir.

5. **Spring HATEOAS (Hypermedia as the Engine of Application State)**: Spring HATEOAS, REST API'lerde daha zengin ve anlamlı yanıtlar oluşturmayı amaçlar. Hypermedia, API'nin istemcinin kendi kendine yol bulmasını sağlayan linkleri yanıtlarla birlikte döndürmesini sağlar. Örneğin, bir kullanıcı bilgisi döndürülürken, o kullanıcıya ait ilişkili diğer kaynakların (siparişler, adresler) bağlantıları da yanıt içinde sunulabilir.

6. **Spring Security**: API'lerin güvenliğini sağlamak için kullanılan modüldür. Kimlik doğrulama, yetkilendirme ve erişim kontrolü gibi güvenlik işlemlerini yönetir. API'lerin güvenliğini sağlamak, özellikle kullanıcı verilerini korumak için son derece önemlidir. Spring Security, REST API'ler için OAuth2, JWT (JSON Web Tokens) gibi modern güvenlik protokollerini de destekler.

7. **Spring Cloud**: Mikroservis mimarisine uygun API'ler geliştirmek için kullanılan Spring modülüdür. Spring Cloud, dağıtık sistemlerde kullanılan servis keşfi, yük dengeleme, yapılandırma yönetimi gibi özellikleri sağlar. Özellikle mikroservis tabanlı uygulamalarda, Spring Cloud ile API'lerin yönetimi kolaylaşır.

### Spring API ile RESTful Servis Geliştirme

RESTful servisler, Spring API'nin en sık kullanıldığı alanlardan biridir. Spring API, REST standartlarına uygun servislerin hızlı ve kolay bir şekilde geliştirilmesini sağlar. Spring API ile RESTful servis geliştirmek için izlenen adımlar şunlardır:

1. **Controller Sınıfları**: Spring API'de RESTful servislerin ana bileşeni olan denetleyiciler (controllers) kullanılır. Bu sınıflar, gelen HTTP isteklerini işleyerek uygun yanıtları döndürür. Her bir HTTP isteği, belirli bir denetleyici metoduna yönlendirilir ve burada işlenir.

   Örneğin, `@RestController` anotasyonu ile bir denetleyici sınıfı tanımlanabilir ve `@RequestMapping` ile belirli bir URL ile eşleştirilebilir:

   ```java
   @RestController
   @RequestMapping("/api/customers")
   public class CustomerController {

       @GetMapping("/{id}")
       public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
           Customer customer = customerService.findById(id);
           return ResponseEntity.ok(customer);
       }

       @PostMapping
       public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
           Customer createdCustomer = customerService.save(customer);
           return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
       }
   }
   ```

   Bu örnekte, `CustomerController` sınıfı, `/api/customers` yoluyla HTTP GET ve POST isteklerini işler. `@GetMapping` ve `@PostMapping` anotasyonları ile bu isteklerin belirli metodlara yönlendirilmesi sağlanır.

2. **DTO (Data Transfer Object) Kullanımı**: API’ler aracılığıyla veri alışverişinde kullanılan nesneler, genellikle DTO adı verilen veri transfer nesneleri ile yönetilir. DTO’lar, veri modelini doğrudan istemciye göndermek yerine daha güvenli ve optimize edilmiş veri yapıları sunar.

3. **Exception Handling**: Spring API, hata durumlarında daha anlamlı ve kullanıcı dostu yanıtlar döndürmek için istisna yönetimi sağlar. `@ExceptionHandler` anotasyonu ile belirli hata türlerine özel yanıtlar oluşturulabilir. Bu, istemcinin hata durumlarında daha ayrıntılı bilgi almasını sağlar.

   Örneğin:

   ```java
   @ControllerAdvice
   public class GlobalExceptionHandler {

       @ExceptionHandler(ResourceNotFoundException.class)
       public ResponseEntity<ErrorResponse> handleResourceNotFound(ResourceNotFoundException ex) {
           ErrorResponse error = new ErrorResponse("Resource not found", ex.getMessage());
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
       }
   }
   ```

4. **ResponseEntity Kullanımı**: Spring API, yanıtları daha esnek bir şekilde döndürmek için `ResponseEntity` sınıfını sağlar. Bu sınıf ile HTTP durum kodları, başlık bilgileri ve yanıt gövdesi özelleştirilebilir. `ResponseEntity`, yanıtın daha anlamlı ve detaylı olmasını sağlar.

5. **Parametre Kullanımı**: Spring API, API isteklerinde parametrelerin kolayca kullanılmasını sağlar. `@RequestParam`, `@PathVariable` gibi anotasyonlar ile URL parametreleri, yol parametreleri ve sorgu parametreleri yönetilebilir.

   ```java
   @GetMapping
   public List<Customer> getCustomersByStatus(@RequestParam String status) {
       return customerService.findByStatus(status);
   }
   ```

### Spring Data REST ile Otomatik API Geliştirme

Spring Data REST, Spring Data ile oluşturulmuş veri modellerini otomatik olarak REST API olarak sunmak için kullanılır. Bu sayede veri tabanı işlemleri için manuel olarak denetleyici sınıfları yazmaya gerek kalmaz. Spring Data REST, Spring Data repository arayüzlerini kullanarak otomatik olarak CRUD API’leri oluşturur.

Örneğin, `CustomerRepository` aşağıdaki gibi tanımlanmışsa:

```java
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
```

Spring Data REST, bu repository’ye otomatik olarak CRUD işlemlerini sağlayan URL’ler ekler:

- `GET /customers`: Tüm müşterileri getirir.
- `POST /customers`: Yeni bir müşteri ekler.
- `GET /customers/{id}`: Belirli bir müşteri detayını getirir.
- `PUT /customers/{id}`: Belirli bir müşteriyi günceller.
- `DELETE /customers/{id}`: Belirli bir müşteriyi siler.

Bu özellik, veri tabanı işlemlerini hızlı bir şekilde API olarak sunmak isteyen geliştiriciler için büyük bir avantaj sağlar.

### Spring HATEOAS ile Hypermedia Destekli API’ler

Spring HATEOAS, REST API yanıtlarını zenginleştirmek için kullanılan bir modüldür. HATEOAS, istemcinin API yapısını daha iyi anlamasını ve navigasyonu kolaylaştırmasını sağlar. Yanıt içerisine linkler ekleyerek, istemcinin ek bir dokümana ihtiyaç duymadan ilgili kaynaklara erişebilmesi sağlanır.

Örneğin, müşteri detaylarını döndürürken, o müşteriye ait siparişlerin linkini de yanıtabilirsiniz. Bu, istemcinin müşteri verisini aldıktan sonra ilgili sipariş bilgilerine kolayca ulaşmasını sağlar.

```java
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public EntityModel<Customer> getCustomerById(@PathVariable Long id) {
        Customer customer = customerService.findById(id);

        EntityModel<Customer> resource = EntityModel.of(customer);
        resource.add(linkTo(methodOn(CustomerController.class).getCustomerById(id)).withSelfRel());
        resource.add(linkTo(methodOn(OrderController.class).getOrdersByCustomerId(id)).withRel("orders"));

        return resource;
    }
}
```

Bu örnekte `EntityModel` kullanılarak `Customer` nesnesine "self" linki ve ilişkili "orders" linki eklenmiştir. İstemci, yanıtı aldığında müşteriye ait siparişlere de kolayca erişebilir.

### Spring Security ile API Güvenliği

API’lerin güvenliği, özellikle hassas veri alışverişi yapılan uygulamalarda büyük önem taşır. Spring Security, kimlik doğrulama ve yetkilendirme süreçlerini yöneterek API'leri güvenli hale getirir. Spring API’de güvenlik sağlamak için JWT (JSON Web Token) veya OAuth2 gibi modern güvenlik protokolleri kullanılabilir.

**JWT ile Kimlik Doğrulama**: JWT, kullanıcının kimliğini doğrulamak için kullanılan, imzalı bir token yapısıdır. Kullanıcı giriş yaptığında, JWT token oluşturulur ve kullanıcıya gönderilir. İstemci, API isteklerinde bu token'ı taşıyarak kimliğini doğrular.

```java
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/api/auth/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .addFilter(new JWTAuthenticationFilter(authenticationManager()));
    }
}
```

Bu yapılandırmada `/api/auth/**` altındaki URL'lere kimlik doğrulama olmadan erişim izni verilmiştir. Diğer tüm URL'ler için JWT kimlik doğrulaması gereklidir.

### Spring API'de Swagger ile API Dokümantasyonu

Spring API'leri geliştirirken, istemcilerin API'leri nasıl kullanacağını anlamalarını sağlamak için dokümantasyon önemlidir. Swagger, Spring API’leri için kapsamlı ve otomatik bir dokümantasyon çözümü sunar. Spring Boot projelerine kolayca entegre edilebilir ve API uç noktalarını görselleştirir.

Swagger’ın kullanımı için, `springdoc-openapi-ui` gibi bir bağımlılık projeye eklenebilir. Bu, API uç noktalarının interaktif bir dokümantasyon sayfasında gösterilmesini sağlar.

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.5.9</version>
</dependency>
```

Swagger UI ile, geliştiriciler API isteklerini test edebilir ve dönen yanıtları görebilir, bu da hata ayıklama ve test sürecini kolaylaştırır.

### Spring API'nin Avantajları ve Dezavantajları

**Avantajları**:

- **Hızlı Geliştirme**: Spring API modülleri, geliştiricilere standart yapılar ve anotasyonlar sunarak hızlı bir şekilde API geliştirme imkanı tanır.
- **Esneklik ve Özelleştirilebilirlik**: Spring’in modüler yapısı, projeye uygun bileşenlerin kullanılmasını ve özelleştirilmesini kolaylaştırır.
- **Geniş Güvenlik Desteği**: Spring Security ile güçlü kimlik doğrulama ve yetkilendirme süreçleri oluşturulabilir.
- **Kapsamlı Ekosistem**: Spring Data, Spring MVC, Spring Security gibi modüller, API geliştirme sürecinde her türlü ihtiyaca yanıt verir.

**Dezavantajları**:

- **Öğrenme Eğrisi**: Spring API, yeni başlayanlar için karmaşık olabilir, özellikle HATEOAS, güvenlik yapılandırmaları gibi özellikler öğrenme sürecini uzatabilir.
- **Performans Sorunları**: Büyük ölçekli uygulamalarda performans optimizasyonları gerekebilir.
- **Özelleştirme Gereksinimi**: Özellikle API güvenliği veya özelleştirilmiş sorgular gibi özel gereksinimler için yapılandırmalar karmaşık hale gelebilir.

### Sonuç

Spring API, güçlü ve kapsamlı bir araç seti sunarak kurumsal düzeyde API’lerin hızlı ve güvenli bir şekilde geliştirilmesini sağlar. RESTful servisler, güvenlik önlemleri, veri yönetimi ve dokümantasyon gibi konularda sağladığı çözümler, geliştiricilere modüler, esnek ve test edilebilir API’ler oluşturma imkanı tanır. Spring API’ler, kurumsal projelerde tercih edilen bir yapı olarak, geniş topluluk desteği ve sürekli güncellenen ekosistemi sayesinde modern yazılım geliştirme süreçlerinin vazgeçilmez bir parçası olmuştur.

Daha detaylı bir konu veya örnek ile ilgili sorularınız varsa, daha ayrıntılı bilgi sağlamaktan memnuniyet duyarım.



## Spring Boot (Spring Security)
```sh 

```
---

Spring Security, Java tabanlı uygulamalarda kimlik doğrulama, yetkilendirme ve erişim kontrolü sağlamak için kullanılan güçlü ve esnek bir güvenlik çerçevesidir. Spring Framework’ün bir modülü olan Spring Security, web uygulamaları, RESTful API’ler ve mikroservis mimarilerinde güvenlik önlemleri almak için yaygın olarak kullanılır. Özellikle kurumsal projelerde güvenliğin kritik önemde olduğu durumlarda, Spring Security’nin sunduğu kapsamlı güvenlik özellikleri, uygulamaların yüksek güvenlik standartlarına uygun bir şekilde geliştirilmesine olanak tanır.

### Spring Security'nin Temel Özellikleri ve Faydaları

1. **Kimlik Doğrulama (Authentication)**: Kullanıcıların sisteme erişim sağlamak için doğrulanmasını sağlar. Kimlik doğrulama, kullanıcı adı ve şifre ile yapılabileceği gibi, OAuth2 ve JWT (JSON Web Token) gibi modern güvenlik protokolleri ile de desteklenir.

2. **Yetkilendirme (Authorization)**: Kimlik doğrulaması yapılan kullanıcıların hangi kaynaklara erişim iznine sahip olduğunu belirler. Kullanıcılar belirli roller ve yetkilere göre sınıflandırılır ve bu yetkiler doğrultusunda kaynaklara erişim izni verilir.

3. **HTTP Güvenliği**: Spring Security, HTTP tabanlı saldırılara karşı koruma sağlar. Özellikle CSRF (Cross-Site Request Forgery - Siteler Arası İstek Sahteciliği), XSS (Cross-Site Scripting - Siteler Arası Betik Çalıştırma) ve Clickjacking gibi saldırılara karşı güvenlik önlemleri sunar.

4. **Şifreleme ve Hashing Desteği**: Spring Security, kullanıcı şifrelerinin güvenli bir şekilde saklanması ve işlenmesi için hashing algoritmaları kullanır. Örneğin, BCrypt algoritması ile şifrelerin güvenli bir şekilde saklanmasını sağlar.

5. **Esnek Kimlik Doğrulama Mekanizmaları**: Temel kimlik doğrulamanın yanı sıra, LDAP (Lightweight Directory Access Protocol), OAuth2, OpenID Connect ve SSO (Single Sign-On) gibi çeşitli kimlik doğrulama protokolleri ile entegre çalışır.

6. **Kolay Konfigürasyon ve Esneklik**: Spring Security, hem XML tabanlı hem de Java tabanlı konfigürasyon destekler. Geliştiricilere, güvenlik ayarlarını özelleştirme ve uygulama gereksinimlerine göre yapılandırma imkanı tanır.

### Spring Security’nin Mimarisi

Spring Security’nin temel yapısı üç ana bileşenden oluşur:

1. **SecurityContext**: Uygulamada oturum açan kullanıcıya ait güvenlik bilgisini saklar. SecurityContext, kimlik doğrulama işlemi tamamlandığında kullanıcının kimliğini doğrulayan bilgileri içerir ve uygulama boyunca bu bilgilerden faydalanır.

2. **AuthenticationManager**: Kullanıcının kimliğini doğrulayan ana bileşendir. AuthenticationManager, kimlik doğrulama sağlayıcıları (authentication providers) aracılığıyla kimlik doğrulama işlemlerini gerçekleştirir. Bu sağlayıcılar, kullanıcı bilgilerini doğrulamak için veri tabanları, LDAP veya üçüncü parti kimlik doğrulama servisleri ile entegre çalışabilir.

3. **AccessDecisionManager**: Yetkilendirme kararlarını alır ve kullanıcının belirli bir kaynağa erişim hakkı olup olmadığını belirler. Kullanıcı, istenen kaynağa erişim iznine sahip değilse, erişim reddedilir.

### Spring Security ile Kimlik Doğrulama (Authentication)

Kimlik doğrulama, kullanıcının geçerli bir kullanıcı adı ve şifre ile sisteme giriş yapması işlemidir. Spring Security’de kimlik doğrulama işlemi `AuthenticationManager` aracılığıyla gerçekleştirilir. `UsernamePasswordAuthenticationToken` sınıfı, en yaygın kimlik doğrulama yöntemi olan kullanıcı adı ve şifreyle doğrulama yapar. `AuthenticationProvider` ise bu doğrulama sürecinin gerçek kaynağıdır; yani kullanıcı bilgilerini doğrulamak için veri tabanında arama yapar.

#### Örnek Kimlik Doğrulama Yapılandırması

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user")
            .password(passwordEncoder().encode("password"))
            .roles("USER")
            .and()
            .withUser("admin")
            .password(passwordEncoder().encode("admin"))
            .roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/user/**").hasAnyRole("USER", "ADMIN")
            .and()
            .formLogin();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

Bu yapılandırmada, `inMemoryAuthentication` ile kullanıcı bilgileri bellekte saklanır. `/admin/**` yoluna sadece "ADMIN" rolüne sahip kullanıcılar erişebilirken, `/user/**` yoluna "USER" veya "ADMIN" rolüne sahip kullanıcılar erişebilir.

### Yetkilendirme (Authorization)

Spring Security, kullanıcıların belirli kaynaklara erişimini kısıtlayarak yetkilendirme işlemlerini yönetir. Kullanıcılar roller (roles) ve yetkiler (authorities) aracılığıyla sınıflandırılır. Bu roller ve yetkiler, belirli URL’lere veya metodlara erişim kontrolü sağlamak için kullanılır.

#### Rol Tabanlı Yetkilendirme

Rol tabanlı yetkilendirme, kullanıcının rolüne göre kaynaklara erişim hakkı vermeyi sağlar. `@Secured` ve `@PreAuthorize` anotasyonları, rol tabanlı erişim kontrolünü gerçekleştirmede kullanılır.

```java
@Secured("ROLE_ADMIN")
public void adminOnlyMethod() {
    // Yalnızca ROLE_ADMIN rolüne sahip kullanıcılar bu metodu çağırabilir
}

@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
public void userOrAdminMethod() {
    // ROLE_USER veya ROLE_ADMIN rolüne sahip kullanıcılar bu metodu çağırabilir
}
```

### Spring Security ile HTTP Güvenliği

Spring Security, HTTP tabanlı güvenlik tehditlerine karşı koruma sağlar. Aşağıda, Spring Security’nin HTTP güvenliği kapsamında sağladığı başlıca koruma mekanizmaları yer almaktadır:

1. **CSRF (Cross-Site Request Forgery)**: CSRF saldırılarına karşı koruma sağlar. CSRF, saldırganın kullanıcının oturumunu ele geçirerek kullanıcı adına istek yapmasını sağlayan bir saldırı türüdür. Spring Security, CSRF korumasını varsayılan olarak aktifleştirir.

2. **Clickjacking Koruması**: Spring Security, uygulamanın başka siteler tarafından çerçevelenmesini önlemek için X-Frame-Options başlığını kullanarak clickjacking saldırılarına karşı koruma sağlar.

3. **XSS Koruması**: XSS (Cross-Site Scripting) saldırılarına karşı korunmak için içerik güvenlik politikaları (Content Security Policies) uygulanabilir.

4. **HTTP Strict Transport Security (HSTS)**: HSTS, yalnızca HTTPS bağlantılarını zorunlu kılarak veri aktarım güvenliğini artırır.

### JWT ile Kimlik Doğrulama ve Yetkilendirme

JWT, kullanıcı kimliğini doğrulamak ve API güvenliğini sağlamak için popüler bir yöntemdir. JWT kullanıldığında, kullanıcı giriş yaptığında bir token üretilir ve bu token, sonraki isteklerde kimlik doğrulaması için kullanılır. Spring Security, JWT token ile kimlik doğrulama işlemlerini kolayca yapılandırma imkanı sunar.

#### JWT Kimlik Doğrulama Örneği

JWT kullanarak kimlik doğrulama yapılacak bir örnek yapılandırma şu şekildedir:

1. **JWT Oluşturma**: Kullanıcı giriş yaptığında, JWT token oluşturulur ve istemciye döndürülür.
2. **JWT Doğrulama**: İstemciden gelen her istekte, JWT doğrulanarak kullanıcının kimliği belirlenir.

```java
// JWT oluşturma ve doğrulama işlemleri için kullanılan sınıf
public class JwtUtil {

    private String secretKey = "mySecretKey";

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
}
```

### OAuth2 ve Spring Security

Spring Security, OAuth2 protokolünü destekleyerek üçüncü taraf kimlik doğrulama servisleriyle (Google, Facebook gibi) entegre çalışabilir. OAuth

2, özellikle kullanıcıların aynı hesapla farklı uygulamalarda oturum açmasını sağlar ve API güvenliği için de yaygın olarak kullanılır.

### Spring Security ile Test ve Hata Yönetimi

Spring Security, güvenlik testlerini kolaylaştırmak için `@WithMockUser`, `@WithUserDetails` gibi test anotasyonları sağlar. Bu anotasyonlar ile belirli roller ve yetkiler atanarak güvenlik testleri yapılabilir.

```java
@Test
@WithMockUser(username = "admin", roles = {"ADMIN"})
public void testAdminAccess() {
    // ADMIN rolüyle test işlemleri yapılır
}
```

### Spring Security’nin Avantajları ve Dezavantajları

**Avantajları**:

- **Yüksek Güvenlik Desteği**: Kimlik doğrulama, yetkilendirme ve HTTP güvenliği sağlar.
- **Esneklik**: LDAP, OAuth2, JWT gibi çeşitli kimlik doğrulama protokolleri ile entegre çalışabilir.
- **Kolay Konfigürasyon**: XML veya Java tabanlı konfigürasyon seçenekleri sunar.
- **Modüler Yapı**: Farklı güvenlik bileşenlerinin ihtiyaca göre eklenmesini sağlar.

**Dezavantajları**:

- **Öğrenme Eğrisi**: İlk kez kullananlar için oldukça karmaşık olabilir.
- **Performans Maliyeti**: Güvenlik işlemleri ek yük getirebilir, özellikle büyük ölçekli uygulamalarda optimize edilmesi gerekebilir.

### Sonuç

Spring Security, uygulamalarda güçlü bir güvenlik altyapısı sunarak veri gizliliğini ve güvenliğini sağlar. Kimlik doğrulama, yetkilendirme ve HTTP güvenliği özellikleriyle geniş kapsamlı güvenlik ihtiyaçlarını karşılar. Modern güvenlik standartlarını destekleyen Spring Security, web uygulamaları ve API’lerde güvenlik sağlamak isteyen geliştiriciler için ideal bir çözümdür.

Daha ayrıntılı örnekler veya belirli bir konuyla ilgili daha fazla bilgiye ihtiyacınız varsa, size yardımcı olmaktan memnuniyet duyarım.

## ModelMapper
```sh 

```
---

ModelMapper, Java tabanlı uygulamalarda veri nesneleri (model sınıfları) arasındaki dönüşüm işlemlerini kolaylaştıran bir kütüphanedir. Özellikle DTO (Data Transfer Object) ve Entity sınıfları arasındaki veri aktarımını otomatikleştirerek, kod tekrarını azaltır ve uygulamaların daha temiz, sürdürülebilir hale gelmesini sağlar. DTO ve Entity nesneleri, genellikle veri tabanıyla iletişim kuran veya kullanıcı arayüzüne sunulan farklı veri yapılarında temsil edilir. Bu nesneler arasında veri aktarımı gerektiren durumlarda, ModelMapper otomatik olarak gerekli eşleştirmeleri yapar.

### ModelMapper’ın Kullanım Amacı ve Faydaları

1. **Kod Tekrarını Azaltır**: DTO ve Entity sınıfları arasında veri aktarımı yaparken her iki sınıfın alanlarını manuel olarak eşleştirmek gerekir. ModelMapper, bu eşleştirmeyi otomatik hale getirerek kod tekrarını azaltır.

2. **Daha Temiz ve Yönetilebilir Kod**: Otomatik eşleştirme sayesinde veri dönüştürme işlemleri daha temiz bir kod yapısı içinde yürütülür. Bu, özellikle büyük projelerde yönetilebilirliği artırır.

3. **Hızlı Geliştirme**: ModelMapper, eşleştirmeleri otomatik olarak gerçekleştirdiğinden, veri dönüşüm işlemleri daha hızlı yapılır ve geliştirme süreci kısalır.

4. **Esneklik ve Özelleştirilebilirlik**: ModelMapper, belirli alanlarda manuel eşleştirme ve özelleştirme yapmayı da destekler. Özel gereksinimlere göre eşleştirme kuralları tanımlanabilir.

### ModelMapper’ın Temel Özellikleri

ModelMapper, özellikle alan adları aynı olan sınıflar arasında otomatik eşleştirme yapması ile bilinir. Bu eşleştirme sürecinde, kaynak (source) nesne ile hedef (destination) nesne arasındaki alanların isimleri ve türleri eşleştirilir. ModelMapper, aynı zamanda karmaşık nesne yapıları ve özel dönüşümler için de geniş bir yapılandırma desteği sunar.

- **Otomatik Eşleştirme (Implicit Mapping)**: Alan adları aynı olan sınıflar arasındaki eşleştirmeleri otomatik olarak yapar.
- **Özelleştirilmiş Eşleştirme (Explicit Mapping)**: Belirli alanlar için özel dönüşüm kuralları belirlenebilir.
- **Derin Kopyalama (Deep Copy)**: Nesneler içindeki alt nesneleri de otomatik olarak eşleştirir ve derin kopyalama yapar.
- **Koleksiyon Eşleştirme**: Listeler ve diğer koleksiyon türleri arasındaki eşleştirmeleri destekler.
- **Koşullu Eşleştirme**: Belirli koşullara göre eşleştirme kuralları tanımlanabilir.

### ModelMapper Kullanımı

ModelMapper kullanmak için `ModelMapper` sınıfının bir örneğini oluşturmak ve `map` metodunu çağırarak kaynak nesneyi hedef nesneye dönüştürmek yeterlidir. Aşağıda basit bir örnek gösterilmektedir.

#### Basit Bir ModelMapper Örneği

Örneğin, `User` ve `UserDTO` adlı iki sınıfımız olduğunu düşünelim. `User` sınıfı veri tabanıyla ilişkili bir `Entity` iken, `UserDTO` sınıfı kullanıcı arayüzünde kullanılan bir veri taşıma nesnesidir.

```java
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    // Getter ve Setter metotları
}

public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    // Getter ve Setter metotları
}
```

Bu iki sınıf arasında veri dönüşümü yapmak için ModelMapper kullanabiliriz:

```java
ModelMapper modelMapper = new ModelMapper();
User user = new User(1L, "John", "Doe", "john.doe@example.com");
UserDTO userDTO = modelMapper.map(user, UserDTO.class);

System.out.println("DTO First Name: " + userDTO.getFirstName());
System.out.println("DTO Email: " + userDTO.getEmail());
```

Bu örnekte `user` nesnesinin tüm alanları otomatik olarak `userDTO` nesnesine aktarılır. ModelMapper, alan adları aynı olduğu sürece, nesneler arasındaki tüm veriyi sorunsuz bir şekilde eşleştirir.

### Özelleştirilmiş Eşleştirme

ModelMapper, özel dönüşüm kuralları tanımlamak için geniş bir yapılandırma desteği sunar. Özellikle alan adları farklı olan sınıflar veya karmaşık nesne yapıları arasında dönüşüm yapılması gerektiğinde, eşleştirme kuralları belirlemek gerekir.

#### Farklı Alan Adları İçin Eşleştirme

Örneğin, `User` sınıfındaki `firstName` alanını `UserDTO` sınıfında `name` olarak adlandırdığımızı düşünelim. Bu durumda, ModelMapper’a `firstName` alanını `name` alanına eşleştirmesini manuel olarak söylememiz gerekir.

```java
ModelMapper modelMapper = new ModelMapper();
modelMapper.typeMap(User.class, UserDTO.class).addMappings(mapper -> 
    mapper.map(User::getFirstName, UserDTO::setName));

User user = new User(1L, "John", "Doe", "john.doe@example.com");
UserDTO userDTO = modelMapper.map(user, UserDTO.class);

System.out.println("DTO Name: " + userDTO.getName());
```

Bu yapılandırmada, `User` sınıfındaki `firstName` alanı `UserDTO` sınıfındaki `name` alanına eşleştirilir. `addMappings` metodu ile özel eşleştirme kuralları belirleyebiliriz.

### Koleksiyon Eşleştirme

ModelMapper, koleksiyon türlerini de dönüştürebilir. Özellikle listeler arasındaki dönüşüm işlemleri, büyük veri setlerinde sıklıkla ihtiyaç duyulan bir özelliktir.

```java
List<User> userList = Arrays.asList(new User(1L, "John", "Doe", "john@example.com"),
                                    new User(2L, "Jane", "Doe", "jane@example.com"));

Type listType = new TypeToken<List<UserDTO>>() {}.getType();
List<UserDTO> userDTOList = modelMapper.map(userList, listType);

userDTOList.forEach(userDTO -> System.out.println("DTO Name: " + userDTO.getFirstName()));
```

Bu örnekte, `User` nesnelerinden oluşan bir liste `UserDTO` nesnelerinden oluşan bir listeye dönüştürülmüştür.

### Derin Kopyalama (Deep Copy)

ModelMapper, nesneler arasındaki alt nesneleri de eşleştirerek derin kopyalama yapabilir. Örneğin, `Address` sınıfına sahip bir `User` nesnesinin `UserDTO` nesnesine dönüştürülmesi durumunda, `Address` nesnesi de otomatik olarak eşleştirilir.

```java
public class User {
    private Long id;
    private String firstName;
    private Address address;
    // Getter ve Setter metotları
}

public class UserDTO {
    private Long id;
    private String firstName;
    private AddressDTO address;
    // Getter ve Setter metotları
}

public class Address {
    private String street;
    private String city;
    // Getter ve Setter metotları
}

public class AddressDTO {
    private String street;
    private String city;
    // Getter ve Setter metotları
}

ModelMapper modelMapper = new ModelMapper();
User user = new User(1L, "John", new Address("Main St", "New York"));
UserDTO userDTO = modelMapper.map(user, UserDTO.class);

System.out.println("DTO City: " + userDTO.getAddress().getCity());
```

Bu örnekte, `User` nesnesindeki `Address` nesnesi otomatik olarak `UserDTO` nesnesindeki `AddressDTO` nesnesine dönüştürülür.

### Koşullu Eşleştirme

ModelMapper, belirli bir koşula göre eşleştirme yapılmasına da olanak tanır. Örneğin, belirli bir alanın boş olmaması durumunda eşleştirme yapılmasını isteyebiliriz.

```java
modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
```

Bu ayar ile, sadece `null` olmayan alanlar eşleştirilir. Bu sayede kaynak nesnedeki boş alanların hedef nesneye aktarılması engellenir.

### ModelMapper ile DTO ve Entity Arasındaki Dönüşümün Avantajları ve Dezavantajları

**Avantajları**:

- **Kod Basitleştirir**: Dönüşüm işlemleri için yazılması gereken kod miktarını azaltır.
- **Esnek ve Güçlü Yapılandırma**: Farklı durumlara göre özelleştirme yapılabilir.
- **Koleksiyon Eşleştirme**: Listeler ve diğer koleksiyon türleri için dönüşüm işlemlerini kolaylaştırır.
- **Test Edilebilirlik**: DTO ve Entity arasında dönüşüm işlemleri standart hale geldi
  ği için daha test edilebilir bir yapı sunar. Örneğin, tüm dönüşümler ModelMapper aracılığıyla yapıldığından, dönüşüm sürecinin doğru çalışıp çalışmadığı tek bir noktada test edilebilir.

**Dezavantajları**:

- **Performans Maliyeti**: Özellikle büyük veri setlerinde otomatik dönüşüm işlemleri performans açısından maliyetli olabilir. Bu durumda, ModelMapper yerine manuel dönüşüm yöntemleri tercih edilebilir.
- **Öğrenme Eğrisi**: ModelMapper’ın tüm özelliklerini verimli kullanabilmek için bir miktar öğrenme süreci gerekebilir. Özellikle karmaşık nesne yapıları ve özelleştirilmiş dönüşümler için ayrıntılı bilgiye ihtiyaç duyulabilir.
- **Gereksiz Eşleştirmeler**: ModelMapper, tüm alanları eşleştirmeye çalıştığı için bazı durumlarda gereksiz eşleştirmeler yapılabilir. Bu durumda belirli alanları hariç tutmak gerekebilir.

### ModelMapper’ın Alternatifleri ve Karşılaştırma

ModelMapper, Java dünyasında popüler bir kütüphane olmakla birlikte, aynı işlevi gören bazı alternatifleri de vardır. Bu alternatifler arasında Dozer, MapStruct ve Orika gibi kütüphaneler öne çıkar.

- **MapStruct**: ModelMapper’dan farklı olarak derleme zamanında (compile-time) dönüşüm işlemlerini gerçekleştirir. Bu sayede daha hızlı çalışır, çünkü dönüşüm işlemleri çalışma zamanında yapılmaz. Özellikle büyük projelerde performans avantajı sağlar.
- **Dozer**: Dozer de otomatik eşleştirme yapabilen bir kütüphanedir ancak ModelMapper kadar esnek yapılandırma sunmaz.
- **Orika**: Orika, büyük veri setleri için optimize edilmiştir ve hızlı dönüşüm işlemleri yapabilir.

ModelMapper, özellikle kullanım kolaylığı ve esnek yapılandırma seçenekleri sayesinde küçük ve orta ölçekli projelerde daha sık tercih edilirken, MapStruct performans avantajı sayesinde büyük projelerde daha yaygın olarak kullanılır.

### ModelMapper Yapılandırma Özellikleri

ModelMapper’ın sunduğu bazı yapılandırma özellikleri şunlardır:

1. **Eşleştirme Stratejileri**: Eşleştirme stratejileri, ModelMapper’ın nasıl çalışacağını belirler. Örneğin, standart eşleştirme stratejisi `STANDARD` iken, daha esnek bir eşleştirme için `LOOSE` stratejisi kullanılabilir. `LOOSE` stratejisi, küçük farklılıkları göz ardı ederek eşleştirme yapmaya çalışır.

    ```java
    modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
    ```

2. **Boş Alanları Hariç Tutma**: Boş (null) değerleri eşleştirme işleminden hariç tutmak için `setPropertyCondition` yapılandırması kullanılabilir.

    ```java
    modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
    ```

3. **Karmaşık Eşleştirme**: Karmaşık nesne yapıları için `TypeMap` kullanılarak daha ayrıntılı dönüşüm kuralları oluşturulabilir.

    ```java
    TypeMap<User, UserDTO> typeMap = modelMapper.createTypeMap(User.class, UserDTO.class);
    typeMap.addMappings(mapper -> mapper.map(src -> src.getAddress().getCity(), UserDTO::setCity));
    ```

Bu örnekte, `User` nesnesindeki `address.city` alanı `UserDTO` nesnesindeki `city` alanına eşleştirilmektedir.

### Spring Boot ile ModelMapper Entegrasyonu

Spring Boot projelerinde ModelMapper kullanımı oldukça yaygındır. ModelMapper, Spring konteynerına bir `@Bean` olarak eklenir ve proje genelinde kullanılabilir hale getirilir.

```java
@Configuration
public class ModelMapperConfig {
    
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}
```

Bu yapılandırma ile `ModelMapper` nesnesi `@Autowired` anotasyonu ile diğer sınıflara enjekte edilebilir. Bu sayede, uygulamanın farklı katmanlarında dönüşüm işlemleri için ModelMapper kolayca kullanılabilir.

```java
@Service
public class UserService {

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO convertToDto(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    public User convertToEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
```

Bu yapılandırma sayesinde, `UserService` sınıfı içinde `convertToDto` ve `convertToEntity` metotları ile `User` ve `UserDTO` arasında dönüşüm işlemleri kolayca yapılabilir.

### Sonuç

ModelMapper, Java tabanlı uygulamalarda veri transfer nesneleri (DTO) ve veri tabanı nesneleri (Entity) arasındaki dönüşüm işlemlerini kolaylaştırmak için güçlü ve esnek bir araçtır. Otomatik eşleştirme, derin kopyalama, koşullu eşleştirme gibi özellikleriyle veri dönüşümlerini hızlı, kolay ve sürdürülebilir hale getirir. Kod tekrarını azaltarak daha temiz ve yönetilebilir bir kod yapısı sağlar.

ModelMapper, özellikle veri modelleme ve DTO katmanının yoğun olarak kullanıldığı projelerde tercih edilir. Ancak büyük projelerde performans kaygıları olan durumlarda alternatif kütüphaneler de değerlendirilmelidir. Spring Boot ile entegre edilmesi kolaydır ve Spring konteynerında bir `@Bean` olarak tanımlanarak proje genelinde kullanılabilir.

Detaylı veya özel dönüşüm senaryolarında ModelMapper’ın sunduğu yapılandırma özelliklerinden faydalanarak karmaşık veri modelleri arasında hızlı dönüşümler gerçekleştirilebilir. ModelMapper’ın sağladığı esneklik, özelleştirilebilirlik ve basit kullanımı, onu Java ekosistemindeki popüler araçlardan biri yapmaktadır.



## ModelMapper kullanırken dikkat etmeniz gereken bazı kurallar
```sh 

```
---


ModelMapper kullanırken dikkat etmeniz gereken bazı kurallar ve en iyi uygulamalar vardır. Bu kurallar, ModelMapper’ın performansını optimize etmek, dönüşüm sürecini hatasız ve daha anlaşılır hale getirmek için önemlidir. İşte dikkat edilmesi gereken bazı temel kurallar:

### 1. **Matching Strategy (Eşleştirme Stratejisi) Seçimine Dikkat Edin**
- ModelMapper, varsayılan olarak `STANDARD` eşleştirme stratejisini kullanır. Bu strateji, alan adlarının tamamen eşleşmesini bekler ve küçük harf-farklılıklarını veya alt sınıf yapıları göz ardı etmez.
- Eğer alan adlarında küçük farklılıklar varsa veya daha esnek bir eşleştirme gerekiyorsa `LOOSE` stratejisini kullanabilirsiniz. Ancak `LOOSE` stratejisi daha esnektir ve yanlış eşleştirme yapma ihtimali daha yüksektir.
- Öneri: Mümkünse `STRICT` veya `STANDARD` stratejisini kullanarak eşleştirme doğruluğunu artırın.

   ```java
   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
   ```

### 2. **Boş (null) Alanları Hariç Tutma**
- Varsayılan olarak, ModelMapper tüm alanları eşleştirmeye çalışır. Ancak bazı durumlarda, `null` olan alanları hedef nesneye taşımak istemeyebilirsiniz. Örneğin, güncelleme işlemlerinde boş alanların eski değerleri değiştirmemesi gerekebilir.
- `isNotNull` koşulunu kullanarak `null` değerleri hariç tutabilirsiniz.

   ```java
   modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
   ```

### 3. **Eşleştirilecek Alanların Adlarının Tutarlı Olmasına Özen Gösterin**
- ModelMapper, alan adlarını temel alarak otomatik eşleştirme yapar. Bu yüzden kaynak (source) ve hedef (destination) nesneler arasındaki alan adlarının tutarlı olması önemlidir.
- Farklı adlandırılmış alanlar arasında eşleştirme yapmanız gerektiğinde, `TypeMap` veya `addMappings` kullanarak özelleştirme yapabilirsiniz.

   ```java
   modelMapper.typeMap(User.class, UserDTO.class).addMappings(mapper -> 
       mapper.map(User::getFirstName, UserDTO::setName));
   ```

### 4. **Karmaşık ve Büyük Nesneler İçin Eşleştirmeyi Basitleştirin**
- Büyük nesneler ve çok katmanlı yapılar ModelMapper ile eşleştirildiğinde performans sorunları yaşanabilir. Bu durumda yalnızca ihtiyacınız olan alanları eşleştirmeye özen gösterin.
- Özellikle karmaşık nesne yapılarında, alt nesneler arasında yapılan derin kopyalama işlemleri (deep copy) performans kaybına yol açabilir. Gereksiz eşleştirmelerden kaçının.

### 5. **Koleksiyonlar İçin Tür Belirlemesi Yapın**
- ModelMapper, koleksiyon türleri arasında dönüşüm yaparken tür bilgisine ihtiyaç duyar. Koleksiyonlar için dönüşüm yaparken tür bilgilerini `TypeToken` ile belirtin.
- Örneğin, `List<User>` nesnesini `List<UserDTO>` nesnesine dönüştürmek için `TypeToken` kullanmak önemlidir.

   ```java
   Type listType = new TypeToken<List<UserDTO>>() {}.getType();
   List<UserDTO> userDTOList = modelMapper.map(userList, listType);
   ```

### 6. **DTO ve Entity Sınıflarında Fazla Alan Kullanmayın**
- DTO (Data Transfer Object) ve Entity sınıflarında yalnızca ihtiyacınız olan alanları kullanın. Fazla ve gereksiz alanlar, dönüşüm işlemlerini karmaşıklaştırabilir ve hatalara yol açabilir.
- Ayrıca, her iki sınıfta aynı işlevi gören alanların adlarının uyumlu olmasına dikkat edin.

### 7. **Mapping Yapısını Test Edin**
- Özellikle karmaşık dönüşüm işlemlerinde, ModelMapper’ın doğru çalıştığından emin olmak için birim testler yazın.
- Testler, eşleştirmenin beklendiği gibi yapıldığını doğrulamanıza yardımcı olur. Örneğin, `assertEquals` kullanarak kaynak ve hedef nesnelerdeki alanların doğru şekilde eşleştirildiğini kontrol edebilirsiniz.

   ```java
   @Test
   public void testUserToUserDtoMapping() {
       ModelMapper modelMapper = new ModelMapper();
       User user = new User(1L, "John", "Doe", "john@example.com");
       UserDTO userDTO = modelMapper.map(user, UserDTO.class);

       assertEquals(user.getFirstName(), userDTO.getFirstName());
       assertEquals(user.getEmail(), userDTO.getEmail());
   }
   ```

### 8. **Performansı İzleyin**
- ModelMapper, çalışma zamanında eşleştirme yaptığı için özellikle büyük veri setleri üzerinde çalışırken performans sorunları yaşanabilir.
- Performans kritik uygulamalarda alternatif dönüşüm kütüphanelerini (örneğin, MapStruct) değerlendirebilirsiniz.

### 9. **Özelleştirilmiş Eşleştirmeler İçin TypeMap Kullanımı**
- Karmaşık dönüşümler veya farklı adlandırma durumlarında `TypeMap` kullanarak özel eşleştirmeler tanımlayabilirsiniz.
- `TypeMap`, belirli dönüşümler için yapılandırmaları saklar ve performans açısından daha avantajlıdır.

   ```java
   TypeMap<User, UserDTO> typeMap = modelMapper.createTypeMap(User.class, UserDTO.class);
   typeMap.addMappings(mapper -> mapper.map(User::getAddress, UserDTO::setUserAddress));
   ```

### 10. **Gerekmedikçe Derin Eşleştirmelerden Kaçının**
- ModelMapper varsayılan olarak derin eşleştirme yapar, yani alt nesneleri de eşleştirir. Ancak, tüm alt nesnelerin dönüştürülmesi her zaman gerekmeyebilir.
- Derin eşleştirmenin kapatılması gereken durumlarda `modelMapper.getConfiguration().setDeepCopyEnabled(false);` ayarını kullanabilirsiniz.

### 11. **Eşleştirme Çakışmalarını Önleyin**
- Aynı kaynak sınıfı farklı hedef sınıflara dönüştürmek istediğinizde, `TypeMap` kullanarak her dönüşüm için ayrı bir yapılandırma tanımlayın. Bu, ModelMapper’ın çakışan dönüşüm yapılandırmalarını önlemesini sağlar.
- Aynı türde iki farklı hedef nesneye dönüşüm yapılması gerektiğinde, her dönüşüm için özel `TypeMap` tanımları kullanarak dönüşümleri yönetebilirsiniz.

### 12. **@Configuration Sınıfı ile Merkezi Konfigürasyon Sağlayın**
- Özellikle Spring Boot projelerinde ModelMapper’ı merkezi bir yapılandırma sınıfında `@Bean` olarak tanımlayın ve tüm uygulama genelinde aynı `ModelMapper` nesnesini kullanın.
- Merkezi bir konfigürasyon, kodun yönetilebilirliğini artırır ve tek bir noktadan tüm ModelMapper yapılandırmalarını değiştirme imkanı sunar.

   ```java
   @Configuration
   public class ModelMapperConfig {
       
       @Bean
       public ModelMapper modelMapper() {
           ModelMapper modelMapper = new ModelMapper();
           modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
           return modelMapper;
       }
   }
   ```

### Sonuç

ModelMapper, veri dönüşümlerini hızlı ve kolay hale getiren güçlü bir kütüphanedir. Ancak, özellikle büyük projelerde veya karmaşık veri modellerinde bazı performans ve yapılandırma sorunları yaşanabilir. Bu yüzden yukarıdaki kurallara dikkat etmek, ModelMapper’ın daha verimli kullanılmasını sağlar. Özellikle `MatchingStrategy` seçimi, `TypeMap` ile özelleştirme, koleksiyon türlerinin belirlenmesi ve gereksiz derin eşleştirmelerden kaçınma gibi kurallar, ModelMapper’ın işlevselliğini artırır ve dönüşüm işlemlerinin daha güvenli ve hızlı olmasını sağlar.

Dikkat etmeniz gereken bu kurallar sayesinde ModelMapper’ı daha verimli kullanabilir ve veri dönüştürme işlemlerini yönetilebilir bir yapıya kavuşturabilirsiniz.

## Lombok
```sh 

```
---
Lombok, Java geliştiricilerinin daha az kod yazarak daha okunabilir ve bakım yapılabilir kodlar geliştirmesini sağlamak amacıyla kullanılan bir kütüphanedir. Java dilinde, getter ve setter metodları, `toString()`, `equals()`, `hashCode()`, constructor (yapıcı metodlar) gibi birçok tekrarlayan kod yazmak gerekmektedir. Lombok, bu tarz kodları otomatik olarak oluşturarak, geliştiricinin kod tekrarını azaltmasını sağlar ve kodu daha temiz hale getirir.

### Lombok’un Amacı ve Faydaları

1. **Kod Tekrarını Azaltır**: Lombok, Java dilinde sıkça yazılan getter/setter, constructor gibi metotları otomatik oluşturur. Bu, özellikle büyük projelerde kod tekrarını azaltır ve kodun daha okunabilir hale gelmesini sağlar.

2. **Daha Temiz ve Okunabilir Kod**: Lombok, sınıfların sadece iş mantığını içermesini sağlar. Gereksiz metotlar ve alanlar yerine, sadece anotasyonlarla bu işlemler yapılabilir, bu da kodu daha sade hale getirir.

3. **Daha Hızlı Geliştirme**: Tekrarlayan kod yazmak yerine, Lombok anotasyonları kullanılarak hızlı bir şekilde sınıflar tanımlanabilir. Lombok, boilerplate kod olarak bilinen ve defalarca yazılması gereken yapıları ortadan kaldırarak zamandan tasarruf sağlar.

### Lombok Kurulumu

Lombok, Java projelerine Maven veya Gradle bağımlılığı eklenerek kolayca entegre edilebilir.

Maven ile kurulum:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.20</version>
    <scope>provided</scope>
</dependency>
```

Gradle ile kurulum:

```gradle
implementation 'org.projectlombok:lombok:1.18.20'
```

Eklendikten sonra, Lombok kullanılabilir hale gelir ve projeye dahil edilen anotasyonlar, kod derlendiğinde otomatik olarak ilgili metotları oluşturur.

### Lombok’un Başlıca Anotasyonları ve Kullanımı

Lombok, farklı işlemleri gerçekleştiren birçok anotasyona sahiptir. Her anotasyonun kendine özgü işlevi vardır ve uygun yerlerde kullanıldığında kodu oldukça sadeleştirir.

#### 1. `@Getter` ve `@Setter`

`@Getter` ve `@Setter` anotasyonları, sınıf içindeki alanlar için getter ve setter metodlarını otomatik olarak oluşturur. Bu anotasyonlar, özellikle POJO (Plain Old Java Object) sınıflarında yaygın olarak kullanılır.

```java
import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter
    private Long id;
    
    @Getter @Setter
    private String name;
}
```

Bu örnekte, `id` ve `name` alanları için getter ve setter metotları otomatik olarak oluşturulur. Lombok sayesinde, bu metotları manuel olarak yazmak zorunda kalmazsınız.

#### 2. `@ToString`

`@ToString` anotasyonu, `toString()` metodunu otomatik olarak oluşturur. Bu metot, nesnenin tüm alanlarını veya belirtilen alanlarını içeren bir `String` temsilini döndürür.

```java
import lombok.ToString;

@ToString
public class User {
    private Long id;
    private String name;
}
```

Bu anotasyon, `User` nesnesi için `toString()` metodunu oluşturur ve id ve name alanlarının değerlerini döndürür. Ayrıca `exclude` parametresi ile `toString()` metodunda yer almasını istemediğiniz alanları belirleyebilirsiniz:

```java
@ToString(exclude = "id")
public class User {
    private Long id;
    private String name;
}
```

Bu durumda, `toString()` metodu `id` alanını hariç tutarak sadece `name` alanını döndürür.

#### 3. `@EqualsAndHashCode`

`@EqualsAndHashCode` anotasyonu, `equals()` ve `hashCode()` metodlarını otomatik olarak oluşturur. Bu metotlar, nesnelerin eşitliğini kontrol etmek ve nesneleri bir hash tablosunda saklamak için kullanılır.

```java
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class User {
    private Long id;
    private String name;
}
```

Bu anotasyon, `User` sınıfı için `equals()` ve `hashCode()` metodlarını oluşturur. `onlyExplicitlyIncluded` parametresi ile belirli alanların eşitlik kontrolüne dahil edilmesi sağlanabilir.

#### 4. `@NoArgsConstructor`, `@AllArgsConstructor`, ve `@RequiredArgsConstructor`

- **@NoArgsConstructor**: Parametresiz bir yapıcı metod (constructor) oluşturur.
- **@AllArgsConstructor**: Sınıftaki tüm alanlar için bir yapıcı metod oluşturur.
- **@RequiredArgsConstructor**: Sadece `final` ve `@NonNull` olarak işaretlenmiş alanlar için bir yapıcı metod oluşturur.

```java
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    private Long id;
    private final String name;
}
```

Bu örnekte, `User` sınıfı için parametresiz, tüm alanları içeren ve sadece `name` alanını zorunlu kılan yapıcı metodlar oluşturulacaktır.

#### 5. `@Data`

`@Data` anotasyonu, `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode` ve `@RequiredArgsConstructor` anotasyonlarını tek bir yerde toplar. Genellikle veri taşıma nesnelerinde (DTO) kullanılır.

```java
import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
}
```

Bu anotasyon, `User` sınıfı için tüm getter/setter, `toString()`, `equals()`, `hashCode()` ve final alanlar için bir yapıcı metod oluşturur.

#### 6. `@Builder`

`@Builder` anotasyonu, sınıfın bir builder deseni ile oluşturulmasını sağlar. Bu, özellikle çok sayıda parametreye sahip nesnelerin daha okunabilir bir şekilde oluşturulmasına olanak tanır.

```java
import lombok.Builder;

@Builder
public class User {
    private Long id;
    private String name;
}
```

Bu anotasyon, `User` sınıfı için bir builder oluşturur. `User` nesnesi aşağıdaki gibi oluşturulabilir:

```java
User user = User.builder()
                .id(1L)
                .name("John Doe")
                .build();
```

#### 7. `@Value`

`@Value` anotasyonu, immutable (değişmez) sınıflar oluşturmak için kullanılır. Tüm alanlar `final` olur ve sınıfın getter metotları ile `toString()`, `equals()`, `hashCode()` metotları otomatik olarak oluşturulur.

```java
import lombok.Value;

@Value
public class User {
    Long id;
    String name;
}
```

Bu sınıfın `id` ve `name` alanları değiştirilemez hale gelir, sadece okuma yapılabilir.

#### 8. `@NonNull`

`@NonNull` anotasyonu, bir alanın null olamayacağını belirtir. Bu anotasyon ile işaretlenen alan null olarak verilirse, `NullPointerException` fırlatılır.

```java
import lombok.NonNull;

public class User {
    private Long id;
    
    @NonNull
    private String name;
}
```

Bu örnekte, `name` alanına null değer atanırsa, çalışma zamanında bir `NullPointerException` meydana gelir.

### Lombok Kullanırken Dikkat Edilmesi Gerekenler

1. **Kodun Anlaşılabilirliği**: Lombok kodu otomatik oluşturduğu için, kodu inceleyen birinin hangi metotların mevcut olduğunu anlaması zorlaşabilir. Özellikle `@Data`, `@Builder` gibi anotasyonlar kullanılan sınıflarda, IDE yardımıyla kodu incelemek faydalı olur.

2. **Eşitlik ve Hash Kodu**: `@EqualsAndHashCode` anotasyonunu kullanırken dikkatli olun. Eşitlik ve hash kodu, nesnelerin karşılaştırılmasında ve hash tablosunda saklanmasında önemli rol oynar. Eşitlik kontrollerini belirli alanlarla sınırlandırmanız gerekiyorsa `@EqualsAndHashCode` ile bu alanları tanımlayın.

3. **Performans Kaygıları**: Lombok’un tüm alanlar için getter/setter oluşturması her durumda gerekli olmayabilir. Gereksiz metotlar performans kaygılarına neden olabilir. Sadece ihtiyaç duyulan anotasyonları kullanmaya özen gösterin.

4. **IDE Desteği**: Lombok, IDEA veya Eclipse gibi IDE'lerde desteklenir, ancak IDE üzerinde ek bir eklenti yüklemek gerekebilir. Lombok'un tam olarak çalışabilmesi için IDE'ye Lombok eklentisi kurmalısınız.

5. **Immutable Sınıflar İçin @Value Kullanabilirsiniz. `@Value` anotasyonu, immutable (değiştirilemez) sınıflar oluşturmak için Lombok’un sağladığı bir kolaylıktır. `@Value` anotasyonu kullanıldığında sınıfın tüm alanları otomatik olarak `final` ve private olur; ayrıca sınıfa getter metotları, `toString()`, `equals()` ve `hashCode()` metotları eklenir. Bu, sınıfın değişmezliğini sağlar ve veri taşıma nesneleri (DTO) veya sabit veri yapıları için oldukça uygun hale getirir.

```java
import lombok.Value;

@Value
public class User {
    Long id;
    String name;
}
```

Bu örnekte `User` sınıfı, `@Value` anotasyonu ile işaretlendiğinden, oluşturulduktan sonra değiştirilemez hale gelir. `id` ve `name` alanlarına ilk değer atandıktan sonra bu alanların değeri değiştirilemez. Böylece `User` sınıfı immutable bir sınıf haline gelir ve daha güvenli bir yapı sunar.

### Lombok ile İlgili Diğer Önemli Anotasyonlar

#### 1. `@SneakyThrows`
`@SneakyThrows` anotasyonu, checked exception (kontrollü istisnalar) kullanımını basitleştirir. Java’da genellikle checked exception’lar (IOException, SQLException gibi) `try-catch` blokları içinde yakalanmak zorundadır. Ancak `@SneakyThrows` ile bu zorunluluk ortadan kaldırılabilir.

```java
import lombok.SneakyThrows;

public class FileReaderExample {

    @SneakyThrows
    public void readFile(String fileName) {
        FileReader fileReader = new FileReader(fileName);
        // Dosya okuma işlemleri
    }
}
```

Bu örnekte, `FileReader` normalde `FileNotFoundException` fırlatır ve `try-catch` bloğu gerektirir. Ancak `@SneakyThrows`, bu istisnayı method imzasında belirtmeden kullanmamıza olanak tanır. **Dikkat edilmesi gereken nokta:** `@SneakyThrows` kullanımı, checked exception’ların gözden kaçmasına yol açabilir; bu yüzden dikkatli kullanılmalıdır.

#### 2. `@Accessors`
`@Accessors` anotasyonu, getter ve setter metodlarının isimlendirme yapısını değiştirmemize olanak tanır. Normalde getter/setter metotları `getField()` ve `setField()` şeklinde isimlendirilir. Ancak `@Accessors(fluent = true)` kullanarak, alan adını doğrudan getter/setter metodu olarak kullanabilirsiniz.

```java
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class User {
    private Long id;
    private String name;
}
```

Bu durumda `user.getName()` yerine `user.name()` ve `user.setName("John")` yerine `user.name("John")` yazabilirsiniz. `@Accessors(chain = true)` ise, setter metotlarının zincirleme (chaining) kullanımına izin verir. Bu sayede daha akıcı bir yapı sağlanır.

```java
user.id(1L).name("John");
```

#### 3. `@NonNull`
`@NonNull` anotasyonu, null değerlerin kabul edilmediği alanları belirtir. Bu anotasyon `null` bir değer atanmaya çalışıldığında otomatik olarak `NullPointerException` fırlatır. Özellikle güvenli veri işlemlerinde faydalıdır.

```java
import lombok.NonNull;

public class User {

    private Long id;
    
    @NonNull
    private String name;
}
```

Bu örnekte, `name` alanı `null` olarak atanırsa `NullPointerException` oluşur. `@NonNull`, özellikle zorunlu alanların belirlenmesi ve güvenli hale getirilmesinde yardımcı olur.

### Lombok Kullanırken Dikkat Edilmesi Gereken Önemli Noktalar

1. **Kod Bakımı ve Okunabilirlik**: Lombok, kodu oldukça sadeleştirir, ancak aynı zamanda metotları görünmez hale getirdiği için kodun anlaşılmasını zorlaştırabilir. Takım çalışması yapılan projelerde, özellikle projeye yeni katılan geliştiricilerin kodu anlaması daha uzun sürebilir.

2. **Kodun Derleme Aşamasında Üretilmesi**: Lombok anotasyonları, derleme zamanında (compile-time) metotları ekler, bu nedenle IDE tarafından her zaman doğru bir şekilde tanınmayabilir. IDE desteğinin sağlanabilmesi için Lombok eklentisinin yüklenmiş olması gerekir.

3. **Performans ve Gereksizlikten Kaçınma**: Lombok tüm alanlar için getter/setter metodları veya tüm alanları içeren `toString()` metodunu otomatik olarak oluşturur. Bu nedenle, yalnızca gerçekten ihtiyaç duyulan metotları ve anotasyonları kullanmak daha performanslı bir yapı sunar.

4. **Immutable Sınıflar için @Value Kullanımı**: Immutable (değişmez) sınıflar, veri güvenliği açısından tercih edilir. `@Value` anotasyonu ile oluşturulan immutable sınıflar, eşzamanlı (concurrent) işlemlerde veri tutarlılığını sağlar. Ancak mutable (değişebilir) olması gereken sınıflarda `@Value` kullanmaktan kaçınılmalıdır.

5. **Test ve Hata Ayıklama**: Lombok’un oluşturduğu metotlar çalışma zamanında hataya yol açarsa, bu hataları bulmak zor olabilir. Bu yüzden Lombok kullanırken yazdığınız sınıfları iyi test etmek, beklenmedik hataların önüne geçmek açısından önemlidir.

6. **Özel Durumlara Dikkat**: Lombok bazı özel durumlarda (örneğin, karmaşık yapılı sınıflar veya büyük veri yapıları gibi) beklenmedik performans sorunlarına yol açabilir. Özellikle çok sayıda alan içeren veya derin yapıdaki nesneler için performans optimizasyonuna dikkat edilmelidir.

### Lombok’un Sağladığı Genel Avantaj ve Dezavantajlar

#### Avantajlar

- **Kod Tekrarını Azaltır**: Lombok’un anotasyonları sayesinde sınıflarda sıkça yazılması gereken kodlar otomatik olarak oluşturulur. Bu sayede kod tekrarından kaçınılır.
- **Daha Az Kod, Daha Fazla Okunabilirlik**: Lombok, sınıfları daha anlaşılır hale getirir. Özellikle `@Data` gibi anotasyonlar ile tüm temel metotlar tek bir satırda oluşturulabilir.
- **Kolay Entegrasyon**: Lombok, Maven veya Gradle projelerine kolayca eklenebilir ve IDE’ler ile uyumludur.

#### Dezavantajlar

- **IDE Bağımlılığı**: Lombok, IDE tarafından otomatik olarak tanınmayabilir, bu yüzden ek bir eklentiye ihtiyaç duyar.
- **Bakım Zorluğu**: Lombok’un otomatik olarak ürettiği kodlar sınıfın içinde görünmez olduğu için, sınıfın davranışını anlamak zor olabilir.
- **Performans Maliyetleri**: Lombok, özellikle `toString()`, `equals()`, `hashCode()` gibi metodları karmaşık yapılar için otomatik olarak oluştururken performans kaybına yol açabilir.
- **Standartlara Bağımlılık**: Lombok, Java'nın standart bir kütüphanesi değildir. Proje bağımlılığının artması bazı kurumsal projelerde kabul edilmeyebilir.

### Sonuç

Lombok, Java projelerinde boilerplate kod olarak bilinen, sıkça tekrar eden yapıları otomatik olarak oluşturarak kodu sadeleştirir, geliştirme hızını artırır ve kodun daha okunabilir olmasını sağlar. `@Data`, `@Builder`, `@Value`, `@Getter` ve `@Setter` gibi anotasyonları sayesinde Java projelerinde büyük kolaylık sağlar.

Ancak Lombok’un kullanımı, bazı durumlarda karmaşıklaşabilir ve takım çalışması yapılan projelerde dikkatli kullanılmalıdır. Kodun anlaşılabilirliği, performans ve bakım açısından Lombok’un sağladığı avantajları ve potansiyel dezavantajları değerlendirerek kullanmak en doğru yaklaşım olacaktır.

Lombok’un özelliklerinden en iyi şekilde faydalanmak için ihtiyaca göre doğru anotasyonları kullanmaya özen gösterin ve her anotasyonun kullanım amacını iyi anlayın. Kodunuzun sürdürülebilirliğini sağlamak için Lombok ile yazılan sınıfları iyi test etmeyi unutmayın.



## Spring Boot (@PostConstruct)
```sh 

```
---

#### 1. **`@PostConstruct` Anotasyonu:**
- **Ne yapar?** Bu metodun, sınıfın tüm bağımlılıkları atandıktan sonra çalıştırılmasını sağlar.
- Yani, `springData()` metodu, sınıfın diğer bileşenleri veya bağımlılıkları (örneğin, `apiResult` gibi) Spring tarafından hazır hale getirildikten sonra çalıştırılır.
- **Neden kullanılır?** Eğer belirli bir nesne veya değişken (örneğin `apiResult`) sınıf başlatıldığında otomatik olarak başlatılmak isteniyorsa,
- bu anotasyon kullanılır. Böylece her seferinde constructor’da veya manuel olarak başlatmak zorunda kalmazsınız.

#### 2. **`apiResult = new ApiResult();`**
- **Ne yapar?** `springData()` metodu çalıştığında, `apiResult` nesnesi yeni bir `ApiResult` örneği olarak başlatılır.
- Bu sayede sınıfın diğer metotları bu `apiResult` örneğini kullanabilir.
- **Bağlam:** `apiResult` burada bir sınıf değişkeni (instance variable) olarak tanımlanmıştır.
- Eğer bu değişkenin başlatılması gerekiyorsa, `@PostConstruct` anotasyonu ile bağımlılıkların atandıktan hemen sonra bu işlemi gerçekleştirebilirsiniz.

### Özet:
- **`@PostConstruct`**, Spring tarafından yönetilen bir sınıfın yaşam döngüsünde constructor'dan sonra,
- ancak diğer metodların çağrılmasından önce çalıştırılacak bir metodu belirtir.
- Bu anotasyon ile sınıfın ilk kurulum aşamasında gerekli hazırlıkları yapmak için kullanılabilir,
- örneğin: veri başlatma, bağlantı kurma ya da değişkenlere ilk değer atama gibi işlemler.



---
## GET attributes
@GetMapping(
name = "/addres_list_name",
value = "/list",
//path = "/list2"
params = "active=true",
consumes = "application/json",
produces = "application/json",
headers = "X-API-VERSION=1"
)
@Override
public ResponseEntity<List<AddressDto>> addressApiList() {
return ResponseEntity.status(HttpStatus.OK).body(iAddressService.addressServiceList());
}

Bu komutta kullanılan `@GetMapping` anotasyonu, Spring Framework'deki RESTful API geliştirme işlemlerinde kullanılan bir anotasyondur. Bu anotasyon, bir HTTP GET isteğine yanıt veren bir metodun yapılandırılmasını sağlar. Kodda verilen her bir özelliği (attribute) detaylı bir şekilde inceleyip, nasıl çalıştığını ve ne anlama geldiğini açıklayacağım. Ayrıca, her bir özelliğin API'nin nasıl çalışmasını etkilediğini de ayrıntılı olarak açıklayacağım.

### Komut:
```java
@GetMapping(
    name = "/addres_list_name",
    value = "/list",
    path = "/list",
    params = "active=true",
    consumes = "application/json",
    produces = "application/xml",
    headers = "X-API-VERSION=1"
)
@Override
public ResponseEntity<List<AddressDto>> addressApiList() {
    return ResponseEntity.status(HttpStatus.OK).body(iAddressService.addressServiceList());
}
```

## Kısaca
    /*
    İşte `@GetMapping` anotasyonundaki parametrelerin kısa ve madde madde açıklamaları:

1. **`name`:**
    - Metoda bir isim verir (genellikle içsel kullanım içindir, dışarıdan görünmez).
    - Örnek: `name = "/address_list_name"`

2. **`value`:**
    - GET isteğinin URL yolunu belirtir (endpoint).
    - Örnek: `value = "/list"`

3. **`path`:**
    - `value` ile aynı işlevi görür, endpoint yolunu belirtir.
    - Örnek: `path = "/list2"`

4. **`params`:**
    - GET isteğinde belirli bir query parametresinin bulunmasını zorunlu kılar.
    - Örnek: `params = "active=true"`
    - EndPoint: http://lcaolhost:4444/list?active=true

5. **`consumes`:**
    - İstek veri formatını (Content-Type) belirtir, sadece bu formatta gelen verileri kabul eder.
    - Örnek: `consumes = "application/json"`

6. **`produces`:**
    - Yanıt veri formatını belirtir, API'nin döneceği formatı tanımlar.
    - Örnek: `produces = "application/json"`
    - - Örnek: `produces = "application/xml"`

7. **`headers`:**
    - İstek başlığında (header) belirli bir bilginin bulunmasını zorunlu kılar.
    - Örnek: `headers = "X-API-VERSION=1"`
      */
## name attribute örnek vermek
"Bu isim, Spring'in dahili mekanizmasında kullanılabilir" ifadesi, Spring'in kendi yapısında bu ismi referans olarak kullanabileceği anlamına gelir.
Ancak, bu isim dışarıya görünmez, yani API'yi çağıran istemciler bu ismi görmez veya bilmezler.
Bu isim, genellikle Spring'in içsel işlemlerinde, logging (kayıt tutma), izleme veya debugging (hata ayıklama) gibi durumlarda kullanılabilir.

### Örnek:
Spring uygulamanızda birden fazla endpoint olabilir ve her birine `name` özelliği ile benzersiz isimler verebilirsiniz. Bu isimler, özellikle monitoring (izleme) veya hata ayıklama araçları tarafından kullanılabilir.

#### Kullanım Senaryosu:
1. **İzleme ve Debugging:** Uygulamanız bir monitoring aracı ile izleniyorsa, belirli bir endpoint'in adı bu araçlarda kolayca görüntülenebilir ve loglarda daha anlaşılır bir bilgi sağlar.

2. **Logging:** Loglarınızda hangi metodun hangi isimle çağrıldığını belirtmek isteyebilirsiniz. Örneğin, hata aldığınızda bu endpoint'e verilen isim loglarda gözükebilir.

### Örnek:
```java
@GetMapping(
    name = "getAddressListEndpoint",
    value = "/list",
    produces = "application/json"
)
public ResponseEntity<List<AddressDto>> addressApiList() {
    log.info("Calling the endpoint: getAddressListEndpoint");
    return ResponseEntity.ok(iAddressService.addressServiceList());
}
```

Bu örnekte, `log.info("Calling the endpoint: getAddressListEndpoint");` satırı, bu endpoint'e yapılan çağrıların loglanmasını sağlar. Loglarda bu metodun adı `getAddressListEndpoint` olarak görünür. Bu, metodun ne işe yaradığını anlamayı kolaylaştırır.

### Spring Actuator ile Kullanım:
Eğer Spring Actuator kullanıyorsanız, uygulamanızın `name` ile tanımlanmış metodlarını izleme veya raporlama araçlarıyla daha anlamlı hale getirebilirsiniz.

```bash
curl http://localhost:8080/actuator/mappings
```

Bu komutla, Spring Actuator üzerinde tanımlı tüm endpoint'leri görebilirsiniz ve bu noktada `name` ile verilmiş isimler bu mapping bilgisi içinde görünür.

### `@GetMapping` Anotasyonunun Ayrıntılı Açıklaması:
Spring Framework'de `@GetMapping` anotasyonu, bir HTTP GET isteğini belirli bir metoda eşlemek için kullanılır.
Bu metoda gelen GET isteği, `value` ve diğer koşullara göre doğru URL'ye ve isteklere yönlendirilir.

#### 1. **`name`:**
```java
name = "/addres_list_name"
```
- **Açıklama:** `name` özelliği, Spring'in dahili kullanımında metodlara bir referans ismi vermek için kullanılır. Normalde bu isim dışarıya yansıtılmaz ve kullanıcının göremeyeceği bir özelliktir.
- **Anlamı:** Bu metot için bir isim tanımlanmıştır: "/addres_list_name". Bu, proje içinde Spring'in bu metodu izleyebilmesi ve gerektiğinde referans verebilmesi için kullanılabilir.
- **Kullanımı:** Özellikle büyük projelerde, belirli metodlara referans vermek ve metodların izlenebilirliğini artırmak için faydalıdır.
- Ancak genellikle küçük projelerde bu özelliğin kullanımı zorunlu değildir ve isteğe bağlıdır.

#### 2. **`value`:**
```java
value = "/list"
```
- **Açıklama:** `value` özelliği, GET isteğinin URL yolunu tanımlar.
- Bu, istemcinin hangi URL'ye istek yapacağını belirleyen temel yoldur.
- **Anlamı:** `/list` olarak belirlenen bu URL, istemcinin `http://localhost:4444/api/address/list` adresine GET isteği yaparak bu metoda ulaşmasını sağlar.
- Uygulamanın çalıştığı kök URL ve sınıf düzeyinde tanımlanan yol (muhtemelen `/api/address`) bu yolun tam halini belirler.
- **Kullanımı:** İstemci, bu API'ye erişmek istediğinde `http://localhost:4444/api/address/list` yoluna bir GET isteği yapar.
- Bu URL, servise dışarıdan erişim için kapı görevi görür.

#### 3. **`params`:**
```java
params = "active=true"
```
- **Açıklama:** `params` özelliği, HTTP isteğinin belirli bir query parametresini içermesi gerektiğini belirtir. Burada, URL'de belirli parametreler bulunması zorunlu kılınmıştır.
- **Anlamı:** API çağrısı yapılırken, URL'de `active=true` query parametresi olmalıdır. Örneğin: `http://localhost:4444/api/address/list?active=true` şeklinde bir GET isteği yapılması gerekir.
- Eğer bu parametre belirtilmezse veya değeri farklı olursa, istek bu metoda yönlendirilmez.
- **Kullanımı:** `params` özelliği ile aynı endpoint'e farklı parametreler göndererek farklı işlemler gerçekleştirebiliriz.
- Parametre kontrolü, isteğin doğru metodla eşleşmesini sağlar.

#### 4. **`consumes`:**
```java
consumes = "application/json"
```
- **Açıklama:** `consumes` özelliği, API'ye gönderilecek olan isteğin veri formatını belirtir.
- Yani bu metod, yalnızca belirli bir formatta (bu örnekte `application/json`) gönderilen istekleri kabul eder.
- **Anlamı:** Bu API, sadece JSON formatındaki verileri kabul eder.
- Bu, istemcinin isteği yaparken `Content-Type: application/json` başlığı ile veri göndermesi gerektiği anlamına gelir.
- Eğer istek başka bir formatta (örneğin XML) gönderilirse, API bunu işleyemez ve 415 (Unsupported Media Type) hatası döner.
- **Kullanımı:** `consumes` özelliği, API'nin yalnızca belirli formatta veri almasını sağlamak için kullanılır.
- Genellikle JSON (`application/json`), XML (`application/xml`), veya form verisi (`application/x-www-form-urlencoded`) formatlarıyla çalışır.

#### 5. **`produces`:**
```java
produces = "application/json"
```
- **Açıklama:** `produces` özelliği, bu metodun istemciye hangi formatta yanıt döndüreceğini belirtir.
- Bu durumda, API JSON formatında bir yanıt döndürecektir.
- **Anlamı:** Yanıt, `application/json` formatında dönecektir. İstemci bu endpoint'i çağırırken `Accept: application/json` başlığını ekleyebilir ve yanıtın JSON formatında olduğunu bilmelidir.
- Eğer istemci farklı bir format beklerse (örneğin XML), 406 (Not Acceptable) hatası dönebilir.
- **Kullanımı:** Bu özellik, API'nin belirli bir formatta yanıt döndürmesini zorunlu kılar.
- JSON, XML, HTML gibi farklı formatlar arasında seçim yapabilirsiniz.

#### 6. **`headers`:**
```java
headers = "X-API-VERSION=1"
```
- **Açıklama:** `headers` özelliği, HTTP isteğinde belirli bir başlığın (header) bulunmasını zorunlu kılar.
- Bu örnekte, `X-API-VERSION` başlığı kullanılmaktadır.
- **Anlamı:** Bu API'yi çağırırken HTTP isteğine `X-API-VERSION: 1` başlığı eklenmelidir.
- Bu genellikle API versiyonlaması için kullanılır.
- İstemci bu başlığı göndermezse ya da farklı bir değer gönderirse, bu metot çalışmaz ve genellikle 400 (Bad Request) veya 404 (Not Found) hatası dönebilir.
- **Kullanımı:** `headers` özelliği, API versiyonlama, güvenlik veya farklı ihtiyaçlar doğrultusunda isteklere eklenen başlıkları kontrol etmek için kullanılır.
- Versiyonlamada API'nin farklı sürümlerini desteklemek için başlıklar sıkça kullanılır.

### Metodun Gövdesi:
```java
@Override
public ResponseEntity<List<AddressDto>> addressApiList() {
    return ResponseEntity.status(HttpStatus.OK).body(iAddressService.addressServiceList());
}
```
#### 1. **`@Override`:**
- **Açıklama:** Bu anotasyon, bir metotun üst sınıfta veya bir interface'de tanımlandığını ve burada tekrar tanımlandığını belirtir. Bu, metodun bir interface olan `IAddressApi`'dan alındığını gösterir.
- **Anlamı:** Bu metot, `IAddressApi` interface’inde tanımlanmış olmalıdır. Bu, Spring'te Interface-Implementation ilişkisini sağlar.

#### 2. **`ResponseEntity`:**
- **Açıklama:** `ResponseEntity`, HTTP yanıtlarını döndürmek için kullanılan bir sınıftır.
- Yanıtın durum kodu ve gövdesi gibi HTTP yanıtı ile ilgili tüm bilgileri içerir.
- **Anlamı:** Bu metod, HTTP yanıtı olarak bir liste döndürür (`List<AddressDto>`).
- Bu liste, Spring'in HTTP yanıtı olarak işleyebileceği şekilde paketlenir.
- Ayrıca, yanıt durum kodu olarak `HttpStatus.OK` (200) belirlenmiştir.
- **Kullanımı:** `ResponseEntity`, API yanıtının durum kodunu (`HttpStatus`), başlıklarını ve gövdesini kontrol etmek için güçlü bir yapı sağlar.
- Yanıtın gövdesi burada `iAddressService.addressServiceList()` tarafından sağlanan veri olacaktır.

#### 3. **`iAddressService.addressServiceList()`:**
- **Açıklama:** Bu, `iAddressService` adında bir servis tarafından sağlanan bir metottur.
- `addressServiceList()` metodu, adresleri listeleyen bir servis çağrısıdır.
- **Anlamı:** Bu servis çağrısı, adresleri (`AddressDto`) içeren bir liste döndürür ve bu liste API'ye yanıt olarak istemciye iletilir.
- **Kullanımı:** Servis katmanında iş mantığı genellikle burada yapılır.
- Bu, veritabanı veya başka bir kaynaktan verilerin alınmasını ve işlenmesini sağlar. Burada işlenen veri, API yanıtı olarak döndürülecektir.

### API’nin Nasıl Çalışacağı:
Bu metod, `http://localhost:4444/api/address/list` URL'sine yapılan GET isteklerini karşılar. Ancak bu

isteğin çalışabilmesi için birkaç koşul vardır:

1. **URL Parametresi:** İstek, `active=true` query parametresini içermelidir. Örneğin: `http://localhost:4444/api/address/list?active=true`.
2. **Başlıklar (Headers):** HTTP isteği, `X-API-VERSION: 1` başlığını içermelidir. Bu, API'nin doğru versiyonuna eriştiğinizi garanti eder.
3. **İçerik Tipi (Content-Type):** İstek verisi JSON formatında olmalıdır, yani `Content-Type: application/json` başlığı ile gönderilmelidir.
4. **Yanıt Formatı (Produces):** Yanıt JSON formatında döndürülecektir. İstemci, bu yanıtı alacaksa `Accept: application/json` başlığı ile çağrı yapabilir.

### Özet:
Bu API'nin GET metoduna gelen istek, belirli bir URL, query parametre, başlık ve içerik türü ile sınırlandırılmıştır.
Sadece `active=true` parametresi ile, `X-API-VERSION=1` başlığı ile ve `application/json` formatında gelen istekler işlenir.
Yanıt olarak JSON formatında bir `AddressDto` listesi döndürülür.
Bu yapı, API'nin versiyonlama, veri formatı yönetimi ve parametre kontrolü gibi gelişmiş özelliklerini kullanarak RESTful bir mimari sunar.

## @EnableWebMvc
---
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    // CORS yapılandırması
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Tüm URL'ler için geçerli
                .allowedOrigins("http://localhost:3000")  // İzin verilen köken
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // İzin verilen HTTP metodları
                .allowedHeaders("*");  // İzin verilen başlıklar
    }

    // Statik kaynaklar için yapılandırma
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")  // Kaynakların URL deseni
                .addResourceLocations("/public/", "classpath:/static/")  // Kaynakların yerleri
                .setCachePeriod(3600);  // Cache süresi (saniye)
    }

    // Interceptor eklemek için yapılandırma
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor())  // CustomInterceptor sınıfı ile Interceptor eklenir
                .addPathPatterns("/api/**")  // Hangi URL deseninde geçerli olacağı
                .excludePathPatterns("/api/login", "/api/register");  // Hariç tutulacak URL desenleri
    }
}


Spring Boot'ta `WebConfig` sınıfı genellikle özel yapılandırmalar yapmak için kullanılır. Özellikle CORS yapılandırması, statik kaynakların yönetimi, `Interceptor` ekleme gibi çeşitli web ayarlarını özelleştirmek amacıyla tercih edilir. Aşağıda bir `WebConfig` örneği ve açıklamaları yer almaktadır:

### WebConfig Örneği

```java
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    // CORS yapılandırması
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Tüm URL'ler için geçerli
                .allowedOrigins("http://localhost:3000")  // İzin verilen köken
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // İzin verilen HTTP metodları
                .allowedHeaders("*");  // İzin verilen başlıklar
    }

    // Statik kaynaklar için yapılandırma
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")  // Kaynakların URL deseni
                .addResourceLocations("/public/", "classpath:/static/")  // Kaynakların yerleri
                .setCachePeriod(3600);  // Cache süresi (saniye)
    }

    // Interceptor eklemek için yapılandırma
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor())  // CustomInterceptor sınıfı ile Interceptor eklenir
                .addPathPatterns("/api/**")  // Hangi URL deseninde geçerli olacağı
                .excludePathPatterns("/api/login", "/api/register");  // Hariç tutulacak URL desenleri
    }
}
```

### Açıklamalar:

1. **@Configuration**: Spring Boot'ta yapılandırma sınıflarını işaretler. `WebConfig`, Spring'e bu sınıfın yapılandırma amaçlı olduğunu söyler.

2. **@EnableWebMvc**: Bu anotasyon, Spring MVC'nin tam kontrolünü elde etmek için kullanılır. Ancak, Spring Boot varsayılan olarak birçok MVC ayarını otomatik olarak yapar. Bu nedenle, genellikle bu anotasyona ihtiyaç duyulmaz. Eğer manuel kontrol gerekiyorsa eklenir.

3. **addCorsMappings(CorsRegistry registry)**: Bu metot, Cross-Origin Resource Sharing (CORS) yapılandırması sağlar. Bu yapılandırmada:
    - `addMapping("/**")`: Tüm URL'ler için CORS kısıtlamalarını uygular.
    - `allowedOrigins("http://localhost:3000")`: Sadece `localhost:3000` kökeninden gelen istekleri kabul eder.
    - `allowedMethods("GET", "POST", "PUT", "DELETE")`: İzin verilen HTTP metodlarını tanımlar.
    - `allowedHeaders("*")`: Tüm başlıklara izin verir.

4. **addResourceHandlers(ResourceHandlerRegistry registry)**: Bu metot, statik kaynakların (CSS, JS, resimler vb.) nerede bulunduğunu ve bu kaynaklara nasıl erişileceğini tanımlar.
    - `addResourceHandler("/resources/**")`: `/resources/` ile başlayan URL'ler bu statik kaynaklara erişir.
    - `addResourceLocations("/public/", "classpath:/static/")`: Kaynakların dosya sisteminde ve classpath içinde nerede olduğunu belirtir.

5. **addInterceptors(InterceptorRegistry registry)**: Bu metot, istekleri işleme aşamasında öncesinde veya sonrasında ek davranışlar ekleyen Interceptor'lar tanımlar.
    - `addInterceptor(new CustomInterceptor())`: `CustomInterceptor` sınıfı ile bir Interceptor eklenir.
    - `addPathPatterns("/api/**")`: Bu Interceptor sadece `/api/` ile başlayan URL'lerde çalışır.
    - `excludePathPatterns("/api/login", "/api/register")`: `/api/login` ve `/api/register` URL'leri Interceptor'dan hariç tutulur.

Bu şekilde, Spring Boot projelerinizde CORS, statik kaynak yönetimi ve Interceptor'ları yönetebilirsiniz. `WebMvcConfigurer` arayüzü, bu yapılandırmaları yapmanıza imkan tanır.


`.setCachePeriod(3600)` metodu, statik kaynaklar için cache (önbellekleme) süresini saniye cinsinden ayarlayan bir işlevdir. Buradaki 3600 değeri, cache süresinin 3600 saniye, yani 1 saat olduğunu belirtir. Bu süre boyunca tarayıcı veya istemci, statik kaynakları (örneğin CSS, JavaScript, resim dosyaları gibi) yeniden indirmek yerine önbellekten kullanır.

Önbellekleme, sunucu üzerindeki yükü azaltmak ve uygulamanın performansını artırmak için kullanılır. Statik kaynaklar sık sık değişmez, bu yüzden istemcilerin her seferinde sunucudan bu dosyaları indirmesine gerek yoktur. Önbellekleme süresi şu anlama gelir:

- **Cache süresi dolmadan**: İstemci (tarayıcı gibi), kaynağı tekrar sunucudan talep etmez, bunun yerine daha önce aldığı ve önbelleğe kaydettiği versiyonu kullanır.
- **Cache süresi dolduktan sonra**: İstemci, kaynağın güncellenmiş olup olmadığını kontrol etmek için sunucuya yeni bir talep gönderir.

Örneğin, `.setCachePeriod(3600)` kullanıldığında, istemci bir CSS dosyasını ilk defa aldığında, bu dosya 1 saat boyunca istemcinin cache belleğinde tutulur ve bu süre dolmadan sunucuya tekrar bu dosya için istek göndermez.

Bu yöntem özellikle büyük dosyalar ve sık güncellenmeyen statik içerikler için faydalıdır, çünkü istemciler sunucudan gereksiz yere veri indirmez ve böylece uygulamanızın performansı artar.


`public void addResourceHandlers(ResourceHandlerRegistry registry)` metodu, Spring Boot'ta statik kaynakların (CSS, JavaScript, resim dosyaları vb.) nasıl yönetileceğini ve nerede bulunacağını yapılandırmak için kullanılan bir metottur. Bu metot, Spring MVC'nin varsayılan olarak sağladığı statik kaynak yönetimini özelleştirmemizi sağlar.

### Kullanım Amacı
Bu metot ile uygulamanızın kaynaklarının nerede yer aldığını ve bu kaynaklara nasıl erişileceğini belirleyebilirsiniz. Statik kaynaklar genellikle `src/main/resources/static` dizininde tutulur. Ancak, bu dizini değiştirmek, farklı dizinler eklemek veya önbellekleme ayarları gibi ek yapılandırmalar yapmak istediğinizde `addResourceHandlers` metodunu kullanabilirsiniz.

### Parametre: `ResourceHandlerRegistry`
`ResourceHandlerRegistry`, statik kaynakların tanımlandığı bir yapılandırma aracıdır. Bu parametre ile Spring MVC'ye hangi URL desenlerine karşı hangi kaynakların sunulacağını belirleriz.

### Örnek

```java
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/resources/**")  // URL deseni
            .addResourceLocations("classpath:/static/", "/public/")  // Kaynakların konumları
            .setCachePeriod(3600);  // Önbellekleme süresi (saniye)
}
```

### Açıklamalar:

1. **`addResourceHandler("/resources/**")`**: Bu, URL desenini belirtir. Yani uygulamanızda `/resources/` ile başlayan herhangi bir URL, tanımladığınız kaynak dosyalarına yönlendirilecektir. Örneğin, `/resources/css/style.css` gibi bir URL bu yapılandırmaya uygun olacaktır.

2. **`addResourceLocations("classpath:/static/", "/public/")`**: Bu metot, kaynak dosyalarının yerini tanımlar. Burada iki farklı kaynak dizini belirtilmiş:
    - `classpath:/static/`: Bu, `src/main/resources/static/` dizinini ifade eder. Spring Boot projelerinde genellikle statik dosyalar burada tutulur.
    - `/public/`: Bu da proje klasörünüzdeki bir dizini ifade eder. Eğer dosyalarınız `public` klasöründe bulunuyorsa, buraya erişim de sağlar.

3. **`setCachePeriod(3600)`**: Bu, yukarıda açıkladığımız gibi, kaynakların istemci tarafında ne kadar süreyle önbellekte saklanacağını (saniye cinsinden) belirler. 3600 saniye, yani 1 saat önbellekleme süresi sağlar.

### Bu Yapılandırmanın Avantajları
- **Statik dosya erişimini özelleştirme**: Varsayılan dizinlerin dışında, farklı dizinlerden de statik kaynakları sunabilirsiniz.
- **Önbellekleme**: Performansı artırmak için istemcinin statik dosyaları önbelleğe almasını sağlayabilirsiniz.
- **Farklı yollar tanımlama**: Farklı URL desenleriyle farklı kaynakları yönetebilir, proje düzeninizi daha esnek hale getirebilirsiniz.

### Ne Zaman Kullanılır?
- Statik kaynakları varsayılan dizin dışına taşımak veya başka bir dizinden sunmak istiyorsanız.
- Önbellekleme ayarlarını kontrol etmek istiyorsanız.
- Birden fazla kaynak dizinini yapılandırmanız gerekiyorsa.
- Özel URL desenleri ile statik kaynaklara erişimi ayarlamak istiyorsanız.

Bu metodun Spring MVC'deki temel rolü, uygulamanızın statik dosyalarını daha esnek bir şekilde yönetmenize yardımcı olmaktır.


`addInterceptors(InterceptorRegistry registry)` metodu, Spring Boot'ta istekleri karşılamadan önce veya sonra ek işlemler gerçekleştirmek için **Interceptor**'ları yapılandırmak amacıyla kullanılır. Interceptor'lar, web uygulamalarındaki HTTP isteklerinin giriş ve çıkışında ek işlemler yapabilen sınıflardır. Özellikle kimlik doğrulama, yetkilendirme, loglama, performans izleme gibi işlemler için kullanılırlar.

### Interceptor Nedir?
Bir **Interceptor**, uygulamaya gelen veya giden HTTP isteklerinin öncesinde ya da sonrasında çalışır. Herhangi bir işlemi tamamlamadan önce belirli kontroller yapabilir veya isteğe ek bilgiler ekleyebilir.

### Metodun Detaylı Açıklaması

```java
@Override
public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new CustomInterceptor())  // CustomInterceptor sınıfı ile Interceptor eklenir
            .addPathPatterns("/api/**")  // Hangi URL deseninde geçerli olacağı
            .excludePathPatterns("/api/login", "/api/register");  // Hariç tutulacak URL desenleri
}
```

### Adım Adım Açıklama:

#### 1. **`addInterceptor(new CustomInterceptor())`**:
Bu kısım, `CustomInterceptor` adlı sınıfı kullanarak bir Interceptor ekler. `CustomInterceptor`, bizim tanımladığımız bir sınıf olup `HandlerInterceptor` arayüzünü ya da `HandlerInterceptorAdapter` sınıfını genişletir.

   ```java
   public class CustomInterceptor implements HandlerInterceptor {

       @Override
       public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
           // İstek işlenmeden önce çalışır
           return true;  // Eğer false dönerse istek devam etmez
       }

       @Override
       public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
           // İstek işlendikten sonra ama cevap istemciye gitmeden önce çalışır
       }

       @Override
       public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
           // İstek tamamlandıktan sonra çalışır, genellikle temizleme işlemleri için kullanılır
       }
   }
   ```

- **`preHandle`**: İstek sunucuya ulaşmadan önce çalışır. Burada, kimlik doğrulama, loglama, izin kontrolü gibi işlemler yapılabilir. Eğer `false` dönerse istek işlenmez ve burada durdurulur.
- **`postHandle`**: İstek başarıyla işlendiğinde ama yanıt henüz istemciye gitmeden önce çalışır. Bu aşamada, model veya view ile ek işlemler yapılabilir.
- **`afterCompletion`**: İstek tamamen tamamlandığında çalışır. Bu aşamada genellikle temizleme, loglama gibi işlemler yapılır.

#### 2. **`addPathPatterns("/api/**")`**:
Bu kısımda, Interceptor'ın hangi URL'lerde aktif olacağını belirleriz. Örneğin, `"/api/**"` deseni, `/api/` ile başlayan tüm URL'lere uygulanır. Bu, `/api/v1/products`, `/api/orders`, `/api/customers` gibi URL'ler olabilir.

Yani, `/api/**` ile eşleşen her istek Interceptor tarafından işlenecektir.

#### 3. **`excludePathPatterns("/api/login", "/api/register")`**:
Bu kısım, belirli URL'leri Interceptor'dan hariç tutmak için kullanılır. Yani, `/api/login` ve `/api/register` URL'leri Interceptor tarafından işlenmeyecektir.

Örneğin, kimlik doğrulama ve kayıt gibi işlemler genellikle tüm kullanıcılara açık olur, bu yüzden bu URL'ler Interceptor'ın denetiminden hariç tutulabilir. Bu, özellikle oturum açmamış kullanıcıların da bu işlemleri yapabilmesini sağlar.

### Özet:

Bu yapılandırma şunu sağlar:

1. **Interceptor eklenir**: `CustomInterceptor`, uygulamaya bir Interceptor olarak eklenmiştir. Bu Interceptor, gelen HTTP isteklerini işleyebilir veya kontrol edebilir.

2. **Path desenleri belirlenir**: Interceptor, sadece `/api/**` ile başlayan URL'lerde çalışacaktır. Bu da, API'ye yapılan isteklerin tamamında bu Interceptor'ın kullanılacağı anlamına gelir.

3. **Hariç tutulan URL'ler belirlenir**: `/api/login` ve `/api/register` URL'leri, Interceptor'ın dışında bırakılmıştır. Yani, bu iki URL'ye yapılan istekler Interceptor tarafından işlenmeyecek.

### Ne zaman kullanılır?
- **Kimlik doğrulama ve yetkilendirme**: Kullanıcıların yetkilerini denetlemek için her isteğin başında kimlik doğrulama kontrolü yapmak amacıyla kullanılabilir.
- **Loglama**: Tüm isteklerin ve yanıtların loglanması gerekiyorsa Interceptor ile bu işlemler gerçekleştirilir.
- **Performans takibi**: İsteklerin ne kadar sürede tamamlandığını takip etmek için kullanılabilir.
- **İstek değiştirme**: Giden ve gelen istek/yanıt başlıklarına eklemeler yapma gibi işlemler de Interceptor ile yapılabilir.

### Örnek Kullanım Senaryosu:

Diyelim ki bir e-ticaret uygulamanız var ve `/api/**` ile başlayan tüm isteklerde kullanıcı kimliği doğrulaması yapmak istiyorsunuz. Ancak `/api/login` ve `/api/register` yolları herkese açık olmalı. İşte bu durumda, `addInterceptors` metoduyla bir Interceptor ekleyip bu yollar hariç diğer tüm API isteklerine kimlik doğrulama kontrolü ekleyebilirsiniz.

```java
public class CustomInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        if (token == null || !isValidToken(token)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;  // İstek işlenmez ve hata döner
        }
        return true;  // İstek işlenmeye devam eder
    }

    private boolean isValidToken(String token) {
        // Token doğrulama işlemi
        return token.equals("geçerli-token");
    }
}
```

Bu yapılandırma ile, `/api/**` yollarına gelen istekler için `Authorization` başlığı ile gelen token'lar doğrulanacak, ancak `/api/login` ve `/api/register` gibi yollara gelen istekler bu kontrolün dışında tutulacaktır.







---
`@CrossOrigin` Spring Boot'ta bir anotasyon olup, **Cross-Origin Resource Sharing (CORS)** ile ilgili ayarları yönetmek için kullanılır. CORS, bir kaynağın (örneğin, bir API'nin) başka bir alan adı (domain) üzerindeki istemciler tarafından kullanılmasına izin verip vermeyeceğini belirleyen bir güvenlik mekanizmasıdır.

Tarayıcılar, bir web sayfasının başka bir alan adından veri istemesine normalde izin vermezler (aynı kaynaktan gelmeyen istekler kısıtlanır). Ancak bazı durumlarda bir web uygulamasının, başka bir alan adındaki bir API'den veri çekmesi gerekebilir. İşte burada **CORS** devreye girer ve bu isteklere izin verilip verilmeyeceğini belirler.

### `@CrossOrigin` Anotasyonu Nedir?
`@CrossOrigin`, Spring Boot'ta CORS ayarlarını yapılandırmak için kullanılan bir anotasyondur. Bu anotasyon, belirli bir API veya tüm uygulama genelinde başka bir alan adından gelen isteklere izin vermek için kullanılır.

### Kullanımı

1. **Bir Denetleyici Seviyesinde (Controller Level)**:
   Bir denetleyicinin (controller) tüm yöntemlerine başka bir alan adından gelen isteklere izin vermek için bu anotasyon kullanılabilir.

   ```java
   @RestController
   @CrossOrigin(origins = "http://example.com")
   public class MyController {

       @GetMapping("/data")
       public String getData() {
           return "Cross-origin data";
       }
   }
   ```

   Bu örnekte, `http://example.com` alan adından gelen istekler `getData()` yöntemine erişebilir. Eğer `origins` parametresi belirtilmezse, tüm alan adlarına izin verilir.

2. **Yöntem Seviyesinde (Method Level)**:
   Sadece belirli bir yöntem için CORS ayarlarını uygulamak isterseniz, bunu yöntem seviyesinde kullanabilirsiniz.

   ```java
   @RestController
   public class MyController {

       @CrossOrigin(origins = "http://example.com")
       @GetMapping("/restricted-data")
       public String getRestrictedData() {
           return "Restricted cross-origin data";
       }
   }
   ```

   Bu durumda, sadece `http://example.com` alan adından gelen istekler `getRestrictedData()` metoduna erişebilir.

### `@CrossOrigin` Anotasyonunun Parametreleri

1. **`origins`**:
   İsteklerin kabul edileceği alan adlarını belirtir. Bir veya birden fazla alan adı ekleyebilirsiniz. Varsayılan olarak, tüm alan adlarına (`*`) izin verilir.

   ```java
   @CrossOrigin(origins = {"http://example.com", "http://another-domain.com"})
   ```

2. **`methods`**:
   Hangi HTTP yöntemlerinin (GET, POST, PUT, DELETE vs.) izin verileceğini belirtir. Eğer belirtilmezse, varsayılan olarak tüm yöntemlere izin verilir.

   ```java
   @CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
   ```

3. **`allowedHeaders`**:
   İzin verilen başlıkları belirtir. Varsayılan olarak, tüm başlıklara izin verilir.

   ```java
   @CrossOrigin(allowedHeaders = {"Content-Type", "Authorization"})
   ```

4. **`exposedHeaders`**:
   Tarayıcıya açığa çıkarılacak başlıkları belirtir. Varsayılan olarak, CORS başlıkları tarayıcıya açılmaz.

   ```java
   @CrossOrigin(exposedHeaders = {"X-Custom-Header"})
   ```

5. **`allowCredentials`**:
   Kimlik doğrulama bilgileri (çerezler gibi) gönderilip gönderilmeyeceğini belirtir. Varsayılan olarak `false`'tur.

   ```java
   @CrossOrigin(allowCredentials = "true")
   ```

6. **`maxAge`**:
   Tarayıcının, bu ayarların geçerliliğini önbelleğe alacağı süreyi (saniye cinsinden) belirtir. Varsayılan olarak `1800` (30 dakika)'dır.

   ```java
   @CrossOrigin(maxAge = 3600)
   ```

### Global CORS Yapılandırması
Sadece belirli denetleyicilere değil, uygulamanın tamamına CORS yapılandırmasını eklemek için `WebMvcConfigurer` arabirimi kullanılır.

```java
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://example.com")
                .allowedMethods("GET", "POST")
                .allowedHeaders("Content-Type")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
```

Bu yapılandırma ile, uygulamanın tüm yollarına (`/**`) `http://example.com` alan adından gelen GET ve POST isteklerine izin verilir.

### Özetle:
- `@CrossOrigin` anotasyonu, Spring Boot uygulamanızda farklı alan adlarından gelen istekleri kabul etmek için kullanılır.
- Bu anotasyon ile belirli API'ler için CORS politikası belirlenebilir.
- `origins`, `methods`, `allowedHeaders`, `exposedHeaders`, `allowCredentials`, ve `maxAge` gibi parametrelerle daha ince ayarlar yapabilirsiniz.

CORS politikalarını doğru ayarlamak, güvenlik açısından kritik olabilir. Uygulamanızın dışarıya açık alan adlarından gelen istekleri ne zaman ve nasıl kabul edeceğini dikkatli bir şekilde belirlemelisiniz.

## CORS DEVAM
```java
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://example.com")
                .allowedMethods("GET", "POST")
                .allowedHeaders("Content-Type")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
```
Bu kod parçası, Spring Boot'ta **CORS (Cross-Origin Resource Sharing)** yapılandırmasını yönetmek için kullanılan bir sınıfı gösterir. Spring Boot uygulamalarında farklı alan adlarından gelen istekleri yönetmek için CORS yapılandırması yapmak gerekebilir ve bu yapılandırma `WebMvcConfigurer` arayüzü kullanılarak sağlanır. Kod parçasını detaylıca açıklayalım:

### @Configuration Anotasyonu
`@Configuration` anotasyonu, bu sınıfın bir **Spring yapılandırma sınıfı** olduğunu belirtir. Spring, bu anotasyonla işaretlenmiş sınıfları, başlatma sırasında konfigürasyon bilgilerini içeren sınıflar olarak tanır. Bu sınıfın içinde tanımladığınız metodlar ve yapılandırmalar Spring IOC Container (Bağımlılık Enjeksiyon Yöneticisi) tarafından yönetilir ve uygulamanın başlatılması sırasında yüklenir.

Örneğin, bu sınıf bir CORS yapılandırmasını içeren bir sınıf olduğu için, Spring Boot bu sınıfı otomatik olarak tanıyacak ve CORS ayarlarını uygulamanın tümüne yayacaktır.

### WebMvcConfigurer Arayüzü
`WebMvcConfigurer`, Spring MVC için yapılandırmaları özelleştirmenize olanak tanıyan bir arayüzdür. Bu arayüz, Spring MVC'nin varsayılan yapılandırmasını değiştirmek istediğinizde kullanılır. `WebMvcConfigurer` kullanarak aşağıdaki gibi yapılandırmaları özelleştirebilirsiniz:
- CORS (Cross-Origin Resource Sharing) ayarları
- View Resolver (görünüm çözümleyici) ayarları
- Kaynak (resource) ayarları
- Yol eşlemesi (path mapping) ayarları

Bu arayüzdeki metodları override ederek, Spring MVC'nin işleyişini uygulamaya özgü hale getirebilirsiniz.

### addCorsMappings(CorsRegistry registry) Metodu
Bu metod, CORS yapılandırmasını tanımladığınız yer. Bu metod Spring tarafından çağrılır ve **CORS politikalarını** özelleştirmenize olanak tanır. İçinde **CorsRegistry** nesnesini kullanarak, hangi yolların (URL endpoint'lerinin) hangi alan adlarından gelen isteklere izin vereceğini belirleyebilirsiniz.

#### Detaylı Parametreler:
- **registry.addMapping("/**")**:
  Bu kısım, hangi yolların CORS yapılandırmasına tabi olduğunu tanımlar. Burada `"/**"` kullanarak uygulamanızdaki tüm yolları belirtmiş oluyorsunuz. Yani bu yapılandırma, uygulamanın tüm API endpoint'leri için geçerlidir.

  Eğer sadece belirli bir yol için CORS ayarı yapmak isterseniz, o yolu belirtebilirsiniz. Örneğin, sadece `/api/**` yolları için izin vermek istiyorsanız:

  ```java
  registry.addMapping("/api/**")
  ```

- **allowedOrigins("http://example.com")**:
  Bu kısım, hangi alan adlarından gelen isteklere izin verileceğini tanımlar. Örnekte sadece `http://example.com` alan adından gelen isteklere izin veriyorsunuz. Eğer bu kısmı `*` olarak ayarlarsanız, tüm alan adlarından gelen isteklere izin verilmiş olur:

  ```java
  allowedOrigins("*")
  ```

  Ancak, güvenlik açısından genelde belirli bir alan adı tanımlamak daha güvenlidir.

- **allowedMethods("GET", "POST")**:
  Bu kısım, hangi HTTP yöntemlerine izin verileceğini belirler. Örnekte sadece **GET** ve **POST** yöntemlerine izin verilmektedir. Eğer diğer yöntemlere de (PUT, DELETE vb.) izin vermek isterseniz bunları ekleyebilirsiniz:

  ```java
  allowedMethods("GET", "POST", "PUT", "DELETE")
  ```

  Varsayılan olarak tüm yöntemler (GET, POST, PUT, DELETE vb.) desteklenir, ancak bu metod ile belirli yöntemleri sınırlayabilirsiniz.

- **allowedHeaders("Content-Type")**:
  Bu kısım, hangi başlıkların (headers) CORS istekleri sırasında kabul edileceğini belirler. Örneğin, sadece **Content-Type** başlığına izin vermek için kullanılır. Eğer tüm başlıklara izin vermek isterseniz `*` kullanabilirsiniz:

  ```java
  allowedHeaders("*")
  ```

  İstek sırasında hangi başlıkların geçerli olacağını belirlemek, uygulamanızın güvenliğini arttırmaya yardımcı olabilir.

- **allowCredentials(true)**:
  Bu kısım, **kimlik doğrulama bilgileri** (örneğin, çerezler veya kimlik doğrulama başlıkları gibi) ile yapılacak isteklere izin verilip verilmeyeceğini belirler. Eğer `true` olarak ayarlanmışsa, kimlik doğrulama bilgileri ile gelen istekler kabul edilir. Bu ayarı dikkatli kullanmak gerekir çünkü uygulamanızın güvenlik risklerini artırabilir.

- **maxAge(3600)**:
  Bu kısım, tarayıcının CORS önbellekleme süresini (saniye cinsinden) tanımlar. Burada `3600` olarak ayarlanmış ve bu, CORS ayarlarının tarayıcıda **1 saat** boyunca geçerli olacağı anlamına gelir. Tarayıcı bu süre boyunca aynı kaynak için CORS doğrulamasını tekrar etmez ve bu da performans açısından fayda sağlar.

### Örnek Senaryo:
Bu CORS yapılandırması ile, uygulamanızın tüm yollarına (`/**`) `http://example.com` alan adından gelen GET ve POST isteklerine izin veriyorsunuz. Bu istekler sırasında kimlik doğrulama bilgileri (çerezler vb.) kabul ediliyor ve tarayıcı bu yapılandırmayı 1 saat boyunca önbelleğe alıyor.

### Spring Boot'ta Global CORS Yapılandırması
Bu yapılandırma, Spring Boot uygulamanızın global CORS ayarlarını yapılandırmanızı sağlar. Yani bu sınıf ve metod, tüm denetleyicilere (controller) ve API endpoint'lerine uygulanır. Eğer sadece belirli endpoint'ler için CORS ayarı yapmak isterseniz, `@CrossOrigin` anotasyonunu ilgili denetleyici veya metodun üstüne ekleyebilirsiniz.

### Genel Özeti:
Bu kod parçası, Spring Boot'ta **CORS** yapılandırmasını yönetmek için kullanılan bir sınıf örneğidir. Spring'in `WebMvcConfigurer` arayüzünü uygulayarak, uygulamanızın tüm yollarında CORS politikalarını belirlemenize olanak tanır. Bu sayede, uygulamanızın başka bir alan adından gelen isteklere nasıl yanıt vereceğini kontrol edebilirsiniz.

---
## Spring Boot Jpa Terimler
Spring Data JPA ile kullanılan bu terimler, bir veritabanı üzerinde otomatik olarak veri tablolarının yönetilmesine olanak tanıyan JPA (Java Persistence API) sağlayıcısının yapılandırma seçenekleridir. Her bir yapılandırma seçeneği, JPA'nın veritabanı şeması üzerinde nasıl bir işlem yapacağını belirler. Bu işlemler uygulamanızın başlatılması sırasında veritabanı ile nasıl etkileşimde bulunulacağını kontrol eder. Detaylı olarak açıklarsak:

### 1. `none`
- **Açıklama:**
  `none` ayarı, JPA'nın uygulama başlatılırken veritabanı üzerinde herhangi bir şema yönetimi işlemi yapmamasını sağlar. Yani JPA, tabloları oluşturmaz, güncellemez veya doğrulamaz.

- **Kullanım Durumu:**
  Eğer veritabanı şema yönetimini tamamen dış bir araçla veya manuel olarak yapmak istiyorsanız ve JPA'nın şema üzerinde hiçbir etkisi olmaması gerekiyorsa `none` kullanılır.

- **Özellikleri:**
  Veritabanı üzerinde hiç değişiklik yapmaz. Tabloların ve diğer yapıların zaten hazır olduğu varsayılır.

### 2. `update`
- **Açıklama:**
  `update` ayarı, mevcut şemanın korunmasını ve yalnızca gerekli değişikliklerin (örneğin yeni sütunlar veya tablolar ekleme) uygulanmasını sağlar. Ancak, bu işlem sırasında var olan veriler korunur. `update` modunda JPA, mevcut tabloya yeni alanlar veya ilişkiler ekler ancak var olan alanları değiştirmez veya silmez.

- **Kullanım Durumu:**
  Geliştirme sırasında, veritabanındaki tabloları yeniden oluşturmadan sadece yeni eklemeler yapmak istediğinizde `update` ayarı kullanılabilir.

- **Özellikleri:**
    - Veritabanındaki tabloların varlığını kontrol eder.
    - Yeni alanlar ekler ancak mevcut verileri silmez veya değiştirmez.

### 3. `create`
- **Açıklama:**
  `create` ayarı, uygulama başlatıldığında veritabanındaki tüm mevcut tabloları silip yeniden oluşturur. Bu, veritabanında yeni tablolar oluştururken sıfırdan başlamak anlamına gelir. Var olan tablolar ve veriler tamamen silinir ve ardından şemaya uygun yeni tablolar oluşturılır.

- **Kullanım Durumu:**
  Genellikle test veya geliştirme ortamlarında, veritabanı şemasının sürekli olarak sıfırdan oluşturulması gerektiğinde kullanılır. Canlı ortamda kullanılması önerilmez çünkü mevcut tüm veriler kaybolur.

- **Özellikleri:**
    - Var olan tabloları siler.
    - Tabloları yeniden oluşturur ve boş bir şema ile başlar.

### 4. `create-drop`
- **Açıklama:**
  `create-drop` ayarı, `create` moduna benzer bir şekilde başlar; uygulama başlatıldığında veritabanındaki tüm tabloları silip yeniden oluşturur. Ancak, `create-drop`'un farkı uygulama kapatıldığında, JPA'nın oluşturduğu tabloların tekrar silinmesidir. Yani, tabloyu oluşturur, uygulama kapanınca ise siler.

- **Kullanım Durumu:**
  Test senaryolarında veya geçici veritabanı kullanımında yararlıdır. Örneğin, uygulama kapandığında tüm test verilerinin silinmesi isteniyorsa `create-drop` kullanılabilir.

- **Özellikleri:**
    - Uygulama başlatıldığında tabloları oluşturur.
    - Uygulama kapatıldığında oluşturulan tabloları siler.

### 5. `validate`
- **Açıklama:**
  `validate` ayarı, veritabanındaki mevcut tabloların uygulamadaki JPA varlıklarına (entities) uygun olup olmadığını kontrol eder. Ancak, bu işlem sırasında herhangi bir tablo oluşturulmaz, değiştirilmez veya silinmez. Sadece var olan şemanın doğruluğu kontrol edilir. Eğer tablo yapısı JPA varlıklarına uygun değilse hata verir ve uygulama başlamaz.

- **Kullanım Durumu:**
  Canlı sistemlerde, şemanın doğru yapılandırıldığından emin olmak için kullanılabilir. Veritabanında herhangi bir değişiklik yapmadığı için, mevcut yapıyı korur ve sadece doğrulama yapar.

- **Özellikleri:**
    - Tablo yapısının JPA varlıklarıyla uyumlu olup olmadığını kontro
```sh 

```
---



## Spring Data (ilişkiler  (relationships))
```sh 

```
---


Spring Boot’ta **ilişkiler** (relationships), veri modelleme açısından önemli bir role sahiptir ve `@OneToOne`, `@OneToMany`, `@ManyToOne`, ve `@ManyToMany` gibi anotasyonlarla tanımlanır. Bu ilişkiler, veritabanındaki tablo yapıları arasındaki bağları temsil eder ve bir nesneyle diğer nesneler arasındaki bağı kurmamıza olanak tanır. Her bir ilişkinin kendine özgü bazı önemli **attributeları** vardır. Aşağıda bu ilişki türlerinin ve bu anotasyonlarla birlikte kullanılan en önemli attribute’ların detaylı bir açıklamasını bulabilirsiniz.

### 1. `@OneToOne` İlişkisi

`@OneToOne`, iki varlık arasında birebir ilişki kurmak için kullanılır. Örneğin, bir **kullanıcı** ile onun **profil** bilgisi arasında birebir bir ilişki olabilir.

#### Örnek Kullanım
```java
@Entity
public class User {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;
}
```

#### Önemli Attribute’lar

- **`mappedBy`**: Bir ilişkinin ters tarafında (`inverse side`) kullanılır. `mappedBy`, ilişkiyi ters tarafla eşleştirmek için ilişki sahibini (`owning side`) belirtir. Örneğin, `Profile` sınıfında `User`’ın ters tarafı olarak `mappedBy` kullanılabilir.

    ```java
    @OneToOne(mappedBy = "profile")
    private User user;
    ```

- **`cascade`**: İlişkili varlık üzerinde yapılacak işlemleri (örneğin, kayıt, güncelleme veya silme) belirler. Örneğin `CascadeType.ALL`, `User` kaydedildiğinde otomatik olarak `Profile` kaydını da günceller.

- **`fetch`**: Varsayılan olarak `EAGER`’dır. `@OneToOne` ilişkilerde ilişki veri her zaman yüklenir. `LAZY` olarak ayarlandığında, ilişki veri sadece gerektiğinde yüklenir.

- **`optional`**: `true` ise, ilişki nullable olarak tanımlanır. Bu, ilişkili varlığın `null` olabileceği anlamına gelir. `false` yapıldığında, ilişkili varlık `null` olamaz.

- **`@JoinColumn`**: Veritabanında ilişkiyi kuran anahtar sütunu belirtir. `name` attribute’u, ilişki kurulacak sütunun ismini tanımlar.

### 2. `@OneToMany` İlişkisi

`@OneToMany`, bir varlığın diğer bir varlıkla bire-çok ilişkisini temsil eder. Örneğin, bir **yazar** ve onun **kitapları** arasında bire-çok ilişkisi olabilir. Bu tür bir ilişkide, bir yazarın birden fazla kitabı vardır.

#### Örnek Kullanım
```java
@Entity
public class Author {
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;
}
```

#### Önemli Attribute’lar

- **`mappedBy`**: `@OneToMany` ilişkilerinde sıkça kullanılır. İlişki sahibini belirleyerek, ilişkiyi ters tarafla bağlar. Burada `Book` sınıfında `author` ilişki sahibidir.

- **`cascade`**: Bu attribute, ilişki güncellemelerinde ne yapılması gerektiğini belirtir. Örneğin, `CascadeType.ALL` kullanıldığında, `Author` güncellenirken ilişkili tüm `Book` kayıtları da güncellenir.

- **`fetch`**: `@OneToMany` ilişkilerde varsayılan olarak `LAZY`’dir. Veri gerektiğinde yüklenir. `EAGER` olarak değiştirilirse ilişki veri her zaman yüklenir.

- **`orphanRemoval`**: `true` olarak ayarlanırsa, ilişki koparıldığında `orphan` (yetim) olan `Book` kayıtları otomatik olarak silinir.

- **`@JoinColumn` veya `@JoinTable`**: İlişkiyi bağlayacak anahtar sütunu veya bağlantı tablosunu belirler. `@JoinColumn`, tek bir anahtar sütunuyla ilişki kurarken, `@JoinTable` iki tablo arasındaki bağlantıyı kurar.

### 3. `@ManyToOne` İlişkisi

`@ManyToOne`, birden fazla varlığın tek bir varlığa bağlı olduğu ilişki türüdür. Örneğin, bir **kitap** ve onun **yazarı** arasındaki ilişki gibi. Birçok kitap tek bir yazara ait olabilir.

#### Örnek Kullanım
```java
@Entity
public class Book {
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
```

#### Önemli Attribute’lar

- **`fetch`**: `@ManyToOne` ilişkilerde varsayılan olarak `EAGER`’dır. İlişki veri her zaman yüklenir. `LAZY` olarak ayarlanabilir.

- **`optional`**: Eğer `true` olarak ayarlanmışsa, ilişkili varlık `null` olabilir. Örneğin, `optional = false` yapıldığında `Book` kaydının mutlaka bir `Author` ile ilişkili olması gerekir.

- **`cascade`**: Aynı diğer ilişki türlerinde olduğu gibi, `cascade` tipi belirlenebilir. Örneğin, `CascadeType.PERSIST` sadece ana varlık kaydedildiğinde ilişkili varlık da kaydedilir.

- **`@JoinColumn`**: Bu ilişkiyi kuran anahtar sütunu tanımlar. `name` attribute’u, ilişkili sütunun veritabanında hangi isimle yer alacağını belirler.

### 4. `@ManyToMany` İlişkisi

`@ManyToMany`, iki varlık arasında çoktan çoğa ilişkiyi tanımlar. Örneğin, bir **öğrenci** ve onun **dersleri** arasında çoktan çoğa ilişki vardır; bir öğrenci birden fazla ders alabilir ve bir ders birden fazla öğrenciye sahip olabilir.

#### Örnek Kullanım
```java
@Entity
public class Student {
    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}
```

#### Önemli Attribute’lar

- **`mappedBy`**: İlişkiyi ters tarafla bağlar. Bir sınıfta `@ManyToMany` ilişki tanımlandıysa, diğer sınıfta `mappedBy` ile ilişki sahibi belirtilmelidir.

- **`cascade`**: İlişki için uygulanacak işlemleri belirtir. Örneğin, `CascadeType.MERGE` ile ana varlık güncellendiğinde ilişkili varlıklar da güncellenir.

- **`fetch`**: `@ManyToMany` ilişkilerde varsayılan olarak `LAZY`’dir. Veri gerektiğinde yüklenir, ancak `EAGER` olarak ayarlanabilir.

- **`@JoinTable`**: Çoktan çoğa ilişkilerde bağlantıyı sağlayan üçüncü bir tabloyu belirtir. `name` attribute’u ile bağlantı tablosunun ismi verilir. `joinColumns` ana varlığın anahtar sütununu, `inverseJoinColumns` ise ilişkili varlığın anahtar sütununu belirtir.

- **`@JoinColumn`**: Birçok `@JoinColumn` ile ilişkili varlıklar arasında köprü kuran bir tablo tanımlanabilir. Bu, ilişki için bağlantı sütunlarını belirler.

### Cascade Tipleri (CascadeType)

Tüm ilişki türlerinde kullanılabilen `cascade` tipi, ilişki işlemlerinin ilişkili varlığa nasıl yansıyacağını belirler:

- **`CascadeType.ALL`**: Tüm işlemler ilişki üzerinde yapılır (persist, merge, remove, refresh, detach).
- **`CascadeType.PERSIST`**: Ana varlık kaydedildiğinde, ilişkili varlıklar da kaydedilir.
- **`CascadeType.MERGE`**: Ana varlık güncellendiğinde, ilişkili varlıklar da güncellenir.
- **`CascadeType.REMOVE`**: Ana varlık silindiğinde, ilişkili varlıklar da silinir.
- **`CascadeType.REFRESH`**: Ana varlık yenilendiğinde, ilişkili varlıklar da yenilenir.
- **`CascadeType.DETACH`**: Ana varlık oturumdan ayrıldığında, ilişkili varlıklar da ayrılır.

### Fetch Tipleri (FetchType)

**FetchType** iki seçenek sunar:

- **`FetchType.EAGER`**: İlişki veri her zaman yüklenir. Bu, veri her durumda belleğe alınır.
- **`FetchType.LAZY`**: İlişki veri yalnızca gerektiğinde yüklenir. Bu, bellek yönetimi açısından daha verimlidir.

### Özet

Spring Boot ilişkileri tanımlamak için kullanılan `@anotasyonlar`, veritabanı modellemelerinde veri ilişkilerini açık bir şekilde ifade etmemizi sağlar. Bu ilişkiler, `@OneToOne`, `@OneToMany`, `@ManyToOne`, ve `@ManyToMany` anotasyonları ile belirtilir. Her bir ilişki türü, veritabanı yapısında anlamlı bağlantılar kurmayı sağlar ve verilerin yönetilmesi, güncellenmesi, veya silinmesi gibi işlemler sırasında entegre bir yapı sunar.

### İlişkilerde Kullanılan Başlıca Attribute ve Anotasyonların Özeti

1. **`@OneToOne`**:
    - Birebir ilişkilerde kullanılır.
    - `mappedBy`, ilişkiyi ters tarafla eşleştirir.
    - `@JoinColumn`, ilişkiyi kuran sütunu belirtir.
    - `cascade`, işlemleri tüm varlıklar arasında paylaşır.
    - `fetch`, veri yükleme türünü belirler (`EAGER` varsayılan).

2. **`@OneToMany`**:
    - Bire-çok ilişkilerde kullanılır.
    - `mappedBy`, ilişki sahibini belirtir.
    - `cascade`, işlemleri yönetir (örneğin `CascadeType.ALL` ile tüm işlemler).
    - `orphanRemoval`, ilişki sona erdiğinde ilişkisiz (orphan) öğeleri siler.
    - `fetch`, veri yükleme türünü belirler (`LAZY` varsayılan).

3. **`@ManyToOne`**:
    - Çoktan-bire ilişkiyi ifade eder.
    - `cascade`, işlemleri ilişkili varlık üzerinde uygular.
    - `optional`, ilişkili varlığın zorunlu olup olmadığını belirtir.
    - `fetch`, veri yükleme türünü belirler (`EAGER` varsayılan).
    - `@JoinColumn`, ilişkiyi sağlayan sütunu belirtir.

4. **`@ManyToMany`**:
    - Çoktan-çoğa ilişkilerde kullanılır.
    - `mappedBy`, ilişkiyi ters tarafla bağlar.
    - `@JoinTable`, üçüncü tablo ile iki varlık arasındaki bağlantıyı sağlar.
    - `cascade`, işlemleri her iki taraf üzerinde de yürütür.
    - `fetch`, veri yükleme türünü belirler (`LAZY` varsayılan).

5. **`CascadeType`** Seçenekleri:
    - `ALL`, `PERSIST`, `MERGE`, `REMOVE`, `REFRESH`, `DETACH` işlemlerini belirtir.
    - `CascadeType.ALL` tüm işlemleri ilişki varlığına uygular.

6. **`FetchType`** Seçenekleri:
    - `EAGER`: Veri her zaman yüklenir.
    - `LAZY`: Veri sadece gerektiğinde yüklenir, performans avantajı sağlar.

### İlişki Yönetiminde Dikkat Edilmesi Gerekenler

- **Bellek Yönetimi**: `LAZY` yükleme, bellek yönetimi açısından avantaj sağlar. Özellikle büyük veri setleriyle çalışıyorsanız `LAZY` olarak ayarlamak belleği daha verimli kullanmanıza yardımcı olur.
- **Orphan Removal**: `orphanRemoval = true` olarak ayarlanırsa, bir koleksiyondan silinen öğeler otomatik olarak veritabanından da silinir.
- **Veritabanı İşlemleri**: `cascade` ile, bir varlık üzerinde yapılan işlemlerin bağlı varlıkları nasıl etkilediğini kontrol edebilirsiniz.
- **Veri Tutarlılığı**: `optional = false` gibi özelliklerle, ilişkilerin bütünlüğünü koruyabilir ve `null` ilişki oluşmasını engelleyebilirsiniz.

Spring Boot’ta veri modelleri arasında anlamlı bağlantılar kurmak ve bu ilişkileri doğru bir şekilde yönetmek, uygulamanın sağlam bir yapıya sahip olmasını sağlar. Bu ilişkileri ve `attribute`ları doğru kullanmak, veritabanı işlemlerinin daha etkili ve sürdürülebilir olmasını sağlar.





## Spring API (@RequestParam) 
```sh 

```
---


`@RequestParam` ve `@PathVariable`, Spring Framework'de HTTP isteğinden parametreleri almak için kullanılan iki farklı anotasyondur. Bu iki anotasyonun nasıl çalıştığını, aralarındaki farkları ve hangi durumlarda hangisini kullanmanız gerektiğini ayrıntılı olarak açıklayalım.

### `@RequestParam` Nedir?

`@RequestParam`, genellikle **sorgu parametrelerini** almak için kullanılır. Sorgu parametreleri, URL’nin `?` işaretinden sonra gelen anahtar-değer çiftleridir. `@RequestParam` ile bir URL’nin sorgu kısmından parametreleri alabiliriz.

**Örnek Kullanım**:
URL: `http://example.com/api/products?category=electronics&price=100`

```java
@GetMapping("/products")
public String getProducts(@RequestParam String category, @RequestParam int price) {
    // category = "electronics"
    // price = 100
    return "Category: " + category + ", Price: " + price;
}
```

Yukarıdaki örnekte:
- `@RequestParam` ile `category` ve `price` sorgu parametreleri URL'den alınır.
- `category` değeri `"electronics"` ve `price` değeri `100` olarak atanır.

**Özellikleri**:
- **İsteğe Bağlı Yapılandırma**: `@RequestParam` isteğe bağlı olarak yapılandırılabilir. Parametre zorunlu değilse `required = false` olarak ayarlanabilir ve varsayılan bir değer belirtilebilir.
- **Sorgu Parametreleri İçin Kullanılır**: `@RequestParam`, URL'nin sorgu kısmından parametre almak için idealdir.

### `@PathVariable` Nedir?

`@PathVariable`, **URL yolunun (path) bir parçasını** parametre olarak almak için kullanılır. Bu yöntem, özellikle RESTful API’lerde, belirli bir kaynağı benzersiz bir kimlik veya özellik ile almak için tercih edilir.

**Örnek Kullanım**:
URL: `http://example.com/api/products/5`

```java
@GetMapping("/products/{id}")
public String getProduct(@PathVariable int id) {
    // id = 5
    return "Product ID: " + id;
}
```

Yukarıdaki örnekte:
- `@PathVariable` ile `id` parametresi URL'den alınır.
- `id` değeri `5` olarak atanır.

**Özellikleri**:
- **Dinamik Yol Parametreleri İçin Kullanılır**: `@PathVariable`, URL’nin bir parçası olan ve kaynakları temsil eden parametreler için kullanılır.
- **Daha Okunaklı URL Yapısı**: `@PathVariable` ile dinamik yollar oluşturulabilir; bu da RESTful API tasarımında daha okunabilir ve anlamlı URL yapıları sağlar.

### `@RequestParam` ile `@PathVariable` Arasındaki Farklar

| Özellik            | @RequestParam                                  | @PathVariable                               |
|--------------------|-----------------------------------------------|--------------------------------------------|
| **Kullanım Yeri**  | Sorgu parametreleri (`?`)                     | URL yolundaki dinamik parametreler (`/{}`) |
| **Amaç**           | Parametre değerleri sorgu parametrelerinden almak için | URL yolunun bir parçasını almak için       |
| **Zorunluluk**     | `required` ile isteğe bağlı yapılabilir        | Zorunludur (yolun bir parçası olarak)      |
| **Örnek URL**      | `/products?category=electronics`              | `/products/electronics`                    |

### Hangi Durumda Hangisini Kullanmalıyım?

1. **Kimlik (ID) veya Kaynak Belirteçleri İçin**: Belirli bir kaynağı benzersiz bir kimlik ile alıyorsanız (örneğin, `productId` veya `userId` gibi), `@PathVariable` kullanmak daha iyi bir yaklaşımdır. Bu, daha temiz ve okunabilir bir URL sağlar. Örneğin:
   ```java
   @GetMapping("/users/{id}")
   public User getUserById(@PathVariable Long id) {
       return userService.findUserById(id);
   }
   ```

2. **Filtreleme veya Arama İçin**: Eğer bir liste üzerinde filtreleme veya arama işlemi yapıyorsanız, `@RequestParam` kullanmanız daha uygundur. Örneğin:
   ```java
   @GetMapping("/products")
   public List<Product> getProducts(@RequestParam(required = false) String category,
                                    @RequestParam(required = false, defaultValue = "0") int minPrice) {
       return productService.findProducts(category, minPrice);
   }
   ```

3. **URL Yapısı ve Okunabilirlik**: RESTful API tasarımı için `@PathVariable`, kaynak belirleme anlamında daha okunabilir URL yapısı sağlar. Örneğin:
    - `@GetMapping("/orders/{orderId}")` – Belirli bir siparişin ayrıntılarına ulaşmak için.

4. **Parametrelerin Zorunluluğu**: `@RequestParam`, isteğe bağlı (`required=false`) olarak yapılandırılabilir ve varsayılan değer atanabilir. `@PathVariable` ise URL yolunun bir parçası olduğundan zorunludur.

### Özet

- **Kaynakları belirlemek için** `@PathVariable` kullanılır.
- **Sorgu veya filtre parametreleri için** `@RequestParam` kullanılır.
- RESTful API’lerde kimlikleri `@PathVariable` ile, opsiyonel sorgu parametrelerini ise `@RequestParam` ile almak iyi bir pratiktir.

## Java 8 ile gelen Stream API
```sh 

```
---


Java 8 ile gelen **Stream API**, veri işlemlerini daha etkili, temiz ve okunabilir bir şekilde yapmayı sağlayan bir araçtır. `Stream`ler, bir veri kaynağı (koleksiyonlar, diziler veya dosyalar gibi) üzerinde işlem yapmamıza olanak tanıyan bir dizi metottan oluşur. Stream API, özellikle koleksiyonlar üzerindeki sıralama, filtreleme, dönüştürme ve toplama işlemlerini çok daha kolay hale getirir. Java 8 ile gelen fonksiyonel programlama özellikleri sayesinde `Stream`ler, geleneksel `for` döngüleri ve `iterator` işlemlerine daha modern bir alternatif sunar.

### Stream API’nin Temel Özellikleri

1. **Fonksiyonel Programlama Mantığı ile Çalışır**: Java 8 ile gelen lambda ifadeleri ile Stream işlemleri kolaylaşır. Lambda ile ifade edilen kısa ve etkili işlemler sayesinde daha az kodla daha çok iş yapılabilir.
2. **İşlem Zinciri (Pipeline) Mantığı**: Stream’ler, bir veri kaynağından veri alır ve bu veri üzerinde çeşitli işlemler uygular. Bu işlemler birbirine bağlıdır ve bir zincir (pipeline) olarak ifade edilir.
3. **Tek Kullanımlık Yapı**: Bir `Stream`, yalnızca bir kez tüketilebilir; yeniden kullanılamaz. Bu nedenle bir `Stream` ile bir kez işlem yapıldığında, başka bir işlem için yeni bir `Stream` oluşturmak gerekir.
4. **Dönüştürülebilirlik**: `Stream`ler, veri kaynağını değiştirmez, verileri işleyerek yeni `Stream` veya sonuçlar üretir. `Stream` nesnesini koleksiyonlara veya diğer veri yapılarına dönüştürebiliriz.
5. **Paralel İşlem Desteği**: `Stream` API, paralel işlemler için güçlü bir destek sağlar. Bu, büyük veri kümeleri üzerinde işlemleri hızlandırmak için önemlidir.

### Stream Türleri

1. **Sıralı (Sequential) Stream**: Veriler sırayla işlenir. `Collection.stream()` metodu ile elde edilir. Bu türde işlemler, veri sırasına sadık kalarak tek bir iş parçacığı (thread) üzerinde çalışır.
2. **Paralel (Parallel) Stream**: Veriler paralel olarak işlenir ve performansı artırmak için çok çekirdekli işlemcilerin gücünden yararlanır. `Collection.parallelStream()` metodu ile elde edilir.

### Stream’in Çalışma Mantığı: Ara ve Terminal İşlemler

Stream işlemleri ikiye ayrılır: **ara (intermediate)** ve **terminal işlemler**.

#### 1. Ara İşlemler (Intermediate Operations)
Ara işlemler, bir `Stream` üzerinde dönüşüm veya filtreleme gibi işlemler yapar ve yeni bir `Stream` döner. Bu işlemler "lazy" (tembel) olarak değerlendirilir; yani, ara işlemler tek başlarına çalıştırıldığında işlem yapılmaz, ancak bir terminal işlem çağrıldığında zincirdeki tüm ara işlemler gerçekleştirilir.

Başlıca ara işlemler:
- **filter(Predicate)**: Veriyi belirli bir koşula göre filtreler.
- **map(Function)**: Her öğe üzerinde dönüşüm yapar ve her bir öğeyi bir diğerine dönüştürür.
- **sorted() veya sorted(Comparator)**: Veriyi doğal sıralama veya özel bir `Comparator` ile sıralar.
- **distinct()**: Aynı olan öğeleri kaldırır (tekrarlı öğeleri kaldırır).
- **limit(long)**: İlk belirtilen sayıda elemanı alır.
- **skip(long)**: İlk belirtilen sayıda elemanı atlar.

Örnek:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
System.out.println(evenNumbers); // Çıktı: [2, 4, 6, 8, 10]
```

Yukarıdaki örnekte, `filter` ara işlemi ile yalnızca çift sayılar seçilmiş ve yeni bir `Stream` olarak işlenmiştir.

#### 2. Terminal İşlemler (Terminal Operations)
Terminal işlemler, bir `Stream` üzerindeki işlemleri sonlandırır ve `Stream` iş akışının sonuçlarını döner. Terminal işlemler çağrıldığında, `Stream` üzerindeki ara işlemler gerçekleştirilir ve terminal işlemle birlikte sonlandırılır.

Başlıca terminal işlemler:
- **forEach(Consumer)**: Her bir öğeyi belirtilen işlem ile işler.
- **collect(Collector)**: `Stream` sonuçlarını bir koleksiyona veya diğer veri yapılarına toplar.
- **reduce(BinaryOperator)**: `Stream` öğelerini indirger ve tek bir sonuç döner.
- **count()**: `Stream` üzerindeki öğe sayısını döner.
- **anyMatch(Predicate), allMatch(Predicate), noneMatch(Predicate)**: Belirli koşullara göre `boolean` sonuç döner.

Örnek:
```java
List<String> names = Arrays.asList("Ali", "Ahmet", "Ayşe", "Mehmet");
String concatenatedNames = names.stream()
                                .filter(name -> name.startsWith("A"))
                                .collect(Collectors.joining(", "));
System.out.println(concatenatedNames); // Çıktı: Ali, Ahmet, Ayşe
```

### Stream İşlemlerinin Özellikleri ve Kullanım Durumları

1. **Filtreleme**: `filter` ile belirli koşullara göre eleme yapılır.
2. **Dönüştürme**: `map` ile bir veri kaynağındaki veriler başka bir veri tipine veya şekle dönüştürülür. Örneğin, `String` listesindeki her bir öğeyi büyük harfe çevirmek için `map` kullanılabilir.
3. **Toplama İşlemleri**: `collect` ile bir `Stream`, liste, küme, harita gibi veri yapılarına dönüştürülebilir.
4. **Birleştirme ve İndirgeme (Reduction)**: `reduce` ile `Stream` öğeleri tek bir değere indirgenebilir. Örneğin, bir sayı listesindeki sayıların toplamını bulmak.
5. **Sıralama ve Sınırlama**: `sorted` ile sıralama, `limit` ile eleman sayısını sınırlandırma yapılır.

Örnek:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .reduce(0, Integer::sum);
System.out.println(sum); // Çıktı: 15
```

### Parallel Stream ile Paralel İşlemler

`Stream API`, çok çekirdekli sistemlerde işlemleri paralel hale getirmeyi destekler. `parallelStream()` kullanarak işlemleri paralel hale getirip performansı artırabilirsiniz. Ancak, paralel işlemler her durumda verim sağlamayabilir; bu yüzden dikkatli kullanılmalıdır.

Örnek:
```java
List<Integer> largeList = Arrays.asList(…); // Büyük bir liste
long count = largeList.parallelStream()
                      .filter(n -> n % 2 == 0)
                      .count();
System.out.println("Çift sayı adedi: " + count);
```

### Stream API’nin Sağladığı Avantajlar

- **Kodun Okunabilirliği**: `Stream` ile yazılan kod daha kısa ve daha okunaklıdır.
- **Performans Artışı**: Paralel `Stream` ile büyük veri setlerinde performans artışı sağlanabilir.
- **Fonksiyonel Programlama**: Lambda ifadeleri ile veri işleme daha basit hale gelir.
- **İmmutability**: `Stream` işlemleri veriyi değiştirmez, yalnızca yeni bir `Stream` veya sonuç üretir.

### Stream API İle Koleksiyon İşlemleri

Koleksiyonlar üzerinde `Stream API` kullanımı, verileri işlemek için döngü veya `iterator` kullanmaya göre daha işlevseldir. Geleneksel yöntemde bir liste üzerinde filtreleme yapmak için `for` döngüsü ile `if` kontrolleri yazmanız gerekirdi. `Stream` ile bu işlemler daha sade hale gelir.

Örnek:
```java
List<Person> people = Arrays.asList(
    new Person("John", 25),
    new Person("Jane", 22),
    new Person("Jack", 30)
);

List<Person> filteredPeople = people.stream()
                                    .filter(person -> person.getAge() > 23)
                                    .collect(Collectors.toList());
System.out.println(filteredPeople);
```

Bu örnekte, `Stream API`, bir `for` döngüsüne kıyasla daha sade ve anlaşılırdır.

### Sonuç

Java 8 `Stream API`, veri işlemeyi daha kolay ve etkili hale getiren güçlü bir araçtır. Fonksiyonel programlama yetenekleri, paralel işlem desteği ve veri kaynağını değiştirmeden işleme olanaklarıyla modern Java geliştirmede vazgeçilmez hale gelmiştir. `Stream`ler, özellikle büyük ve karmaşık veri işleme görevlerinde daha az kod yazarak daha



## Java 8 Stream API'nin sağladığı metotlar
```sh 

```
---

Java 8 Stream API'nin sağladığı metotlar, veri işleme akışını daha okunabilir ve etkili hale getiren birçok farklı işlem sunar. Bu metotlar, genellikle iki ana kategoriye ayrılır: **Ara İşlemler (Intermediate Operations)** ve **Terminal İşlemler (Terminal Operations)**. İşte en yaygın kullanılan Stream API metotları ve açıklamaları:

### Ara İşlemler (Intermediate Operations)

Ara işlemler, bir `Stream` üzerinde dönüşüm veya filtreleme gibi işlemler yapar ve yeni bir `Stream` döner. Bu işlemler, tembel (lazy) olarak değerlendirilir, yani yalnızca bir terminal işlem çağrıldığında etkin hale gelirler.

1. **`filter(Predicate<? super T> predicate)`**: Stream’deki öğeleri belirtilen koşula göre filtreler. Predicate (koşul) sağlanır ve bu koşulu sağlayan öğeler yeni bir `Stream` olarak döner.

   ```java
   stream.filter(n -> n > 10);
   ```

2. **`map(Function<? super T, ? extends R> mapper)`**: Her bir öğe üzerinde dönüşüm işlemi yapar ve yeni bir `Stream` döner. Öğeleri bir veri tipinden başka bir veri tipine dönüştürmek için kullanılır.

   ```java
   stream.map(String::toUpperCase);
   ```

3. **`flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)`**: Her bir öğeyi bir `Stream`'e dönüştürür ve bu `Stream`leri tek bir `Stream` olarak birleştirir. Bir koleksiyonun içindeki koleksiyonları düzleştirmek için kullanılır.

   ```java
   stream.flatMap(list -> list.stream());
   ```

4. **`distinct()`**: Stream'deki tekrarlı (aynı) öğeleri kaldırır ve benzersiz öğelerden oluşan bir `Stream` döner.

   ```java
   stream.distinct();
   ```

5. **`sorted()`**: Stream'deki öğeleri doğal sıraya göre sıralar. Eğer öğeler `Comparable` değilse, `Comparator` parametresiyle sıralama yapılabilir.

   ```java
   stream.sorted();
   ```

6. **`sorted(Comparator<? super T> comparator)`**: Verilen `Comparator`'a göre öğeleri sıralar. Özel sıralama işlemleri için kullanılır.

   ```java
   stream.sorted(Comparator.reverseOrder());
   ```

7. **`limit(long maxSize)`**: Stream’in ilk belirtilen sayıda (`maxSize`) öğesini alır ve yeni bir `Stream` döner.

   ```java
   stream.limit(5);
   ```

8. **`skip(long n)`**: Stream’in ilk `n` öğesini atlar ve geriye kalan öğelerle yeni bir `Stream` döner.

   ```java
   stream.skip(3);
   ```

9. **`peek(Consumer<? super T> action)`**: Stream üzerinde işlem yaparken, her bir öğeyi gözlemlemek için kullanılır. Veriyi değiştirmez; debug amaçlı veya yan etkiler eklemek için kullanılabilir.

   ```java
   stream.peek(System.out::println);
   ```

### Terminal İşlemler (Terminal Operations)

Terminal işlemler, bir `Stream` üzerindeki işlemleri sonlandırır ve bir sonuç döner. Terminal işlem çağrıldığında, ara işlemler de işlenmiş olur.

1. **`forEach(Consumer<? super T> action)`**: Stream’deki her bir öğe üzerinde belirtilen işlemi uygular. Dönen bir sonuç yoktur.

   ```java
   stream.forEach(System.out::println);
   ```

2. **`collect(Collector<? super T, A, R> collector)`**: Stream öğelerini toplayarak bir koleksiyona veya başka bir sonuç tipine dönüştürür. Genellikle `Collectors` yardımcı sınıfı ile kullanılır.

   ```java
   List<Integer> list = stream.collect(Collectors.toList());
   ```

3. **`reduce(BinaryOperator<T> accumulator)`**: Stream’deki öğeleri indirger ve tek bir sonuç döner. Bu, örneğin tüm sayıların toplamını veya çarpımını bulmak için kullanılabilir.

   ```java
   int sum = stream.reduce(0, Integer::sum);
   ```

4. **`reduce(T identity, BinaryOperator<T> accumulator)`**: Belirli bir başlangıç değeri (`identity`) ile indirgeme işlemi yapar. Başlangıç değeri, işlemin ilk girdisi olarak kullanılır.

   ```java
   int sum = stream.reduce(0, (a, b) -> a + b);
   ```

5. **`count()`**: Stream’deki öğelerin sayısını döner. Özellikle filtreleme gibi işlemler sonrası kaç öğe olduğunu bulmak için kullanışlıdır.

   ```java
   long count = stream.count();
   ```

6. **`anyMatch(Predicate<? super T> predicate)`**: Stream’de en az bir öğenin belirtilen koşulu sağladığını kontrol eder. `boolean` döner.

   ```java
   boolean hasEven = stream.anyMatch(n -> n % 2 == 0);
   ```

7. **`allMatch(Predicate<? super T> predicate)`**: Stream’deki tüm öğelerin belirtilen koşulu sağladığını kontrol eder. `boolean` döner.

   ```java
   boolean allPositive = stream.allMatch(n -> n > 0);
   ```

8. **`noneMatch(Predicate<? super T> predicate)`**: Stream’deki hiçbir öğenin belirtilen koşulu sağlamadığını kontrol eder. `boolean` döner.

   ```java
   boolean noneNegative = stream.noneMatch(n -> n < 0);
   ```

9. **`findFirst()`**: Stream’deki ilk öğeyi döner. Optional olarak sonuç döner; eğer boş bir `Stream` varsa sonuç `Optional.empty()` olur.

   ```java
   Optional<Integer> first = stream.findFirst();
   ```

10. **`findAny()`**: Stream’deki herhangi bir öğeyi döner. Paralel `Stream`lerde performans optimizasyonu sağlar. Sonuç `Optional` olarak döner.

    ```java
    Optional<Integer> any = stream.findAny();
    ```

### Stream API Kullanımına Dair Özet

Java 8 Stream API’nin sağladığı bu metotlar, veri üzerinde filtreleme, dönüştürme, sıralama, toplama ve daha fazlasını gerçekleştirmek için idealdir. Stream işlemleri, veri üzerinde işlem yapmayı çok daha basit ve etkili hale getirir, bu da kodun okunabilirliğini ve bakımını kolaylaştırır. Bu metotların işlevlerini doğru bir şekilde anlayarak, veri işleme ihtiyaçlarınıza göre uygun `Stream` işlemlerini seçebilirsiniz.

## Spring Boot (@PostConstruct Annotation)
```sh 

```
---

Spring'de `@PostConstruct` ile constructor (yapıcı metod) arasında temel farklar, uygulama başlatılırken bileşenlerin ne zaman ve nasıl hazırlandığıyla ilgilidir. İşte bu iki yöntem arasındaki farklar:

### 1. @PostConstruct Annotation
- `@PostConstruct`, bir sınıfta `@Bean` olarak tanımlanan bileşenin tüm bağımlılıkları enjekte edildikten hemen sonra çalıştırılan bir metodu belirtir.
- Bu metot, Spring Bean Lifecycle (Spring Bean Yaşam Döngüsü) içerisinde yer alır ve Spring Container, bileşen hazır olduktan sonra `@PostConstruct` ile işaretlenmiş metodu çağırır.
- `@PostConstruct`, genellikle bir bileşenin bağımlılıkları sağlandıktan sonra yapılan başlatma işlemlerini tanımlamak için kullanılır.
- Örneğin, bir bileşen yüklenirken bazı veritabanı kontrolleri veya ön yüklemeler yapılması gerekiyorsa, bu işlemler `@PostConstruct` ile yapılabilir.

### 2. Constructor
- Constructor, bir sınıfın örneği oluşturulduğunda ilk çağrılan yapıdır.
- `new` anahtar kelimesi ile çağrıldığında veya Spring Container tarafından oluşturulduğunda, sınıfın bağımlılıkları enjekte edilmeden önce çağrılır.
- Constructor içinde bileşenler henüz tamamen hazır olmadığından, bağımlılıklara erişmek mümkün olmayabilir.
- Constructor, genellikle nesnenin ilk durumunu ayarlamak veya zorunlu bağımlılıkları inject etmeden önce bazı başlatma işlemleri yapmak için kullanılır.

### Farkları Özetlersek:
| Özellik                 | Constructor                                  | @PostConstruct                               |
|-------------------------|----------------------------------------------|----------------------------------------------|
| Çalışma Zamanı          | Nesne oluşturulduğunda                       | Bağımlılıklar enjekte edildikten sonra       |
| Bağımlılıklara Erişim   | Bağımlılıklar henüz enjekte edilmemiştir     | Tüm bağımlılıklar enjekte edilmiştir         |
| Kullanım Alanı          | Nesneyi başlatmak ve gerekli bağımlılıkları inject etmek | Hazır hale gelen nesne ile başlatma yapmak |
| Kullanım Yeri           | Tüm Java sınıfları                           | Spring Bean’leri                            |

### Örnek:
```java
@Component
public class ExampleService {

    private final DependencyService dependencyService;

    // Constructor injection
    public ExampleService(DependencyService dependencyService) {
        this.dependencyService = dependencyService;
        System.out.println("Constructor çağrıldı.");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct çağrıldı. Bağımlılıklar enjekte edilmiş durumda.");
        // dependencyService burada kullanılabilir
    }
}
```

Bu örnekte:
- **Constructor** çağrıldığında bağımlılık enjekte edilmiş olsa da, `@PostConstruct` çağrıldığında tüm bileşenler eksiksiz olarak yüklenmiş durumdadır.

## Spring Boot (Injection)
```sh 

```
---

Spring'de **instance** oluşturmak ve **injection** (bağımlılık enjeksiyonu) farklı iki yöntemdir ve uygulamanın bağımlılıklarını yönetme şekli açısından önemli farklara sahiptir. Bu farkları inceleyelim:

### 1. Instance Oluşturmak
- Java’da **instance** (örnek) oluşturmak, `new` anahtar kelimesi kullanılarak doğrudan bir nesne oluşturmak anlamına gelir. Örneğin, `MyService myService = new MyService();` ifadesi ile `MyService` sınıfının bir örneği oluşturulur.
- Bu yöntemle oluşturulan nesne **manuel** olarak oluşturulur ve Spring Container tarafından yönetilmez.
- Eğer bir nesne manuel olarak oluşturulursa, Spring'in bağımlılık yönetimi, yaşam döngüsü kontrolleri veya diğer özelliklerinden yararlanılamaz.
- Bu yöntem daha basit projelerde kullanılabilir, ancak bağımlılıkların manuel olarak yönetilmesi gerekir ve kod karmaşık hale gelebilir.

### 2. Injection (Bağımlılık Enjeksiyonu)
- **Injection** (Bağımlılık Enjeksiyonu), Spring’in bağımlılık yönetimini sağlayan bir özelliktir. Spring, nesneleri **otomatik olarak enjekte ederek** bağımlılıkları sağlar.
- Injection işlemi Spring’in kendi yönetiminde olup, Spring Container tarafından otomatik olarak yapılır.
- Spring Container, uygulama çalıştırıldığında belirli kurallara göre bağımlılıkları enjekte eder. Bu, sınıf yapıcıları (constructor injection) veya alanlar (field injection) kullanılarak yapılabilir.
- **Constructor Injection** veya **@Autowired** gibi anotasyonlarla bağımlılıklar enjekte edilir.
- Injection sayesinde bağımlılıkların yönetimi Spring Container tarafından yapılır, bu da uygulamayı daha modüler ve test edilebilir hale getirir.

### Farkları Özetlersek:

| Özellik                    | Instance Oluşturmak (new)                        | Injection (Bağımlılık Enjeksiyonu)                |
|----------------------------|-------------------------------------------------|---------------------------------------------------|
| Nesne Oluşturma Yöntemi    | `new` anahtar kelimesi ile manuel               | Spring tarafından otomatik                        |
| Spring Container Yönetimi  | Yönetilmez                                      | Spring Container tarafından yönetilir             |
| Bağımlılık Yönetimi        | Manuel olarak yönetilmesi gerekir               | Otomatik olarak Spring tarafından sağlanır        |
| Kod Bakımı ve Modülerlik   | Daha zor ve daha fazla kodlama gerektirir       | Daha düzenli, modüler ve test edilebilir          |
| Yaşam Döngüsü Kontrolleri  | Spring yaşam döngüsünden bağımsızdır            | Spring Bean yaşam döngüsü kurallarına tabidir     |
| Kullanım Alanı             | Basit bağımlılıklar için veya bağımsız nesneler | Karmaşık bağımlılıkların yönetimi için idealdir   |

### Örnek Kod ile Açıklama:

```java
// Manuel Instance Oluşturma
public class Application {

    public static void main(String[] args) {
        // MyService bağımlılığı manuel olarak oluşturulur
        MyService myService = new MyService();
        myService.doSomething();
    }
}
```

Yukarıdaki kodda, `MyService` nesnesi manuel olarak oluşturulmuştur ve bağımlılıklar yönetilmez.

```java
// Spring Injection ile
@Component
public class MyService {
    
    public void doSomething() {
        System.out.println("Hizmet çalışıyor.");
    }
}

@Component
public class Application {

    private final MyService myService;

    // Constructor Injection
    public Application(MyService myService) {
        this.myService = myService;
    }

    public void run() {
        myService.doSomething();
    }
}
```

Bu örnekte:
- Spring Container, `Application` sınıfını başlattığında `MyService` bağımlılığını otomatik olarak enjekte eder.
- `@Component` anotasyonu sayesinde `MyService`, Spring tarafından yönetilen bir bean haline gelir.
- **Injection**, kodun daha temiz ve modüler olmasını sağlar, çünkü bağımlılıklar `new` ile manuel olarak oluşturulmamış, Spring tarafından sağlanmıştır.

### Sonuç:
Injection, Spring'in bağımlılık yönetimini sağladığı bir mekanizmadır ve projelerde daha düzenli, modüler ve test edilebilir bir yapı sağlar. Diğer yandan, instance oluşturma yöntemi manuel bir yöntem olup daha basit projelerde kullanılabilir, ancak bağımlılıkların yönetimi kullanıcıya bırakıldığından kod karmaşık hale gelebilir.

## Spring Boot (Manuel Bağımlılık)
```sh 

```
---

**Bağımlılıkların manuel olarak yönetilmesi**, bir sınıfın bağımlılıklarını elle oluşturarak veya elle enjekte ederek, yani Spring gibi bir bağımlılık enjeksiyonu çerçevesine başvurmadan yönetilmesi anlamına gelir. Bu yöntem, bağımlılık yönetimini tamamen geliştiricinin sorumluluğuna bırakır.

### Manuel Bağımlılık Yönetimi Nedir?
Bağımlılıkların manuel olarak yönetilmesi, bağımlı sınıfların ihtiyaç duyduğu nesnelerin `new` anahtar kelimesi ile oluşturulması ve bu bağımlılıkların ilgili sınıfa doğrudan verilmesidir. Geliştirici, hangi nesnelerin nerede ve nasıl kullanılacağını kodda açıkça belirler. Bu yaklaşım, bağımlılık enjeksiyonuna alternatif bir yöntemdir ancak bazı dezavantajlara sahiptir.

### Manuel Bağımlılık Yönetiminin Dezavantajları
1. **Kod Tekrarı ve Dağınıklığı**: Bağımlılıkları manuel olarak yönetmek, kodda `new` anahtar kelimesi ile çok sayıda nesne oluşturulmasına ve aynı nesnenin birçok yerde tekrar tekrar tanımlanmasına neden olabilir. Bu da kodun okunabilirliğini azaltır ve bakımını zorlaştırır.

2. **Gevşek Bağlılık Eksikliği**: Bağımlılık enjeksiyonu ile bağımlılıkları otomatik olarak yöneten çerçeveler, sınıfların birbirine daha az bağımlı (gevşek bağlı) olmasını sağlar. Manuel yöntemle nesneler sıkı sıkıya birbirine bağlı olur, bu da bir sınıfta yapılan bir değişikliğin diğer sınıfları etkilemesine yol açabilir.

3. **Test Edilebilirlik**: Manuel bağımlılık yönetimi, birim testlerini zorlaştırır. Bir sınıfın bağımlılıklarını test sırasında mock (sahte) nesneler ile değiştirmek zor olabilir çünkü bağımlılıklar sınıf içinde doğrudan `new` anahtar kelimesi ile oluşturulmuştur. Bu da test sırasında sınıfları izole etmeyi zorlaştırır.

4. **Yaşam Döngüsü Yönetimi**: Spring gibi bağımlılık enjeksiyonu çerçeveleri, nesnelerin yaşam döngüsünü yönetir ve nesneler yalnızca ihtiyaç duyulduğunda oluşturulur. Manuel bağımlılık yönetiminde, geliştirici bu yaşam döngüsünü yönetmek zorundadır, ki bu da gereksiz bellek kullanımı veya performans sorunlarına yol açabilir.

### Manuel Bağımlılık Yönetimine Örnek

Örneğin, bir `DatabaseService` sınıfının bir `UserService` sınıfında manuel olarak yönetildiğini düşünelim:

```java
public class DatabaseService {
    public void connect() {
        System.out.println("Veritabanına bağlanıldı.");
    }
}

public class UserService {
    private DatabaseService databaseService;

    public UserService() {
        // DatabaseService bağımlılığı manuel olarak oluşturuluyor
        this.databaseService = new DatabaseService();
    }

    public void performDatabaseOperation() {
        databaseService.connect();
    }
}
```

Yukarıdaki kodda:
- `UserService` sınıfı, `DatabaseService` bağımlılığını kendisi yönetmektedir. Bu bağımlılık `UserService` sınıfı içinde manuel olarak oluşturulmuş, yani Spring gibi bir enjeksiyon çerçevesi kullanılmamıştır.
- `UserService` içinde `DatabaseService` nesnesi manuel olarak `new` anahtar kelimesi ile başlatılmıştır. Bu durum sınıflar arasında sıkı bir bağ oluşturur ve bağımlılık enjeksiyonu yapılmadığı için kod daha az esnek hale gelir.

### Manuel Bağımlılık Yönetimine Alternatif: Bağımlılık Enjeksiyonu
Spring ile aynı örnek bağımlılık enjeksiyonu ile yönetildiğinde kod daha temiz ve modüler hale gelir:

```java
@Component
public class DatabaseService {
    public void connect() {
        System.out.println("Veritabanına bağlanıldı.");
    }
}

@Component
public class UserService {
    private final DatabaseService databaseService;

    // Constructor Injection
    @Autowired
    public UserService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public void performDatabaseOperation() {
        databaseService.connect();
    }
}
```

Yukarıdaki örnekte:
- Spring Container, `DatabaseService` nesnesini `UserService` içine otomatik olarak enjekte eder.
- `@Autowired` anotasyonu kullanılarak `UserService` sınıfı bağımlılığını doğrudan `new` ile yönetmek yerine Spring Container’a bırakır.
- Bu yaklaşım, kodun daha modüler, esnek ve test edilebilir olmasını sağlar.

### Sonuç
Manuel bağımlılık yönetimi, bağımlılıkların doğrudan kod içinde `new` ile oluşturulması ve yönetilmesi anlamına gelir. Ancak bu yöntem, kodun karmaşık hale gelmesine ve bakımının zorlaşmasına neden olabilir. Spring gibi bağımlılık enjeksiyon araçları, bağımlılıkları yöneterek kodu daha esnek, test edilebilir ve modüler hale getirir.

## Spring Data (@EmbeddedId)
```sh 

```
---

Spring Boot ile çalışırken bir entity içinde birden fazla ID’ye sahip olmak istediğimizde, genellikle **@EmbeddedId** veya **@IdClass** yaklaşımlarını kullanarak bunu yönetiriz. Bu, özellikle **birleştirilmiş anahtar** (composite key) veya **işlemsel olarak birden fazla kimlik alanı** gerektiğinde kullanılır. Aşağıda bu yöntemlerin her birini detaylı olarak ele alacağım.

### 1. @EmbeddedId Kullanarak Birden Fazla ID Yönetimi

**@EmbeddedId** anotasyonu, bir entity içinde birleştirilmiş bir anahtar oluşturmak için kullanılır. Burada, anahtar olarak kullanılacak tüm alanları kapsayan bir sınıf tanımlarız ve entity sınıfında bu sınıfı **@EmbeddedId** ile işaretleriz.

#### Örnek:
Varsayalım ki bir **OrderItem** entity sınıfımız var ve bu sınıf **orderId** ve **productId** alanları ile birleştirilmiş bir anahtara sahip olacak.

1. **Anahtar sınıfını tanımla:**

   ```java
   @Embeddable
   public class OrderItemKey implements Serializable {
       private Long orderId;
       private Long productId;

       // Getter ve Setter'lar, hashCode() ve equals() metotları ekleyin
   }
   ```

    - **@Embeddable**: Anahtar sınıfını tanımlamak için bu anotasyonu kullanıyoruz.
    - **Serializable**: Birleştirilmiş anahtar sınıfı mutlaka `Serializable` olmalıdır.
    - **equals() ve hashCode()**: Bu metotlar, birleştirilmiş anahtar sınıfının benzersizliğini sağlamak için gereklidir.

2. **Entity içinde @EmbeddedId kullanımı:**

   ```java
   @Entity
   public class OrderItem {
       @EmbeddedId
       private OrderItemKey id;

       private int quantity;
       private BigDecimal price;

       // Diğer alanlar ve getter/setter metotları
   }
   ```

   Burada **OrderItemKey** sınıfı, **OrderItem** entity sınıfı içinde **@EmbeddedId** ile tanımlanmıştır. Bu sayede birleştirilmiş anahtar, **orderId** ve **productId** alanlarını içerir.

#### Avantajları:
- Anahtar sınıfını bir **@Embeddable** nesne olarak ayrı bir sınıf halinde tanımladığımız için kod düzeni sağlanır.
- Birleştirilmiş anahtar kolayca entity’e gömülebilir.

#### Dezavantajları:
- **@EmbeddedId** yöntemi daha çok birleştirilmiş anahtarların yönetimi için uygundur, ve bu yöntemde ID değerlerinin entity içinde tek bir nesne olarak yönetilmesi gerekmektedir.

### 2. @IdClass Kullanarak Birden Fazla ID Yönetimi

**@IdClass** anotasyonu, entity içinde birden fazla ID alanı tanımlamak için kullanılır. Bu yöntemde birleştirilmiş anahtar alanları entity’nin içinde bağımsız değişkenler olarak tanımlanır. **@IdClass** kullanırken, bir **primary key** sınıfı oluşturur ve bu sınıfı entity’nin üstüne **@IdClass** ile işaretleriz.

#### Örnek:
Yine bir **OrderItem** entity sınıfı olduğunu varsayalım, fakat burada **@IdClass** kullanacağız.

1. **Primary key sınıfını tanımla:**

   ```java
   public class OrderItemId implements Serializable {
       private Long orderId;
       private Long productId;

       // Getter ve Setter'lar, hashCode() ve equals() metotları ekleyin
   }
   ```

2. **Entity içinde @IdClass kullanımı:**

   ```java
   @Entity
   @IdClass(OrderItemId.class)
   public class OrderItem {
       @Id
       private Long orderId;

       @Id
       private Long productId;

       private int quantity;
       private BigDecimal price;

       // Diğer alanlar ve getter/setter metotları
   }
   ```

   Bu örnekte, **OrderItem** entity’si, **orderId** ve **productId** alanlarını **@Id** ile bağımsız olarak tanımlar. **OrderItemId** sınıfı ise **@IdClass** ile belirtilir.

#### Avantajları:
- Birleştirilmiş anahtarın tüm alanları entity içinde bağımsız olarak tanımlanabilir.
- Karmaşık birleştirilmiş anahtar yapılarını yönetmek için uygundur.

#### Dezavantajları:
- **@IdClass** kullanımı daha fazla kod gerektirir ve **@EmbeddedId** kadar pratik değildir.
- **equals() ve hashCode()** metotlarının düzgün bir şekilde tanımlanması gerekir.

### Hangi Yöntem Ne Zaman Kullanılmalı?

| Durum                             | Tercih Edilecek Anotasyon |
|-----------------------------------|---------------------------|
| Basit birleştirilmiş anahtar      | **@EmbeddedId**          |
| Birden fazla bağımsız ID alanı    | **@IdClass**             |
| Legacy veritabanı yapısı          | **@IdClass**             |

### Özet

Spring Boot ve JPA içinde bir entity’de birden fazla ID’yi yönetmek için **@EmbeddedId** ve **@IdClass** kullanabiliriz. **@EmbeddedId** daha düzenli ve basit bir yaklaşımdır ve anahtar olarak kullanılan alanları tek bir nesnede toplar. **@IdClass** ise daha karmaşık veya legacy veritabanı yapıları için uygundur, her bir ID alanını bağımsız olarak tanımlama esnekliği sağlar.

Her iki yöntemde de ID yönetiminde doğru bir şekilde `equals()` ve `hashCode()` metotlarını tanımlamayı unutmamak önemlidir, aksi halde JPA entity ilişkilerinde beklenmeyen sorunlarla karşılaşabilirsiniz.



## Design Pattern (Creational) tasarım desenleri)
```sh 

```
---
oluşturım (Creational) tasarım desenleri, nesne oluşturma süreçlerini yönetmek ve optimize etmek amacıyla kullanılır. Bu desenler, nesne oluşturmanın doğrudan yapılmasından ziyade bir yapı üzerinden yapılmasını sağlar ve böylece sistemin esnekliğini artırır.

İşte başlıca oluşturım desenleri:

1. **Singleton**
   - Sınıfın yalnızca bir örneğinin olmasını sağlar ve global bir erişim noktası sunar.

2. **Factory Method (Fabrika Metodu)**
   - Alt sınıfların hangi sınıfın örneğinin oluşturulacağına karar vermesini sağlayan bir arayüz tanımlar.

3. **Abstract Factory (Soyut Fabrika)**
   - Birbiriyle ilişkili veya bağımlı nesne ailesi oluşturan arayüz sağlar ve hangi sınıfın örneğinin oluşturulacağına alt sınıflar karar verir.

4. **Builder (Kurucu)**
   - Kompleks nesneleri adım adım oluşturmak için kullanılır ve nesnelerin farklı gösterimlerinden bağımsız olarak oluşturulmasını sağlar.

5. **Prototype (Prototip)**
   - Bir nesnenin örneğini klonlayarak kopyalar. Yeni nesneler oluşturmak yerine var olan nesnelerden kopyalama yapılır.

Bu desenler, nesne oluşturma süreçlerini daha esnek hale getirir ve kodun bakımını kolaylaştırır.


## Singleton tasarım deseni
```sh 

```
---

Java'da Singleton tasarım deseni, bir sınıfın yalnızca bir örneğinin oluşturulmasını sağlar ve bu örneğe küresel bir erişim noktası sunar. Bu desen, sistem genelinde belirli işlemleri koordine etmek için yalnızca bir nesneye ihtiyaç duyulduğunda faydalıdır.

### Singleton Tasarım Deseninin Özellikleri
1. **Tek Örnek**: Bir sınıfın yalnızca bir "tek" örneğinin oluşturulmasını kısıtlar.
2. **Küresel Erişim Noktası**: Örneğe küresel bir erişim noktası sağlar.
3. **Thread-Safe (İş Parçacığı Güvenliği)**: Bu desen gerektiğinde iş parçacığı güvenli olacak şekilde tasarlanabilir.
4. **Lazy Initialization (Tembel Başlatma)**: Örnek yalnızca gerektiğinde oluşturulabilir.

### Java'da Singleton Deseninin Uygulama Yöntemleri

#### 1. Eager Initialization (Hızlı Başlatma)
Bu yöntemde, örnek sınıf yüklendiğinde oluşturulur.

```java
public class Singleton {
    private static final Singleton instance = new Singleton();

    // Özel bir yapıcı (constructor) ile dışardan nesne oluşturulması engellenir
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

- **Avantajlar**: Basit ve thread-safe.
- **Dezavantajlar**: Sınıf yüklendiğinde hemen örnek oluşturulur. Bu, örneğe her zaman ihtiyaç duyulmayacaksa kaynak israfına neden olabilir.

#### 2. Lazy Initialization (Tembel Başlatma)
Bu yöntemde, örnek yalnızca `getInstance()` çağrıldığında oluşturulur.

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

- **Avantajlar**: Örnek yalnızca gerektiğinde oluşturulur, bu da kaynak kullanımını optimize eder.
- **Dezavantajlar**: Bu yöntem thread-safe değildir; çoklu iş parçacığında sorun çıkarabilir.

#### 3. Thread-Safe Singleton
Thread-safe hale getirmek için `synchronized` anahtar kelimesi kullanılabilir.

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

- **Avantajlar**: Thread-safe olduğu için çoklu iş parçacığı ortamında güvenlidir.
- **Dezavantajlar**: `synchronized` anahtar kelimesi performansı etkileyebilir.

#### 4. Double-Checked Locking (Çift Kontrol Kilitleme)
Hem tembel başlatmayı hem de thread-safe yapıyı birleştirmek için çift kontrol kilitleme uygulanabilir.

```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

- **Avantajlar**: Hem thread-safe hem de tembel başlatma özelliklerini sağlar.
- **Dezavantajlar**: Kod biraz karmaşıktır.

#### 5. Bill Pugh Singleton Yöntemi
Bu yöntemde, iç sınıf kullanarak tembel başlatma ve thread-safe özelliklerini basit bir şekilde sağlar.

```java
public class Singleton {
    private Singleton() {}

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
```

- **Avantajlar**: Hem thread-safe hem de tembel başlatma özelliklerine sahip, ayrıca diğer yöntemlere göre daha verimli.
- **Dezavantajlar**: Kodun anlaşılması biraz daha zor olabilir.

### Singleton Deseninin Kullanım Alanları
- **Bağlantı Havuzu (Connection Pool)**
- **Yapılandırma Yöneticileri (Configuration Managers)**
- **Cache (Önbellek)**
- **Loglama (Logging)**

Her bir yöntem, farklı kullanım senaryoları için uygundur ve uygulamanın ihtiyaçlarına göre seçilmelidir.


## IntelliJ IDEA'da sıklıkla kullanılan kısayollar
```sh 

```
---


İşte IntelliJ IDEA'da sıklıkla kullanılan kısayollar ve açıklamaları:

### 1. Kod Navigasyonu ve Arama
- **Class Bulma**:
   - **Windows/Linux**: `Ctrl + N`
   - **Mac**: `Command + O`
   - Açıklama: Projedeki herhangi bir sınıfı ada göre arar.

- **Dosya Bulma**:
   - **Windows/Linux**: `Ctrl + Shift + N`
   - **Mac**: `Command + Shift + O`
   - Açıklama: Projedeki herhangi bir dosyayı ada göre arar.

- **Semboller Arasında Arama**:
   - **Windows/Linux**: `Ctrl + Alt + Shift + N`
   - **Mac**: `Command + Option + O`
   - Açıklama: Projedeki herhangi bir sembolü (değişken, metod, sınıf vb.) arar.

- **Son Düzenlenen Dosyaları Göster**:
   - **Windows/Linux**: `Ctrl + E`
   - **Mac**: `Command + E`
   - Açıklama: En son açılan veya düzenlenen dosyaları listeler.

### 2. Kod Düzenleme
- **Kod Tamamlama**:
   - **Windows/Linux**: `Ctrl + Space`
   - **Mac**: `Control + Space`
   - Açıklama: Kod tamamlama için öneriler sunar.

- **Kod Formatlama**:
   - **Windows/Linux**: `Ctrl + Alt + L`
   - **Mac**: `Command + Option + L`
   - Açıklama: Seçili kodu veya dosyayı IntelliJ IDEA'nın düzenleme kurallarına göre otomatik olarak biçimlendirir.

- **Kullanılmayan Importları Temizleme**:
   - **Windows/Linux**: `Ctrl + Alt + O`
   - **Mac**: `Command + Option + O`
   - Açıklama: Kullanılmayan tüm importları siler.

- **İfadenin Tamamını veya Satırın Geri Kalanını Silme**:
   - **Windows/Linux**: `Ctrl + Y`
   - **Mac**: `Command + Delete`
   - Açıklama: Satırın geri kalanını veya seçili ifadeyi siler.

### 3. Refactoring
- **Refactor This**:
   - **Windows/Linux**: `Ctrl + Alt + Shift + T`
   - **Mac**: `Control + T`
   - Açıklama: Kodunuzu yeniden düzenlemenizi sağlayan refactoring seçenekleri sunar.

- **Değişken, Metod vb. Yeniden Adlandırma**:
   - **Windows/Linux**: `Shift + F6`
   - **Mac**: `Shift + F6`
   - Açıklama: Seçilen öğeyi yeniden adlandırır; tüm kullanımları günceller.

### 4. Kod İnceleme ve Çalıştırma
- **Hata Bulma (Debugging) Başlat**:
   - **Windows/Linux**: `Shift + F9`
   - **Mac**: `Control + D`
   - Açıklama: Uygulamayı hata ayıklama modunda başlatır.

- **Çalıştırma (Run)**:
   - **Windows/Linux**: `Shift + F10`
   - **Mac**: `Control + R`
   - Açıklama: Uygulamayı çalıştırır.

- **Hata Çıkarma (Step Into)**:
   - **Windows/Linux**: `F7`
   - **Mac**: `F7`
   - Açıklama: Kodda adım adım hata ayıklamaya girer.

- **Sonraki Adıma Geçme (Step Over)**:
   - **Windows/Linux**: `F8`
   - **Mac**: `F8`
   - Açıklama: Mevcut adımdan bir sonraki adıma geçer.

### 5. Genel Kısayollar
- **Arama (Search Everywhere)**:
   - **Windows/Linux**: `Shift` tuşuna iki kere basın
   - **Mac**: `Shift` tuşuna iki kere basın
   - Açıklama: Dosya, sınıf, sembol veya herhangi bir şeyi genel olarak arar.

- **Proje Gezginini Açma/Kapatma (Project View)**:
   - **Windows/Linux**: `Alt + 1`
   - **Mac**: `Command + 1`
   - Açıklama: Proje dosya gezgini penceresini açar veya kapatır.

- **Terminal Açma**:
   - **Windows/Linux**: `Alt + F12`
   - **Mac**: `Option + F12`
   - Açıklama: IntelliJ IDEA içindeki terminali açar.

Bu kısayollar, IntelliJ IDEA'da hızlı bir şekilde çalışmanızı sağlar ve projelerdeki üretkenliğinizi artırır.


## Application Server (Wildfly)
```sh 

```
---

JBoss'ın yeni ismi WildFly olarak değiştirildi. Red Hat tarafından geliştirilen JBoss Application Server, 2013 yılında yapılan bir değişiklikle WildFly olarak yeniden adlandırıldı. Bu değişiklikle, JBoss topluluğunun ücretsiz ve açık kaynaklı uygulama sunucusu sürümünü ifade etmek için "WildFly" ismi kullanılırken, ticari sürüm için Red Hat JBoss Enterprise Application Platform (EAP) ismi kullanılmaktadır.

WildFly, Java EE ve Jakarta EE uyumlu, yüksek performanslı bir uygulama sunucusu olarak geliştirilmiş olup, bulut tabanlı mikroservis mimarileriyle uyumludur.

İhtiyacınıza göre en uygun WildFly dağıtımını seçerken dikkate almanız gereken bazı ayrıntılar şunlardır:

1. **WildFly Dağıtımı**:
   - **Kullanım Amacı**: Bu, üretim ve geliştirme ortamlarında kullanılabilen standart WildFly uygulama sunucusudur. Eğer doğrudan WildFly'ın kararlı sürümünü kullanarak bir uygulama dağıtmak ya da geliştirme yapmak istiyorsanız, bu seçenek idealdir.
   - **İndirme Formatları**:
      - **zip**: Windows gibi dosya sıkıştırma araçlarının yaygın olarak desteklediği bir formattır. Özellikle Windows işletim sisteminde WildFly kurulumunu kolaylaştırır.
      - **tgz**: Linux/Unix tabanlı sistemlerde tercih edilen bir sıkıştırma formatıdır. Eğer Linux tabanlı bir sunucuda çalışıyorsanız `tgz` formatını tercih edebilirsiniz.
   - **SHA-1 Karma Değeri**: Dosyanın bütünlüğünü doğrulamak için kullanılabilir. İndirilen dosyanın bozulmamış olduğundan emin olmak için SHA-1 değerini kontrol edebilirsiniz.

2. **WildFly Önizleme Dağıtımı**:
   - **Kullanım Amacı**: Bu, henüz tam kararlı hale getirilmemiş özellikleri içerir. Yeni özellikleri test etmek ya da geliştirme sırasında en son yenilikleri denemek istiyorsanız bu seçeneği indirebilirsiniz. Ancak üretim ortamlarında kullanılması önerilmez, çünkü tam olarak kararlı değildir.
   - **İndirme Formatları**: Yine `zip` ve `tgz` formatlarında sunulmaktadır. Çalıştığınız işletim sistemine göre uygun formatı seçebilirsiniz.
   - **SHA-1 Karma Değeri**: Dosya doğrulaması için sağlanmıştır.

3. **Uygulama Sunucusu Kaynak Kodu**:
   - **Kullanım Amacı**: Eğer WildFly'ın kaynak kodunu incelemek, modifiye etmek ya da WildFly üzerinde özelleştirilmiş geliştirmeler yapmak istiyorsanız bu seçeneği tercih edebilirsiniz. Kaynak kodu, projeye daha derinlemesine bir inceleme yapma imkanı sunar.
   - **İndirme Formatları**: `zip` ve `tgz` olarak sunulur, yukarıda bahsedildiği gibi işletim sistemine göre seçebilirsiniz.
   - **SHA-1 Karma Değeri**: İndirilen dosyanın orijinal olduğundan emin olmak için SHA-1 doğrulaması yapabilirsiniz.

4. **Hızlı Başlangıç Kaynak Kodu**:
   - **Kullanım Amacı**: WildFly üzerinde örnek projeler ya da eğitim materyalleri ile hızlı bir başlangıç yapmak istiyorsanız bu kaynak kodunu indirmeniz faydalı olabilir. Örnek uygulamalar ve kullanım senaryolarını içerir.
   - **Git Tag**: Git üzerinden doğrudan erişim imkanı sunar. Git kullanarak kaynak kodunu daha kolay yönetebilir ve sürüm kontrolü yapabilirsiniz.
   - **zip ve SHA-1**: Zip formatında indirmek ve doğrulamak için seçenekler mevcut.

5. **Sürüm Notları**:
   - **Kullanım Amacı**: WildFly'ın bu sürümünde yapılan değişiklikler, yeni özellikler, düzeltmeler ve bilinen sorunlar hakkında bilgi almak için sürüm notlarını inceleyebilirsiniz. Bu notlar, hangi özelliklerin eklendiği veya değiştiği hakkında detaylı bilgi sağlar.

**Özetle**:
- **Geliştirme veya Üretim İçin**: Standart **WildFly Dağıtımı** önerilir.
- **Yeni Özellikleri Test Etmek İçin**: **WildFly Önizleme Dağıtımı** uygun olabilir.
- **Kaynak Kod İncelemesi veya Özelleştirme İçin**: **Uygulama Sunucusu Kaynak Kodu** tercih edilebilir.
- **Örnek Uygulama ve Hızlı Başlangıç İçin**: **Hızlı Başlangıç Kaynak Kodu** yararlı olabilir.

Sizin gereksinimlerinize göre en uygun seçeneği yukarıdaki açıklamalara göre seçebilirsiniz.


## Spring Data (JdbcTemplate)
```sh 

```
---

`JdbcTemplate`, Spring Framework'ün bir parçası olarak veri tabanıyla etkileşimde bulunmak için geliştirilmiş bir sınıftır ve özellikle Spring Boot uygulamalarında yaygın olarak kullanılır. `JdbcTemplate`, SQL sorgularını çalıştırmak, veri tabanından veri çekmek, güncelleme işlemleri yapmak ve veritabanı bağlantılarını yönetmek için güçlü ve basit bir yol sağlar. Spring Boot, `JdbcTemplate` sınıfının kullanılmasını daha da kolaylaştırarak, veri tabanı işlemleri için hem esneklik hem de güvenilirlik sunar.

### JdbcTemplate'in Amacı
`JdbcTemplate`, JDBC (Java Database Connectivity) API'sini basitleştirmeyi amaçlar. Geleneksel JDBC kodu yazarken, kaynakları açma ve kapatma, hata işleme, veritabanı bağlantılarının yönetimi gibi çeşitli işlemler manuel olarak yapılır ve bu da hata riskini artırır. `JdbcTemplate`, bu tür görevleri otomatikleştirerek, JDBC işlemlerini basitleştirir. Bu sayede, geliştiriciler odaklarını SQL sorgularına ve iş mantığına verebilirler.

### JdbcTemplate'in Sağladığı Faydalar
- **Kaynak Yönetimi**: `JdbcTemplate`, veritabanı bağlantılarını otomatik olarak yönetir ve kapatır, böylece bağlantı sızıntılarını önler.
- **Hata İşleme**: `SQLException` gibi veritabanı hatalarını otomatik olarak işler ve bunları daha anlamlı `DataAccessException` sınıflarına dönüştürür.
- **Basit Kullanım**: CRUD (Create, Read, Update, Delete) işlemlerini gerçekleştirmek için kullanımı kolay metodlar sunar.
- **Güvenli Parametre Kullanımı**: SQL enjeksiyonu gibi güvenlik açıklarını önlemek için parametreli sorguları destekler.
- **Esneklik**: Veritabanına özel SQL sorguları yazma esnekliği sağlar ve ORM kullanımı zorunluluğu yoktur.

### JdbcTemplate Kullanım Adımları
Spring Boot uygulamasında `JdbcTemplate` kullanmak için temel adımlar şunlardır:

#### 1. Bağımlılıkları Ekleme
Spring Boot projesinde `JdbcTemplate` kullanmak için `spring-boot-starter-jdbc` bağımlılığına ihtiyacınız vardır. `pom.xml` dosyasına aşağıdaki bağımlılığı ekleyin:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
```

#### 2. Veri Tabanı Yapılandırması
Uygulamanızın `application.properties` veya `application.yml` dosyasına veri tabanı yapılandırmalarını ekleyin:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

#### 3. JdbcTemplate Bean Tanımlama
Spring Boot, otomatik yapılandırma sayesinde `JdbcTemplate` bean'ini otomatik olarak yaratır. Bu yüzden `JdbcTemplate` nesnesini doğrudan kullanabiliriz:

```java
@Autowired
private JdbcTemplate jdbcTemplate;
```

### JdbcTemplate ile CRUD İşlemleri

#### Veri Ekleme (Insert)
`JdbcTemplate` ile veri eklemek için `update` metodu kullanılır:

```java
String sql = "INSERT INTO customers (name, age, city) VALUES (?, ?, ?)";
jdbcTemplate.update(sql, "Ali", 30, "Ankara");
```

#### Veri Okuma (Select)
Veri tabanından veri çekmek için `queryForObject` veya `query` metotları kullanılır.

- **Tek Bir Değer Döndürme**:

```java
String sql = "SELECT COUNT(*) FROM customers";
Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
```

- **Liste Döndürme**:

```java
String sql = "SELECT * FROM customers";
List<Customer> customers = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class));
```

#### Veri Güncelleme (Update)
Var olan veriyi güncellemek için `update` metodu kullanılır:

```java
String sql = "UPDATE customers SET city = ? WHERE name = ?";
jdbcTemplate.update(sql, "Istanbul", "Ali");
```

#### Veri Silme (Delete)
Veriyi silmek için yine `update` metodunu kullanabiliriz:

```java
String sql = "DELETE FROM customers WHERE name = ?";
jdbcTemplate.update(sql, "Ali");
```

### JdbcTemplate RowMapper Kullanımı
`RowMapper`, veritabanı kayıtlarını Java nesnelerine dönüştürmek için kullanılan bir arayüzdür. `BeanPropertyRowMapper` sınıfı, SQL sorgusundan dönen verileri otomatik olarak belirttiğimiz nesneye dönüştürür:

```java
String sql = "SELECT * FROM customers WHERE id = ?";
Customer customer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class), 1);
```

#### Özel RowMapper Kullanımı
Kendi `RowMapper` sınıfınızı oluşturmak isterseniz, `RowMapper` arayüzünü uygulayabilirsiniz:

```java
public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer();
        customer.setId(rs.getInt("id"));
        customer.setName(rs.getString("name"));
        customer.setCity(rs.getString("city"));
        return customer;
    }
}

// Kullanım
String sql = "SELECT * FROM customers WHERE id = ?";
Customer customer = jdbcTemplate.queryForObject(sql, new CustomerRowMapper(), 1);
```

### JdbcTemplate BatchUpdate
`BatchUpdate` metodu, çok sayıda veri işlemi yapmanız gerektiğinde birden fazla SQL sorgusunu tek seferde çalıştırarak performansı artırır:

```java
String sql = "INSERT INTO customers (name, age, city) VALUES (?, ?, ?)";
List<Object[]> batchArgs = Arrays.asList(
    new Object[]{"Ali", 30, "Ankara"},
    new Object[]{"Ayşe", 25, "İstanbul"},
    new Object[]{"Mehmet", 35, "İzmir"}
);

jdbcTemplate.batchUpdate(sql, batchArgs);
```

### JdbcTemplate ile Transaction Yönetimi
`JdbcTemplate`, `@Transactional` anotasyonu ile işlemleri bir bütün olarak ele alır. Eğer bir işlem sırasında hata oluşursa, yapılan değişiklikler geri alınır:

```java
@Service
public class CustomerService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void transferFunds(int senderId, int receiverId, double amount) {
        jdbcTemplate.update("UPDATE accounts SET balance = balance - ? WHERE id = ?", amount, senderId);
        jdbcTemplate.update("UPDATE accounts SET balance = balance + ? WHERE id = ?", amount, receiverId);
    }
}
```

### JdbcTemplate ve Spring Boot'ta Exception Management
`JdbcTemplate`, `SQLException` gibi veritabanı hatalarını `DataAccessException` isimli bir üst sınıf ile kapsar. Bu sayede istisnaları kolayca yönetebilirsiniz:

```java
try {
    jdbcTemplate.update("UPDATE customers SET city = ? WHERE id = ?", "Izmir", 1);
} catch (DataAccessException e) {
    // Hata yönetimi
    System.out.println("Veri tabanı hatası: " + e.getMessage());
}
```

### JdbcTemplate'in Alternatifleri
Spring Boot ve Spring Framework, veritabanı işlemleri için `JdbcTemplate` dışında başka araçlar da sunar:
- **Spring Data JPA**: ORM (Object Relational Mapping) kullanmak isteyenler için idealdir.
- **NamedParameterJdbcTemplate**: Parametreli SQL sorguları için daha esnek bir yapı sunar.
- **Spring Data JDBC**: `JdbcTemplate`'in daha modern bir alternatifi olarak basit veri tabanı işlemleri için kullanılır.

### Sonuç
`JdbcTemplate`, SQL sorgularını manuel yazmak isteyen veya ORM kullanmadan doğrudan veritabanıyla etkileşim kurmak isteyen Spring Boot geliştiricileri için güçlü ve kullanışlı bir araçtır. JDBC işlemlerini kolaylaştırarak, kaynak yönetimi, hata işleme ve parametre güvenliği gibi konularda standart çözümler sunar.


## Spring Data (JdbcTemplate)
```sh 

```
---

Spring Framework’ün bir bileşeni olan `JdbcTemplate`, veri tabanıyla etkileşimi kolaylaştırmak için geliştirilmiş bir araçtır. JDBC (Java Database Connectivity) API'sini basitleştirir ve veri tabanı bağlantıları, hata yönetimi, veri çekme ve güncelleme işlemleri gibi temel işlevleri daha rahat ve güvenli hale getirir. `JdbcTemplate` kullanmanın avantajları kadar bazı dezavantajları da bulunmaktadır. İşte detaylı bir şekilde avantaj ve dezavantajları:

---

### JdbcTemplate’in Avantajları

1. **Kaynak Yönetiminin Kolaylığı**:
   - JDBC ile çalışırken bağlantı, `Statement` ve `ResultSet` gibi kaynakları manuel olarak açmak ve kapatmak gerekir. `JdbcTemplate`, bu kaynakları otomatik olarak yönetir ve bağlantı sızıntılarını önler.
   - Özellikle uzun süreli uygulamalarda kaynak yönetiminin doğru yapılması performansı artırır.

2. **Daha Basit Hata Yönetimi**:
   - `JdbcTemplate`, JDBC'nin `SQLException` sınıfı yerine `DataAccessException` adlı daha genel ve Spring’e özgü bir istisna yönetimi sağlar.
   - Bu sayede, SQL hatalarını uygulama düzeyinde daha iyi yakalamak ve yönetmek mümkündür.

3. **Güvenli Parametreli Sorgu Desteği**:
   - `JdbcTemplate`, SQL enjeksiyonuna karşı koruma sağlayan parametreli sorguları destekler. Parametreli sorgular ile değişkenler güvenli bir şekilde SQL cümlelerine yerleştirilir.
   - SQL enjeksiyonu gibi güvenlik açıklarına karşı önlem alınması güvenilir bir veri tabanı erişimi sağlar.

4. **CRUD İşlemlerini Kolaylaştırma**:
   - Veri ekleme, güncelleme, silme ve okuma gibi işlemler `JdbcTemplate` ile çok daha basit hale gelir. `update()`, `query()`, `queryForObject()` gibi metodlar sayesinde temel SQL işlemleri hızlıca yapılabilir.
   - Bu da veri tabanı ile sık etkileşimde bulunan uygulamalarda geliştirme sürecini hızlandırır.

5. **Esnek SQL Yazma İmkanı**:
   - ORM (Object-Relational Mapping) araçlarına kıyasla `JdbcTemplate` ile tamamen SQL tabanlı çalışılabilir. Karmaşık SQL sorgularını `JdbcTemplate` üzerinden doğrudan yazabilirsiniz.
   - Bu esneklik, özellikle karmaşık sorgu ihtiyaçları olan projelerde önemli bir avantajdır.

6. **Transaction Yönetimi**:
   - Spring Framework ile uyumlu olan `JdbcTemplate`, `@Transactional` anotasyonu ile işlemleri yönetir. Bu sayede veri tabanındaki işlemler bir bütün olarak ele alınır ve bir hata durumunda tüm değişiklikler geri alınır.
   - Transaction yönetiminin sağladığı bu bütünlük, veri güvenliğini artırır.

7. **Performans**:
   - ORM araçlarına kıyasla daha hızlı bir veri tabanı etkileşimi sağlar çünkü `JdbcTemplate`, doğrudan SQL sorguları ile çalışır ve veri tabanı işlemlerinde bir katman daha azdır.

---

### JdbcTemplate’in Dezavantajları

1. **SQL Bağımlılığı**:
   - `JdbcTemplate`, SQL sorgularının elle yazılmasını gerektirir. Bu, uygulamanın veritabanı bağımlılığını artırır. Örneğin, veritabanı türü değiştiğinde (MySQL'den PostgreSQL'e geçiş gibi) SQL ifadelerinde değişiklik yapmak gerekebilir.
   - ORM çözümlerinde olduğu gibi soyutlama seviyesi düşük olduğu için veritabanı değiştirme süreçlerinde fazladan iş yükü getirir.

2. **Kod Tekrarı**:
   - SQL sorgularını elle yazmak, kod tekrarına yol açabilir. Özellikle büyük projelerde benzer SQL ifadelerinin tekrar tekrar yazılması gerekebilir.
   - ORM çözümleri ile genellikle bu tekrarlar model katmanında tek bir tanımla yönetilebilirken, `JdbcTemplate` ile her SQL ifadesi için ayrı bir sorgu yazmak gerekebilir.

3. **Nesne-İlişkisel Eşleme (ORM) Eksikliği**:
   - `JdbcTemplate`, veri tabanı kayıtlarını doğrudan Java nesnelerine otomatik olarak eşleştirmez. Elde edilen sonuçları nesnelere manuel olarak dönüştürmek için `RowMapper` kullanmak gerekebilir.
   - ORM araçları (Hibernate, JPA gibi) otomatik nesne eşleme desteği sunarken, `JdbcTemplate` ile bu işlemi kendiniz yapmanız gerekir.

4. **Bakım Zorluğu**:
   - Çok sayıda SQL sorgusu içeren projelerde bakım zorluğu artabilir. SQL sorgularındaki değişiklikler doğrudan kod içerisine yazıldığı için bu sorgular üzerinde yapılacak değişiklikler uygulamanın her yerinde güncellenmelidir.
   - Özellikle büyük projelerde bu durum, bakım sürecinde fazladan iş yükü oluşturur.

5. **Sınırlı Çoklu Veri Kaynağı Desteği**:
   - `JdbcTemplate` varsayılan olarak tek bir veri kaynağı ile çalışır. Birden fazla veri kaynağı ile çalışmak istediğinizde ekstra yapılandırmalar gerekebilir.
   - ORM araçları çoklu veri kaynaklarını daha kolay yönetme imkanına sahipken, `JdbcTemplate`'de bu işlemler daha karmaşık hale gelebilir.

6. **Yüksek Seviye Veri Yönetimi Özelliklerinin Eksikliği**:
   - ORM araçları, nesneler arası ilişkiler (birlikte yükleme, geç yükleme) gibi gelişmiş özellikleri desteklerken `JdbcTemplate` bu özelliklere sahip değildir.
   - Örneğin, ilişkili nesnelerin otomatik olarak yüklenmesi gibi özellikler `JdbcTemplate`'de bulunmaz, dolayısıyla bu ilişkileri yönetmek için daha fazla manuel kod yazmak gerekebilir.

---

### JdbcTemplate’in Avantaj ve Dezavantajlarının Özet Tablosu

| Avantajlar                               | Dezavantajlar                                    |
|------------------------------------------|--------------------------------------------------|
| Kaynak Yönetimi Kolaylığı                | SQL Bağımlılığı                                  |
| Hata Yönetimi                            | Kod Tekrarı                                      |
| Güvenli Parametreli Sorgu                | ORM Eşleme Eksikliği                             |
| CRUD İşlemlerinde Kolaylık               | Bakım Zorluğu                                    |
| Esnek SQL Yazma İmkanı                   | Çoklu Veri Kaynağı Desteği Zorluğu               |
| Transaction Yönetimi                      | Yüksek Seviye Veri Yönetim Özelliklerinin Eksikliği|
| Performans                               | -                                                |

---

### Sonuç
Spring `JdbcTemplate`, veri tabanı işlemlerini daha hızlı ve basit hale getirirken, SQL bağımlılığı ve bakım zorluğu gibi dezavantajlara da sahiptir. Küçük ve orta ölçekli projeler için hızlı bir çözüm sunar ancak büyük projelerde veya karmaşık nesne ilişkilerinin bulunduğu durumlarda ORM çözümleri (Spring Data JPA, Hibernate vb.) ile birlikte kullanılması daha mantıklı olabilir. `JdbcTemplate`, SQL tabanlı veri erişimi gerektiren ve ORM’nin fazla soyutlama sağladığı projelerde ideal bir seçimdir.


## Spring Boot Delivered Query, Named Query, JPQL, Native Query Örnekleri
```sh 

```
---

Spring Data JPA, Java uygulamalarında veri tabanı işlemlerini kolaylaştırmak için çeşitli sorgulama yöntemleri sunar. Bu yöntemler arasında Delivered Query, Named Query, JPQL ve Native Query bulunur. Her birinin kendi kullanım amacı ve avantajları vardır. Aşağıda her birinin detaylı açıklamaları yer almaktadır:

---

### 1. Delivered Query (Derived Query)
Delivered Query, metod isimlerinden otomatik olarak SQL sorguları üreten bir özelliktir. Bu özellik sayesinde, belirli kurallara uygun metod isimleri yazarak Spring Data JPA’nın bu metodlar için otomatik olarak SQL sorgusu oluşturmasını sağlarız. Delivered Query kullanımı özellikle basit CRUD işlemlerinde yaygın olarak tercih edilir.

#### Özellikler
- **Kolay Kullanım**: Metod ismine göre Spring Data JPA, SQL sorgusunu otomatik olarak oluşturur.
- **Yaygın Kapsam**: Tek bir kolon üzerinde eşleştirme, aralıklar, sıralama ve benzeri birçok koşul desteklenir.
- **Parametre Uyarlama**: Delivered Query metotları, metod isminde belirtilen parametreleri alır ve uygun SQL sorgusunu oluşturur.

#### Kullanım Örnekleri
Örneğin, bir `CustomerEntity` sınıfı üzerinde `firstName` ve `age` gibi alanlara göre sorgu yapıyorsak, aşağıdaki gibi `ICustomerRepository` üzerinde Delivered Query tanımlayabiliriz:

```java
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {

    // Belirli bir isme sahip müşterileri bulma
    List<CustomerEntity> findByFirstName(String firstName);

    // Yaşı belirli bir değerden büyük olan müşterileri bulma
    List<CustomerEntity> findByAgeGreaterThan(int age);

    // İsim sıralamasına göre müşterileri bulma
    List<CustomerEntity> findAllByOrderByFirstNameAsc();
}
```

Bu örneklerde Spring Data JPA, `findByFirstName`, `findByAgeGreaterThan` ve `findAllByOrderByFirstNameAsc` metodları için SQL sorgularını otomatik olarak oluşturur.

#### Avantajları
- Hızlı ve pratik bir şekilde basit sorguları yazma imkanı sunar.
- Kolay anlaşılır, bakımı kolaydır ve çoğu CRUD işlemi için yeterlidir.

#### Dezavantajları
- Karmaşık sorgular veya birden fazla tabloya erişim gerektiren durumlarda sınırlıdır.
- Metod isimleri büyüdükçe okunabilirlik azalabilir.

---

### 2. Named Query
Named Query, `@NamedQuery` anotasyonu ile `Entity` sınıfı üzerinde tanımlanır ve bu sorgular uygulama çalıştığında önceden derlenir. Named Query kullanarak sık kullanılan veya karmaşık sorguları bir defa tanımlar ve bunları repository içerisinde tekrar tekrar çağırabiliriz.

#### Özellikler
- **Önceden Tanımlı ve Derlenmiş**: Uygulama başlatıldığında, tanımlanan sorgular derlenir ve kullanılmaya hazır hale gelir.
- **Tekrarlı Kullanım**: Aynı sorguyu tekrar kullanmanız gereken durumlarda uygun bir yöntemdir.
- **Kolay Bakım**: Tüm Named Query'ler `Entity` sınıfında toplandığından, sorgularda yapılacak değişiklikler merkezi olarak yönetilebilir.

#### Kullanım Örnekleri
Örneğin, `CustomerEntity` üzerinde bir `Named Query` tanımlayalım:

```java
@Entity
@NamedQueries({
    @NamedQuery(name = "Customer.findByLastName", query = "SELECT c FROM CustomerEntity c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Customer.findByCity", query = "SELECT c FROM CustomerEntity c WHERE c.city = :city"),
    @NamedQuery(name = "Customer.findByAgeGreaterThan", query = "SELECT c FROM CustomerEntity c WHERE c.age > :age")
})
public class CustomerEntity {
    // Sınıf tanımı burada
}

// ICustomerRepository sınıfında kullanımı
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {
    
    @Query(name = "Customer.findByLastName")
    List<CustomerEntity> findByLastName(@Param("lastName") String lastName);
}
```

#### Avantajları
- Sık kullanılan sorguları merkezi bir yerde tanımlamak mümkündür.
- Derlenmiş sorgular performansı artırır ve bakım açısından kolaylık sağlar.
- Karmaşık sorgularda hata ayıklama ve düzenleme kolaylığı sunar.

#### Dezavantajları
- Sorgular `Entity` sınıfında toplandığından, `Entity` sınıfı karmaşık hale gelebilir.
- Genellikle statik sorgular içindir, dinamik sorgular için sınırlıdır.

---

### 3. JPQL (Java Persistence Query Language)
JPQL, Java EE uygulamalarında veri tabanı sorguları yazmak için kullanılan bir dildir ve SQL'e benzer bir yapıya sahiptir. Ancak, SQL'in aksine JPQL, doğrudan veri tabanı tablolarını değil, Java sınıflarını ve alanlarını kullanır. JPQL sorguları, veri tabanı bağımsızlığı sağlar ve ORM tabanlı uygulamalarda tercih edilir.

#### Özellikler
- **Nesne Tabanlı**: SQL’den farklı olarak, doğrudan tablolar yerine Java nesneleri (Entity) üzerinden çalışır.
- **Veri Tabanı Bağımsızlığı**: JPQL sorguları genellikle veri tabanı bağımsızdır ve farklı veri tabanları üzerinde sorunsuz çalışır.
- **Esnek**: Karmaşık ve dinamik sorgular yazmak için uygundur.

#### Kullanım Örnekleri
JPQL kullanarak örnek bir sorgu yazalım:

```java
// ICustomerRepository sınıfında JPQL sorgu örnekleri
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {

    // Ad ve Soyada göre müşteri bulma
    @Query("SELECT c FROM CustomerEntity c WHERE c.firstName = :firstName AND c.lastName = :lastName")
    List<CustomerEntity> findByFullName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    // Yaş kriterine göre müşteri listeleme
    @Query("SELECT c FROM CustomerEntity c WHERE c.age > :age")
    List<CustomerEntity> findCustomersOlderThan(@Param("age") int age);
}
```

#### Avantajları
- ORM yapısına uyumludur ve veri tabanı bağımsız çalışır.
- Karmaşık sorgular yazmayı kolaylaştırır.
- Java nesneleri ile doğrudan çalıştığı için daha anlaşılırdır.

#### Dezavantajları
- Bazı özel veri tabanı işlevlerini desteklemez.
- Karmaşık ve çok performans gerektiren sorgularda daha düşük performans gösterebilir.

---

### 4. Native Query
Native Query, doğrudan SQL sorguları kullanarak veri tabanıyla etkileşime girmenizi sağlar. JPQL ve diğer ORM tabanlı sorguların aksine, Native Query veri tabanı bağımlı SQL sorgularını destekler. Bu nedenle, belirli bir veri tabanına özel SQL komutları kullanılabilir.

#### Özellikler
- **Doğrudan SQL Kullanımı**: SQL dilinin tüm özelliklerini kullanabilirsiniz (JOIN'ler, `GROUP BY` işlemleri, alt sorgular vb.)
- **Veri Tabanına Özel İşlemler**: Veri tabanı bağımlı sorgular yazmak mümkündür.
- **Performans**: Karmaşık sorgular için daha performanslıdır çünkü SQL'in tüm gücünden yararlanılır.

#### Kullanım Örnekleri
Örneğin, `ICustomerRepository` içinde Native Query ile yazılmış SQL sorgularını görelim:

```java
// ICustomerRepository sınıfında Native Query örnekleri
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {

    // Şehir ve yaş kriterine göre müşteri bulma
    @Query(value = "SELECT * FROM customers WHERE city = :city AND age > :age", nativeQuery = true)
    List<CustomerEntity> findCustomersInCityOlderThan(@Param("city") String city, @Param("age") int age);

    // Belirli bir soyada sahip müşterileri listeleme
    @Query(value = "SELECT * FROM customers WHERE last_name = :lastName", nativeQuery = true)
    List<CustomerEntity> findByLastNameNative(@Param("lastName") String lastName);
}
```

#### Avantajları
- SQL’in sunduğu tüm özellikleri kullanarak veri tabanına doğrudan erişim sağlar.
- Karmaşık ve optimize edilmesi gereken sorgular için yüksek performans sunar.
- Belirli veri tabanı işlevlerini kullanarak daha detaylı işlemler yapma imkanı sağlar.

#### Dezavantajları
- Veri tabanı bağımlıdır, bu da taşınabilirliği zorlaştırır.
- SQL enjeksiyonuna karşı dikkatli olunması gerekir.
- ORM soyutlama katmanından yararlanmaz, dolayısıyla nesneler arası ilişkilerde manuel işlemler gerekebilir.

---

### Sonuç
Delivered Query, Named Query, JPQL ve Native Query her biri farklı ihtiyaçlara cevap veren güçlü sorgulama yöntemleridir.
- **Delivered Query** basit işlemler için hızlı

çözümler sunarken,
- **Named Query** tekrarlı ve önceden tanımlanmış sorgular için idealdir.
- **JPQL**, veri tabanı bağımsızlığı gerektiren, nesne odaklı sorgular için tercih edilirken,
- **Native Query**, doğrudan SQL sorgularıyla en yüksek performansı gerektiren işlemler için uygundur.

Her yöntemi, uygulamanın ihtiyaçlarına ve veri tabanı erişim gereksinimlerine göre seçerek etkili bir veri erişim stratejisi oluşturabilirsiniz.


## Spring Boot Delivered Query, Named Query, JPQL, Native Query Örnekleri
```sh 

```
---

Dosyalarınıza ve istediğiniz konu başlıklarına uygun olarak, `Delivered Query`, `Named Query`, `JPQL`, ve `Native Query` için üçer örnek hazırlıyorum. Bu örnekleri, veritabanı işlemleri üzerinde nasıl çalışacaklarına dair açıklamalarla birlikte paylaşacağım.

### 1. Delivered Query
Delivered Query, Spring Data JPA'nın metod adlarına göre otomatik olarak SQL sorgularını oluşturmasına dayalıdır.

```java
// CustomerEntity.java dosyasında tanımlı CustomerEntity ile ICustomerRepository kullanılarak Delivered Query örnekleri
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {

    // 1. Ad ile müşteri bulma
    List<CustomerEntity> findByFirstName(String firstName);

    // 2. Şehir ile müşteri listeleme
    List<CustomerEntity> findByCity(String city);

    // 3. Yaş aralığındaki müşterileri bulma
    List<CustomerEntity> findByAgeBetween(int minAge, int maxAge);
}
```

### 2. Named Query
Named Query, genellikle `@NamedQuery` anotasyonu ile belirtilir ve sorgular `Entity` sınıfında tanımlanır. Daha sonra bu sorgular repository içinde çağrılır.

```java
// CustomerEntity.java dosyasında Named Query tanımları
@Entity
@NamedQueries({
    @NamedQuery(name = "Customer.findByLastName", query = "SELECT c FROM CustomerEntity c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Customer.findByCity", query = "SELECT c FROM CustomerEntity c WHERE c.city = :city"),
    @NamedQuery(name = "Customer.findByAgeGreaterThan", query = "SELECT c FROM CustomerEntity c WHERE c.age > :age")
})
public class CustomerEntity {
    // CustomerEntity sınıfının diğer alanları ve metodları
}

// ICustomerRepository.java dosyasında Named Query çağrıları
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {

    // 1. Soyad ile müşteri bulma
    @Query(name = "Customer.findByLastName")
    List<CustomerEntity> findByLastName(@Param("lastName") String lastName);

    // 2. Şehir ile müşteri bulma
    @Query(name = "Customer.findByCity")
    List<CustomerEntity> findByCity(@Param("city") String city);

    // 3. Belirli bir yaşın üstündeki müşterileri bulma
    @Query(name = "Customer.findByAgeGreaterThan")
    List<CustomerEntity> findByAgeGreaterThan(@Param("age") int age);
}
```

### 3. JPQL (Java Persistence Query Language)
JPQL, Java varlıklarına dayalı olarak SQL benzeri sorgular yazmamızı sağlar. JPQL, `@Query` anotasyonu ile kullanılır.

```java
// ICustomerRepository.java dosyasında JPQL örnekleri
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {

    // 1. Ad ve Soyada göre müşteri bulma
    @Query("SELECT c FROM CustomerEntity c WHERE c.firstName = :firstName AND c.lastName = :lastName")
    List<CustomerEntity> findByFullName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    // 2. Yaş kriterine göre müşteri listeleme
    @Query("SELECT c FROM CustomerEntity c WHERE c.age > :age")
    List<CustomerEntity> findCustomersOlderThan(@Param("age") int age);

    // 3. Şehirde bulunan müşterileri listeleme
    @Query("SELECT c FROM CustomerEntity c WHERE c.city = :city")
    List<CustomerEntity> findByCity(@Param("city") String city);
}
```

### 4. Native Query
Native Query, doğrudan SQL komutlarını kullanmamıza olanak tanır ve `@Query` anotasyonu ile belirtilir. JPQL’in aksine, SQL sorguları veri tabanı bağımlı hale gelir.

```java
// ICustomerRepository.java dosyasında Native Query örnekleri
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {

    // 1. Şehir ve yaş kriterine göre müşteri bulma
    @Query(value = "SELECT * FROM customers WHERE city = :city AND age > :age", nativeQuery = true)
    List<CustomerEntity> findCustomersInCityOlderThan(@Param("city") String city, @Param("age") int age);

    // 2. Belirli bir soyada sahip müşterileri listeleme
    @Query(value = "SELECT * FROM customers WHERE last_name = :lastName", nativeQuery = true)
    List<CustomerEntity> findByLastNameNative(@Param("lastName") String lastName);

    // 3. Tüm müşterileri alfabetik sırayla listeleme
    @Query(value = "SELECT * FROM customers ORDER BY first_name ASC", nativeQuery = true)
    List<CustomerEntity> findAllOrderedByFirstName();
}
```

Bu örnekler, veri tabanı sorgularını çeşitli şekillerde kullanmanıza olanak sağlar:
- Delivered Query, otomatik sorgu oluşturma ile daha kısa kodlama sağlarken
- Named Query, Entity sınıfında önceden tanımlanmış sorguları kullanır,
- JPQL, Java varlıklarına dayalı SQL benzeri sorgular oluşturur,
- Native Query ise doğrudan SQL kullanılarak daha karmaşık veya veri tabanına özel sorguların gerçekleştirilmesine olanak tanır.



## Spring Boot
```sh 

```
---