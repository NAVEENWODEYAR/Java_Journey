package com.dataJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.madal.Book;
import com.dataJpa.service.BookService;

@RestController
@CrossOrigin()
public class BookController
{
	@Autowired
	BookService bookService;

	// generating the API.,
	// 1. post for inserting the data.,
	@PostMapping("/insertBookData")
	public List<Book> insertBokData(@RequestBody List<Book> bk)
	{
		List<Book> lt = bookService.insertBooKData(bk);
					return lt;
	}
	
	// 2. get for selecting the data.,
	@GetMapping("/getBookData")
	public List<Book> getCarData()
	{
		return bookService.getBookData();
	}
	
	// 3. put for updating the data.,
	@PutMapping("/updateBookData/{bId}")
	public Book updateCarData(@PathVariable int bId, @RequestBody Book bk)
	{
		return bookService.updateBookData(bId, bk);
	}
	
	// 4. delete for deleting the data.,
	@DeleteMapping("/deleteBookData/{bId}")
	public String deleteBookData(@PathVariable int bId)
	{
		bookService.deleteBookData(bId);
		return "Successfully deleted the book records,,";
	}
}
