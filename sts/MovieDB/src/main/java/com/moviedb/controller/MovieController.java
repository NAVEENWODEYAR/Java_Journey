package com.moviedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviedb.modal.Movie;
import com.moviedb.service.MovieService;

@RestController
public class MovieController 
{
	// injecting the package,,
	@Autowired
	MovieService mService;
	
	// generate the API
	// 1. post for sending the data.,
	@PostMapping("/insertMovieData")
	public Movie insertMovieData(Movie mv)
	{
		Movie lt = mService.insertData(mv);
					return lt;
	}
}
