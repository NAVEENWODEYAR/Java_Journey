package com.aquila.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.aquila.dto.ResponseDTO;

@RestControllerAdvice
public class BikeNotFoundExceptionHandler 
{		
		// for handling the BikeNotFoundException,
		@ExceptionHandler
		public ResponseEntity<ResponseDTO> bikeNotFoundException(BikeNotFoundException exception)
		{
			ResponseDTO responseDTO = new ResponseDTO("No bike is present in the database with the given id.",exception.getMessage());
			return new ResponseEntity<>(responseDTO, HttpStatus.NOT_FOUND);
		}
		
		// for handling the Illegal Argument Exception,
		@ExceptionHandler
		public ResponseEntity<ResponseDTO> methodArgumentException(MethodArgumentNotValidException exception)
		{
			List<ObjectError> errList = exception.getBindingResult().getAllErrors();
			List<String> errMsg = errList.stream()
											.map(err -> err.getDefaultMessage())
											.collect(Collectors.toList());
			ResponseDTO responseDTO = new ResponseDTO("Exception occured while processing the API,",errMsg.toString());
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
											
		}
}
