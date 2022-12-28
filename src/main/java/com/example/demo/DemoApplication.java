package com.example.demo;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.IUserRepository;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@Configuration
public class DemoApplication {
//	private IUserRepository userRepository;
//	private PasswordEncoder encoder;
//	public DemoApplication(IUserRepository userRepository, PasswordEncoder passwordEncoder){
//		this.userRepository = userRepository;
//		this.encoder = passwordEncoder;
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


//	@Override
//	public void run(String... args) throws Exception {
//		UserEntity userEntity = new UserEntity().builder()
//												.username("user")
//												.password(encoder.encode("userPass"))
//												.build();
//		userRepository.save(userEntity);
//		System.out.println(userEntity.toString());
//	}
}
