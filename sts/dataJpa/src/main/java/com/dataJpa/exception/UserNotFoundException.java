package com.dataJpa.exception;

public class UserNotFoundException extends RuntimeException
{
	public UserNotFoundException(int bId)
	{
		super("No such book "+bId);
	}
}
