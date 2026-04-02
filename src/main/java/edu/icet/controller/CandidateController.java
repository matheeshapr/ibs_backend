package edu.icet.controller;

import edu.icet.model.entity.Candidate;
import edu.icet.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidate")
@CrossOrigin(origins = "http://localhost:4200")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/add")
    public Candidate addCandidate(@RequestBody Candidate candidate){
        return candidateService.save(candidate);
    }

    @GetMapping("/get-all")
    public List<Candidate> getAllCandidate(){
        return candidateService.getAll();
    }
}
