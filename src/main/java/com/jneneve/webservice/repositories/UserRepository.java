package com.jneneve.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jneneve.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
