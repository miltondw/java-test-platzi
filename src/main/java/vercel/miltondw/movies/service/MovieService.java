package vercel.miltondw.movies.service;

import vercel.miltondw.movies.data.MovieRepository;
import vercel.miltondw.movies.model.Genre;
import vercel.miltondw.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre()==genre)
                .collect(Collectors.toList());
    }

    public Collection<Movie> findByLength(int time) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes()>=time)
                .collect(Collectors.toList());
    }
}
