package com.swager.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "name")
@NoArgsConstructor
public class BookRequestDTO 
{
	@NotNull(message = "Name can't be empty")
	private String bookName;
	
	@NotEmpty(message = "Author name can't be empty")
	private String bookAuthor;
	
	@Min(value = 100,message = "Price should be more than 100")
	private double bookPrice;
}
