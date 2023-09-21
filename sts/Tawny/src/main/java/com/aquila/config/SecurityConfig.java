package com.aquila.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig 
{
	@Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
    {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/car/test").permitAll()
                .requestMatchers("/car").authenticated()

                .and().formLogin()
                .and().httpBasic();
        
        return http.build();

    }
}
