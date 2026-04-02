package edu.icet.service;

import edu.icet.model.entity.InterviewSlot;
import edu.icet.repository.InterviewSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InterviewSlotService {

    @Autowired
    private InterviewSlotRepository interviewSlotRepository;

    public InterviewSlot saveSlot(InterviewSlot interviewSlot) {
        return interviewSlotRepository.save(interviewSlot);
    }

    public List<InterviewSlot> getSlotsByInterviewer(Long interviewerId) {
        return interviewSlotRepository.findByInterviewerId(interviewerId);
    }

    public List<InterviewSlot> getAllSlots() {
        return interviewSlotRepository.findAll();
    }
}
