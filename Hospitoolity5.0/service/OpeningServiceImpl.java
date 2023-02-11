package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.Opening;
import main.repository.OpeningRepository;


@Service
@Transactional
public class OpeningServiceImpl implements OpeningService{

	@Autowired
	private OpeningRepository openingRepository;
	
	@Override
	public List<Opening> getAll() {
		return openingRepository.findAll();
	}

	@Override
	public Opening getById(int id) {
		return openingRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(Opening opening) {
		openingRepository.save(opening);
	}

	@Override
	public void delete(int id) {
		openingRepository.deleteById(id);
	}

	@Override
	public List<Opening> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return openingRepository.findByDateBetween(startDate, currentDate);
	}

	}
