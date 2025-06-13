package com.hamitmizrak.business.services.impl;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.business.mapper.AddressMapper;
import com.hamitmizrak.business.services.ICustomerService;
import com.hamitmizrak.data.embeddable.AddressEntityEmbeddable;
import com.hamitmizrak.data.entity.CustomerEntity;
import com.hamitmizrak.data.repository.ICustomerRepository;
import com.hamitmizrak.exception._404_NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

// LOMBOK
@RequiredArgsConstructor // for injection

// Asıl iş yükünü yapan Bean
@Service
public class CustomerServiceImpl implements ICustomerService<CustomerDto, CustomerEntity> {

    // FIELD INJECTION

    // LOMBOK CONSTRUCTOR INJECTION
    private final ICustomerRepository iCustomerRepository;
    private final ModelMapperBean modelMapperBean;

    // MODEL MAPPER
    @Override
    public CustomerDto entityCustomerToDto(CustomerEntity customerEntity) {

        // 1.YOL
        // return modelMapperBean.getModelMapper().map(customerEntity, CustomerDto.class);

        // 2.YOL
        return CustomerMapper.CustomerEntityToDto(customerEntity);
    }

    @Override
    public CustomerEntity dtoCustomerToEntity(CustomerDto customerDto) {
        // 1.YOL
        // return modelMapperBean.getModelMapper().map(customerDto, CustomerEntity.class);

        //  2.YOL
        return CustomerMapper.CustomerDtoToEntity(CustomerDto);
    }

    /////////////////////////////////////////////////////////////////
    // CRUD
    // CREATE
    @Transactional // create, delete, update (manipulation)
    @Override
    public CustomerDto customerServiceCreate(CustomerDto customerDto) {
        CustomerEntity customerEntityCreate = dtoCustomerToEntity(customerDto);
        customerEntityCreate = iCustomerRepository.save(customerEntityCreate);
        return entityCustomerToDto(customerEntityCreate);
    }

    // LIST
    @Override
    public List<CustomerDto> customerServiceList() {
        return iCustomerRepository.findAll()
                .stream()
                //.map(CustomerMapper::CustomerEntityToDto)// 1.YOL Method Referance
                //.sorted(Comparator.comparing((temp)->temp.getCustomerEntityEmbeddable().getCity()))
                .map((temp) -> CustomerMapper.CustomerEntityToDto(temp))// 2.YOL Lambda Expression
                .collect(Collectors.toList());
    }

    // FIND BY ID
    @Override
    public CustomerDto customerServiceFindById(Long id) {
        return iCustomerRepository.findById(id)
                .map(CustomerMapper::CustomerEntityToDto)// 1.YOL Method Referance
                //.map((temp)->CustomerMapper.CustomerEntityToDto(temp))// 2.YOL Lambda Expression
                .orElseThrow(() -> new _404_NotFoundException(id + " nolu Customer yoktur"));
    }

    // UPDATE
    @Transactional // create, delete, update (manipulation)
    @Override
    public CustomerDto customerServiceUpdate(Long id, CustomerDto customerDto) {
        // ID Varsa
        CustomerEntity customerEntityUpdate = dtoCustomerToEntity(customerServiceFindById(id));

        // Embeddable
        AddressEntityEmbeddable addressEntityEmbeddable = new AddressEntityEmbeddable();
        addressEntityEmbeddable.setZipCode(customerDto.getZipCode());
        addressEntityEmbeddable.setCity(customerDto.getCity());
        addressEntityEmbeddable.setState(customerDto.getState());
        addressEntityEmbeddable.setStreet(customerDto.getStreet());
        addressEntityEmbeddable.setDoorNumber(customerDto.getDoorNumber());
        addressEntityEmbeddable.setDescription(customerDto.getDescription());
        customerEntityUpdate = iCustomerRepository.saveAndFlush(customerEntityUpdate);
        return entityCustomerToDto(customerEntityUpdate);
    }

    // DELETE
    @Transactional // create, delete, update (manipulation)
    @Override
    public CustomerDto customerServiceDeleteById(Long id) {
        // ID Varsa
        CustomerEntity customerEntityDelete = dtoCustomerToEntity(customerServiceFindById(id));
        iCustomerRepository.delete(customerEntityDelete);
        return entityCustomerToDto(customerEntityDelete);
    }
    
}