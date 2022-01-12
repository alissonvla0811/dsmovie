package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
