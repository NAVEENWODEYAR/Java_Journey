package com.moviedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieDbApplication
{

	public static void main(String[] args)
	{
		System.out.println("Spring Started..,");
		SpringApplication.run(MovieDbApplication.class, args);
	}

}
