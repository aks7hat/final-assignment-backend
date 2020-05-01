package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.nagarro.model.Registration;

@Service
public class NotificationService {
	
	private JavaMailSenderImpl mail;
	
	@Autowired
	public NotificationService(JavaMailSenderImpl mail) 
	{
		this.mail = mail;
		
	}
	public void sendNotification(Registration registration) throws MailException
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(registration.getEmail());
		message.setFrom("aks07hataggarwal");
		message.setSubject("Nagarro Travel portal Information");
		message.setText("Hi " + registration.getFirstName() + " Your username is " + registration.getEmail() + " and the password is " + registration.getPassword());
		
		mail.send(message);
	}
	
	public String forgotPasswordMail(String email) throws MailException
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setFrom("aks07hataggarwal");
		message.setSubject("Forgot password Request");
		String pass = Registration.getPassword();
		message.setText("You have requested your user name and password for the your access to the Nagarro Travel Portal:....Your password is->" + pass);
		
		
		mail.send(message);
		return pass;
		
	}

}
