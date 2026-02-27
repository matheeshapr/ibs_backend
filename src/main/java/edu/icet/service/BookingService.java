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
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private InterviewSlotRepository interviewSlotRepository;
    @Autowired
    private CandidateRepository candidateRepository;



    public String createBooking(Booking booking) {
            Optional<InterviewSlot> slotOptional = interviewSlotRepository.findById(booking.getSlotId());

            if (slotOptional.isEmpty()) {
                return "ERROR:\n" +
                        "Slot with this ID does not exist in the system!";
            }

            InterviewSlot slot = slotOptional.get();

            if (slot.isBooked()) {
                return "ERROR:\n" +
                        "This time slot is already booked by someone else!";
            }

            if (slot.getStartTime().isBefore(LocalDateTime.now())) {
                return "ERROR\n:" +
                        "Bookings cannot be made for past time slots!";
            }

            booking.setStatus("CONFIRMED");
            booking.setCreatedAt(LocalDateTime.now());
            bookingRepository.save(booking);

            slot.setBooked(true);
            interviewSlotRepository.save(slot);

            System.out.println("SIMULATION: Email sent to Candidate for slot: " + slot.getStartTime());

            return "Success\n:" +
                    "Booking completed successfully!";

    }

    public List<InterviewSlot> getInterviewerById(Long id) {
        return interviewSlotRepository.findByInterviewerId(id);
    }

    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }
}
