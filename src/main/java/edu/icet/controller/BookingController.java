package edu.icet.controller;

import edu.icet.model.dto.BookingDTO;
import edu.icet.model.entity.Booking;
import edu.icet.model.entity.InterviewSlot;
import edu.icet.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public String createNewBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }

    @GetMapping("/all-bookings")
    public List<Booking> getAllBookings(){
        System.out.println(bookingService.getAllBookings());
        return bookingService.getAllBookings();
    }

    @GetMapping("/interviewer-by/{id}")
    public List<InterviewSlot> getInterviewerById(@PathVariable Long id){
        return bookingService.getInterviewerById(id);
    }
}
