package pt.up.fc.dcc.pdm.core;

import java.util.List;
import pt.up.fc.dcc.pdm.resources.*;

public interface MovieServer {

    public List<Movie> getMovies();

    public Movie getMovie(int id);
    
}
