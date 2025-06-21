package com.hamitmizrak.business.services.interfaces;

import com.hamitmizrak.business.services.ICrudService;
import com.hamitmizrak.business.services.IModelMapperService;

// D: Dto
// E: Entity
public interface IBlogServices<D, E>  extends IModelMapperService<D,E>,ICrudService<D,E>{

    // SPEED DATA
    public String blogSpeedData(Long data);

    // ALL DELETE
    public String blogAllDelete();
}
