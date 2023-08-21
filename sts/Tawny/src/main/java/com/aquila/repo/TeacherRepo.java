package com.aquila.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aquila.modal.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> 
{
	@Query(value = "SELECT * FROM TEACHERS WHERE tName=name", nativeQuery = true )
	List<Teacher> getTeachers();
	
	// findByName queries,
	Teacher findBytName(String tName);

	// @Query
	@Query(value = "SELECT * FROM book 	where teacher.t_salaryrice >=250000 ORDER BY teacher.t_salary",nativeQuery = true)
	List<Teacher> getBooksGreaterThan();
}