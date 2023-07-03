package com.moviedb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviedb.modal.Movie;
import com.moviedb.repo.MovieRepo;

@Service
public class MovieService 
{
	// injecting the object..,
	@Autowired
	MovieRepo mRepo;
	
	// CRUD operations..,
	// 1. insert the data..,
	public Movie insertData(Movie mv)
	{
		Movie lt = mRepo.save(mv); 
					return lt;
	}
}
