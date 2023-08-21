package com.aquila.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.aquila.modal.Teacher;

public interface TeacherRepo extends MongoRepository<Teacher, Integer> 
{
	@Query(value = "SELECT * FROM TEACHERS WHERE tName=name", nativeQuery = true )
	List<Teacher> getTeachers();
	
//	// findByName queries,
//	Book findBybookName(String bookName);
//
//	// @Query
//	@Query(value = "SELECT * FROM book 	where book.book_price >=100 ORDER BY book.book_price",nativeQuery = true)
//	List<Book> getBooksGreaterThan();
}
