package com.hamitmizrak.data.mapper;



import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.data.entity.CustomerEntity;
import lombok.extern.log4j.Log4j2;

// LOMBOK
@Log4j2

public class CustomerMapper {

    // 1- CustomerEntity'i CustomerDto'a çevir
    public static CustomerDto CustomerEntityToCustomerDto(CustomerEntity customerEntity){
        // Instance (CustomerDto)
        CustomerDto customerDto= new CustomerDto();

        //ID,SYSTEM DATE
        customerDto.setId(customerEntity.getId());
        customerDto.setFirstName(customerEntity.getFirstName());
        customerDto.setLastName(customerEntity.getLastName());
        customerDto.setNotes(customerEntity.getNotes());

        // DİKKAT: Composition (Customer(1) -Address(1))
        if(customerEntity.getAddressCustomerEntity() != null){
            customerDto.setAddressDto(AddressMapper.AddressEntityToAddressDto(customerEntity.getAddressCustomerEntity()));
        }else{
            System.err.println("Customer(1) - Adress(1) not connected because AddressEntity is null");
            log.error("Customer(1) - Adress(1) not connected because Address is null");
        }

        // DİKKAT: Composition (Customer(1) -Order(N))
        return customerDto;
    }

    // 2- CustomerDto'u CustomerEntity'e  çevir
    public static CustomerEntity CustomerDtoToCustomerEntity(CustomerDto  customerDto){
        // Instance (CustomerEntity)
        CustomerEntity customerEntity= new CustomerEntity();

        //ID,SYSTEM DATE
        customerEntity.setId(customerDto.getId());
        customerEntity.setFirstName(customerDto.getFirstName());
        customerEntity.setLastName(customerDto.getLastName());
        customerEntity.setNotes(customerDto.getNotes());
        //customerEntity.setSystemCreatedDate(customerDto.getSystemCreatedDate());

        // DİKKAT: Composition (Customer(1) -Address(1))
        if(customerDto.getAddressDto() != null){
            customerEntity.setAddressCustomerEntity(AddressMapper.AddressDtoToAddressEntity(customerDto.getAddressDto()));
        }else{
            System.err.println("Customer(1) - Adress(1) not connected because AddressDto is null");
            log.error("Customer(1) - Adress(1) not connected because Address is null");
        }

        // DİKKAT: Composition (Customer(1) -Order(N))
        return customerEntity;
    }
}
