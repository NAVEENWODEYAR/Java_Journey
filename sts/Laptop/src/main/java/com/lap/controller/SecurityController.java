package com.lap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController 
{
	
	@GetMapping("/normal") //http://localhost:8765/security/normal
	public ResponseEntity<String> normalUser()
	{
		return  ResponseEntity.ok("Normal User");
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser()
	{
		return  ResponseEntity.ok("Admin User");
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser()
	{
		return  ResponseEntity.ok("Public User");
	}
}
