package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.model.Registration;
import com.nagarro.model.RegistrationRepository;

import java.util.*;

@Service
public class RegService {
	
	@Autowired
	private RegistrationRepository repo;
	
	
	public Registration saveUser(Registration registration)
	{
		
		return repo.save(registration);
		
	}
	
	public List<Registration> saveUsers(List<Registration> registrations)
	{
		
		return (List<Registration>) repo.saveAll(registrations);
		
	}

	public Registration getUsersByEmail(String email)
	{
		
		Registration registration = new Registration();
		//Registration existinguser = 
		return repo.findByEmail(email);
//		int id =  existinguser.getId();
//		System.out.println(id);
//		return repo.getPass(id);
//		
		
	}

	public Registration updateProduct(Registration registration)
	{
		Registration existinguser = repo.findByEmail(registration.getEmail());
		existinguser.setFirstName(registration.getFirstName());
		existinguser.setLastName(registration.getLastName());
		existinguser.setBusinessUnit(registration.getBusinessUnit());
		existinguser.setTitle(registration.getTitle());
		existinguser.setEmail(registration.getEmail());
		existinguser.setTelephone(registration.getTelephone());
		existinguser.setAdd1(registration.getAdd1());
		existinguser.setAdd2(registration.getAdd2());
		existinguser.setCity(registration.getCity());
		existinguser.setState(registration.getState());
		existinguser.setZip(registration.getZip());
		existinguser.setCountry(registration.getCountry());
		
		
		return repo.save(existinguser);
	}
	
	public Registration getUsersById()
	{
		
		return repo.findTopByOrderByIdDesc();
		
	}

	public Registration updateEmail(String email , String pass)
	{
//		Registration registration = new Registration();
//		Registration existinguser = repo.findByEmail(email);
		System.out.println(email);
		repo.updateUser(pass, email);
		return null;
		
		
		
		
	}
	

}
