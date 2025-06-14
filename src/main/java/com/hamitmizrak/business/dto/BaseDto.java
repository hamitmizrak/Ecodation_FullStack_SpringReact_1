package com.hamitmizrak.business.dto;

import com.hamitmizrak.audit.AuditingAwareBaseDto;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Getter
@Setter

// Serializable:
// abstract: BaseDto instance(örnek) yapılmasını istemiyorum
abstract public class BaseDto extends AuditingAwareBaseDto implements Serializable {

    // SERILESTIRME
    public static final Long serialVersionUID = 1L;

    // FIELD
    // ID
    protected Long id;

    // DATE
    protected Date systemCreatedDate;
} //end BaseDto
