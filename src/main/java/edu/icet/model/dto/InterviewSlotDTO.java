package edu.icet.model.dto;

import edu.icet.model.entity.Interviewer;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class InterviewSlotDTO {
    private Long id;
    private Interviewer interviewer;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isBooked = false;
}
