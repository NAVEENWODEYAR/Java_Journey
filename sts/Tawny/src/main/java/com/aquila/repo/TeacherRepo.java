package com.aquila.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aquila.modal.Teacher;

public interface TeacherRepo extends MongoRepository<Teacher, String> 
{

}
