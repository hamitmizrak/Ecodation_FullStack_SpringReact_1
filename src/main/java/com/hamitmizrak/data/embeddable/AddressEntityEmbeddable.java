package com.hamitmizrak.data.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

// LOMBOK
@Getter
@Setter

// EMBEDDABLE
@Embeddable // Class Entity yapıları için daha okunaklı olması içindir
public class AddressEntityEmbeddable {

    // DOOR NUMBER
    @Column(name = "door_number")
    private String doorNumber;

    // STREET
    private String street;

    // CITY
    @Column(name = "city")
    private String city;


    // ZIP CODE
    @Column(name = "zip_code")
    private String zipCode;

    // STATE
    private String state;

    // ADDRESS QR CODE
    @Column(name = "address_qr_code")
    private String addressQrCode;

    // DESCRIPTION
    @Column(name = "description")
    private String description;
} //end AddressEntityEmbeddable


