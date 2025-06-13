package com.hamitmizrak.business.mapper;

import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.data.entity.CustomerEntity;
import lombok.extern.log4j.Log4j2;

// LOMBOK
@Log4j2

public class CustomerMapper {

    // Customer Entity To Dto
    public static CustomerDto CustomerEntityToDto(CustomerEntity customerEntity) {
        // Instance (CustomerDto)
        CustomerDto customerDto = new CustomerDto();

        // ID
        customerDto.setId(customerEntity.getId());
        customerDto.setFirstName(customerEntity.getFirstName());
        customerDto.setLastName(customerEntity.getLastName());
        customerDto.setNotes(customerEntity.getNotes());
        customerDto.setSystemCreatedDate(customerEntity.getSystemCreatedDate());

        // DİKKAT: Composition Customer(1) -Address(1)
        if (customerEntity.getAddressCustomerRelationEntiy() != null) {
           customerDto.setAddressDto(AddressMapper.AddressEntityToDto(customerEntity.getAddressCustomerRelationEntiy()));
        }else{
            System.out.println("Customer(1) - Address(1) via Customer with Address relation is not null");
            log.error("Customer(1) - Address(1) via Customer with Address relation is not null");
        }
        return customerDto;
    }

    // Customer Dto To Entity
    public static CustomerEntity CustomerDtoToEntity(CustomerDto customerDto) {
        // Instance (CustomerDto)
        CustomerEntity customerEntity = new CustomerEntity();

        // ID
        customerEntity.setId(customerDto.getId());
        customerEntity.setFirstName(customerDto.getFirstName());
        customerEntity.setLastName(customerDto.getLastName());
        customerEntity.setNotes(customerDto.getNotes());

        // DİKKAT Composition (Customer(1) - Address(1))
        if(customerDto.getAddressDto() != null){
            customerEntity.setAddressCustomerRelationEntiy(AddressMapper.AddressDtoToEntity(customerDto.getAddressDto()));
        }else{
            System.out.println("Customer(1) - Address(1) via Customer with Address relation is not null");
            log.error("Customer(1) - Address(1) via Customer with Address relation is not null");
        }
        return customerEntity;
    }
}
