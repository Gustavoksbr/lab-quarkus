package domain.services;

import domain.Election;


import java.util.List;

import domain.ElectionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@jakarta.enterprise.context.ApplicationScoped
public class ElectionService {

    @Inject
    ElectionRepository repository;

    public void submit(Election election) {
        repository.persist(election);
    }

    public List<Election> findAll() {
        return repository.listAll();
    }
}
