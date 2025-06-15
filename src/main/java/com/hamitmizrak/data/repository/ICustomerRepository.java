package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// CrudRepository<CustomerEntity, Long>
// PagingAndSortingRepository<CustomerEntity, Long>

@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {
    // Delivered Query
    // Named Query
    // JPQL
    // Native Query
}
