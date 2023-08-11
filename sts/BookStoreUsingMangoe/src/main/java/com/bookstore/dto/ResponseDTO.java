package com.bookstore.dto;

import java.util.List;

import com.bookstore.modal.BookStore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ResponseDTO
{
	private String msg;
	private Object ob;
}
