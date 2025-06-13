package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.AddressEntity;
import com.hamitmizrak.data.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// CrudRepository<AddressEntity, Long>
// PagingAndSortingRepository<AddressEntity, Long>

@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {
    // Delivered Query
    // Named Query
    // JPQL
    // Native Query
}
