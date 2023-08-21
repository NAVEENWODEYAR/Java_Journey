package com.aquila;

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
public class TawnyApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(TawnyApplication.class, args);
		System.out.println("Flying towards target");
	}

}
