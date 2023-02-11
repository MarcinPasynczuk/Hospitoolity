package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.TemperatureChecker;
import main.repository.TemperatureCheckerRepository;

@Service
@Transactional
public class TemperatureCheckerServiceImpl implements TemperatureCheckerService{

	@Autowired
	private TemperatureCheckerRepository temperatureCheckerRepository;
	
	@Override
	public List<TemperatureChecker> getAll() {
		return temperatureCheckerRepository.findAll();
	}

	@Override
	public TemperatureChecker getById(int id) {
		return temperatureCheckerRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(TemperatureChecker temperatureChecker) {
		temperatureCheckerRepository.save(temperatureChecker);
	}

	@Override
	public void delete(int id) {
		temperatureCheckerRepository.deleteById(id);
	}

	@Override
	public List<TemperatureChecker> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return temperatureCheckerRepository.findByDateBetween(startDate, currentDate);
	}

	}
