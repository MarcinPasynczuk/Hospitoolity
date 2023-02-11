package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.CleaningSchedule;


@Repository
public interface CleaningScheduleRepository extends JpaRepository<CleaningSchedule, Integer>{

}
