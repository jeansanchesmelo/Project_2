package com.projectone.projecttwo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.projectone.projecttwo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
