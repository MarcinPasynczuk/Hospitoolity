package main.service;

import java.util.List;

import main.model.FreezerTemperatureChecker;




public interface FreezerTemperatureCheckerService {

	public List<FreezerTemperatureChecker> getAll();
	
	public FreezerTemperatureChecker getById(int id);
	
	public void saveOrUpdate(FreezerTemperatureChecker FreezerTemperatureChecker);
	
	public void delete(int id);
	
	public List<FreezerTemperatureChecker> getAllForNextMonth();
	
	
}
