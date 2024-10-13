package api;


import domain.Candidate;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CandidateApi {
    public void create(Candidate candidate) {
        candidate.persist();
    }

    public Candidate update(Long id, Candidate candidate) {
        Candidate existingCandidate = Candidate.findById(id);
        if (existingCandidate == null) {
            throw new IllegalArgumentException("Candidate not found");
        }
        existingCandidate.setPhoto(candidate.getPhoto());
        existingCandidate.setGivenName(candidate.getGivenName());
        existingCandidate.setFamilyName(candidate.getFamilyName());
        existingCandidate.setEmail(candidate.getEmail());
        existingCandidate.setPhone(candidate.getPhone());
        existingCandidate.setJobTitle(candidate.getJobTitle());
        existingCandidate.persist();
        return existingCandidate;
    }

    public List<Candidate> list() {
        return Candidate.listAll();
    }
}
