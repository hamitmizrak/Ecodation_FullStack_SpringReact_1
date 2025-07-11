package com.hamitmizrak.data.mapper;


import com.hamitmizrak.business.dto.ProductDto;
import com.hamitmizrak.data.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    // 1- OrderEntity'i OrderDto'a çevir
    public static ProductDto ProductEntityToProductDto(ProductEntity productEntity) {
        // Instance(OrderDto)
        ProductDto productDto = new ProductDto();

        // Field
        productDto.setId(productEntity.getId());
        productDto.setName(productEntity.getName());
        productDto.setCode(productEntity.getCode());
        return productDto;
    }

    // 2- OrderDto'u OrderEntity'e  çevir
    public static ProductEntity ProductDtoToProductEntity(ProductDto productDto) {
        // Instance(OrderEntity)
        ProductEntity productEntity = new ProductEntity();

        // Field
        productEntity.setId(productDto.getId());
        productEntity.setName(productDto.getName());
        productEntity.setCode(productDto.getCode());
        return productEntity;
    }

    // 3- ProductDto nesnesini ProductEntity Listesine çevirmek
    public static List<ProductEntity> ProductDtoListToEntityList(List<ProductDto> productDtoList) {
        return productDtoList.stream().map(ProductMapper::ProductDtoToProductEntity).collect(Collectors.toList());
    }
}
