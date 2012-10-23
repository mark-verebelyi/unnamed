package hu.shining.unnamed.core.security.repository;

import hu.shining.unnamed.core.security.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
