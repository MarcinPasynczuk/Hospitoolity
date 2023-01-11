package main.dao;

import main.model.TemperatureCheckerDetails;

public interface TemperatureCheckerDetailsDAO {

	public TemperatureCheckerDetails getById(int id);
	
	public void saveOrUpdate(TemperatureCheckerDetails temperatureCheckerDetails);
	
	public void delete(int id);
	
}
