package com.aquila.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig 
{
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
// 		http
// 			.authorizeHttpRequests((authorizeHttpRequests) ->
// 				authorizeHttpRequests
// 					.requestMatchers("/**").hasRole("USER")
// 			)
// 			.formLogin();
// 		return http.build();
//	}
}
