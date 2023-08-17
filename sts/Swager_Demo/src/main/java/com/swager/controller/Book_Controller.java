package com.swager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swager.dto.BookRequestDTO;
import com.swager.dto.ResponseDTO;
import com.swager.modal.Book;
import com.swager.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/book")
public class Book_Controller
{

	// DI.,
	@Autowired
	private BookService bookService;

		/**
		// dummy API for testing(http://localhost:1234/book/swagerHomePage)
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
		*/

		// 1. insert into the book table,(http://localhost:1234/book/insertBooks)
		@PostMapping("/sendBooks")
		public ResponseEntity<ResponseDTO> insertBooks(@RequestBody List<Book> book)
		{
			List<Book> books = bookService.insertBooks(book);
			ResponseDTO responseDTO = new ResponseDTO("Successfully saved the details", books);
			return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
		}

		// 1.a insert the record into the table.,(http://localhost:1234/book/insertBook)
		@PostMapping("/sendBook")
		public ResponseEntity<Book> insertBook(@Valid @RequestBody  BookRequestDTO bookDto)
		{
			return new ResponseEntity<>(bookService.insertBook(bookDto), HttpStatus.ACCEPTED);
		}

		// 2. get the books from the table.,(http://localhost:1234/book/getBookDetails)
		@GetMapping("/getBookDetails")
		public ResponseEntity<ResponseDTO> getBookDetails()
		{
			List<Book> books = bookService.getBooks();
			ResponseDTO responseDTO = new ResponseDTO("Found the list", books);
			return new ResponseEntity<>(responseDTO, HttpStatus.FOUND);
		}

		// 2.a get the details of an record.,(http://localhost:1234/book/getBook/)
		@GetMapping("/getBook/{bookID}")
		public ResponseEntity<ResponseDTO> getBook(@PathVariable Integer bookID)
		{
			Book book = bookService.getBook(bookID).get();
			ResponseDTO responseDTO = new ResponseDTO("Found the book", book);
			return new ResponseEntity<>(responseDTO, HttpStatus.FOUND);
		}

		// 2.b custom query findBybookName;
		@GetMapping("/getBookByName/{bookName}")
		public ResponseEntity<ResponseDTO> getBookByName(String bookName)
		{
			Book book = bookService.getBookByName(bookName);
			ResponseDTO responseDTO = new ResponseDTO("Found the book,", book);
			return new ResponseEntity<>(responseDTO, HttpStatus.FOUND);
		}

		// 3. delete the book record from the table.,(http://localhost:1234/book/deleteBook/)
		@DeleteMapping("/deleteBook/{bookID}")
		public ResponseEntity<ResponseDTO> deleteBook(@PathVariable Integer bookID)
		{
			bookService.deleteBook(bookID);
			ResponseDTO responseDTO = new ResponseDTO("", "");
			return new ResponseEntity<>(responseDTO, HttpStatus.GONE);
		}

		// 4. update the book details,(http://localhost:1234/book/updateBook/)
		@PutMapping("/updateBook/{bookID}")
		public ResponseEntity<ResponseDTO> updateBook(@RequestBody BookRequestDTO bookDto,@PathVariable Integer bookID)
		{
			Book book = bookService.updateBook(bookDto, bookID);
			ResponseDTO responseDTO = new ResponseDTO("Updated the details", book);
			return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);

		}

		// 5. get the books price > 100,
		@GetMapping("/priceGreaterThan")
		public ResponseEntity<ResponseDTO>getBooksPriceGreaterThan()
		{
			List<Book> book = bookService.getBooksPriceGreaterThan();
			ResponseDTO responseDTO = new ResponseDTO("List of book whose price is greater than $100,-", book);
			return new ResponseEntity<>(responseDTO, HttpStatus.PARTIAL_CONTENT);
		}
}
