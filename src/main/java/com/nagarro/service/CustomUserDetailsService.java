package com.nagarro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nagarro.model.Registration;
import com.nagarro.model.RegistrationRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private RegistrationRepository repo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Registration registration = repo.findByEmail(email);
		return new org.springframework.security.core.userdetails.User(registration.getEmail(), repo.getPass(email), new ArrayList<>());
	}

}
