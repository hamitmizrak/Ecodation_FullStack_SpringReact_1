package com.hamitmizrak.controller.api.impl;

import com.hamitmizrak.business.dto.OrderDto;
import com.hamitmizrak.business.services.IOrderService;
import com.hamitmizrak.controller.api.IOrderApi;
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
@RequestMapping("/api/order")
public class OrderApiImpl implements IOrderApi<OrderDto> {

    // INJECTION
    private final IOrderService iOrderService;
    private final MessageSource messageSource;

    // Api Result
    private ApiResult apiResult;

    // http://localhost:4444/api/order/create
    // CREATE (order)
    @PostMapping("/create")
    @Override
    public ResponseEntity<?> orderApiCreate(@Valid @RequestBody OrderDto orderDto) {
        OrderDto orderDtoCreate = (OrderDto) iOrderService.orderServiceCreate(orderDto);
        // return ResponseEntity.status(200).body(OrderDtoCreate);
        // return ResponseEntity.status(HttpStatus.OK).body(OrderDtoCreate);
        // return new ResponseEntity<>(OrderDtoCreate, HttpStatus.CREATED);
        // return ResponseEntity.ok().body(OrderDtoCreate);
        return ResponseEntity.ok(orderDtoCreate);
    }

    // http://localhost:4444/api/order/list
    // LIST
    @GetMapping(value = "/list")
    @Override
    public ResponseEntity<List<OrderDto>> orderApiList() {
        List<OrderDto> orderDtoList = iOrderService.orderServiceList();
        // Stream
        return ResponseEntity.ok(orderDtoList);
    }

    // http://localhost:4444/api/order/find
    // http://localhost:4444/api/order/find/0
    // http://localhost:4444/api/order/find/-1
    // http://localhost:4444/api/order/find/%20%
    // http://localhost:4444/api/order/find/44
    // @PathVariable Long id
    // @PathVariable(name="id") Long id, @PathVariable(name="id") Long id
    // FIND
    @GetMapping(value ={"/find/", "/find/{id}"})
    @Override
    public ResponseEntity<?> orderApiFindById(@PathVariable(name = "id", required = false) Long id) {
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
            apiResult.setPath("/api/order/find");
            apiResult.setStatus(HttpStatus.UNAUTHORIZED.value());
            apiResult.setMessage(message);
            return ResponseEntity.ok(apiResult);
        }

        // Yukarıdakilerden herhangi bir sıkıntı söz konusu değilse
        OrderDto OrderDtoFind = (OrderDto) iOrderService.orderServiceFindById(id);
        return ResponseEntity.ok(OrderDtoFind);
    }

    // http://localhost:4444/api/order/update/id
    // UPDATE
    @PutMapping(value ={"/update/", "/update/{id}"})
    @Override
    public ResponseEntity<?> orderApiUpdate(
            @PathVariable(name = "id", required = false) Long id,
            @Valid @RequestBody OrderDto orderDto) {
        return  ResponseEntity.ok(iOrderService.orderServiceUpdate(id, orderDto));
    }

    // http://localhost:4444/api/order/delete/id
    // DELETE BY ID
    @DeleteMapping(value ={"/delete/", "/delete/{id}"})
    @Override
    public ResponseEntity<?> orderApiDeleteById(@PathVariable(name = "id", required = false)  Long id) {
        return ResponseEntity.ok(iOrderService.orderServiceDeleteById(id));
    }
} //end orderApiImpl