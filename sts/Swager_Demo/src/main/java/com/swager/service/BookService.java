package com.swager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swager.modal.Book;
import com.swager.repo.BookRepo;

@Service
public class BookService
{
	//DI,
	@Autowired
	private BookRepo bookRepo;
		
	// CRUD operations.,
	// 1. insert the data into the table.,
	public List<Book> insertBooks(List<Book> books)
	{
		List<Book> b1 = bookRepo.saveAll(books);
		return b1;
	}
	
	// 1.a insert the record.,
	public Book insertBook(Book book)
	{
		return bookRepo.save(book);
	}
	
	// 2. select * from the book.,
	public List<Book> getBookDetails()
	{
		return bookRepo.findAll();
	}
	
	// 2.a SELECT * FROM book WHERE bookID= 
	public Book getBook(Integer bookID)
	{
		return bookRepo.findById(bookID).get();
	}
	
	// 3. SELECT * FROM book WHERE bookId= .,
	public Book getBook(Book book, Integer bookID)
	{
		return bookRepo.findById(bookID).get();
	}
	
	// 4. DROP FROM book WHERE bookId= .,
	public String deleteBook(Integer bookID)
	{
		bookRepo.deleteById(bookID);
		return "";
	}
	
	// 5. UPDATE  SET COLUMN1=VALU1,,, COLUMNn=VALUEn book WHERE bookID=""
	public Book updateBook(Book book, Integer bookID) 
	{
		Book bk = bookRepo.findById(bookID).get();
			bk.setBookName(book.getBookName());
			bk.setBookAuthor(book.getBookAuthor());
			bk.setBookPrice(book.getBookPrice());
			
			return bookRepo.save(bk);
	}

}
