package com.dataJpa.util;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.auth0.jwt.interfaces.Verification;

@Component
public class TokenUtil
{
	private static final String TOKEN_SECRET = "Books";
	
	public String createToken(int id)
	{
		try
		{
			// set the algoritham.,
			Algorithm al = Algorithm.HMAC256(TOKEN_SECRET);
			
			String token = JWT.create()
							.withClaim("user_id", id)
							.sign(al);
					return token;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	// method to decode the string.,
	public int decodeToken(String token)
	{
		int userid;
		
		// to verify the algoritham,
		Verification verification = null;
		
		try
		{
			verification = JWT.require(Algorithm.HMAC256(TOKEN_SECRET));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		JWTVerifier jwtVerifier = verification.build();
		
		// to decode the token
		DecodedJWT decodedJWT = jwtVerifier.verify(token);
		
		Claim claim = decodedJWT.getClaim("user_id");
		userid = claim.asInt();
		return userid;
	}
	
	
}
