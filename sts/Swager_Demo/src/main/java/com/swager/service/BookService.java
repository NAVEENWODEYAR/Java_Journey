package com.swager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swager.dto.BookRequestDTO;
import com.swager.modal.Book;
import com.swager.repo.BookRepo;

@Service
public class BookService 
{
	// DI.,
	@Autowired
	private BookRepo bookRepo;
	
		// CRUD operations.,
		// insert the records,
		public Book insertBook(BookRequestDTO bookDto)
		{	
			Book bk = Book.name(0,bookDto.getBookName(),bookDto.getBookAuthor(),bookDto.getBookPrice());
			return bookRepo.save(bk);
		}
		
		// insert the List.,
		public List<Book> insertBooks(List<Book> book)
		{
			List<Book> list = bookRepo.saveAll(book);
			return list;
		}
		
		// get the record,
		public Book getBook(int bookID)
		{
			return bookRepo.findById(bookID).get();
		}
		
		//get record by name., custom query(findByfieldName)
		public Book getBookByName(String bookName)
		{
			return bookRepo.findBybookName(bookName);
		}
		
		// get all the records,
		public List<Book> getBooks()
		{
			return bookRepo.findAll();
		}
		
		// update the record,
		public Book updateBook(BookRequestDTO book, int bookID)
		{
			Book bk = bookRepo.findById(bookID).get();
				bk.setBookName(book.getBookName());
				bk.setBookAuthor(book.getBookAuthor());
				bk.setBookPrice(book.getBookPrice());

				return bookRepo.save(bk);
		}
		
		// delete the record
		public String deleteBook(int bookID)
		{
			bookRepo.deleteById(bookID);
			return "";
		}
		
}
