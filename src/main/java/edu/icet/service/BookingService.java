package edu.icet.service;

import edu.icet.model.dto.BookingDTO;
import edu.icet.model.dto.InterviewSlotDTO;
import edu.icet.repository.BookingRepository;
import edu.icet.repository.CandidateRepository;
import edu.icet.repository.InterviewSlotRepository;
import edu.icet.repository.InterviewerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {


    private BookingRepository bookingRepository;

    private InterviewSlotRepository interviewSlotRepository;

    private CandidateRepository candidateRepository;

    public String createBooking(BookingDTO bookingDTO) {
        return null;
    }

    public List<InterviewSlotDTO> getAllSlots() {
    }

    public List<InterviewSlotDTO> getInterviewerById(Long id) {
    }
}
