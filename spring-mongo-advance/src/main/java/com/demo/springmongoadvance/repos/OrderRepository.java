package com.demo.springmongoadvance.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.demo.springmongoadvance.entity.User;

public interface OrderRepository extends MongoRepository<User, Integer>{

	List<User> findByName(String name);
	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);

}
