package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.Problem;


@Repository
public interface ProblemRepository extends JpaRepository<Problem, Integer>{
	
	
	public List<Problem> findByDateBetween(Date startDate, Date endDate);
}
