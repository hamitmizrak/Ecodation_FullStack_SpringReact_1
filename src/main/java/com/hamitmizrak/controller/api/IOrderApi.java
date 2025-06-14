package com.hamitmizrak.controller.api;

import org.springframework.http.ResponseEntity;

import java.util.List;

// D: Dto
public interface IOrderApi<D> {

    // CRUD
    // CREATE (CUSTOMER)
    public ResponseEntity<?> orderApiCreate(D d);

    // LIST (order)
    public ResponseEntity<List<D>> orderApiList();

    // FIND (order)
    public ResponseEntity<?> orderApiFindById(Long id);

    // UPDATE (order)
    public ResponseEntity<?> orderApiUpdate(Long id, D d);

    // DELETE  (order)
    public ResponseEntity<?> orderApiDeleteById(Long id);
}