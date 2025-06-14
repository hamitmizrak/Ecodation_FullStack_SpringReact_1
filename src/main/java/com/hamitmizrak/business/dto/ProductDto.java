package com.hamitmizrak.business.dto;

import com.hamitmizrak.audit.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// Product(N) - Order(M)
public class ProductDto extends AuditingAwareBaseDto implements Serializable {

    // SERILEŞTIRME
    public static final Long serialVersionUID = 1L;

    // FIELD
    private Long id;

    @NotEmpty(message = "{product.name.validation.constraints.NotNull.message}")
    private String name;

    @NotEmpty(message = "{product.code.validation.constraints.NotNull.message}")
    private String code;

    //////////////////////////////////////////////////////////////////////////////////////
    // COMPOSITION

    // RELATION

} //end class CustomerDto