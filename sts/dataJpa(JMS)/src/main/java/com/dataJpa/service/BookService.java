package com.dataJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataJpa.madal.Book;
import com.dataJpa.repo.BookRepo;
import com.dataJpa.util.EmailSenderService;
import com.dataJpa.util.TokenUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookService
{
	@Autowired
	BookRepo bRepo;
	
	// mailService object.,
	@Autowired
	EmailSenderService eService;
	
	// dependancy injection for tokenutil class
	@Autowired
	TokenUtil tokenUtil;
 
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
		Book b1 = bRepo.save(bk);
				String token = tokenUtil.createToken(bk.getbId());
				eService.sendEmail(bk.getaMail(), ""+token+"", "Dear "+bk.getbName()+" book aded to the list sucessfully.,");
				log.info("Mail sent to the user,");
				return b1;
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
			bk1.setaMail(bk.getaMail());
			
			return bRepo.save(bk1);
	}
	
	// 4. delete the data., 
	public String deleteBookData(int bId)
	{
		bRepo.deleteById(bId);
		return " ";
	}
}
