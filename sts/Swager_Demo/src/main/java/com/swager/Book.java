package com.swager;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "Books_Table")
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int bookID;
	
	@NotNull
	@Column(name = "Boook Name")
	private String bookName;
	
	@Column(name = "Author")
	private String bookAuthor;
	
	@NotNull
	private double bookPrice;
	
	private java.util.List<String> bookPublishers;
}
