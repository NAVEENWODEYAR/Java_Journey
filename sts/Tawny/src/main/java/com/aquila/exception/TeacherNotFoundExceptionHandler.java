package com.aquila.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	@ExceptionHandler
	public ResponseEntity<ResponseDTO> illegalArgumentExceptionHandler(MethodArgumentNotValidException exception)
	{
		List<ObjectError> errList = exception.getBindingResult().getAllErrors();
		List<String> errMsg = errList.stream()
									.map(e -> e.getDefaultMessage())
									.collect(Collectors.toList());
		ResponseDTO responseDTO = new ResponseDTO("Teacher not Found in the database..,",errMsg);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
	}
}
