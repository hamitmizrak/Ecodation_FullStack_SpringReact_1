package com.hamitmizrak.controller.api.impl;

import com.hamitmizrak.business.dto.AddressDto;
import com.hamitmizrak.business.services.IAddressService;
import com.hamitmizrak.controller.api.IAddressApi;
import com.hamitmizrak.error.ApiResult;
import com.hamitmizrak.exception._400_BadRequestException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
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

// API: Dıi dünyaya açılan kapı
@RestController
@CrossOrigin // Backendten giden veriyi yakalacak frontend için farklı portlara izin vermek
@RequestMapping("/api/address")
public class AddressApiImpl implements IAddressApi<AddressDto> {

    // INJECTION
    private final IAddressService addressService;
    private final MessageSource messageSource;

    // Api Result
    private ApiResult apiResult;

    // http://localhost:4444/api/address/create
    // CREATE (ADDRESS)
    @PostMapping("/create")
    @Override
    public ResponseEntity<?> addressApiCreate(@Valid @RequestBody AddressDto addressDto) {
        AddressDto addressDtoCreate = (AddressDto) addressService.addressServiceCreate(addressDto);
        // return ResponseEntity.status(200).body(addressDtoCreate);
        // return ResponseEntity.status(HttpStatus.OK).body(addressDtoCreate);
        // return new ResponseEntity<>(addressDtoCreate, HttpStatus.CREATED);
        // return ResponseEntity.ok().body(addressDtoCreate);
        return ResponseEntity.ok(addressDtoCreate);
    }

    // http://localhost:4444/api/address/list
    // LIST
    @GetMapping(value = "/list")
    @Override
    public ResponseEntity<List<AddressDto>> addressApiList() {
        List<AddressDto> addressDtoList = addressService.addressServiceList();
        // Stream
        return ResponseEntity.ok(addressDtoList);
    }

    // http://localhost:4444/api/address/find
    // http://localhost:4444/api/address/find/0
    // http://localhost:4444/api/address/find/-1
    // http://localhost:4444/api/address/find/%20%
    // http://localhost:4444/api/address/find/44
    // @PathVariable Long id
    // @PathVariable(name="id") Long id, @PathVariable(name="id") Long id
    // FIND
    @GetMapping(value ={"/find/", "/find/{id}"})
    @Override
    public ResponseEntity<?> addressApiFindById(@PathVariable(name = "id", required = false) Long id) {
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
            apiResult.setPath("/api/address/find");
            apiResult.setStatus(HttpStatus.UNAUTHORIZED.value());
            apiResult.setMessage(message);
            return ResponseEntity.ok(apiResult);
        }

        // Yukarıdakilerden herhangi bir sıkıntı söz konusu değilse
        AddressDto addressDtoFind = (AddressDto) addressService.addressServiceFindById(id);
        return ResponseEntity.ok(addressDtoFind);
    }

    // http://localhost:4444/api/address/update/1
    // UPDATE
    @PutMapping(value ={"/update/", "/update/{id}"})
    @Override
    public ResponseEntity<?> addressApiUpdate(
            @PathVariable(name = "id", required = false) Long id,
            @Valid @RequestBody AddressDto addressDto) {
        return  ResponseEntity.ok(addressService.addressServiceUpdate(id, addressDto));
    }


    // http://localhost:4444/api/address/delete/id
    // DELETE BY ID
    @DeleteMapping(value ={"/delete/", "/delete/{id}"})
    @Override
    public ResponseEntity<?> addressApiDeleteById(@PathVariable(name = "id", required = false)  Long id) {
        return ResponseEntity.ok(addressService.addressServiceDeleteById(id));
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    // PAGING AND SORTING

    // PAGINATION
    // http://localhost:4444/api/address/pagination?currentPage=0&pageSize=3  => 1.sayfada bana 3 tane veri göster
    // currentPage=0 demek ilk sayfa demektir
    @Override
    @GetMapping(value ="/pagination")
    public ResponseEntity<Page<?>> addressServicePagination(
           @RequestParam(name = "currentPage", required = false, defaultValue = "0") int currentPage,
           @RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) {
        return  ResponseEntity.ok(addressService.addressServicePagination(currentPage, pageSize));
    }


    // SORTING BELLI SUTUNA GÖRE
    // http://localhost:4444/api/address/sorting?sortBy=addressEntityEmbeddable.street
    // http://localhost:4444/api/address/sorting?sortBy=addressEntityEmbeddable.state
    // http://localhost:4444/api/address/sorting?sortBy=addressEntityEmbeddable.city
    // Adres Entityden belirli sutununa göre Sıramalama
    // NOT: Embeddable Entity verileri aldığımdan dolayı aşağıdaki gibi çağırmak zorundayım
    /*
    addressDetails.doorNumber, addressDetails.street, paddressDetails.avenue, addressDetails.city, addressDetails.zipCode
    addressDetails.addressQrCode, addressDetails.state, addressDetails.description
     */
    @GetMapping(value ="/sorting")
    @Override
    public ResponseEntity<List<?>> addressServiceAllSortedBy(
            @RequestParam(name = "sortBy", required = false, defaultValue = "addressEntityEmbeddable.city")  String sortedBy
    ) {
        return ResponseEntity.ok(addressService.addressServiceAllSortedBy(sortedBy));
    }


    // SORTING ASC
    // http://localhost:4444/api/address/sorting/city/asc
    // Default Olarak Addres Entityden Şehire göre Küçükten Büyüğe Doğru Sıralama
    @GetMapping(value ="/sorting/city/asc")
    @Override
    public ResponseEntity<List<?>> addressServiceAllSortedByCityAsc() {
        return ResponseEntity.ok(addressService.addressServiceAllSortedByCityAsc());
    }


    // SORTING DESC
    // http://localhost:4444/api/address/sorting/city/desc
    // Default Olarak Addres Entityden Şehire göre Büyükten Küçüğe Doğru Sıralama
    @GetMapping(value ="/sorting/city/desc")
    @Override
    public ResponseEntity<List<?>> addressServiceAllSortedByCityDesc() {
        return ResponseEntity.ok(addressService.addressServiceAllSortedByCityDesc());
    }

} //end AddressApiImpl