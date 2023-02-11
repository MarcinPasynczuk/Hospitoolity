package main.service;

import java.util.List;

import main.model.TemperatureChecker;


public interface TemperatureCheckerService {

	public List<TemperatureChecker> getAll();
	
	public TemperatureChecker getById(int id);
	
	public void saveOrUpdate(TemperatureChecker TemperatureChecker);
	
	public void delete(int id);
	
	public List<TemperatureChecker> getAllForNextMonth();
	
	
}
