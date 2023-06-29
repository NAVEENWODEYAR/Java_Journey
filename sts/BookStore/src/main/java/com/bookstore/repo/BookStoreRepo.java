package com.bookstore.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.modal.BookStore;

@Repository 
public interface BookStoreRepo extends JpaRepository<BookStore, Integer> 
{
	
}
