package com.nagarro.model;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "http://localhost:4200")
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{

	Registration findByEmail(String email);

	Registration findTopByOrderByIdDesc();
	@Transactional
    @Modifying
	@Query(value="UPDATE user u SET PASSWORD =:pass WHERE u.EMAIL =:email",nativeQuery=true)
	void updateUser(@Param("pass") String password, @Param("email") String email);
	
	@Query(value="SELECT u.password fROM user u WHERE u.Email=:email",nativeQuery=true)
	String getPass(@Param("email")String email);

}
