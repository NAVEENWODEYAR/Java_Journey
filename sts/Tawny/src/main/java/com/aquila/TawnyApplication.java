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
						title = "Tawny_SpringBoot Application",
						version = "3.0.0",
						description = "API Documentation,",
						termsOfService = "Testing the REST API",
						contact = @Contact(
											name = "Boss",
											email = "boss@boss.org"),
						license = @License(
											name = "Boss",
											url = "https://en.wikipedia.org/wiki/Tawny_eagle")))
public class TawnyApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(TawnyApplication.class, args);
		System.out.println("Flying towards target");
	}

}
