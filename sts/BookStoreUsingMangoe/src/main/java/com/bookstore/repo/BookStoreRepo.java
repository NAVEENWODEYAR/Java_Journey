package com.bookstore.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.modal.BookStore;

@Repository 
public interface BookStoreRepo extends MongoRepository<BookStore, String> 
{
	
}
