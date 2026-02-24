package edu.icet.controller;

import edu.icet.model.dto.BookingDTO;
import edu.icet.service.BookingService;
import org.springframework.web.bind.annotation.PostMapping;

public class BookingController {

    private BookingService bookingService;

    @PostMapping("/create")
    public String createNewBooking(BookingDTO bookingDTO){
        return bookingService.createBooking(bookingDTO);
    }
}
