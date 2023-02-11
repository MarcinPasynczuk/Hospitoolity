package main.service;

import java.util.List;

import main.model.TrainingRecord;



public interface TrainingRecordService {

	public List<TrainingRecord> getAll();
	
	public TrainingRecord getById(int id);
	
	public void saveOrUpdate(TrainingRecord trainingRecord);
	
	public void delete(int id);
	
	public List<TrainingRecord> getAllForNextMonth();
	
}
