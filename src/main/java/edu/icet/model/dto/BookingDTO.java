package edu.icet.model.dto;

import edu.icet.model.entity.Candidate;
import edu.icet.model.entity.InterviewSlot;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class BookingDTO {
    private Long id;
    private Candidate candidate;
    private InterviewSlot slotId;
    private String status = "CONFIRMED"; // Default status
    private LocalDateTime createdAt = LocalDateTime.now();
}
