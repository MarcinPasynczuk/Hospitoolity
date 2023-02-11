package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.FreezerTemperatureChecker;

@Repository
public interface FreezerTemperatureCheckerRepository extends JpaRepository<FreezerTemperatureChecker, Integer>{
	
	public List<FreezerTemperatureChecker> findByDateBetween(Date startDate, Date endDate);

	
}
