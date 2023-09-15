package com.aquila.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aquila.modal.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> 
{
	@Query(value = "SELECT * FROM TEACHERS WHERE teacher.t_name=name", nativeQuery = true )
	List<Teacher> getTeachers();
	
	// findByName queries,
	Teacher findBytName(String tName);
	
//	Teacher findBytMail(String tMail);

	// @Query
	@Query(value = "SELECT * FROM book 	where teacher.t_salaryrice >=250000 ORDER BY teacher.t_salary",nativeQuery = true)
	List<Teacher> getTeachersSalaryGreaterThan();
	
	@Query(value = "SELECT * FROM book ORDER BY teacher.t_salary",nativeQuery = true)
	List<Teacher> getTeacherBasedOnSalary();
}
