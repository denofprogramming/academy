package com.denofprogramming.repository;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.denofprogramming.model.User;

@Component
public class UserRepository implements UserRepositoryInterface{

	
	private static final Logger logger = Logger.getLogger("com.denofprogramming.repository.UserRepository");
	
	@Override
	public User read(User domain) {
		logger.info("Entered UserRepository->read with:" + domain);
		
		final User newUser = new User();
		newUser.setId(domain.getId());
		newUser.setName("Jack Sparrow");
		newUser.setAge(30);
		
		logger.info("Exiting UserRepository->read with:" + newUser);
		return newUser;
	}

	@Override
	public User update(User domain) {		
		return null;
	}

	

}
