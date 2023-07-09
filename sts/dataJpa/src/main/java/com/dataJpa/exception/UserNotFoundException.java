package com.dataJpa.exception;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException
{
	public UserNotFoundException(int bId)
	{
		super("No such book with the given Book Id- "+bId);
	}
}
