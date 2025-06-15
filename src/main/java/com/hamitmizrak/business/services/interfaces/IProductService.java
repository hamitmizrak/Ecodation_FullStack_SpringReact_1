package com.hamitmizrak.business.services.interfaces;

import com.hamitmizrak.business.services.ICrudService;
import com.hamitmizrak.business.services.IModelMapperService;

import java.util.List;

// D: Dto
// E: Entity
public interface IProductService<D,E>
        extends IModelMapperService<D,E>,
        ICrudService<D,E> {

    // Special Address
}
