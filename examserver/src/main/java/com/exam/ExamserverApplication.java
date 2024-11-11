package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{

	
//	@Autowired
//	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
//		User user=new User();
//		user.setFirstname("Ravi");
//		user.setLastname("Prajapati");
//		user.setUsername("arman22");
//		user.setPassword("ravipooja");
//		user.setEmail("ravi@gmail.com");
//		user.setProfile("ravi.png");
//		
//		Role role1= new Role();
//		role1.setroleId(44L);
//		role1.setRoleName("admin");
//		
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		
//		this.userService.createUser(user, userRoleSet);
		
	}

}
