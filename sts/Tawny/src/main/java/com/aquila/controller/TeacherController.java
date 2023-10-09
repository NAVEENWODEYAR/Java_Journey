package com.aquila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aquila.dto.ResponseDTO;
import com.aquila.dto.TeacherDTO;
import com.aquila.modal.Teacher;
import com.aquila.service.TeacherService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/teacher")
public class TeacherController 
{
	// Dependency Injection,
	@Autowired
	private TeacherService teacherService;
	
	// Create the API
	@GetMapping("/getMsg")
//	@RequestMapping(method = RequestMethod.GET,path = "/testMsg")
	public String getMsg()
	{
		log.info("Welcome");
		return "Sky is not the limit!";
	}
	
	// Post request for sending the data,
	@PostMapping("/insertTeacher")
	@ResponseStatus(code = HttpStatus.IM_USED)
	public ResponseEntity<ResponseDTO> insertTeacher(@Valid @RequestBody TeacherDTO teacherDTO)
	{
		Teacher teacher = teacherService.insertTeacher(teacherDTO);
		ResponseDTO responseDTO = new ResponseDTO("Data saved to successfully,",teacher);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.ACCEPTED);
	}
	
	// Get for receiving the data.,
	@GetMapping("/getTeachers")
	@ResponseStatus(code = HttpStatus.UPGRADE_REQUIRED)
	public ResponseEntity<ResponseDTO> getTeacchers()
	{
		List<Teacher> teacher = teacherService.getTeachersList();
		ResponseDTO responseDTO = new ResponseDTO("Details found,",teacher);
		return new ResponseEntity<>(responseDTO,HttpStatus.FOUND);
	}
	
	// getByName
	@GetMapping("/getByName")
	public Teacher getByName(String tName)
	{
		log.info("{}, welcome to the club");
		return teacherService.getByName(tName);
	}
}
