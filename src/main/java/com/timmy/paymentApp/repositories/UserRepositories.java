package com.timmy.paymentApp.repositories;

import com.timmy.paymentApp.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositories extends MongoRepository<User, String> {
    Optional<User> findUserByEmail(String email);
}
