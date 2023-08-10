package com.swager.modal;

import java.util.*;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
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
	
//	@ElementCollection
//	@CollectionTable(name = "Publishers",
//						joinColumns = @JoinColumn(name="bookID"))
//	private List<String> bookPublishers;

}
