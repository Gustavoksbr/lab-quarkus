package domain;

import java.util.List;

import jakarta.inject.Inject;

@jakarta.enterprise.context.ApplicationScoped
public class CandidateService {

    @Inject
    CandidateRepository repository;

    public void save(Candidate candidate) {
        repository.persist(candidate);
    }

    public List<Candidate> findAll() {
        return repository.listAll();
    }

    public Candidate findById(String id) {
        return repository.findById(Long.valueOf(id));
    }
}
