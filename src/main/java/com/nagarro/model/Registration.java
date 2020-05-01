package com.nagarro.model;

import java.nio.charset.Charset;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user")
public class Registration {
	
	@Id
	@GeneratedValue
	private int id;
	private static String password = randomPass(8);
	private String firstName;
	private String lastName;
	private String businessUnit;
	private String title;
	private String email;
	private String telephone;
	private String add1;
	private String add2;
	private String city;
	private String state;
	private String zip;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String randomPass(int len) {

		    String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    Random rnd = new Random();

		    StringBuilder sb = new StringBuilder(len);
		    for (int i = 0; i < len; i++) {
		        sb.append(AB.charAt(rnd.nextInt(AB.length())));
		    }
		    return sb.toString();
		}
	
	
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", businessUnit="
				+ businessUnit + ", title=" + title + ", email=" + email + ", telephone=" + telephone + ", add1=" + add1
				+ ", add2=" + add2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
				+ "]";
	}
	
	
	
	
	

}
