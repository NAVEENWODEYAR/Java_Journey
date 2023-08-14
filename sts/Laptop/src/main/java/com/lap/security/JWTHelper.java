//package com.lap.security;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import com.graphbuilder.math.func.Function;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//@Component
//public class JWTHelper 
//{
//	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
//	
//	private String secret = "afdsafa";
//	
//	// Retrieve user name from token.,
//	public String getUserNameFromToken(String token)
//	{
//		return getClaimFromToken(token,Claims::getSubject);
//	}
//	
//	
//	// retrieve expiration from the token,
//	public Date getExpirationDate(String token) 	
//	{
//		return getClaimFromToken(token,Claims::getExpiration);
//	}
//	
//	public <T> T  getClaimFromToken(String token,  Function<Claims,T> claimsResolver)
//	{
//		final Claims claims = getAllClaimsFromToken(token);
//		return claimsResolver.apply(claims);
//	}
//	
//	// to retrieve any information from the token we need key.,
//	private Claims getAllClaimsFromToken(String token)
//	{
//		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//	}
//	
//	// to check if the token is expired 
//	private boolean isTokenExpired(String token)
//	{
//		final Date expiration = getExpirationDate(token);
//		return expiration.before(new Date());
//	}
//	
//	// generate the token for the user.,
//	public String generateToken(UserDetails userDetails)
//	{
//		Map<String, Object> claims = new HashMap<>();
//		return doGenerateToken(claims,userDetails.getUsername());
//	}
//
//	// create the token
//	private String doGenerateToken(Map<String, Object> claims, String username)
//	{
//		return Jwts.builder().setClaims(claims).setSubject(username).setIssuedAt(new Date())
//					.setExpiration(new Date(System.currentTimeMillis()+JWT_TOKEN_VALIDITY*1000))
//					.signWith(SignatureAlgorithm.HS512,secret).compact();
//	}
//	
//	// Validate the token.
//	public boolean validateToken(String token, UserDetails userDetails)
//	{
//		final String userName = getUserNameFromToken(token);
//		return(userName.equals(userDetails.getUsername())) && !isTokenExpired(token);
//	}
//			
//}
