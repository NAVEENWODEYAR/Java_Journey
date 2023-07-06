package com.bookstore.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bookstore.modal.BookStore;
import com.bookstore.service.BookStoreService;


//@Component
public class BookStoreRunner implements CommandLineRunner 
{

	// inject the object
	@Autowired
	BookStoreService bService;
	
		@Override
		public void run(String... args) throws Exception 
		{
			// 1. create the table.,
			bService.insertBook(new BookStore(159.00, "James Gosling", "Java"));
			
			// 2. select the data.,
			bService.getBooks().forEach(b->System.out.println(b));
			
		}

}
