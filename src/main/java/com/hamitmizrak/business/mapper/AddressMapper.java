package com.hamitmizrak.business.mapper;

import com.hamitmizrak.business.dto.AddressDto;
import com.hamitmizrak.data.embeddable.AddressEntityEmbeddable;
import com.hamitmizrak.data.entity.AddressEntity;

public class AddressMapper {

    // AddressEntity To Dto
    public static AddressDto AddressEntityToDto(AddressEntity addressEntity){

        // Instance (AddressDto)
        AddressDto addressDto=new AddressDto();

        // ID
        addressDto.setId(addressEntity.getId());
        addressDto.setSystemCreatedDate(addressEntity.getSystemCreatedDate());

        // Embeddable varsa
        if(addressEntity.getAddressEntityEmbeddable()!=null){
            AddressEntityEmbeddable addressEntityEmbeddable=addressEntity.getAddressEntityEmbeddable();
            addressDto.setState(addressEntityEmbeddable.getState());
            addressDto.setCity(addressEntityEmbeddable.getCity());
            addressDto.setAddressQrCode(addressEntityEmbeddable.getAddressQrCode());
            addressDto.setCountry(addressEntityEmbeddable.getCountry());
            addressDto.setStreet(addressEntityEmbeddable.getStreet());
            addressDto.setZipCode(addressEntityEmbeddable.getZipCode());
            addressDto.setDoorNumber(addressEntityEmbeddable.getDoorNumber());
            addressDto.setDescription(addressEntityEmbeddable.getDescription());
        }
        return addressDto;
    }

    // Dto  To AddressEntity
    public static AddressEntity AddressDtoToEntity(AddressDto addressDto){
        // Instance (AddressDto)
        AddressEntity addressEntity=new AddressEntity();

        // ID
        addressEntity.setId(addressDto.getId());
        addressEntity.setSystemCreatedDate(addressDto.getSystemCreatedDate());

        AddressEntityEmbeddable addressEntityEmbeddable=addressEntity.getAddressEntityEmbeddable();
        addressEntityEmbeddable.setState(addressEntityEmbeddable.getState());
        addressEntityEmbeddable.setCity(addressEntityEmbeddable.getCity());
        addressEntityEmbeddable.setAddressQrCode(addressEntityEmbeddable.getAddressQrCode());
        addressEntityEmbeddable.setCountry(addressEntityEmbeddable.getCountry());
        addressEntityEmbeddable.setStreet(addressEntityEmbeddable.getStreet());
        addressEntityEmbeddable.setZipCode(addressEntityEmbeddable.getZipCode());
        addressEntityEmbeddable.setDoorNumber(addressEntityEmbeddable.getDoorNumber());
        addressEntityEmbeddable.setDescription(addressEntityEmbeddable.getDescription());

        // AddressDetails'i mutlaka AddressEntity içine eklemeliyiz.
        addressEntity.setAddressEntityEmbeddable(addressEntityEmbeddable);

        return addressEntity;
    }

} // end AddressMapper
