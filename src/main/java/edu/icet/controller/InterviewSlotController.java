package edu.icet.controller;

import edu.icet.model.entity.InterviewSlot;
import edu.icet.service.InterviewSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview-slot")
@CrossOrigin
public class InterviewSlotController {

    @Autowired
    private InterviewSlotService interviewSlotService;

    @PostMapping("/add")
    public InterviewSlot addSlot(@RequestBody InterviewSlot interviewSlot){
        return interviewSlotService.saveSlot(interviewSlot);
    }

    @GetMapping("/all-slot")
    public List<InterviewSlot> getAllSlots(){
        System.out.println(interviewSlotService.getAllSlots());
        return interviewSlotService.getAllSlots();
    }

}
