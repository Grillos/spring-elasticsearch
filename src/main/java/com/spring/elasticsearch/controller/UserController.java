package com.spring.elasticsearch.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.elasticsearch.domain.User;
import com.spring.elasticsearch.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;
	 
    @GetMapping
    public Collection<User> findAll() {
    	return userService.findAll();
    }
    
}
