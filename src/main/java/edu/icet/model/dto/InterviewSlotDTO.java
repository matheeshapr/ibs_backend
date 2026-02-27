package edu.icet.model.dto;

import edu.icet.model.entity.Interviewer;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class InterviewSlotDTO {
    private Long id;

    private Long interviewer;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isBooked = false;
}
