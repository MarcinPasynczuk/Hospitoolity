package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.MonthlyProbe;


@Repository
public interface MonthlyProbeRepository extends JpaRepository<MonthlyProbe, Integer>{
	
}
