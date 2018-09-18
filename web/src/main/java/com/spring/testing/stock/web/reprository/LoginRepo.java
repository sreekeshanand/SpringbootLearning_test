package com.spring.testing.stock.web.reprository;

import org.springframework.data.repository.CrudRepository;

import com.spring.testing.stock.web.dao.User;

public interface LoginRepo extends CrudRepository<User, Integer>{

}
