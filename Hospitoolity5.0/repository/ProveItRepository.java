package main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.ProveIt;


@Repository
public interface ProveItRepository extends JpaRepository<ProveIt, Integer>{
	
	
	public List<ProveIt> findByDateBetween(Date startDate, Date endDate);
}
