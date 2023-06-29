package com.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.modal.BookStore;
import com.bookstore.repo.BookStoreRepo;

@Service
public class BookStoreService implements BookStoreInterface
{

	@Autowired
	BookStoreRepo bsRepo;
	
		// 1. save the record,
			@Override
			public String upsertBookStore(BookStore bs) 
			{
				bsRepo.save(bs);		// insert / update based on the PK
				return "Success.,";
			}
		
		// 2. select the single record,
			@Override
			public BookStore getBookStoreById(Integer b_Id) 
			{
			    Optional<BookStore> obs = bsRepo.findById(b_Id);

			    	if(obs.isPresent())
			    	{
			    		return obs.get();
			    	}
			    	return null;
			}
		
		// 3. get all the records.,
			@Override
			public List<BookStore> getBookStore()
			{
				return bsRepo.findAll();
				
			}
		
		// 4. delete the data
			@Override
			public String deleteBookStore(Integer b_Id) 
			{
				if(bsRepo.existsById(b_Id))
				{
					bsRepo.deleteById(b_Id);
					return "Data deleted sucessfully";
				}else
				{
					return "No such record in the database.,";
				}
			}

}
