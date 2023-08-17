package com.swager.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.swager.dto.ResponseDTO;

@RestControllerAdvice
public class BookNotFoundExceptionHandler
{
	@ExceptionHandler
	public ResponseEntity<ResponseDTO> bookNotFoundException(BookNotFoundException exception)
	{
		ResponseDTO resRresponseDTO = new ResponseDTO("Exception occured, idiot check your intput",exception.getMessage());
		return new ResponseEntity<>(resRresponseDTO, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<ResponseDTO> methodArgumentNotValidException(MethodArgumentNotValidException exception)
	{
		List<ObjectError> errList = exception.getBindingResult().getAllErrors();
		List<String> errMsg = errList.stream()
									.map(err -> err.getDefaultMessage())
									.collect(Collectors.toList());
		ResponseDTO reRresponseDTO = new ResponseDTO("Please provide the required details", errMsg.toString());
		return new ResponseEntity<>(reRresponseDTO, HttpStatus.BAD_REQUEST);
	}
}
