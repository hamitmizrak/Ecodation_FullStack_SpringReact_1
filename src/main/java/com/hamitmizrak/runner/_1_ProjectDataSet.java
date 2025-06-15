package com.hamitmizrak.runner;

import com.hamitmizrak.business.dto.AddressDto;
import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.business.dto.OrderDto;
import com.hamitmizrak.business.dto.ProductDto;
import com.hamitmizrak.business.services.IAddressService;
import com.hamitmizrak.business.services.ICustomerService;
import com.hamitmizrak.business.services.IOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// DATA SET
@Component

// Birden fazla CommandLineRunner varsa, hangi sırayla çalışacaklarını belirlemek için @Order anotasyonu kullanılabilir:
@Order(1)
public class _1_ProjectDataSet implements CommandLineRunner {

    // Injection
    private final IAddressService iAddressService;
    private final ICustomerService iCustomerService;
    private final IOrderService iOrderService;

    // AddressDto List Save
    private List<AddressDto> addressSave(){
        List<AddressDto> addressDtoList = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            AddressDto addressDto = new AddressDto();
            addressDto.setCity("İl "+i);
            addressDto.setDescription("tanımlama "+i);
            addressDto.setStreet("cadde "+i);
            addressDto.setState("state "+i);
            addressDto.setZipCode("zip code "+i);
            addressDto.setDoorNumber("door number "+i);
            addressDto.setAddressQrCode(UUID.randomUUID().toString());
            iAddressService.addressServiceCreate(addressDto);
            addressDtoList.add(addressDto);
        }
        return addressDtoList;
    }

    // Address Save
    private AddressDto saveAddress(){
        AddressDto addressDto = new AddressDto();
        addressDto.setCity("Hatay ");
        addressDto.setDescription("tanımlama ");
        addressDto.setStreet("cadde ");
        addressDto.setState("state ");
        addressDto.setZipCode("zip code ");
        addressDto.setDoorNumber("door number ");
        addressDto.setAddressQrCode(UUID.randomUUID().toString());
        return addressDto;
    }

    // Customer Save
    private CustomerDto saveCustomer(){
        // Address Dto Save
        AddressDto addressDto = saveAddress();

        // Customer Dto Save
        CustomerDto customerDto = new CustomerDto();
        customerDto.setFirstName("Müşteri Adı");
        customerDto.setLastName("Müşteri Soyadı");
        customerDto.setNotes("Müşteri Notes");

        // Composition
        customerDto.setAddressDto(addressDto);

        // Save
        //iCustomerService.customerServiceCreate(customerDto);
        //System.out.println(customerDto);
        return customerDto;
    }

    // 2 TANE ÜRÜN EKLE
    private ProductDto[] productSave(){
        System.out.println("###############################################");
        log.info("Product Verileri Kaydediliyor");
        System.out.println("Product Verileri Kaydediliyor");

        // Dizi Tanımla
        ProductDto[] productDtoArray = new ProductDto[2];

        // Ürün 1
        ProductDto productDto1 = new ProductDto();
        productDto1.setName("Masaüstü");
        productDto1.setCode("code 10");

        // Ürün 1
        ProductDto productDto2 = new ProductDto();
        productDto2.setName("Laptop");
        productDto2.setCode("code 15");

        // Diziye Ekle
        productDtoArray[0]=productDto1;
        productDtoArray[1]=productDto2;
        return productDtoArray;
    }

    // SİPARİŞ EKLE
    private OrderDto orderSave(){
        System.out.println("###############################################");
        log.info("Order Verileri Kaydediliyor");
        System.out.println("Order Verileri Kaydediliyor");

        // Order Instance
        OrderDto orderDto = new OrderDto();
        orderDto.setName("Kahvaltı");
        orderDto.setPrice("price-1");

        // Composition (Müşteri Ekle ve zaten Müşteride Adress vardı)
        // Customer, Adres'i Composition ekliyor
        // Order, Customer'ı Composition olarak ekliyor.
        orderDto.setCustomerDto(saveCustomer());
        orderDto.setOrderProductDtoList(Arrays.asList(productSave()[0],productSave()[1]));

        // Database Kaydetmek
        OrderDto orderDtoSaved = (OrderDto) iOrderService.orderServiceCreate(orderDto);
        System.out.println(orderDtoSaved);
        return orderDto;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Project Data set -1 ");
        log.info("Project Data set -1 ");
        //addressSave();
        //saveCustomer();
        // Order Kaydet
        OrderDto orderProductCustomerAddressSaved= orderSave();
        System.out.println(orderProductCustomerAddressSaved);
    }
}
