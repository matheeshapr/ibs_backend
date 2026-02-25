package edu.icet.service;

import edu.icet.model.dto.BookingDTO;
import edu.icet.model.dto.InterviewSlotDTO;
import edu.icet.model.entity.InterviewSlot;
import edu.icet.repository.BookingRepository;
import edu.icet.repository.CandidateRepository;
import edu.icet.repository.InterviewSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private InterviewSlotRepository interviewSlotRepository;
    @Autowired
    private CandidateRepository candidateRepository;



    public String createBooking(BookingDTO bookingDTO) {
        InterviewSlot interviewSlot = interviewSlotRepository.findById(bookingDTO.getSlot().getId());
    }

    public List<InterviewSlot> getAllSlots() {
        return interviewSlotRepository.findAll();
    }

    public List<InterviewSlot> getInterviewerById(Long id) {
        return interviewSlotRepository.findByInterviewerId(id);
    }
}
