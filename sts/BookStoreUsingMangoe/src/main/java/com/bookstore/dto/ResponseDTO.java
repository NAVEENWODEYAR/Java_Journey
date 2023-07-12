package com.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO
{
	private String msg;
	private Object ob;
	
	// constructor.,
	public ResponseDTO(String msg, Object ob)
	{
		super();
		this.msg = msg;
		this.ob = ob;
	}

	
}
