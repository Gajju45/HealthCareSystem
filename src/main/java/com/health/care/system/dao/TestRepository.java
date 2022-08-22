package com.health.care.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.care.system.dto.Test;

public interface TestRepository  extends JpaRepository<Test, Integer>{

}
