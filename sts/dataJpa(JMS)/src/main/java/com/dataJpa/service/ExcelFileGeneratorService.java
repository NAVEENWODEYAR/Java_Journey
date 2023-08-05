package com.dataJpa.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataJpa.madal.Book;
import com.dataJpa.repo.BookRepo;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExcelFileGeneratorService 
{

	// DI
	@Autowired
	private BookRepo bookRepo;
	
	// method to generate the excel file.,
	public void generateExcelFile(HttpServletResponse response) throws IOException
	{
		List<Book> bk = bookRepo.findAll();
		
			HSSFWorkbook workBook = new HSSFWorkbook();
			HSSFSheet sheet = workBook.createSheet("Books List");
			HSSFRow row = sheet.createRow(0);
					row.createCell(0).setCellValue("Book ID");
					row.createCell(1).setCellValue("Author Mail");
					row.createCell(2).setCellValue("Book Author");
					row.createCell(3).setCellValue("Book Name");
					row.createCell(4).setCellValue("Book Price");
					
					int dataRowIndex = 1;
						for(Book books: bk )
						{
							HSSFRow dataRow = sheet.createRow(dataRowIndex);
									dataRow.createCell(0).setCellValue(books.getbId());
									dataRow.createCell(1).setCellValue(books.getaMail());;
									dataRow.createCell(2).setCellValue(books.getbAuthor());
									dataRow.createCell(3).setCellValue(books.getbName());
									dataRow.createCell(4).setCellValue(books.getbPrice());
									
									dataRowIndex++;
						}
						 
						// Ctrl+2
						ServletOutputStream outputStream = response.getOutputStream();
						workBook.write(outputStream);
						workBook.close();
						outputStream.close();

	}
}
