package com.swager.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swager.modal.Book;

public interface BookRepo extends JpaRepository<Book, Integer>
{
	// findByName queries,
	Book findBybookName(String bookName);
	
	// @Query
	@Query(value = "SELECT * FROM book 	where book.book_price >=100 ORDER BY book.book_price",nativeQuery = true)
	List<Book> getBooksGreaterThan();

}
