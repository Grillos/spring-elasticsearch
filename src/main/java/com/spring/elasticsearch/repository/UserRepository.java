package com.spring.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.spring.elasticsearch.domain.User;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, Long>  {

}