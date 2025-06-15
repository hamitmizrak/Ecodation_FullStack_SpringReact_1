package com.hamitmizrak.annotation;

import com.hamitmizrak.data.repository.IAddressRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

// LOMBOK
@RequiredArgsConstructor

// Address Tablosundaki AddressQrCode eğer ilgili kayıt varsa;
// eklemesin ve hata olarak benzersiz bir address oluştururun
public class AddressValidQrCode implements ConstraintValidator<AddressUniqueQrCode, String> {

    // INJECTION
    private final IAddressRepository iAddressRepository;

    @Override
    public boolean isValid(String addressQrCode, ConstraintValidatorContext constraintValidatorContext) {
        String findQrCode = addressQrCode + " Böyle bir qr code yoktur ";
        // 1.YOL
        /*
      AddressEntity addressEntity= iAddressRepository
              .findAddressEntityByAddressEntityEmbeddable_AddressQrCode(addressQrCode)
              .orElseThrow( () -> new _404_NotFoundException(findQrCode));
         */

        // 2.YOL
        boolean isResult = iAddressRepository
                .findAddressEntityByAddressEntityEmbeddable_AddressQrCode(addressQrCode)
                .isPresent();
        if (isResult) {
            System.out.println("Aynı isimde Address Qr Code Vardır başka bir addres");
            return false;
        } else {
            System.out.println("Harika farklı isimde Address Qr Code yazdınız");
            return true;
        } //end else
    } //end isValid
}//end AddressValidQrCode
