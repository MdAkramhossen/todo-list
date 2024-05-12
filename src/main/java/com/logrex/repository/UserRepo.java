package com.logrex.repository;

import com.logrex.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String userName);
    boolean existsByEmail(String email);

    Optional<User> findByUserNameOrEmail(String userName,String email);

  boolean   existsByUserName(String userName);

}
