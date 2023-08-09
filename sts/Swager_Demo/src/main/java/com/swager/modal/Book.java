package com.swager.modal;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Books_Table")
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int bookID;
	
	@NotNull
	@Column(name = "Boook Name")
	private String bookName;
	
	@Column(name = "Author")
	private String bookAuthor;
	
	@NotNull
	private double bookPrice;
	
	private java.util.List<String> bookPublishers;

	public Book(int bookID, @NotNull String bookName, String bookAuthor, @NotNull double bookPrice,
			List<String> bookPublishers) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPublishers = bookPublishers;
	}
	
	
}
