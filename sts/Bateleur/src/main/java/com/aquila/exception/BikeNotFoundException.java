package com.aquila.exception;

public class BikeNotFoundException extends RuntimeException
{
	public BikeNotFoundException(String msg)
	{
		super(msg);
	}
}
