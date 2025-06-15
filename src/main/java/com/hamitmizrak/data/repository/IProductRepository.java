package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// CrudRepository<ProductEntity, Long>
// PagingAndSortingRepository<ProductEntity, Long>

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity, Long> {
    // Delivered Query
    // Named Query
    // JPQL
    // Native Query
}
