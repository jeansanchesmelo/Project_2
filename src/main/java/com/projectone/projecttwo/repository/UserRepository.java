package com.projectone.projecttwo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.projectone.projecttwo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
