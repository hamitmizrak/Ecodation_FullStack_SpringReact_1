package com.hamitmizrak.business.services.interfaces;

import com.hamitmizrak.business.services.ICrudService;
import com.hamitmizrak.business.services.IModelMapperService;
import com.hamitmizrak.business.services.ISortingPagingService;
import org.springframework.data.domain.Page;

import java.util.List;

// D: Dto
// E: Entity
public interface IAddressService<D,E>
        extends IModelMapperService<D,E>,
        ICrudService<D,E>,
        ISortingPagingService<D,E> {

    // Special Address
}
