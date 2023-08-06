package com.dataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.service.ExcelFileGeneratorService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/excel")
public class ExcelController 
{
	//DI.,
	@Autowired
	private ExcelFileGeneratorService excelService;
	
	// http://localhost:9090/excel/getFile
	@GetMapping("/getFile")
	public void excelGenerate(HttpServletResponse response) throws Exception
	{
		// set the content type.,
		response.setContentType("application/octet-stream");
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=Books.xls";
		
		response.setHeader(headerKey, headerValue);
		excelService.generateExcelFile(response);
	}
}
