package com.dabur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.dabur.controller"})
public class DaburApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(DaburApplication.class, args);
		System.out.println("Spring started,,");
	}

}
