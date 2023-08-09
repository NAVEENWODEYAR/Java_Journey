package com.swager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swager.modal.Book;

public interface BookRepo extends JpaRepository<Book, Integer>
{
	public String  findByBookName(String bookName);
}
