package com.spring.elasticsearch.service;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.elasticsearch.domain.User;
import com.spring.elasticsearch.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Collection<User> findAll() {
		
		return stream(userRepository.findAll().spliterator(), false).collect(toList());
	}


}
