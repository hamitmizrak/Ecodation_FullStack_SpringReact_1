package com.hamitmizrak.business.services.interfaces;


import com.hamitmizrak.business.services.ICrudService;
import com.hamitmizrak.business.services.IModelMapperService;
import com.hamitmizrak.business.services.ISortingPagingService;

public interface IAddressService<D,E>
        extends IModelMapperService<D,E>,
        ICrudService<D,E>,
        ISortingPagingService<D,E> {

    // Special Address
}
