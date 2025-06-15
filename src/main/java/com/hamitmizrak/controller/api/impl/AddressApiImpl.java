package com.hamitmizrak.controller.api.impl;

import com.hamitmizrak.business.dto.AddressDto;
import com.hamitmizrak.business.services.interfaces.IAddressService;
import com.hamitmizrak.controller.api.interfaces.IAddressApi;
import com.hamitmizrak.error.ApiResult;
import com.hamitmizrak.error.GHandleApiresult;
import com.hamitmizrak.exception.HamitMizrakException;
import com.hamitmizrak.exception._400_BadRequestException;
import com.hamitmizrak.utily.FrontEnd;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
Status Code
CREATE	201 Created	Yeni kaynak başarıyla oluşturuldu.

LIST	200 OK	Kaynaklar başarıyla listelendi.

UPDATE	200 OK	Güncellenen kaynak döndürüldü.
        204 No Content	Güncelleme başarılı, ancak yanıt yok.

DELETE	204 No Content	Başarıyla silindi, ancak yanıt yok.
        200 OK	Silme işlemi başarılı, bilgi döndürüldü.
 */

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// API: Dış dünyaya bağlantı kuran yer
@RestController
@RequestMapping("/api/address/")
//@CrossOrigin
//@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = FrontEnd.REACT_URL)
@CrossOrigin(origins = {FrontEnd.REACT_URL, FrontEnd.ANGULAR_URL})
public class AddressApiImpl implements IAddressApi<AddressDto> {

    // Injection
    private final IAddressService iAddressService;
    private final MessageSource messageSource;
    private final GHandleApiresult gHandleApiresult;

    // Api Result
    private ApiResult apiResult = new ApiResult();

    ////////////////////////////////////////////////////////////////////////////////////////
    // CRUD
    // CREATE (Address)
    // http://localhost:4444/api/address/create
    @Override
    @PostMapping("/create")
    public ResponseEntity<?> objectApiCreate(@Valid @RequestBody AddressDto addressDto) {
        return gHandleApiresult.genericsMethod(
                "api/address/create",
                201,
                500,
                () -> iAddressService.objectServiceCreate(addressDto));
    }

    // LIST (Address)
    // http://localhost:4444/api/address//list
    @Override
    @GetMapping("/list")
    public ResponseEntity<List<AddressDto>> objectApiList() {
        return ResponseEntity.ok(iAddressService.objectServiceList());
    }

    // FIND BY ID (Address)
    // http://localhost:4444/api/address/find
    // http://localhost:4444/api/address/find/0
    // http://localhost:4444/api/address/find/-1
    // http://localhost:4444/api/address/find/%20%  %20%=boşluk
    // http://localhost:4444/api/address/find/1
    @Override
    @GetMapping({"/find/", "/find/{id}"})
    public ResponseEntity<?> objectApiFindById(@PathVariable(name = "id", required = false) Long id) {
        if (id == null) {
            throw new NullPointerException("Null pointer exception: Null değer");
        } else if (id == 0) {
            throw new _400_BadRequestException("Bad Request Exception: Kötü istek");
        } else if (id < 0) {
            throw new HamitMizrakException("unauthorized: Yetkisiz Giriş");
        }
        return gHandleApiresult.genericsMethod(
                "api/address/find",
                200,
                500,
                () -> iAddressService.objectServiceFindById(id));
    }

    // UPDATE (Address)
    // http://localhost:4444/api/address/update/1
    @Override
    @PutMapping({"/update/", "/update/{id}"})
    public ResponseEntity<?> objectApiUpdate(
            @PathVariable(name = "id", required = false) Long id,
            @Valid @RequestBody AddressDto addressDto) {
        return gHandleApiresult.genericsMethod(
                "api/address/update",
                201,
                500,
                () -> iAddressService.objectServiceUpdate(id, addressDto));
    }

    // DELETE BY ID (Address)
    // http://localhost:4444/api/address/delete/1
    @Override
    @DeleteMapping({"/delete/", "/delete/{id}"})
    public ResponseEntity<?> objectApiDelete(@PathVariable(name = "id", required = false) Long id) {
        return gHandleApiresult.genericsMethod(
                "api/address/delete",
                200,
                500,
                () -> iAddressService.objectServiceDelete(id));
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    // PAGINATION/SORTING
    /*
     PathVariable ve RequestParam Arasındaki Farklar

    | Özellik             | @PathVariable                                         | @RequestParam                                   |
    |-------------------- |-------------------------------------------------------|----------------------------------------------------|
    | Amaç                | URL yolundaki bir parametreyi alır.                   | Sorgu parametrelerini (query parameters) alır.     |
    | Kullanım Yeri       | URL'nin bir parçası olarak tanımlanır.                | URL'deki `?` işaretinden sonra gelen parametrelerle çalışır. |
    | URL Örneği          | `/api/users/{id}`                                     | `/api/users?name=Hamit`                             |
    | Tanımlama Şekli     | `@PathVariable("id") Long id`                         | `@RequestParam("name") String name`               |
    | Zorunluluk          | Varsayılan olarak zorunludur (opsiyonel yapılabilir). | Varsayılan olarak zorunludur (opsiyonel yapılabilir).|
    | Çoklu Değerler      | Sadece tek bir değer alır.                            | Birden fazla parametreyi kolayca alabilir.         |

     Örnekler
     @PathVariable Kullanımı
    URL: `/api/users/123`

    @GetMapping("/api/users/{id}")
    public ResponseEntity<String> getUserById(@PathVariable("id") Long id) {
        return ResponseEntity.ok("User ID: " + id);
    }

    @RequestParam Kullanımı
    URL: `/api/users?name=Hamit`


    @GetMapping("/api/users")
    public ResponseEntity<String> getUserByName(@RequestParam("name") String name) {
        return ResponseEntity.ok("User Name: " + name);
    }
    ---

     Temel Fark
    - @PathVariable, dinamik bir URL'nin bir parçasını temsil eder.
    - @RequestParam, sorgu parametrelerini alır ve genelde isteğe bağlı parametreler için kullanılır.

    Hangi Durumda Kullanılır?
    - @PathVariable: Kaynak kimliğini veya bir URL'nin parçasını almak için.
    - @RequestParam: Filtreleme, sıralama veya arama gibi isteğe bağlı parametrelerle çalışmak için.
  */
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // PAGINATION
    // 1.sayfada 4 tane veri getir.
    // http://localhost:4444/api/address/pagination?current_page=0&page_size=4
    @Override
    @GetMapping(value = "/pagination")
    public ResponseEntity<Page<?>> objectServicePagination(
            @RequestParam(name = "current_page", required = false, defaultValue = "0") int currentPage,
            @RequestParam(name = "page_size", required = false, defaultValue = "0") int pageSize
    ) {
        return ResponseEntity.ok(iAddressService.objectServicePagination(currentPage, pageSize));
    }

    // SORTING (Belli Sutuna göre)
    // Dikkat: Embedded için gerekli Entity ismini yanlış yazma
    // @Embedded
    // private AddressEntityDetailsEmbeddable detailsEmbeddable;
    // http://localhost:4444/api/address/sorting?sorted_by=detailsEmbeddable.city
    // http://localhost:4444/api/address/sorting?sorted_by=detailsEmbeddable.state
    // http://localhost:4444/api/address/sorting?sorted_by=detailsEmbeddable.street
    @Override
    @GetMapping(value = "/sorting")
    public ResponseEntity<List<AddressDto>> objectServiceListSortedBy(
            @RequestParam(name = "sorted_by", required = false, defaultValue = "detailsEmbeddable.city") String sortedBy
    ) {
        return ResponseEntity.ok(iAddressService.objectServiceListSortedByDefault(sortedBy));
    }

    // SORTING ASC (Küçükten büyüğe doğru)
    // http://localhost:4444/api/address/sorting/city/asc
    @Override
    @GetMapping(value = "/sorting/city/asc")
    public ResponseEntity<List<AddressDto>> objectServiceListSortedByAsc() {
        return ResponseEntity.ok(iAddressService.objectServiceListSortedByAsc());
    }

    // SORTING DESC (Büyükten küçüğe doğru)
    // http://localhost:4444/api/address/sorting/city/desc
    @Override
    @GetMapping(value = "/sorting/city/desc")
    public ResponseEntity<List<AddressDto>> objectServiceListSortedByDesc() {
        return ResponseEntity.ok(iAddressService.objectServiceListSortedByDesc());
    }

} // end AddressApiImpl
