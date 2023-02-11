package main.service;

import java.util.List;

import main.model.MonthlyProbe;



public interface MonthlyProbeService {

	public List<MonthlyProbe> getAll();
	
	public MonthlyProbe getById(int id);
	
	public void saveOrUpdate(MonthlyProbe monthlyProbe);
	
	public void delete(int id);
	
}
