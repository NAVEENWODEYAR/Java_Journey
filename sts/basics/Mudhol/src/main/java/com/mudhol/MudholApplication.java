package com.mudhol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MudholApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(MudholApplication.class, args);
		System.out.println("Started the app..,.,");
	}

}
