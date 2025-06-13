package com.hamitmizrak.business.services;

import java.util.List;

// D: Dto
// E: Entity
public interface ICustomerService<D, E> {

    // Model Mapper
    public D entityCustomerToDto(E e);

    public E dtoCustomerToEntity(D d);

    /////////////////////////////////////////////////
    // CRUD
    // CREATE (Customer)
    public D customerServiceCreate(D d);

    // LIST (Customer)
    public List<D> customerServiceList();

    // FIND (Customer)
    public D customerServiceFindById(Long id);

    // UPDATE (Customer)
    public D customerServiceUpdate(Long id, D d);

    // DELETE  (Customer)
    public D customerServiceDeleteById(Long id);
}