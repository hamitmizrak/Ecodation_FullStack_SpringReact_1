package com.hamitmizrak.business.mapper;

import com.hamitmizrak.business.dto.AddressDto;
import com.hamitmizrak.data.embeddable.AddressEntityEmbeddable;
import com.hamitmizrak.data.entity.AddressEntity;

public class CustomerMapper {

    // Address Entity To Dto
    public static AddressDto AddressEntityToDto(AddressEntity addressEntity) {
        // Instance (AddressDto)
        AddressDto addressDto = new AddressDto();

        // ID
        addressDto.setId(addressEntity.getId());
        addressDto.setSystemCreatedDate(addressEntity.getSystemCreatedDate());

        if (addressEntity.getAddressEntityEmbeddable() != null) {
            AddressEntityEmbeddable addressEntityEmbeddable = addressEntity.getAddressEntityEmbeddable();
            addressDto.setState(addressEntityEmbeddable.getState());
            addressDto.setCity(addressEntityEmbeddable.getCity());
            addressDto.setAddressQrCode(addressEntityEmbeddable.getAddressQrCode());
            addressDto.setStreet(addressEntityEmbeddable.getStreet());
            addressDto.setZipCode(addressEntityEmbeddable.getZipCode());
            addressDto.setDescription(addressEntityEmbeddable.getDescription());
            addressDto.setDoorNumber(addressEntityEmbeddable.getDoorNumber());
        }
        return addressDto;
    }

    // Address Dto To Entity
    public static AddressEntity AddressDtoToEntity(AddressDto addressDto) {
        // Instance (AddressDto)
        AddressEntity addressEntity = new AddressEntity();

        // ID
        addressEntity.setId(addressDto.getId());
        AddressEntityEmbeddable addressEntityEmbeddable = new AddressEntityEmbeddable();
        addressEntity.setSystemCreatedDate(addressDto.getSystemCreatedDate());
        addressEntityEmbeddable.setState(addressDto.getState());
        addressEntityEmbeddable.setCity(addressDto.getCity());
        addressEntityEmbeddable.setStreet(addressDto.getStreet());
        addressEntityEmbeddable.setZipCode(addressDto.getZipCode());
        addressEntityEmbeddable.setAddressQrCode(addressDto.getAddressQrCode());
        addressEntityEmbeddable.setDescription(addressDto.getDescription());
        addressEntityEmbeddable.setDoorNumber(addressDto.getDoorNumber());

        // AdressDetails'i AdressEntity Ekle
        addressEntity.setAddressEntityEmbeddable(addressEntityEmbeddable);

        return addressEntity;
    }
}
