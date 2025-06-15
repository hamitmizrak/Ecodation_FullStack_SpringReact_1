package com.hamitmizrak.business.services;

import java.util.List;

// D: Dto
// E: Entity
public interface IProductService<D, E> {

    // Model Mapper
    public D entityProductToDto(E e);

    public E dtoProductToEntity(D d);

    ////////////////////////////////////////////////////////////////////

    // CRUD
    // CREATE (product)
    public D productServiceCreate(D d);

    // LIST (product)
    public List<D> productServiceList();

    // FIND (product)
    public D productServiceFindById(Long id);

    // UPDATE (product)
    public D productServiceUpdate(Long id, D d);

    // DELETE  (product)
    public D productServiceDeleteById(Long id);
}