package com.jneneve.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jneneve.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
