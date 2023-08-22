package com.aquila.exception;

public class TeacherNotFoundException extends RuntimeException
{
	public TeacherNotFoundException(String msg)
	{
		super(msg);
	}
}
