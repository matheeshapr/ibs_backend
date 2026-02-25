package edu.icet.repository;

import edu.icet.model.entity.InterviewSlot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterviewSlotRepository extends JpaRepository<InterviewSlot,Long> {
    List<InterviewSlot> findByInterviewerId(Long inteviewerId);
}
