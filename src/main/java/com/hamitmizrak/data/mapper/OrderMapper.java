package com.hamitmizrak.data.mapper;



import com.hamitmizrak.business.dto.OrderDto;
import com.hamitmizrak.data.entity.OrderEntity;

import java.util.stream.Collectors;

// Address(1)   - Customer(1)**FK
// Customer(1)  - Order(N)**FK
// Order(N)**FK - Product(M)

public class OrderMapper {

    // 1- OrderEntity'i OrderDto'a çevir
    public static OrderDto OrderEntityToOrderDto(OrderEntity orderEntity) {
        // Instance(OrderDto)
        OrderDto orderDto = new OrderDto();

        // Field
        orderDto.setId(orderEntity.getId());
        orderDto.setName(orderEntity.getName());
        orderDto.setPrice(orderEntity.getPrice());
        orderDto.setNotes(orderEntity.getNotes());

        // DİKKAT: Composition (Order(N)- Customer(1))
        if(orderEntity.getCustomerOrderEntity()!=null) {
            orderDto.setCustomerDto(CustomerMapper.CustomerEntityToCustomerDto(orderEntity.getCustomerOrderEntity()));
        }

        // DİKKAT: Composition (Order(N)- Product(M))
        if(orderEntity.getOrderProductEntityList()!=null) {
            orderDto.setOrderProductDtoList(
                    orderEntity
                            .getOrderProductEntityList()
                            .stream()
                            .map(ProductMapper::ProductEntityToProductDto)
                            .collect(Collectors.toList())
            );
        }
        return orderDto;
    }

    // 2- OrderDto'u OrderEntity'e  çevir
    public static OrderEntity OrderDtoToOrderEntity(OrderDto orderDto) {
        // Instance(OrderEntity)
        OrderEntity orderEntity = new OrderEntity();

        // Field
        orderEntity.setId(orderDto.getId());
        orderEntity.setName(orderDto.getName());
        orderEntity.setPrice(orderDto.getPrice());
        orderEntity.setNotes(orderDto.getNotes());

        // DİKKAT: Composition (Order(N)- Customer(1))
        if(orderDto.getCustomerDto()!=null) {
            orderEntity.setCustomerOrderEntity(CustomerMapper.CustomerDtoToCustomerEntity(orderDto.getCustomerDto()));
        }

        // DİKKAT: Composition (Order(N)- Product(M))
        if(orderDto.getOrderProductDtoList()!=null) {
            orderEntity.setOrderProductEntityList(
                    orderDto.getOrderProductDtoList()
                            .stream()
                            .map(ProductMapper::ProductDtoToProductEntity)
                            .collect(Collectors.toList())
            );
        }
        return orderEntity;
    }
}
