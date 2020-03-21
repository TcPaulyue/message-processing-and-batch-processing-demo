package com.demo.messageprocess;

import com.demo.messageprocess.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    List<User> findAllByUserGroup(String userGroup);
}
