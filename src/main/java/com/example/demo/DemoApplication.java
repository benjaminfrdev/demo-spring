package com.example.demo;

import com.example.demo.dto.User;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class DemoApplication implements CommandLineRunner {

	@Autowired
	IUserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// Khi chuong trinh chay thi insert mot user vao csdl
		UserEntity user = new UserEntity();
		user.setUsername("ben");
		user.setPassword(passwordEncoder.encode("benpsw"));
		userRepository.save(user);
		System.out.println(
				"user Created =" + user.toString()
		);
	}
}
