package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// CrudRepository<AddressEntity,Long>
// import org.springframework.data.repository.CrudRepository;

// PagingAndSortingRepository<AddressEntity,Long>
// import org.springframework.data.repository.PagingAndSortingRepository;


@Repository
public interface IAddressRepository extends JpaRepository<AddressEntity,Long> {

    // Delivered Query
     Optional<AddressEntity>  findAddressEntityByAddressEntityEmbeddable_AddressQrCode   (String qrCode);

    // JPQL
    // Native Query
}
