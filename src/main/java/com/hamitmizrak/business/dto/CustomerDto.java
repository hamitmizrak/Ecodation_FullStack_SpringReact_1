package com.hamitmizrak.business.dto;

import com.hamitmizrak.audit.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
import java.util.List;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// Customer(1) - Address(1)
// Customer(1) - Order(N)
public class CustomerDto extends AuditingAwareBaseDto implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID = 1L;

    // FIELD
    private Long id;

    @NotEmpty(message = "{customer.name.validation.constraints.NotNull.message}")
    private String firstName;

    @NotEmpty(message = "{customer.surname.validation.constraints.NotNull.message}")
    private String lastName;

    @NotEmpty(message = "{customer.notes.validation.constraints.NotNull.message}")
    private String notes;

    // email,telephone

    //////////////////////////////////////////////////////////////////////////////////////
    // COMPOSITION
    // RELATION
    // Customer(1) - Addres(1)
    private AddressDto addressDto;

    // RELATION
    // Customer(1) - Order(N)
    private List<OrderDto> orderDtoList;

} //end class CustomerDto
