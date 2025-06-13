package com.hamitmizrak.controller.api.impl;

import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.business.services.ICustomerService;
import com.hamitmizrak.controller.api.ICustomerApi;
import com.hamitmizrak.error.ApiResult;
import com.hamitmizrak.exception._400_BadRequestException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 1xx: Information
// 2xx: Success
// 3xx: Direction
// 4xx: Client Error
// 5xx: Server Error

// LOMBOK
@RequiredArgsConstructor

// API: Dış dünyaya açılan kapı
@RestController
@CrossOrigin // Backendten giden veriyi yakalacak frontend için farklı portlara izin vermek
@RequestMapping("/api/customer")
public class CustomerApiImpl implements ICustomerApi<CustomerDto> {

    // INJECTION
    private final ICustomerService iCustomerService;
    private final MessageSource messageSource;

    // Api Result
    private ApiResult apiResult;

    // http://localhost:4444/api/customer/create
    // CREATE (customer)
    @PostMapping("/create")
    @Override
    public ResponseEntity<?> customerApiCreate(@Valid @RequestBody CustomerDto customerDto) {
        CustomerDto customerDtoCreate = (CustomerDto) iCustomerService.customerServiceCreate(customerDto);
        // return ResponseEntity.status(200).body(customerDtoCreate);
        // return ResponseEntity.status(HttpStatus.OK).body(customerDtoCreate);
        // return new ResponseEntity<>(customerDtoCreate, HttpStatus.CREATED);
        // return ResponseEntity.ok().body(customerDtoCreate);
        return ResponseEntity.ok(customerDtoCreate);
    }

    // http://localhost:4444/api/customer/list
    // LIST
    @GetMapping(value = "/list")
    @Override
    public ResponseEntity<List<CustomerDto>> customerApiList() {
        List<CustomerDto> customerDtoList = iCustomerService.customerServiceList();
        // Stream
        return ResponseEntity.ok(customerDtoList);
    }

    // http://localhost:4444/api/customer/find
    // http://localhost:4444/api/customer/find/0
    // http://localhost:4444/api/customer/find/-1
    // http://localhost:4444/api/customer/find/%20%
    // http://localhost:4444/api/customer/find/44
    // @PathVariable Long id
    // @PathVariable(name="id") Long id, @PathVariable(name="id") Long id
    // FIND
    @GetMapping(value ={"/find/", "/find/{id}"})
    @Override
    public ResponseEntity<?> customerApiFindById(@PathVariable(name = "id", required = false) Long id) {
       String message="";
        if (id == null) {
            throw new NullPointerException("Null Pointer Exception");
        } else if (id == 0) {
            throw new _400_BadRequestException("Bad Request: Kötü istek");
        } else if (id < 0) {
            // config > ApiResultValidMessages
            message=messageSource.getMessage("error.unauthorized",null, LocaleContextHolder.getLocale());
            apiResult = new ApiResult();
            apiResult.setError("unAuthorized: Yetkisiz Giriş");
            apiResult.setPath("/api/customer/find");
            apiResult.setStatus(HttpStatus.UNAUTHORIZED.value());
            apiResult.setMessage(message);
            return ResponseEntity.ok(apiResult);
        }

        // Yukarıdakilerden herhangi bir sıkıntı söz konusu değilse
        CustomerDto customerDtoFind = (CustomerDto) iCustomerService.customerServiceFindById(id);
        return ResponseEntity.ok(customerDtoFind);
    }

    // http://localhost:4444/api/customer/update/id
    // UPDATE
    @PutMapping(value ={"/update/", "/update/{id}"})
    @Override
    public ResponseEntity<?> customerApiUpdate(
            @PathVariable(name = "id", required = false) Long id,
            @Valid @RequestBody CustomerDto customerDto) {
        return  ResponseEntity.ok(iCustomerService.customerServiceUpdate(id, customerDto));
    }

    // http://localhost:4444/api/customer/delete/id
    // DELETE BY ID
    @DeleteMapping(value ={"/delete/", "/delete/{id}"})
    @Override
    public ResponseEntity<?> customerApiDeleteById(@PathVariable(name = "id", required = false)  Long id) {
        return ResponseEntity.ok(iCustomerService.customerServiceDeleteById(id));
    }

} //end customerApiImpl