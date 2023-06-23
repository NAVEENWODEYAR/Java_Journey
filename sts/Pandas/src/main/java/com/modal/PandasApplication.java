package com.modal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PandasApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(PandasApplication.class, args);
		System.out.println("Pandas started..,");
	}

}
