package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.modal.BookStore;
import com.bookstore.service.BookStoreService;

@RestController
@CrossOrigin
public class BookStoreController 
{
	@Autowired
	private BookStoreService bsService;

		// 1. generating the API.,
			@PostMapping("/insertBookStoreData")
			@ResponseStatus(HttpStatus.CREATED)
			public BookStore insertBook(@RequestBody BookStore bs)
			{
				return bsService.insertBook(bs);
			}
			
		// 2. getMapping for receiving the data.,
			@GetMapping("/getBooks")
			@ResponseStatus(HttpStatus.FOUND)
			public List<BookStore> getBooks()
			{
				return bsService.getBooks();
			}
			
		// 3. get the single record.,
			@GetMapping("/getBook/{id}")
			@ResponseStatus(HttpStatus.FOUND)
			public BookStore getBook(@PathVariable String id)
			{
				return bsService.getBook(id);
			}
			
		// 4. delete the data.,
			@DeleteMapping("/deleteBook/{id}")
			@ResponseStatus(HttpStatus.GONE)
			public String deleteBook(@PathVariable String id)
			{
				bsService.dleteBook(id);
				return " Successfully deleted the record,";
			}
		
}

