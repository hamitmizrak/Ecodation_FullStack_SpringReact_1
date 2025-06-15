package com.hamitmizrak.data.repository;


import com.hamitmizrak.data.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// CrudRepository<AddressEntity,Long>
// PagingAndSortingRepository<AddressEntity,Long>
// JpaRepository<AddressEntity,Long>

@Repository
public interface IAddressRepository extends JpaRepository<AddressEntity,Long> {

    /*
    Dikkat: IRepository Delivered Query için `detailsEmbeddable.address` şeklinde yazalır.
    @Embedded
    private AddressEntityDetailsEmbeddable detailsEmbeddable;
    */

    // Delivered Query
    // Embbedable ile çalıştığımızda underscore(_) eklenir.
    //Optional<AddressEntity> findAddressEntitiesByDetailsEmbeddableAddressQrCode (String qrCode);

    // JPQL
    // Native Query
    // Native SQL

}
