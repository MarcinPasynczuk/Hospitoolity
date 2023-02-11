package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.Opening;

@Repository
public interface OpeningRepository extends JpaRepository<Opening, Integer>{
	
	public List<Opening> findByDateBetween(Date startDate, Date endDate);

	
}
