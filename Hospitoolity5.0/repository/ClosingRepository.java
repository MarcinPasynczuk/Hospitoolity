package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.Closing;

@Repository
public interface ClosingRepository extends JpaRepository<Closing, Integer>{
	
	public List<Closing> findByDateBetween(Date startDate, Date endDate);

	
}
