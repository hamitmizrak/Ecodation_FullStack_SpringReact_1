package com.hamitmizrak.business.services.impl;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.OrderDto;
import com.hamitmizrak.business.mapper.OrderMapper;
import com.hamitmizrak.business.services.IOrderService;
import com.hamitmizrak.data.entity.OrderEntity;
import com.hamitmizrak.data.repository.IOrderRepository;
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
public class OrderServiceImpl implements IOrderService<OrderDto, OrderEntity> {


    // LOMBOK CONSTRUCTOR INJECTION
    private final IOrderRepository iOrderRepository;
    private final ModelMapperBean modelMapperBean;

    // MODEL MAPPER
    @Override
    public OrderDto entityOrderToDto(OrderEntity orderEntity) {

        // 1.YOL
        // return modelMapperBean.getModelMapper().map(orderEntity, orderDto.class);

        // 2.YOL
        return OrderMapper.OrderEntityToDto(orderEntity);
    }

    @Override
    public OrderEntity dtoOrderToEntity(OrderDto orderDto) {
        // 1.YOL
        // return modelMapperBean.getModelMapper().map(orderDto, orderEntity.class);

        //  2.YOL
        return OrderMapper.OrderDtoToEntity(orderDto);
    }

    /////////////////////////////////////////////////////////////////
    // CRUD
    // CREATE
    @Transactional // create, delete, update (manipulation)
    @Override
    public OrderDto orderServiceCreate(OrderDto orderDto) {
        OrderEntity orderEntityCreate = dtoOrderToEntity(orderDto);
        orderEntityCreate = iOrderRepository.save(orderEntityCreate);
        return entityOrderToDto(orderEntityCreate);
    }

    // LIST
    @Override
    public List<OrderDto> orderServiceList() {
        return iOrderRepository.findAll()
                .stream()
                //.map(orderMapper::orderEntityToDto)// 1.YOL Method Referance
                .map((temp) -> OrderMapper.OrderEntityToDto(temp))// 2.YOL Lambda Expression
                .collect(Collectors.toList());
    }

    // FIND BY ID
    @Override
    public OrderDto orderServiceFindById(Long id) {
        return iOrderRepository.findById(id)
                .map(OrderMapper::OrderEntityToDto)// 1.YOL Method Referance
                //.map((temp)->orderMapper.orderEntityToDto(temp))// 2.YOL Lambda Expression
                .orElseThrow(() -> new _404_NotFoundException(id + " nolu order yoktur"));
    }

    // UPDATE
    @Transactional // create, delete, update (manipulation)
    @Override
    public OrderDto orderServiceUpdate(Long id, OrderDto orderDto) {
        // ID Varsa
        OrderEntity orderEntityUpdate = dtoOrderToEntity(orderServiceFindById(id));

        // Embeddable
        orderEntityUpdate.setName(orderDto.getName());
        orderEntityUpdate.setPrice(orderDto.getPrice());
        orderEntityUpdate = iOrderRepository.saveAndFlush(orderEntityUpdate);
        return entityOrderToDto(orderEntityUpdate);
    }

    // DELETE
    @Transactional // create, delete, update (manipulation)
    @Override
    public OrderDto orderServiceDeleteById(Long id) {
        // ID Varsa
        OrderEntity orderEntityDelete = dtoOrderToEntity(orderServiceFindById(id));
        iOrderRepository.delete(orderEntityDelete);
        return entityOrderToDto(orderEntityDelete);
    }
}