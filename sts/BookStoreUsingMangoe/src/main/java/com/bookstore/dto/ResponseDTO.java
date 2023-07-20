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
//	public ResponseDTO(String string, BookStore bs1) {
//		// TODO Auto-generated constructor stub
//	}
//	public ResponseDTO(String string, List<BookStore> lt) {
//		// TODO Auto-generated constructor stub
//	}
//	public ResponseDTO(String string, String st) {
//		// TODO Auto-generated constructor stub
//	}
	private String msg;
	private Object ob;
}
