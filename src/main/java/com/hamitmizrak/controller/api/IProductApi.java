package com.hamitmizrak.controller.api;

import org.springframework.http.ResponseEntity;

import java.util.List;

// D: Dto
public interface IProductApi<D> {

    // CRUD
    // CREATE (CUSTOMER)
    public ResponseEntity<?> productApiCreate(D d);

    // LIST (product)
    public ResponseEntity<List<D>> productApiList();

    // FIND (product)
    public ResponseEntity<?> productApiFindById(Long id);

    // UPDATE (product)
    public ResponseEntity<?> productApiUpdate(Long id, D d);

    // DELETE  (product)
    public ResponseEntity<?> productApiDeleteById(Long id);
}