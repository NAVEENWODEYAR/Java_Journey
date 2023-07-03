package com.mango.service;

import com.mango.modal.Movie;
import com.mango.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService
{
    // injecting the objet..,
    @Autowired
    MovieRepo mRepo;

    // CRUD operations.,
    //1. insert query.,
    public List<Movie> insertMovieData(List<Movie> mv)
    {
        List<Movie> lt = mRepo.saveAll(mv);
                    return lt;
    }

    //2. select query..,
    public List<Movie> getMovieData()
    {
        return mRepo.findAll();
    }

    // 3. update query..,

}
