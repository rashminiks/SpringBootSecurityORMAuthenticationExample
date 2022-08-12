package com.springsecurity.examples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.examples.Entity.User;

public interface UserRepository extends JpaRepository<User , Integer>{
	

}
