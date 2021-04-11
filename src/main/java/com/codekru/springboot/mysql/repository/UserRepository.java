package com.codekru.springboot.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codekru.springboot.mysql.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
