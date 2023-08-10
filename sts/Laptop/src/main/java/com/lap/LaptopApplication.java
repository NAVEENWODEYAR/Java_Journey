package com.lap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
						title = "LapTop",
						version = "2.0.0",
						description = "API Documentation,",
						termsOfService = "Test the API",
						contact = @Contact(
											name = "Boss",
											email = "boss@boss.org"),
						license = @License(
											name = "Boss",
											url = "@BOSS@")))
public class LaptopApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(LaptopApplication.class, args);
	}

}
