package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.FreezerTemperatureChecker;
import main.repository.FreezerTemperatureCheckerRepository;

@Service
@Transactional
public class FreezerTemperatureCheckerServiceImpl implements FreezerTemperatureCheckerService{

	@Autowired
	private FreezerTemperatureCheckerRepository freezerTemperatureCheckerRepository;
	
	@Override
	public List<FreezerTemperatureChecker> getAll() {
		return freezerTemperatureCheckerRepository.findAll();
	}

	@Override
	public FreezerTemperatureChecker getById(int id) {
		return freezerTemperatureCheckerRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(FreezerTemperatureChecker freezerTemperatureChecker) {
		freezerTemperatureCheckerRepository.save(freezerTemperatureChecker);
	}

	@Override
	public void delete(int id) {
		freezerTemperatureCheckerRepository.deleteById(id);
	}

	@Override
	public List<FreezerTemperatureChecker> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return freezerTemperatureCheckerRepository.findByDateBetween(startDate, currentDate);
	}

	}
