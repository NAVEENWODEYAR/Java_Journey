package com.lap.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;

@Component
public class JWTService 
{
	// method to generate the JWT token
	public String generateToken(String userName)
	{
		Map<String, Object> claims = new HashMap<>();
		return createToken(claims, userName);
	}
	
	
	private String createToken(Map<String, Object> claims, String userName)
	{
		return Jwts.builder()
					.setClaims(claims)
					.setSubject(userName)
					.setIssuedAt(new Date(System.currentTimeMillis()))
					.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
					.signWith(getSignKey())
					
	}


	private Key getSignKey() {
		// TODO Auto-generated method stub
		return null;
	}
}
