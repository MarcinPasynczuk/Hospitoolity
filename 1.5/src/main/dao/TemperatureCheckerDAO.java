package main.dao;

import java.util.List;

import main.model.TemperatureChecker;

public interface TemperatureCheckerDAO {

	public List<TemperatureChecker> getAll();
	
	public TemperatureChecker getById(int id);
	
	public void saveOrUpdate(TemperatureChecker temperatureChecker);
	
	public void delete(int id);
	
}
