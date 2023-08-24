package com.data.exception.copy;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException
{
	public UserNotFoundException(int bId)
	{
		super("No such book with the given Book Id- "+bId);
	}
}
