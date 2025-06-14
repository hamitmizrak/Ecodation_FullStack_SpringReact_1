package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// CrudRepository<ProductEntity, Long>
// PagingAndSortingRepository<ProductEntity, Long>

@Repository
public interface IOrderRepository extends JpaRepository<OrderEntity, Long> {
    // Delivered Query
    // Named Query
    // JPQL
    // Native Query
}
