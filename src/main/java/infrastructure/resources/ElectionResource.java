package infrastructure.resources;

import api.ElectionApi;

import domain.Election;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


import java.util.List;

@Path("/api/elections")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ElectionResource {

    private final ElectionApi api;

    public ElectionResource(ElectionApi api) {
        this.api = api;
    }

    @POST
    @Transactional
    public void submit() {
        api.submit();
    }

    @GET
    public List<Election> list() {
        return api.findAll();
    }
}
