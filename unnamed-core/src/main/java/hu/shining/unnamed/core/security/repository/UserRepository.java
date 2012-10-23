package hu.shining.unnamed.core.security.repository;

import hu.shining.unnamed.core.security.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends MongoRepository<User, String> {

	User findByUsername(@Param("username") String username);

}
