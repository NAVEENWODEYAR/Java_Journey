package com.aquila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquila.dto.TeacherDTO;
import com.aquila.modal.Teacher;
import com.aquila.repo.TeacherRepo;

@Service
public class TeacherService {
	// DI
	@Autowired
	private TeacherRepo teacherRepo;

	// CRUD operations., insert to the table
	public Teacher insertTeacher(TeacherDTO teacherDTO)
	{
		Teacher t = new Teacher(teacherDTO);
				return teacherRepo.save(t);
	}
	
	// get the data
	public List<Teacher> getTeachersList()
	{
		List<Teacher> list = teacherRepo.findAll();
					return list;
	}
	
	// get the record
	public Teacher getTeacher(Integer tId)
	{
		return teacherRepo.findById(tId).get();
	}
	
	// update the record
	public Teacher updateTeacher(TeacherDTO teacherDTO, Integer tId)
	{
		Teacher t = teacherRepo.findById(tId).get();
	}
}
