package com.bookstore.service;

import java.util.List;

import com.bookstore.modal.BookStore;

public interface BookStoreInterface 
{
	// 1. method to insert & update the data.,
	public String upsertBookStoreData(BookStore bs);
	
	// 2. selecting the data
	public BookStore getBookStoreById(Integer b_Id);
	
	// 3. select all the data
	public List<BookStore> getBookStoreData();
	
	// 4. delete the data
	public String deleteBookStoreById(Integer b_Id);
}
