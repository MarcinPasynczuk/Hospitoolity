package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.TrainingRecord;

@Repository
public interface TrainingRecordRepository extends JpaRepository<TrainingRecord, Integer>{
	
	public List<TrainingRecord> findByDateBetween(Date startDate, Date endDate);

	
}
