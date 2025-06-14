package com.hamitmizrak.business.services.impl;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.ProductDto;
import com.hamitmizrak.business.mapper.ProductMapper;
import com.hamitmizrak.business.services.IProductService;
import com.hamitmizrak.data.entity.ProductEntity;
import com.hamitmizrak.data.repository.IProductRepository;
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
public class ProductServiceImpl implements IProductService<ProductDto, ProductEntity> {


    // LOMBOK CONSTRUCTOR INJECTION
    private final IProductRepository iProductRepository;
    private final ModelMapperBean modelMapperBean;

    // MODEL MAPPER
    @Override
    public ProductDto entityProductToDto(ProductEntity productEntity) {

        // 1.YOL
        // return modelMapperBean.getModelMapper().map(productEntity, ProductDto.class);

        // 2.YOL
        return ProductMapper.ProductEntityToDto(productEntity);
    }

    @Override
    public ProductEntity dtoProductToEntity(ProductDto productDto) {
        // 1.YOL
        // return modelMapperBean.getModelMapper().map(productDto, ProductEntity.class);

        //  2.YOL
        return ProductMapper.ProductDtoToEntity(productDto);
    }

    /////////////////////////////////////////////////////////////////
    // CRUD
    // CREATE
    @Transactional // create, delete, update (manipulation)
    @Override
    public ProductDto productServiceCreate(ProductDto productDto) {
        ProductEntity productEntityCreate = dtoProductToEntity(productDto);
        productEntityCreate = iProductRepository.save(productEntityCreate);
        return entityProductToDto(productEntityCreate);
    }

    // LIST
    @Override
    public List<ProductDto> productServiceList() {
        return iProductRepository.findAll()
                .stream()
                //.map(ProductMapper::ProductEntityToDto)// 1.YOL Method Referance
                .map((temp) -> ProductMapper.ProductEntityToDto(temp))// 2.YOL Lambda Expression
                .collect(Collectors.toList());
    }

    // FIND BY ID
    @Override
    public ProductDto productServiceFindById(Long id) {
        return iProductRepository.findById(id)
                .map(ProductMapper::ProductEntityToDto)// 1.YOL Method Referance
                //.map((temp)->ProductMapper.ProductEntityToDto(temp))// 2.YOL Lambda Expression
                .orElseThrow(() -> new _404_NotFoundException(id + " nolu product yoktur"));
    }

    // UPDATE
    @Transactional // create, delete, update (manipulation)
    @Override
    public ProductDto productServiceUpdate(Long id, ProductDto productDto) {
        // ID Varsa
        ProductEntity productEntityUpdate = dtoProductToEntity(productServiceFindById(id));

        // Embeddable
        productEntityUpdate.setName(productDto.getName());
        productEntityUpdate.setCode(productDto.getCode());
        productEntityUpdate = iProductRepository.saveAndFlush(productEntityUpdate);
        return  entityProductToDto(productEntityUpdate);
    }

    // DELETE
    @Transactional // create, delete, update (manipulation)
    @Override
    public ProductDto productServiceDeleteById(Long id) {
        // ID Varsa
        ProductEntity productEntityDelete = dtoProductToEntity(productServiceFindById(id));
        iProductRepository.delete(productEntityDelete);
        return entityProductToDto(productEntityDelete);
    }
}