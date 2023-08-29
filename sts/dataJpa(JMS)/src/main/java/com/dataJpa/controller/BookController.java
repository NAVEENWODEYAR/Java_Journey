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
import com.dataJpa.repo.BookRepo;
import com.dataJpa.service.BookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
@Slf4j
public class BookController
{
	// Dependency injection(constructor dependency injection)
	@Autowired
	BookService bookService;
	
	@Autowired
	BookRepo bRepo;

	// 1. post for inserting the data.,(http://localhost:9090/insertBookData)
	@PostMapping("/insertBookData")
	public List<Book> insertBokData(@RequestBody List<Book> bk)
	{
		List<Book> lt = bookService.insertBooKData(bk);
		log.info("Data saved successfully,");
					return lt;
	}
	
	// 1.a insert the record.,
	@PostMapping("/insertBook")
	public Book insertBook(@RequestBody Book bk)
	{
		return bookService.insertBook(bk);
	}
	
	// 2. get for selecting the data.,(http://localhost:9090/getBookData)
	@GetMapping("/getBookData")
	public List<Book> getCarData()
	{
		return bookService.getBookData();
	}
	
	// 2.a selecting the record
//	@GetMapping("/getBook/{bId}")
//	public Book getBook(@PathVariable int bId)
//	{
//		return bookService.getBook(bId)
//				.orElseThrow(()-> new UserNotFoundException(bId));
//				
//	}
	
	// 2.a selecting the record.,
		@GetMapping("/getBook/{bId}")
		public Book getBook(@PathVariable int bId)
		{
			return bRepo.findById(bId)
					.orElseThrow(()-> new com.data.exception.UserNotFoundException(bId));
		}

	
	// 3. put for updating the data.,
//	@PutMapping("/updateBookData/{bId}")
//	public Book updateCarData(@PathVariable int bId, @RequestBody Book bk)
//	{
//		return bookService.updateBookData(bId, bk);
//	}
	
	// 3. update the book
	@PutMapping("/updateBook/{bId}")
	public Book updateBook(@PathVariable int bId, @RequestBody Book bk)
	{
		return bRepo.findById(bId)
				.map(book -> {
					book.setbName(bk.getbName());
					book.setbAuthor(bk.getbAuthor());
					book.setbPrice(bk.getbPrice());
					book.setaMail(bk.getaMail());
					
					return bRepo.save(book);
					
				}).orElseThrow(()-> new com.data.exception.UserNotFoundException(bId));
	}
		
	// 4. delete for deleting the data.,
	@DeleteMapping("/deleteBookData/{bId}")
	public String deleteBookData(@PathVariable int bId)
	{
		bookService.deleteBookData(bId);
		return "Successfully deleted the book records,,";
	}
	
	// 4.a delete the record..,
	@DeleteMapping("/deleteBook/{bId}")
	public String deleteBook(@PathVariable int bId)
	{
		if(!bRepo.existsById(bId))
		{
			throw new com.data.exception.UserNotFoundException(bId);
		}
		bRepo.deleteById(bId);
		return "Book with the id "+bId+ " deleted from the database.,";
	}
}
