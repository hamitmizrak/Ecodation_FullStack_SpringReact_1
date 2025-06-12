package com.hamitmizrak.business.dto;

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

// Address(1) - Customer(1)
public class AddressDto extends AuditingAwareBaseDto implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID = 1L;

    // FIELD
    private Long id;

    @NotEmpty(message = "{address.door_number.validation.constraints.NotNull.message}")
    private String doorNumber;

    @NotEmpty(message = "{address.street.validation.constraints.NotNull.message}")
    private String street;

    @NotEmpty(message = "{address.city.validation.constraints.NotNull.message}")
    private String city;

    @NotEmpty(message = "{address.state.validation.constraints.NotNull.message}")
    private String state;

    @NotEmpty(message = "{address.zip_code.validation.constraints.NotNull.message}")
    private String zipCode;

    @NotEmpty(message = "{address.qr_code.validation.constraints.NotNull.message}")
    //@AddressUniqueQrCode
    private String addressQrCode;

    @NotEmpty(message = "{address.description.validation.constraints.NotNull.message}")
    @Size(min = 5,message = "{address.description.least.validation.constraints.NotNull.message}")
    private String description;

    @Builder.Default
    private Date systemCreatedDate=new Date(System.currentTimeMillis());

    // RELATION

} //end class AddressDto
