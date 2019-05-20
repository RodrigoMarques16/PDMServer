package pt.up.fc.dcc.pdm.core;

import pt.up.fc.dcc.pdm.resources.*;

import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;

import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.List;

class MovieServerImpl implements MovieServer {

    static List<Movie> movies = new ArrayList<>();

    @Inject
    public MovieServerImpl() {
        try (CqlSession session = CqlSession.builder()
            .withKeyspace(CqlIdentifier.fromCql("twitchflix"))
            .build()) { 
            
            ResultSet rs = session.execute("select * from movie");

            rs.forEach((Row row) -> 
                movies.add(movieFromRow(row))
            );
        }
    }

    @Override
    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public Movie getMovie(int id) {
        try (CqlSession session = CqlSession.builder()
            .withKeyspace(CqlIdentifier.fromCql("twitchflix"))
            .build()) { 
            
            ResultSet rs = session.execute("select * from movie where id = " + id);
            Row row = rs.one();
            
            if (row == null)
                return null;

            return movieFromRow(row);
        }
    }

    private Movie movieFromRow(Row row) {
        return new Movie(
            row.getInt("id"),
            row.getString("name"), 
            row.getInt("year"), 
            row.getSet("tags", String.class),
            new Length(
                row.getInt("hours"), 
                row.getInt("minutes"), 
                row.getInt("seconds")
            ),
            row.getString("url")
        );
    }

}
