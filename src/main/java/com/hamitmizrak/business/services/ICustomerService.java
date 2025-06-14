package com.hamitmizrak.business.services;

import java.util.List;

// D: Dto
// E: Entity
public interface ICustomerService<D, E> {

    // Model Mapper
    public D entityCustomerToDto(E e);

    public E dtoCustomerToEntity(D d);

    ////////////////////////////////////////////////////////////////////

    // CRUD
    // CREATE (customer)
    public D customerServiceCreate(D d);

    // LIST (customer)
    public List<D> customerServiceList();

    // FIND (customer)
    public D customerServiceFindById(Long id);

    // UPDATE (customer)
    public D customerServiceUpdate(Long id, D d);

    // DELETE  (customer)
    public D customerServiceDeleteById(Long id);
}