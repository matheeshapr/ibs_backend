package edu.icet.service;

import edu.icet.model.entity.Interviewer;
import edu.icet.repository.InterviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewerService {

    @Autowired
    private InterviewerRepository interviewerRepository;

    public Interviewer save(Interviewer interviewer) {
        return interviewerRepository.save(interviewer);
    }

    public List<Interviewer> getAll() {
        return interviewerRepository.findAll();
    }
}
