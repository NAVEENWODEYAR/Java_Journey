package com.aquila.exception;

public class BikeNotFoundException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5750452773581005525L;

	public BikeNotFoundException(String msg)
	{
		super(msg);
	}
}
