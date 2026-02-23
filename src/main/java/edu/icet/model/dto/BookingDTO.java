package edu.icet.model.dto;

import edu.icet.model.entity.Candidate;
import edu.icet.model.entity.InterviewSlot;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class BookingDTO {
    private Long id;
    private Candidate candidate;
    private InterviewSlot slot;
    private String status = "CONFIRMED"; // Default status
    private LocalDateTime createdAt = LocalDateTime.now();
}
