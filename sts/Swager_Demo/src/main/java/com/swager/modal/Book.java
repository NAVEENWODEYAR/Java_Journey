package com.swager.modal;


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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookID;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	
//	@ElementCollection
//	@CollectionTable(name = "Publishers",
//						joinColumns = @JoinColumn(name="bookID"))
//	private List<String> bookPublishers;

}
