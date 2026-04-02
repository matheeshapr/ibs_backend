package edu.icet.controller;

import edu.icet.model.entity.InterviewSlot;
import edu.icet.service.InterviewSlotService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interview-slot")
@CrossOrigin
public class InterviewSlotController {

    @Autowired
    private InterviewSlotService interviewSlotService;

//    public InterviewSlotController(InterviewSlotService interviewSlotService) {
//        this.interviewSlotService = interviewSlotService;
//    }

    @PostMapping("/add")
    public InterviewSlot addSlot(@RequestBody InterviewSlot interviewSlot) {
        return interviewSlotService.saveSlot(interviewSlot);
    }

    @GetMapping("/all-slot")
    public List<InterviewSlot> getAllSlots() {
        return interviewSlotService.getAllSlots();
    }

    @GetMapping("/{id}/slots")
    public List<InterviewSlot> getSlots(@PathVariable Long id) {
        return interviewSlotService.getSlotsByInterviewer(id);
    }
}
