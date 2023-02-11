package main.service;

import java.util.List;

import main.model.Cleaning;



public interface CleaningService {

	public List<Cleaning> getAll();
	
	public Cleaning getById(int id);
	
	public void saveOrUpdate(Cleaning cleaning);
	
	public void delete(int id);
	
	public List<Cleaning> getAllForNextMonth();
	
}
