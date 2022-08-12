package com.springsecurity.examples.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.examples.Entity.User;
import com.springsecurity.examples.repo.UserRepository;
import com.springsecurity.examples.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepository  repo;

	@Override
	public Integer saveUser(User user) {
		user=repo.save(user);
		return user.getUid();
	}
	
	

}
