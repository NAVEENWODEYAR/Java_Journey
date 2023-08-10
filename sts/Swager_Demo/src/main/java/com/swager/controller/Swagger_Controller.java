package com.swager.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swager.modal.Book;
import com.swager.service.BookService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/book")
public class Swagger_Controller 
{
	
	// DI.,
	@Autowired
	private BookService bookService;
	
	
	// dummy API for testing(http://localhost:1234/swagerHomePage)
	@GetMapping("/swagerHomePage")
	public String getSwagerHome()
	{
		return "Welcome to Swagger API.,";
	}
	
	
	// adding the description about the API.,
	@Operation(summary = "Get Names,", description = "Returns the names list from the configured database.," ,tags = "Get")
	@ApiResponses(value = {
							@ApiResponse(responseCode = "200K",description = "Found the List",
										content = {@Content(mediaType = "application/json",
										schema = @Schema(implementation = List.class))}),
							@ApiResponse(responseCode = "404",description = "Not Found",content = @Content)
	})
	
	@GetMapping("/getList")
	public List getList()
	{
		List<String> list = Arrays.asList("Ammu","Bhas","Gowri","Gani");
		return list;
	}
	
	@Operation(summary = "Get Names,", description = "Returns the names list from the configured database.," ,tags = "Get")
	@ApiResponses(value = {
							@ApiResponse(responseCode = "200K",description = "Found the List",
										content = {@Content(mediaType = "application/json",
										schema = @Schema(implementation = List.class))}),
							@ApiResponse(responseCode = "404",description = "Not Found",content = @Content)
	})
	// 1. insert into the book table,(http://localhost:1234/s/insertBooks)
	@PostMapping("/insertBooks")
	public List<Book> insertBooks(@RequestBody List<Book> book)
	{
		List<Book> list = bookService.insertBooks(book);
		return list;
	}
	
	// 1.a insert the record into the table.,(http://localhost:1234/s/insertBook)
	@PostMapping("/insertBook")
	public Book insertBook(@RequestBody Book bk)
	{
		return bookService.insertBook(bk);
	}
	
	// 2. get the books from the table.,(http://localhost:1234/s/getBookDetails)
	@GetMapping("/getBookDetails")
	public List<Book> getBookDetails()
	{
		return bookService.getBookDetails();
	}
	
	// 2.a get the details of an record.,(http://localhost:1234/s/getBook/)
	@GetMapping("/getBook/{bookID}")
	public Book getBook(@RequestBody Book book,@PathVariable Integer bookID)
	{
		return bookService.getBook(book, bookID);
	}
		
	// 3. delete the book record from the table.,(http://localhost:1234/s/deleteBook/)
	@DeleteMapping("/deleteBook/{bookID}")
	public String deleteBook(@PathVariable Integer bookID)
	{
		bookService.deleteBook(bookID);
		return "Book with the id, "+bookID+", deleted from the database.,";
	}
	
	// 4. update the book details,(http://localhost:1234/s/updateBook/)
	@PutMapping("/updateBook/{bookID}")
	public Book updateBook(@RequestBody Book book, @PathVariable Integer bookID)
	{
		return bookService.updateBook(book, bookID);
	}
}
