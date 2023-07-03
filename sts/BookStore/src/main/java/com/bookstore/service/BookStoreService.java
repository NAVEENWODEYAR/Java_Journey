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
	private BookStoreRepo bRespo;
	
			// upsert operation is an polymorphic method, performs update if PK is present else inserts the data., 
			@Override
				public String upsertBookStoreData(BookStore bs)
				{
					bRespo.save(bs);
					return "Data inserted successfully.,";
				}
	
			//  select query on the basis of ID
			@Override
				public BookStore getBookStoreById(Integer b_Id)
				{
					Optional<BookStore> findById = bRespo.findById(b_Id);
						if(findById.isPresent())
						{
							return findById.get();
						}
						return null;
				}
			// select * 
			@Override
				public List<BookStore> getBookStoreData() 
				{
					return bRespo.findAll();
				}
			
			// delete by the Id
			@Override
				public String deleteBookStoreById(Integer b_Id)
				{
					if(bRespo.existsById(b_Id))
					{
						bRespo.deleteById(b_Id);
						return "deleted successfully.,";
					}
					return "No such records.,";
				}

}
