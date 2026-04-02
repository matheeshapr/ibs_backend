package edu.icet.controller;

import edu.icet.model.entity.Interviewer;
import edu.icet.service.InterviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interviewer")
@CrossOrigin(origins = "http://localhost:4200")
public class InterviewerController {

    @Autowired
    private InterviewerService interviewerService;

    @PostMapping("/add")
    public Interviewer addInterviewer(@RequestBody Interviewer interviewer){
        return interviewerService.save(interviewer);
    }

    @GetMapping("/get-all")
    public List<Interviewer> getAllInterviewer(){
        return interviewerService.getAll();
    }
}
