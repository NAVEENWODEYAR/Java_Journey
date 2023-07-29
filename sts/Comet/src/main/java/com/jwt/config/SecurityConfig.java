package com.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig
{
	// in memory user
//	@Bean
//	public InMemoryUserDetailsManager userDetailsManager()
//	{
//		UserDetails user = User.withDefaultPasswordEncoder()
//								.username("me")
//								.password("me")
//								.roles("USER")
//								.build();
//		
//		UserDetails admin = User.withDefaultPasswordEncoder()
//								.username("boss")
//								.password("root")
//								.roles("ADMIN")
//								.build();
//		return new InMemoryUserDetailsManager(user,admin);
//	}
//	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
			http	
					.csrf(csrf -> csrf.disable())
					.authorizeHttpRequests()
					.requestMatchers("/emp/getEmployees")
					.permitAll()
					.anyRequest()
					.authenticated()
					.and()
					.formLogin();
		return http.build();
	}
	
//	@Bean
//	public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception
//	{
//		return httpSecurity
//							.csrf(csrf ->csrf.disable())
//							.authorizeHttpRequests((authorizeHttpRequests) ->
//			 				{authorizeHttpRequests
//			 					.anyRequest().authenticated();
////			 					.requestMatchers("/").authenticated()
////			 					.requestMatchers("/emp").hasAnyAuthority("USER","ADMIN");
//			 					})
//							.httpBasic(Customizer.withDefaults())
//							.build();
}

