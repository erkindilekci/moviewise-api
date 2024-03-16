package com.erkindilekci.movies.service;

import com.erkindilekci.movies.model.Movie;
import com.erkindilekci.movies.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> movieById(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
