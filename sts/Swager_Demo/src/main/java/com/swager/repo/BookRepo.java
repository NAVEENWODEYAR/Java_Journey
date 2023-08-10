package com.swager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swager.modal.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>
{

}
