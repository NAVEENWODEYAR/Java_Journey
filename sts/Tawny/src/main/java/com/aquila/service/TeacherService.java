package com.aquila.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquila.dto.TeacherDTO;
import com.aquila.exception.TeacherNotFoundException;
import com.aquila.modal.Teacher;
import com.aquila.repo.TeacherRepo;

@Service
public class TeacherService {
	// DI
	@Autowired
	private TeacherRepo teacherRepo;

	// CRUD operations., insert values into the table
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
	public Optional<Teacher> getTeacher(Integer tId)
	{
		Optional<Teacher> t = teacherRepo.findById(tId);
		if (t.isPresent()) {
			return t;
		} else
			throw new TeacherNotFoundException("No such record with the given id" + tId);
	}

	// update the record
	public Teacher updateTeacher(TeacherDTO teacherDTO, Integer tId)
	{
		Teacher t = teacherRepo.findById(tId).get();
		if (teacherRepo.findById(tId).isPresent()) {
			t.setTName(teacherDTO.getTName());
			t.setTAddress(teacherDTO.getTAddress());
			t.setTmail(teacherDTO.getTmail());
			t.setTSubject(teacherDTO.getTSubject());
			t.setTSalary(teacherDTO.getTSalary());

			return teacherRepo.save(t);
		} else
			throw new TeacherNotFoundException("Sorry no such record found!");

	}

	// delete the record
	public String deleteTeacher(Integer tId) 
	{
		Teacher t = teacherRepo.findById(tId).get();
		if (teacherRepo.findById(tId).isPresent()) {
			teacherRepo.deleteById(tId);
			return "";
		} else

			throw new TeacherNotFoundException("Sorry no such record found!");
	}

	// getByName
	public Teacher getByName(String tName)
	{
		Teacher t = teacherRepo.findBytName(tName);
		if(teacherRepo.findBytName(tName) != null)
		{
			return t;
		}
		else
			throw new TeacherNotFoundException("No teacher with the given name,");
	}
}
