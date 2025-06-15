package com.hamitmizrak.controller.api.impl;

import com.hamitmizrak.business.dto.ProductDto;
import com.hamitmizrak.business.services.IProductService;
import com.hamitmizrak.controller.api.IProductApi;
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
@RequestMapping("/api/product")
public class ProductApiImpl implements IProductApi<ProductDto> {

    // INJECTION
    private final IProductService iProductService;
    private final MessageSource messageSource;

    // Api Result
    private ApiResult apiResult;

    // http://localhost:4444/api/product/create
    // CREATE (product)
    @PostMapping("/create")
    @Override
    public ResponseEntity<?> productApiCreate(@Valid @RequestBody ProductDto productDto) {
        ProductDto productDtoCreate = (ProductDto) iProductService.productServiceCreate(productDto);
        // return ResponseEntity.status(200).body(productCreate);
        // return ResponseEntity.status(HttpStatus.OK).body(productCreate);
        // return new ResponseEntity<>(productCreate, HttpStatus.CREATED);
        // return ResponseEntity.ok().body(productCreate);
        return ResponseEntity.ok(productDtoCreate);
    }

    // http://localhost:4444/api/product/list
    // LIST
    @GetMapping(value = "/list")
    @Override
    public ResponseEntity<List<ProductDto>> productApiList() {
        List<ProductDto> productDtoList = iProductService.productServiceList();
        // Stream
        return ResponseEntity.ok(productDtoList);
    }

    // http://localhost:4444/api/product/find
    // http://localhost:4444/api/product/find/0
    // http://localhost:4444/api/product/find/-1
    // http://localhost:4444/api/product/find/%20%
    // http://localhost:4444/api/product/find/44
    // @PathVariable Long id
    // @PathVariable(name="id") Long id, @PathVariable(name="id") Long id
    // FIND
    @GetMapping(value ={"/find/", "/find/{id}"})
    @Override
    public ResponseEntity<?> productApiFindById(@PathVariable(name = "id", required = false) Long id) {
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
            apiResult.setPath("/api/product/find");
            apiResult.setStatus(HttpStatus.UNAUTHORIZED.value());
            apiResult.setMessage(message);
            return ResponseEntity.ok(apiResult);
        }

        // Yukarıdakilerden herhangi bir sıkıntı söz konusu değilse
        ProductDto productDtoFind = (ProductDto) iProductService.productServiceFindById(id);
        return ResponseEntity.ok(productDtoFind);
    }

    // http://localhost:4444/api/product/update/id
    // UPDATE
    @PutMapping(value ={"/update/", "/update/{id}"})
    @Override
    public ResponseEntity<?> productApiUpdate(
            @PathVariable(name = "id", required = false) Long id,
            @Valid @RequestBody ProductDto productDto) {
        return  ResponseEntity.ok(iProductService.productServiceUpdate(id, productDto));
    }

    // http://localhost:4444/api/product/delete/id
    // DELETE BY ID
    @DeleteMapping(value ={"/delete/", "/delete/{id}"})
    @Override
    public ResponseEntity<?> productApiDeleteById(@PathVariable(name = "id", required = false)  Long id) {
        return ResponseEntity.ok(iProductService.productServiceDeleteById(id));
    }
} //end productApiImpl