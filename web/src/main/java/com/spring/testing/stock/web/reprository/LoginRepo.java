package com.spring.testing.stock.web.reprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.testing.stock.web.dao.User;

public interface LoginRepo extends JpaRepository<User, Integer>{

}
