package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.modal.BookStore;
import com.bookstore.repo.BookStoreRepo;

@Service
public class BookStoreService 
{
	// injecting the repo object..,
	@Autowired
	BookStoreRepo bookRepo;
	
	// CRUD Operations..,
	// 1. insert query.. single row..,
	public BookStore insertBook(BookStore bs)
	{
		BookStore bs1 = bookRepo.save(bs);
				return bs1;
	}
	
	// 2. insert list data.,
	public List<BookStore> insertBooks(List<BookStore> bs)
	{
		List<BookStore> bs1 = bookRepo.saveAll(bs);
						return bs1;
	}
	
	// 3. select one record
	public BookStore getBook(String id)
	{
		return bookRepo.findById(id).get();
	}
	
	// 4. select data
	public List<BookStore> getBooks()
	{
		return bookRepo.findAll();
	}
	
//	// 5. update the data.,
//	public BookStore updateBook(String id, BookStore bs)
//	{
//		BookStore b1 = bookRepo.findById(bs.getId().getClass());
//					
//	}
	
	// 6. delete the bookdata.,
	public String dleteBook(String id)
	{
		bookRepo.deleteById(id);
		return " ";
	}
	
}
