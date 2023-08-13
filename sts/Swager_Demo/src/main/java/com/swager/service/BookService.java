package com.swager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.swager.dto.BookRequestDTO;
import com.swager.dto.ResponseDTO;
import com.swager.exception.BookNotFoundException;
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
		public Book insertBook(BookRequestDTO bookRequestDTO)
		{
			Book book = new Book(bookRequestDTO);
			return bookRepo.save(book);
		}
		
		// insert the List.,
		public List<Book> insertBooks(List<Book> book)
		{
			List<Book> list = bookRepo.saveAll(book);
			return list;
		}
		
		// get the record,
		public Optional<Book> getBook(int bookID)
		{
			Optional<Book> book = bookRepo.findById(bookID);
				if(book.isPresent())
						{
							return book;
						}
				else
				{
					throw new BookNotFoundException("No book was found with the give book ID"+bookID);
				}
		}
		
		//get record by name., custom query(findByfieldName)
		public Book getBookByName(String bookName)
		{
			Book book = bookRepo.findBybookName(bookName);
					if(bookRepo.findBybookName(bookName)==null)
					{
						throw new BookNotFoundException("Provide the proper book name idiot,");
					}
					else
					{
						return book;
					}
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
				if(bookRepo.findById(bookID).isPresent())
				{
					bk.setBookName(book.getBookName());
					bk.setBookAuthor(book.getBookAuthor());
					bk.setBookPrice(book.getBookPrice());
					
					return bookRepo.save(bk);
				}
				else
				{
					throw new BookNotFoundException("No book to update");
				}
		}
		
		// delete the record
		public String deleteBook(int bookID)
		{
			Optional<Book> book = bookRepo.findById(bookID);
					if(book.isPresent())
					{
						bookRepo.deleteById(bookID);
						return "";
					}
					else
					{
						throw new BookNotFoundException("No book with the id to update");
					}
		}
		
}
