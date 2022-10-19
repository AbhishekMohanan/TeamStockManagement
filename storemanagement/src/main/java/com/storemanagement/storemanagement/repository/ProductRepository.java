package com.storemanagement.storemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storemanagement.storemanagement.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
