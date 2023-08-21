package com.aquila.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.aquila.modal.Teacher;

public interface TeacherMongoRepo extends  MongoRepository<Teacher, String>
{

}
