package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.TrainingRecord;
import main.repository.TrainingRecordRepository;


@Service
@Transactional
public class TrainingRecordServiceImpl implements TrainingRecordService{

	@Autowired
	private TrainingRecordRepository trainingRecordRepository;
	
	@Override
	public List<TrainingRecord> getAll() {
		return trainingRecordRepository.findAll();
	}

	@Override
	public TrainingRecord getById(int id) {
		return trainingRecordRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(TrainingRecord trainingRecord) {
		trainingRecordRepository.save(trainingRecord);
	}

	@Override
	public void delete(int id) {
		trainingRecordRepository.deleteById(id);
	}

	@Override
	public List<TrainingRecord> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return trainingRecordRepository.findByDateBetween(startDate, currentDate);
	}


	}
