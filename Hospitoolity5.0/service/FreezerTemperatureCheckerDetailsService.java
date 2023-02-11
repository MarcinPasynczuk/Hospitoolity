package main.service;

import main.model.FreezerTemperatureCheckerDetails;

public interface FreezerTemperatureCheckerDetailsService {

	public FreezerTemperatureCheckerDetails getById(int id);
	
	public void saveOrUpdate(FreezerTemperatureCheckerDetails freezerTemperatureCheckerDetails);
	
	public void delete(int id);
	
}
