package com.john.springsecdemo.dao;
import com.john.springsecdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
