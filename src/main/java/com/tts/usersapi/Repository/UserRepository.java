package com.tts.usersapi.Repository;

import com.tts.usersapi.Model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByState(String state);
}
    

