package com.jneneve.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jneneve.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
