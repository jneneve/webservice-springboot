package com.jneneve.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jneneve.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
