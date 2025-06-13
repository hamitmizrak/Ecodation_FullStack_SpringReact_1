package com.hamitmizrak.controller.api;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import java.util.List;

// D: Dto
public interface IAddressApi<D> {

    // CRUD
    // CREATE (ADDRESS)
    public ResponseEntity<?> addressApiCreate(D d);

    // LIST (ADDRESS)
    public ResponseEntity<List<D>> addressApiList();

    // FIND (ADDRESS)
    public ResponseEntity<?> addressApiFindById(Long id);

    // UPDATE (ADDRESS)
    public ResponseEntity<?> addressApiUpdate(Long id, D d);

    // DELETE  (ADDRESS)
    public ResponseEntity<?> addressApiDeleteById(Long id);

    /////////////////////////////////////////////////
    // SORTING / PAGINATION
    //  PAGINATION
    public ResponseEntity<Page<?>> addressServicePagination(int currentPage, int pageSize);

    // SORTING
    // Address Entity içindeki herhangibi bir olan kolana göre sıralama
    public ResponseEntity<List<?>> addressServiceAllSortedBy(String sortedBy);

    // SORTING ASC
    // Address Entity içindeki city olan özel bir alana göre sıralama
    public ResponseEntity<List<?>> addressServiceAllSortedByCityAsc();

    // SORTING DESC
    public ResponseEntity<List<?>> addressServiceAllSortedByCityDesc();
}