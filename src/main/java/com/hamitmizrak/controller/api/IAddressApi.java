package com.hamitmizrak.controller.api;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import java.util.List;

// D: Dto
public interface IAddressApi <D> {

    // CRUD
    // CREATE (ADDRESS)
    public ResponseEntity<D>  addressApiCreate(D d);

    // LIST   (ADDRESS)
    public ResponseEntity<List<D>>  addressApiList();

    // FIND   (ADDRESS)
    public ResponseEntity<?>  addressApiFindById(Long id);

    // UPDATE (ADDRESS)
    public ResponseEntity<?> addressApiUpdate(Long id, D d);

    // DELETE (ADDRESS)
    public ResponseEntity<?>  addressApiDeleteById(Long id);

    //////////////////////////////////////////////////////////
    // SORTING / PAGINATION

    // PAGINATION
    public  ResponseEntity<Page<?> > addressApiPagination(int currentPage, int pageSize);

    // SORTING
    public  ResponseEntity< List<?> >addressApiAllSortedBy(String sortedBy);

    // SORTING ASC
    public  ResponseEntity<List<?>>  addressApiAllSortedByCityAsc();

    // SORTING DESC
    public  ResponseEntity<List<?>>  addressApiAllSortedByCityDesc();
}
