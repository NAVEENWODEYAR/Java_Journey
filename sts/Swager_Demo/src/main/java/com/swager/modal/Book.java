package com.swager.modal;

import com.swager.dto.BookRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor(staticName = "name")
@Data
@Entity
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;

		public Book(BookRequestDTO bookRequestDTO)
		{
			this.bookName = bookRequestDTO.getBookName();
			this.bookAuthor = bookRequestDTO.getBookAuthor();
			this.bookPrice = bookRequestDTO.getBookPrice();
		}
}
