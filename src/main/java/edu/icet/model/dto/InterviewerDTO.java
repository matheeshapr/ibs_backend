package edu.icet.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class InterviewerDTO {
    private Long id;
    private String name;
    private String email;
    private String department;
}
