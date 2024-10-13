package api;

import domain.Election;
import domain.services.ElectionService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


import java.util.List;

@ApplicationScoped
public class ElectionApi {

    @Inject
    ElectionService service;

    public void submit() {
        // Lógica de submissão
    }

    public List<Election> findAll() {
        return service.findAll();
    }
}
