package com.lap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	
	// to create  the users
	@Bean
	public UserDetailsService userDetailsService()
	{
		UserDetails user = User.builder().username("boss").password(passwordEncoder().encode("boss")).roles("Admin").build();
		UserDetails user1 = User.builder().username("Ammu").password(passwordEncoder().encode("Ammu")).roles("Admin").build();
		return new  InMemoryUserDetailsManager(user,user1) ;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception 
	{
 		return null;
 	}
}
