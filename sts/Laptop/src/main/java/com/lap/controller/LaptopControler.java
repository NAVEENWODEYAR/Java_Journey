package com.lap.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lap.dto.AuthRequest;
import com.lap.modal.Laptop;
import com.lap.service.ExcelFileGenerator;
import com.lap.service.JWTService;
import com.lap.service.LaptopService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/lap")
public class LaptopControler
{
	// DI,
	@Autowired
	private LaptopService lapService;
	
	//DI.,
	@Autowired
	private JWTService jwtService;
	
	// DI of excelFileGenerator service
	@Autowired
	private ExcelFileGenerator excelFileGenerator;
	
		// REST API's.,
		// 1. PostMapping for sending the data into the table.,(http://localhost:8765/lap/insertLaptop)
		@PostMapping("/insertLaptop")
		public Laptop insertLap(@RequestBody Laptop lp)
		{
			return lapService.insertLaptop(lp);
		}
		
		// 1.a Post the List.,
		@PostMapping("/insertLaps")
		public List<Laptop> insertLaps(@RequestBody List<Laptop> lap)
		{
			List<Laptop> laps = lapService.insertLaps(lap);
			return laps;
		}
		
		// 2. select the record,
		@GetMapping("/getLap/{lapId}")
		public Laptop getLap(@PathVariable int lapId)
		{
			return lapService.getLap(lapId);
		}
		
		// 2.a select the data.
		@GetMapping("/getLaps")
		public List<Laptop> getLaps()
		{
			return lapService.getLaps();
		}
		
		// 3. update the data.,
		@PutMapping("/updateLap/{lapId}")
		public Laptop updateLap(@RequestBody Laptop lap, @PathVariable int lapId)
		{
			return lapService.updateLap(lap, lapId);
		}
		
		// 4. delete the record.,
		@DeleteMapping("/deleteLap/{lapId}")
		public String deleteLap(@PathVariable int lapId)
		{
			lapService.deleteLap(lapId);
			return "LapTop with the id,"+lapId+" deleted from the database successfully";
		}
		
		// 5. to generate the excel file
		@GetMapping("/getExcelFile")
		public void exceFileGenerator(HttpServletResponse response) throws IOException
		{
			// set the content type.,
			response.setContentType("application/octet-stream");
			
			String headerKey = "Content-Disposition";
			String headerValue = "attachment;filename=Laps.xls";
			
			response.setHeader(headerKey, headerValue);
			excelFileGenerator.excelFileGenerator(response);
		}
		
		// to get the details of the logged in user
		@GetMapping("/getLoggedUserName")
		public String getLoggedUserName(Principal principal)
		{
			return principal.getName();
		}
		
		@PostMapping("/authenticate")
		public String authenticateAndGetToken(@RequestBody AuthRequest authRequest)
		{
			return jwtService.generateToken(authRequest.getUserName());
		}
}
