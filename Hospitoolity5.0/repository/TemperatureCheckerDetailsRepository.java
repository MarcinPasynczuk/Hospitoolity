package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.TemperatureCheckerDetails;

@Repository
public interface TemperatureCheckerDetailsRepository extends JpaRepository<TemperatureCheckerDetails, Integer>{

}
