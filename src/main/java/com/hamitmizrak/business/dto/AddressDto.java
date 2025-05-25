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
// @NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// Address(1) - Customer(1)
public class AddressDto extends AuditingAwareBaseDto implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID=1L;

    // FIELD
    private Long id;

    // DOOR
    @NotEmpty(message = "{address.door_number.validation.constraints.NotNull.message}")
    private String doorNumber;

    // STREET
    @NotEmpty(message = "{address.street.validation.constraints.NotNull.message}")
    private String street;

    // CITY
    @NotEmpty(message = "{address.city.validation.constraints.NotNull.message}")
    private String city;

    // STATE
    @NotEmpty(message = "{address.state.validation.constraints.NotNull.message}")
    private String state;

    // ZIP CODE
    @NotEmpty(message = "{address.zip_code.validation.constraints.NotNull.messag}")
    private String zipCode;

    // ADDRESS QR CODE
    @NotEmpty(message = "{address.qr_code.validation.constraints.NotNull.message}")
    private String addressQrCode;

    // COUNTRY
    @NotEmpty(message = "{address.country.validation.constraints.NotNull.message}")
    private String country;

    // DESCRIPTION
    @NotEmpty(message = "{address.description.validation.constraints.NotNull.message}")
    @Size(min=5, message = "{address.description.least.validation.constraints.NotNull.message}")
    private String description;

    // DATE
    private Date systemCreatedDate;

    // Constructor
    public AddressDto() {
        systemCreatedDate = new Date(System.currentTimeMillis());
    }

} //end  AddressDto

