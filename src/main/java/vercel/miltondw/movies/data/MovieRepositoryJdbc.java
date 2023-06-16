package vercel.miltondw.movies.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import vercel.miltondw.movies.model.Genre;
import vercel.miltondw.movies.model.Movie;
import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {
    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] args = {id};
        return jdbcTemplate.queryForObject("select * from movies where id=?",args,movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {

        return jdbcTemplate.query("select * from movies",movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        Object[] args = {movie.getName(),movie.getMinutes(),movie.getGenre().toString()};
        jdbcTemplate.update("insert into movies (name, minutes, genre) values(?,?,?)",args);
    }
    private static RowMapper<Movie> movieMapper= (res, i) -> new Movie(
            res.getInt("id"),
            res.getString("name"),
            res.getInt("minutes"),
            Genre.valueOf(res.getString("genre"))
    );
}
