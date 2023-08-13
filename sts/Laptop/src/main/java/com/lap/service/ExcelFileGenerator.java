package com.lap.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lap.modal.Laptop;
import com.lap.repo.LaptopRepo;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExcelFileGenerator 
{
	// DI of repo object.,
	@Autowired
	private LaptopRepo laptopRepo;
	
		// method to generate the exceFile
		public void excelFileGenerator(HttpServletResponse response) throws IOException
		{
			List<Laptop> list = laptopRepo.findAll();
				
				HSSFWorkbook workBook = new HSSFWorkbook();
				HSSFSheet workSheet = workBook.createSheet("Lap List");
				HSSFRow row = workSheet.createRow(0);
				row.createCell(0).setCellValue("LapTop ID");
				row.createCell(1).setCellValue("LapTop Company");
				row.createCell(2).setCellValue("LapTop Name");
				row.createCell(3).setCellValue("LapTop Model");
				
				int dataRowIndex = 1;
					for(Laptop laps: list )
					{
						HSSFRow dataRow = workSheet.createRow(dataRowIndex);
								dataRow.createCell(0).setCellValue(laps.getLapId());
								dataRow.createCell(1).setCellValue(laps.getLapId());
								dataRow.createCell(2).setCellValue(laps.getLapName());
								dataRow.createCell(3).setCellValue(laps.getLapModel());
								
								dataRowIndex++;
					}
					 
					// Ctrl+2
					ServletOutputStream outputStream = response.getOutputStream();
					workBook.write(outputStream);
					workBook.close();
					outputStream.close();
			
		}
}
