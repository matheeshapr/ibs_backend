package edu.icet.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class CandidateDTO {
    private Long id;
    private String name;
    private String email;
}
