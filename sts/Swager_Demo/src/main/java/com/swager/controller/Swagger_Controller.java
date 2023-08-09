package com.swager.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/s")
public class Swagger_Controller 
{
	// dummy API for testing
	//http://localhost:1234/swagerHomePage
	@GetMapping("/swagerHomePage")
	public String getSwagerHome()
	{
		return "Welcome to Swagger API.,";
	}
	
	
	// adding the description about the API.,
	@Operation(summary = "Get Names,", description = "Returns the names list from the configured database.," ,tags = "Get")
	@ApiResponses(value = {
							@ApiResponse(responseCode = "200K",description = "Found the List",
										content = {@Content(mediaType = "application/json",
										schema = @Schema(implementation = List.class))}),
							@ApiResponse(responseCode = "404",description = "Not Found",content = @Content)
	})
	
	@GetMapping("/getList")
	public List getList()
	{
		List<String> list = Arrays.asList("Ammu","Bhas","Gowri","Gani");
		return list;
	}
	
	
}
