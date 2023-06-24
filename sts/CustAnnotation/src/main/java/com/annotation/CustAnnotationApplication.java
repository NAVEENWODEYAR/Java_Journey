package com.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustAnnotationApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(CustAnnotationApplication.class, args);
		System.out.println("Spring started..,");
	}

}
