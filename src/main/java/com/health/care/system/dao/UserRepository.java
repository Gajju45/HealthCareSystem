package com.health.care.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.care.system.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
