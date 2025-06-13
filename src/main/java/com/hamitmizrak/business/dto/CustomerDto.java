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


// Address(1) - Customer(1)
public class CustomerDto extends AuditingAwareBaseDto implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID = 1L;

    // FIELD
    private Long id;

    @NotEmpty(message = "{customer.firstname.validation.constraints.NotNull.message}")
    private String firstName;

    @NotEmpty(message = "{customer.lastname.validation.constraints.NotNull.message}")
    private String lastName;

    @NotEmpty(message = "{customer.notes.validation.constraints.NotNull.message}")
    private String notes;

    @Builder.Default
    private Date systemCreatedDate=new Date(System.currentTimeMillis());

    // RELATION
} //end class AddressDto
