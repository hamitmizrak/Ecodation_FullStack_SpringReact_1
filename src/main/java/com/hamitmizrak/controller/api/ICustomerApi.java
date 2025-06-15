package com.hamitmizrak.controller.api;

import org.springframework.http.ResponseEntity;

import java.util.List;

// D: Dto
public interface ICustomerApi<D> {

    // CRUD
    // CREATE (CUSTOMER)
    public ResponseEntity<?> customerApiCreate(D d);

    // LIST (CUSTOMER)
    public ResponseEntity<List<D>> customerApiList();

    // FIND (CUSTOMER)
    public ResponseEntity<?> customerApiFindById(Long id);

    // UPDATE (CUSTOMER)
    public ResponseEntity<?> customerApiUpdate(Long id, D d);

    // DELETE  (CUSTOMER)
    public ResponseEntity<?> customerApiDeleteById(Long id);
}