package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.Cleaning;


@Repository
public interface CleaningRepository extends JpaRepository<Cleaning, Integer>{
	
	
	public List<Cleaning> findByDateBetween(Date startDate, Date endDate);
}
