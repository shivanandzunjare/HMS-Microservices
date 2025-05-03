package com.cws.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cws.entities.User;

public interface UserRepo extends JpaRepository<User, String>{

}
