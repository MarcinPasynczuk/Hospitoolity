package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.TemperatureChecker;

@Repository
public interface TemperatureCheckerRepository extends JpaRepository<TemperatureChecker, Integer>{
	
	public List<TemperatureChecker> findByDateBetween(Date startDate, Date endDate);

	
}
