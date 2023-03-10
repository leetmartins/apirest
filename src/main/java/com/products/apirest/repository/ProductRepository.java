package com.products.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.apirest.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	Product findById(long id);
}
