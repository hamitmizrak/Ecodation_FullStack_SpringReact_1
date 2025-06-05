package com.hamitmizrak.business.services;

import org.springframework.data.domain.Page;

import java.util.List;

// D: Dto
// E: Entity
public interface IAddressService <D,E> {

    // ModelMapper
    public D entityAddressToDto(E e);
    public E dtoAddressToEntity(D d);

    //////////////////////////////////////////////////////////
    // CRUD
    // CREATE (ADDRESS)
    public D addressServiceCreate(D d);

    // LIST   (ADDRESS)
    public List<D> addressServiceList();

    // FIND   (ADDRESS)
    public D addressServiceFindById(Long id);

    // UPDATE (ADDRESS)
    public D addressServiceUpdate(Long id, D d);

    // DELETE (ADDRESS)
    public D addressServiceDelete(Long id);

    //////////////////////////////////////////////////////////
    // SORTING / PAGINATION

    // PAGINATION
    public Page<D> addressServicePagination(int currentPage, int pageSize);

    // SORTING
    public List<D> addressServiceAllSortedBy(String sortedBy);

    // SORTING ASC
    public List<D> addressServiceAllSortedByCityAsc();

    // SORTING DESC
    public List<D> addressServiceAllSortedByCityDesc();
}
