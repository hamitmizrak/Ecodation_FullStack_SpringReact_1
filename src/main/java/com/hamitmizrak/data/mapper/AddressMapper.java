package com.hamitmizrak.data.mapper;

import com.hamitmizrak.business.dto.AddressDto;
import com.hamitmizrak.data.embeddable.EmbeddableAddressEntity;
import com.hamitmizrak.data.entity.AddressEntity;

public class AddressMapper {

    // 1-) AddressEntity'i => AddressDto Çevirmek
    public static AddressDto AddressEntityToAddressDto(AddressEntity addressEntity) {

        // Instance (AddressDto)
        AddressDto addressDto = new AddressDto();

        // Embeddable
        EmbeddableAddressEntity addressDetailsDto;

        // Common BaseDto için
        addressDto.setId(addressEntity.getId());
       // addressDto.setSystemCreatedDate(addressEntity.getSystemCreatedDate());
        addressDto.setIsDeleted(addressEntity.getIsDeleted());
        addressDto.setVersion(addressEntity.getVersion());

        // Auditing
        addressDto.setCreatedBy(addressEntity.getCreatedBy());
        addressDto.setCreatedDate(addressEntity.getCreatedDate());
        //addressDto.setLastModifiedBy(addressEntity.getLastModifiedBy());
        //addressDto.setLastModifiedDate(addressEntity.getLastModifiedDate());

        // Embeddable
        if(addressEntity.getAddressEntityEmbeddable() != null){
             addressDetailsDto = addressEntity.getAddressEntityEmbeddable();
             //Embeddable Set
            addressDto.setDoorNumber(addressDetailsDto.getDoorNumber());
            addressDto.setZipCode(addressDetailsDto.getZipCode());
            addressDto.setStreet(addressDetailsDto.getStreet());
            addressDto.setAddressQrCode(addressDetailsDto.getAddressQrCode());
            addressDto.setDescription(addressDetailsDto.getDescription());
            addressDto.setCity(addressDetailsDto.getCity());
            addressDto.setState(addressDetailsDto.getState());
        }
        return addressDto;
    }


    // 2-) AddressDto'u => AddressEntity  Çevirmek
    public static AddressEntity AddressDtoToAddressEntity(AddressDto addressDto) {

        // Instance (AddressEntity)
        AddressEntity addressEntity = new AddressEntity();

        // Embeddable
        EmbeddableAddressEntity addressDetailsEntity=new EmbeddableAddressEntity();

        // Common BaseDto için
        addressDto.setId(addressDto.getId());
        addressDto.setSystemCreatedDate(addressDto.getSystemCreatedDate());
        addressDto.setIsDeleted(addressDto.getIsDeleted());
        addressDto.setVersion(addressDto.getVersion());

        // Auditing
        addressDto.setCreatedBy(addressDto.getCreatedBy());
        addressDto.setCreatedDate(addressDto.getCreatedDate());
        //addressDto.setLastModifiedBy(addressDto.getLastModifiedBy());
        //addressDto.setLastModifiedDate(addressDto.getLastModifiedDate());

        // Embeddable
            //Embeddable Set
        addressDetailsEntity.setDoorNumber(addressDto.getDoorNumber());
        addressDetailsEntity.setZipCode(addressDto.getZipCode());
        addressDetailsEntity.setStreet(addressDto.getStreet());
        addressDetailsEntity.setAddressQrCode(addressDto.getAddressQrCode());
        addressDetailsEntity.setDescription(addressDto.getDescription());
        addressDetailsEntity.setCity(addressDto.getCity());
        addressDetailsEntity.setState(addressDto.getState());

        // Dikkat: AddressEntity içerisine Embedable Set Etmelisiniz.
        addressEntity.setAddressEntityEmbeddable(addressDetailsEntity);

        return addressEntity;
    } //end AddressDtoToAddressEntity
} //end AddressMapper
