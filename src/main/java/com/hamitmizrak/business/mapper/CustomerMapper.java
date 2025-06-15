package com.hamitmizrak.business.mapper;

import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.data.entity.CustomerEntity;
import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.util.stream.Collectors;

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

        // DİKKAT: Composition (Customer(1) Adres(1))
        if (customerEntity.getAddressCustomerEntity() != null) {
            customerDto.setAddressDto(AddressMapper.AddressEntityToDto(customerEntity.getAddressCustomerEntity()));
        } else {
            System.out.println("Customer(1) Adres(1) Customer Composition Adress null");
            log.error("Customer(1) Adres(1) Customer Composition Adress null");
            //JOptionPane.showMessageDialog(null, "Customer(1) Adres(1) Customer Composition Adress null");
        }

        // DİKKAT: Composition (Customer(1) Order(N))
        if(customerEntity.getOrderCustomerEntityList()!=null){
            customerDto.setOrderDtoList(
                    customerEntity
                            .getOrderCustomerEntityList()
                            .stream()
                            .map(OrderMapper::OrderEntityToDto)
                            .collect(Collectors.toList())
            );
        }else{
            System.out.println("(Customer(1) Order(N) Customer Composition Order null");
            log.error("(Customer(1) Order(N) Customer Composition Order null");
            //JOptionPane.showMessageDialog(null, "(Customer(1) Order(N) Customer Composition Order null");

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

        // DİKKAT: Composition ( Customer(1) Adres(1) )
        if(customerDto.getAddressDto() != null) {
            customerEntity.setAddressCustomerEntity(AddressMapper.AddressDtoToEntity(customerDto.getAddressDto()));
        }

        // DİKKAT: Composition (Customer(1) Order(N))
        if(customerDto.getOrderDtoList()!=null){
            customerEntity.setOrderCustomerEntityList(
                    customerDto
                            .getOrderDtoList()
                            .stream()
                            .map(OrderMapper::OrderDtoToEntity)
                            .collect(Collectors.toList()));
        }else{
            System.out.println("(Customer(1) Order(N) Customer Composition Order null");
        }
        return customerEntity;
    }
}
