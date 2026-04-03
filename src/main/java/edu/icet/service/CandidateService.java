package edu.icet.service;

import edu.icet.model.dto.CandidateDTO;
import edu.icet.model.entity.Candidate;
import edu.icet.model.entity.User;
import edu.icet.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public Candidate save(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public List<Candidate> getAll() {
        return candidateRepository.findAll();
    }

    public void registerCandidate(CandidateDTO dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole("CANDIDATE");

        Candidate candidate = new Candidate();
        candidate.setName(dto.getName());
        candidate.setUser(user);

        candidateRepository.save(candidate);
    }
}
