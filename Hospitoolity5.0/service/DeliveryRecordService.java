package main.service;

import java.util.List;

import main.model.DeliveryRecord;



public interface DeliveryRecordService {

	public List<DeliveryRecord> getAll();
	
	public DeliveryRecord getById(int id);
	
	public void saveOrUpdate(DeliveryRecord deliveryRecord);
	
	public void delete(int id);
	
	public List<DeliveryRecord> getAllForNextMonth();
	
}
