package com.hamitmizrak.controller.api;

import org.springframework.http.ResponseEntity;

import java.util.List;

// D: Dto
public interface ICustomerApi<D> {

    // CRUD
    // CREATE (customer)
    public ResponseEntity<?> customerApiCreate(D d);

    // LIST (customer)
    public ResponseEntity<List<D>> customerApiList();

    // FIND (customer)
    public ResponseEntity<?> customerApiFindById(Long id);

    // UPDATE (customer)
    public ResponseEntity<?> customerApiUpdate(Long id, D d);

    // DELETE  (customer)
    public ResponseEntity<?> customerApiDeleteById(Long id);

}