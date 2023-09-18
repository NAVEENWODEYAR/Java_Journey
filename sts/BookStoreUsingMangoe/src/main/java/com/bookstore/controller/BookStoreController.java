package com.bookstore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.bookstore.dto.ResponseDTO;
import com.bookstore.modal.BookStore;
import com.bookstore.service.BookStoreService;

@RestController
@CrossOrigin("http://localhost:3000")
public class BookStoreController 
{
	@Autowired
	private BookStoreService bsService;
	
	// adding the logger
	
	 Logger log = LoggerFactory.getLogger(BookStoreController.class);


		// 1. generating the API.,
			@PostMapping("/insertBookStoreData")
			@ResponseStatus(HttpStatus.CREATED)
			public ResponseEntity<ResponseDTO> insertBook(@RequestBody BookStore bs)
			{
				BookStore bs1 = bsService.insertBook(bs);
				ResponseDTO bDTO = new ResponseDTO("Record inserted successfully.,",bs1);
				return new ResponseEntity<ResponseDTO>(bDTO,HttpStatus.CREATED);
			}
			
		// 2. getMapping for receiving the data.,
			@GetMapping("/getBooks")
			@ResponseStatus(HttpStatus.FOUND)
			public ResponseEntity<ResponseDTO>getBooks()
			{
				List<BookStore> lt = bsService.getBooks();
				ResponseDTO bDTO = new ResponseDTO("Record is present.,", lt);
				return new ResponseEntity<ResponseDTO>(bDTO, HttpStatus.FOUND);
			}
			
		// 3. get the single record.,
			@GetMapping("/getBook/{id}")
			@ResponseStatus(HttpStatus.FOUND)
			public ResponseEntity<ResponseDTO>getBook(@PathVariable String id)
			{
				BookStore bs = bsService.getBook(id);
				ResponseDTO bDTO = new ResponseDTO("Table has the data.,", bs);
				return new ResponseEntity<ResponseDTO>(bDTO, HttpStatus.FOUND);
			}
			
		// 4. delete the data.,
			@DeleteMapping("/deleteBook/{id}")
			@ResponseStatus(HttpStatus.GONE)
			public ResponseEntity<ResponseDTO> deleteBook(@PathVariable String id)
			{
				String st = bsService.dleteBook(id);
				ResponseDTO bDTO = new ResponseDTO("Sucessfully deleted the record.,", st);
				return new ResponseEntity<ResponseDTO>(bDTO, HttpStatus.GONE);
			}
		
}

