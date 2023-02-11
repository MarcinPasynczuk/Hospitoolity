package main.service;

import java.util.List;

import main.model.Closing;



public interface ClosingService {

	public List<Closing> getAll();
	
	public Closing getById(int id);
	
	public void saveOrUpdate(Closing closing);
	
	public void delete(int id);
	
	public List<Closing> getAllForNextMonth();
	
}
