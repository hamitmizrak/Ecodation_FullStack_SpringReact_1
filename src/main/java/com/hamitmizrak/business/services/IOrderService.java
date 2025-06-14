package com.hamitmizrak.business.services;

import java.util.List;

// D: Dto
// E: Entity
public interface IOrderService<D, E> {

    // Model Mapper
    public D entityOrderToDto(E e);

    public E dtoOrderToEntity(D d);

    ////////////////////////////////////////////////////////////////////

    // CRUD
    // CREATE (product)
    public D orderServiceCreate(D d);

    // LIST (order)
    public List<D> orderServiceList();

    // FIND (order)
    public D orderServiceFindById(Long id);

    // UPDATE (order)
    public D orderServiceUpdate(Long id, D d);

    // DELETE  (order)
    public D orderServiceDeleteById(Long id);
}