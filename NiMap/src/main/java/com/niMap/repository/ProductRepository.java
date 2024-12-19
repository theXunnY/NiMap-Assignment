package com.niMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.niMap.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	@Query("SELECT p FROM Product p JOIN FETCH p.category WHERE p.id = :id")
    Product findByIdWithCategory(Long id);
	
}
