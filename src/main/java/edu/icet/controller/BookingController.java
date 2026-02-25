package edu.icet.controller;

import edu.icet.model.dto.BookingDTO;
import edu.icet.model.dto.InterviewSlotDTO;
import edu.icet.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public String createNewBooking(@RequestBody BookingDTO bookingDTO){
        return bookingService.createBooking(bookingDTO);
    }

    @GetMapping("/all-slot")
    public List<InterviewSlotDTO> getAllSlots(){
        return bookingService.getAllSlots();
    }

    @GetMapping("/interviewer-by/{id}")
    public List<InterviewSlotDTO> getInterviewerById(@PathVariable Long id){
        return bookingService.getInterviewerById(id);
    }


}
