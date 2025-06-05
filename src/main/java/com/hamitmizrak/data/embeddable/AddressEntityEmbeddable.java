package com.hamitmizrak.data.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

// LOMBOK
@Getter
@Setter

// EMBEDDABLE
@Embeddable // Class Entity yapıları için daha okunaklı olması içindir
public class AddressEntityEmbeddable {

    // DOOR
    @Column(name = "door_number")
    private String doorNumber;

    // STREET
    private String street;

    // CITY
    private String city;

    // STATE
    private String state;

    // ZIP CODE
    @Column(name = "zip_code")
    private String zipCode;

    // ADDRESS QR CODE
    @Column(name = "address_qr_code")
    private String addressQrCode;

    // COUNTRY
    private String country;

    // DESCRIPTION
    private String description;
}
