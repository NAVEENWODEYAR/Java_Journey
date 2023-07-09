package com.dataJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataJpa.madal.Book;
import com.dataJpa.repo.BookRepo;

@Service
public class BookService
{
	@Autowired
	BookRepo bRepo;

	// CRUD operations
	// 1. insert the data,
	public List<Book> insertBooKData (List<Book> bk)
	{
		List<Book> lt = bRepo.saveAll(bk);
					return lt;
	}
	
	// 1.a insert the record..,
	public Book insertBook (Book bk)
	{
		return bRepo.save(bk);
	}
	
	// 2. get the data,
	public List<Book> getBookData()
	{
		return bRepo.findAll();
	}
	
	// 2.a get the record
	public Book getBook(int bId)
	{
		return bRepo.findById(bId).get();
	}
	
	// 3. update the data,
	public Book updateBookData(int bId, Book bk)
	{
		Book bk1 = bRepo.findById(bId).get();
			bk1.setbAuthor(bk.getbAuthor());;
			bk1.setbName(bk.getbName());
			bk1.setbPrice(bk.getbPrice());
			
			return bRepo.save(bk1);
	}
	
	// 4. delete the data.,
	public String deleteBookData(int bId)
	{
		bRepo.deleteById(bId);
		return " ";
	}
}
