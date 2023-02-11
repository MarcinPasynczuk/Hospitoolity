package main.service;

import java.util.List;

import main.model.CleaningSchedule;



public interface CleaningScheduleService {

	public List<CleaningSchedule> getAll();
	
	public CleaningSchedule getById(int id);
	
	public void saveOrUpdate(CleaningSchedule cleaningSchedule);
	
	public void delete(int id);
	
	
}
