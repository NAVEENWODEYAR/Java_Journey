package com.moviedb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.moviedb.modal.Movie;

public interface MovieRepo extends MongoRepository<Movie, String> {

}
