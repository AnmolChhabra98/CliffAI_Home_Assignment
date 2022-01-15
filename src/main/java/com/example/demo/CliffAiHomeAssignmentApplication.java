package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class CliffAiHomeAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliffAiHomeAssignmentApplication.class, args);
	}
	
	@Bean
	public OpenAPI springOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Cliff.ai take home assignment by Anmol Chhabra")
						.description("INTRODUCING World's first Business Reliability Platform Things break. We ensure that your team is the first to know and the first to solve.")
						.version("v0.0.1"));
	}
}
