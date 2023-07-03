package com.moviedb.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.moviedb.modal.Movie;
import com.moviedb.service.MovieService;

@Component
public class MovieRunner implements CommandLineRunner 
{
	@Autowired
	MovieService mService;
	
	@Override
	public void run(String... args) throws Exception 
	{
		mService.insertData(new Movie(1, "A", "B", 1.0));
	}

}
