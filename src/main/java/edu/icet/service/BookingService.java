package edu.icet.service;

import edu.icet.model.dto.BookingDTO;
import edu.icet.model.entity.Booking;
import edu.icet.model.entity.Candidate;
import edu.icet.model.entity.InterviewSlot;
import edu.icet.repository.BookingRepository;
import edu.icet.repository.CandidateRepository;
import edu.icet.repository.InterviewSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    InterviewSlotRepository interviewSlotRepository;
    @Autowired
    CandidateRepository candidateRepository;



    public String createBooking(Booking booking) {

        InterviewSlot slot = interviewSlotRepository.findById(booking.getSlotId()).get();

        if (slot.isBooked()) {
            return "Already Booked!";
        }

        booking.setStatus("CONFIRMED");
        booking.setCreatedAt(LocalDateTime.now());

        bookingRepository.save(booking);

        slot.setBooked(true);
        interviewSlotRepository.save(slot);

        System.out.println(bookingRepository.save(booking));
        return "Booking Success!";
    }
    public List<InterviewSlot> getAllSlots() {
        return interviewSlotRepository.findAll();
    }

    public List<InterviewSlot> getInterviewerById(Long id) {
        return interviewSlotRepository.findByInterviewerId(id);
    }

    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }
}
