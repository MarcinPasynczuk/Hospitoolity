package main.service;

import main.model.TemperatureCheckerDetails;

public interface TemperatureCheckerDetailsService {

	public TemperatureCheckerDetails getById(int id);
	
	public void saveOrUpdate(TemperatureCheckerDetails temperatureCheckerDetails);
	
	public void delete(int id);
	
}
