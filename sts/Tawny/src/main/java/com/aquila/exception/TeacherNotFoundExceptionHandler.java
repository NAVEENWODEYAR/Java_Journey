package com.aquila.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.aquila.dto.ResponseDTO;

@RestControllerAdvice
public class TeacherNotFoundExceptionHandler 
{
	
	@ExceptionHandler
	public ResponseEntity<ResponseDTO> teacherNotfoundExceptionHandler(TeacherNotFoundException exception)
	{
		ResponseDTO responseDTO = new ResponseDTO("Sorry exception occured while seraching for the reacord which is not present!",exception);
		return new ResponseEntity<>(responseDTO, HttpStatus.NOT_FOUND);
	}
}
