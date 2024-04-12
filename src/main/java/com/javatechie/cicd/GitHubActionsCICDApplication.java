package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionsCICDApplication {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello from Sample CI/CD application.";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsCICDApplication.class, args);
	}

}
