package main.service;

import java.util.List;

import main.model.ProveIt;



public interface ProveItService {

	public List<ProveIt> getAll();
	
	public ProveIt getById(int id);
	
	public void saveOrUpdate(ProveIt proveIt);
	
	public void delete(int id);
	
	public List<ProveIt> getAllForNextMonth();
	
}
