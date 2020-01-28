package com.spring.elasticsearch.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(indexName = "users", type = "user")
public class User {

    private Long id;
	private String username;
	private String password;
	
}
