package com.example.User;

import com.example.User.appuser.AppUser;
import com.example.User.appuser.AppUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(AppUserRepository r) {
		return args -> {

			var users = r.findAll();
			System.out.println(users.toString());

		};
	}

}
