package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.DeliveryRecord;


@Repository
public interface DeliveryRecordRepository extends JpaRepository<DeliveryRecord, Integer>{
	
	
	public List<DeliveryRecord> findByDateBetween(Date startDate, Date endDate);
}
