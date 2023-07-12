package com.dataJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataJpa.madal.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> 
{
	public void findByName(String bName);
}
