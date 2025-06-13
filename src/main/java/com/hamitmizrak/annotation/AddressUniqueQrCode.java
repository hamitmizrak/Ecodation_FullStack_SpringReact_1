package com.hamitmizrak.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {AddressValidQrCode.class}
)
public @interface AddressUniqueQrCode {
    String message() default "{address.qr_code.validation.constraints.unique.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}