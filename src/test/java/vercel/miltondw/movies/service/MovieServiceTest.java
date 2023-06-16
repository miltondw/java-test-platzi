package vercel.miltondw.movies.service;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import vercel.miltondw.movies.data.MovieRepository;
import vercel.miltondw.movies.model.Genre;
import vercel.miltondw.movies.model.Movie;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {
    private MovieRepository movieRepository;
    private MovieService movieService;
    @Before
    public void setup(){
        movieRepository= Mockito.mock(MovieRepository.class);
        List<Movie> movieList = Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                new Movie(4, "Super 8", 112, Genre.THRILLER),
                new Movie(5, "Scream", 111, Genre.HORROR),
                new Movie(6, "Home Alone", 103, Genre.COMEDY),
                new Movie(7, "Matrix", 136, Genre.ACTION),
                new Movie(8, "One Piece Heart Gold ", 90, Genre.ACTION)
        );
        Mockito.when(movieRepository.findAll()).thenReturn(movieList);
        movieService = new MovieService(movieRepository);
    }
    @Test
    public void return_movies_by_genre() {
        Collection<Movie> movies = movieService.findByGenre(Genre.COMEDY);
        assertEquals(2, movies.size());
        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(3,6)));
    }

    @Test
    public void return_movies_by_length() {
        Collection<Movie> movies = movieService.findByLength(120);
        assertEquals(2, movies.size());
        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(1,7)));
    }

    private static List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }
}