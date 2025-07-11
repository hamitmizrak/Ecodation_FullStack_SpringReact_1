package com.hamitmizrak.controller.api.impl;

import com.hamitmizrak.business.dto.BlogDto;
import com.hamitmizrak.business.services.interfaces.IBlogServices;
import com.hamitmizrak.controller.api.interfaces.IBlogApi;
import com.hamitmizrak.utily.FrontEnd;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// API
@RestController
@CrossOrigin(origins = FrontEnd.REACT_URL) // http://localhost:3000
@RequestMapping("/blog/api/v1")
public class BlogApiImpl implements IBlogApi<BlogDto> {

    // Injection
    private final IBlogServices iBlogServices;

    //////////////////////////////////////////////////////////////////////////////////////////
    // SPEED DATA
    @Override
    @GetMapping(value="/speed/data")
    public ResponseEntity<List<BlogDto>> blogApiSpeedData(Long key) {
        return null ;
    }

    // ALL DELETE
    @Override
    @GetMapping(value="/delete/all")
    public ResponseEntity<String> blogApiAllDelete() {
        return ResponseEntity.ok(iBlogServices.blogAllDelete());
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    // CREATE
    // http://localhost:4444/blog/api/v1/create
    @Override
    @PostMapping("/create")
    public ResponseEntity<?> objectApiCreate(@Valid @RequestBody BlogDto categoryDto) {
        return ResponseEntity.ok(iBlogServices.objectServiceCreate(categoryDto));
    }

    // LIST
    // http://localhost:4444/blog/api/v1/list
    @Override
    @GetMapping(value="/list")
    public ResponseEntity<List<BlogDto>> objectApiList() {
        return ResponseEntity.status(HttpStatus.OK).body(iBlogServices.objectServiceList());
    }

    // FIND
    // http://localhost:4444/blog/api/v1/find/1
    @Override
    @GetMapping(value="/find/{id}")
    public ResponseEntity<?> objectApiFindById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.status(200).body(iBlogServices.objectServiceFindById(id));
    }

    // UPDATE
    // http://localhost:4444/blog/api/v1/update/1
    @Override
    @PutMapping(value="/update/{id}")
    public ResponseEntity<?> objectApiUpdate(@PathVariable(name = "id") Long id, @Valid @RequestBody BlogDto categoryDto) {
        return ResponseEntity.ok().body(iBlogServices.objectServiceUpdate(id,categoryDto));
    }

    // DELETE BY ID
    // http://localhost:4444/blog/api/v1/delete/1
    @Override
    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<?> objectApiDelete(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(iBlogServices.objectServiceDelete(id),HttpStatus.OK);
    }

} //end class
