package com.jneneve.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jneneve.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
