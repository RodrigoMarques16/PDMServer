package pt.up.fc.dcc.pdm.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import pt.up.fc.dcc.pdm.core.MovieServer;

import com.google.inject.Inject;

@Path("/resources")
public class MovieResource {
	private final MovieServer server;

	@Inject
	public MovieResource(MovieServer server) {
		this.server = server;
	}

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMovies() {
        return Response.ok(server.getMovies(), MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMovie(@PathParam("id") int id) {
        Movie movie = server.getMovie(id);
        if (movie == null) {
            return Response .status(Response.Status.NOT_FOUND).entity("File not found for ID: " + id).build();
        }
        GenericEntity<Movie> entity = new GenericEntity<Movie>(movie) { };
        //return Response.ok(movie, MediaType.APPLICATION_JSON).build();
        return Response.ok(entity).build();
    }

    /*
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createResource(String content) {
        
    }*/

}