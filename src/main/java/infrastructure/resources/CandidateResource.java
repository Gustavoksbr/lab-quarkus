package infrastructure.resources;

import api.CandidateApi;
import domain.Candidate;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


import java.util.List;

@Path("/api/candidates")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandidateResource {

    private final CandidateApi api;

    public CandidateResource(CandidateApi api) {
        this.api = api;
    }

    @POST
    @Transactional
    public void create(domain.Candidate dto) {
        api.create(dto);
    }

        @GET
    public List<Candidate> list() {
        return api.list();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Candidate update(@PathParam("id") String id, Candidate dto) {
        return api.update(dto.id, dto);
    }
}
