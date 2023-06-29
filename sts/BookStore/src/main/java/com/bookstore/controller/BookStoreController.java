package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.modal.BookStore;
import com.bookstore.service.BookStoreService;

@RestController
public class BookStoreController 
{
	@Autowired
	private BookStoreService bsService;

		// 1. generating the API.,
			@PostMapping("/insertBookStoreData")
			public ResponseEntity<String> insertBookStoreData(@RequestBody BookStore bk)
			{
				String status = bsService.upsertBookStoreData(bk);
						return new ResponseEntity<>(status, HttpStatus.CREATED);
			}
		
		// 2. getMapping for selecting data
			@GetMapping("/getBookStoreData/{b_Id}")
			public ResponseEntity<BookStore> getBookStoreData(@PathVariable Integer b_Id)
			{
				BookStore bs1 = bsService.getBookStoreById(b_Id);
					return new ResponseEntity<>(bs1, HttpStatus.OK);
			}
		
		// 3. getMapping for selecting all the records
			@GetMapping("/getBookStoreData")
			public ResponseEntity<List<BookStore>> getBookStoreData()
			{
				 List<BookStore> lt = bsService.getBookStoreData();
				 return new ResponseEntity<>(lt, HttpStatus.OK);
			}	
		
		// 4. updating the data
			@PutMapping("/updateBookStoreData")
			public ResponseEntity<String> updateBookStore(@RequestBody BookStore bs)
			{
				String status = bsService.upsertBookStoreData(bs);
						return new ResponseEntity<>(status, HttpStatus.OK);
			}
		
		// 5. delete the data
			@DeleteMapping("/deleteBookStoreData/{b_Id}")
			public ResponseEntity<String> deleteBookStore(@PathVariable Integer b_Id)
			{
				String status = bsService.deleteBookStoreById(b_Id);
						return new ResponseEntity<String>(status, HttpStatus.OK);
			}
}

