package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.Cleaning;
import main.repository.CleaningRepository;


@Service
@Transactional
public class CleaningServiceImpl implements CleaningService{

	@Autowired
	private CleaningRepository cleaningRepository;
	
	@Override
	public List<Cleaning> getAll() {
		return cleaningRepository.findAll();
	}

	@Override
	public Cleaning getById(int id) {
		return cleaningRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(Cleaning cleaning) {
		cleaningRepository.save(cleaning);
	}

	@Override
	public void delete(int id) {
		cleaningRepository.deleteById(id);
	}

	@Override
	public List<Cleaning> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return cleaningRepository.findByDateBetween(startDate, currentDate);
	}


	}
