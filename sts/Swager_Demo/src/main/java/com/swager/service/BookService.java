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
	
	@Autowired
	public BookService(BookRepo bookRepo)
	{
		this.bookRepo = bookRepo;
	}
	
	public Book createBook(List<String> authors)
	{
		Book bk = new Book();
			bk.setBookPublishers(authors);
			return bookRepo.save(bk);
	}
	
	// CRUD operations.,
	// 1. insert the data into the table.,
	public List<Book> insertBooks(List<Book> books)
	{
		List<Book> b1 = bookRepo.saveAll(books);
		return b1;
	}
	
	// 2. select * from the book.,
	public List<Book> getBookDetails()
	{
		return bookRepo.findAll();
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
			bk.setBookPublishers(book.getBookPublishers());
			
			return bookRepo.save(bk);
	}

}
