package com.hamitmizrak.business.dto;
import com.hamitmizrak.annotation.AddressUniqueQrCode;
import com.hamitmizrak.audit.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// @NotNull, @NotBlank, @NotEmpty(Genellikle bunu kullanırız çünkü en geniş özellikli)

/*
Spring Boot'ta kullanılan kullanılan @NotEmpty, @NotBlank, @NotNull anatasyonları Bean validation bir koludur.
Giriş verilerini doğrulamak için Validation(Doğrulama) kullanırız.

UNUTMA: Boşluk bir karaktertir null ile karıştırmayınız.
UNUTMA: Primitive türlerde null kullanılmaz. (e.g) byte,short,int,long, boolean, char, float,double
UNUTMA: Wrapper türlerde null kullanabilirsiniz. (e.g) Byte,Short,Integer,Long, Boolean, Character, Float,Double

1-) @NotNull  : Sadece Null olup olmaması
Bir input'ta null olup olmadığını kontrol etmek için kullanılır.
Eğer null ise hata verir.
Sadece Wrapper type için kullanılır ve primitive türlerde kullanamayız.

@NotNull
private String name;
name =null ise çalışır.

2-) @NotBlank : Hem Null olup olmaması hemde boşluk için kontrol sağlar
Sadece String yapıların boş olup olmadığını doğrulamak için kullanıyoruz.
private String name;
name =null, name="", name ise çalışır.

3-) @NotEmpty : Hem Null olup olmaması hemde boşluk için kontrol sağlar
Diziler, Koleksiyonlar, String yapıların boş olup olmadığını doğrulamak için kullanıyoruz

private String name;
name =null, name="", name ise çalışır.
*/

// Address(1) - Customer(1)
public class AddressDto extends BaseDto implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID = 1L;

    // FIELD
    private Long id;

    // DOOR NUMBER
    @NotEmpty(message = "{address.door_number.validation.constraints.NotNull.message}")
    private String doorNumber;

    // STREET
    @NotEmpty(message = "{address.street.validation.constraints.NotNull.message}")
    private String street;

    // CITY
    @NotEmpty(message = "{address.city.validation.constraints.NotNull.message}")
    private String city;

    // COUNTRY
    @NotEmpty(message = "{address.country.validation.constraints.NotNull.message}")
    private String country;

    // STATE
    @NotEmpty(message = "{address.state.validation.constraints.NotNull.message}")
    private String state;

    // ZIP CODE
    @NotEmpty(message = "{address.zip_code.validation.constraints.NotNull.message}")
    private String zipCode;

    // ADDRESS QR CODE
    @NotEmpty(message = "{address.qr_code.validation.constraints.NotNull.message}")
    @AddressUniqueQrCode
    private String addressQrCode;

    // DESCRIPTION
    @NotEmpty(message = "{address.description.validation.constraints.NotNull.message}")
    @Size(min = 5,message = "{address.description.least.validation.constraints.NotNull.message}")
    private String description;

    // Soft Delete (Yumuşak Silme)
    // Verileri silmek database çok doğru bir davranış değildir.
    // Bunun yerine kullanıcıya silindiği gösterip database
    private Boolean isDeleted = false;

    // Locking
    private int version;

    // DATE
    @Builder.Default
    private Date systemCreatedDate=new Date(System.currentTimeMillis());

    // RELATION

} //end class AddressDto
