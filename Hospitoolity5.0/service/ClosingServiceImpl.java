package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.Closing;
import main.repository.ClosingRepository;


@Service
@Transactional
public class ClosingServiceImpl implements ClosingService{

	@Autowired
	private ClosingRepository closingRepository;
	
	@Override
	public List<Closing> getAll() {
		return closingRepository.findAll();
	}

	@Override
	public Closing getById(int id) {
		return closingRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(Closing closing) {
		closingRepository.save(closing);
	}

	@Override
	public void delete(int id) {
		closingRepository.deleteById(id);
	}

	@Override
	public List<Closing> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return closingRepository.findByDateBetween(startDate, currentDate);
	}


	}
