package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.DeliveryRecord;
import main.repository.DeliveryRecordRepository;


@Service
@Transactional
public class DeliveryRecordServiceImpl implements DeliveryRecordService{

	@Autowired
	private DeliveryRecordRepository deliveryRecordRepository;
	
	@Override
	public List<DeliveryRecord> getAll() {
		return deliveryRecordRepository.findAll();
	}

	@Override
	public DeliveryRecord getById(int id) {
		return deliveryRecordRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(DeliveryRecord deliveryRecord) {
		deliveryRecordRepository.save(deliveryRecord);
	}

	@Override
	public void delete(int id) {
		deliveryRecordRepository.deleteById(id);
	}

	@Override
	public List<DeliveryRecord> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return deliveryRecordRepository.findByDateBetween(startDate, currentDate);
	}


	}
