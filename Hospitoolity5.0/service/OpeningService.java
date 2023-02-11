package main.service;

import java.util.List;

import main.model.Opening;


public interface OpeningService {

	public List<Opening> getAll();
	
	public Opening getById(int id);
	
	public void saveOrUpdate(Opening opening);
	
	public void delete(int id);
	
	public List<Opening> getAllForNextMonth();
	
	
}
