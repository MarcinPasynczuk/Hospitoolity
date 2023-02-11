package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.error.HospitoolityNotFoundException;
import main.model.ProveIt;
import main.repository.ProveItRepository;


@Service
@Transactional
public class ProveItServiceImpl implements ProveItService{

	@Autowired
	private ProveItRepository proveItRepository;
	
	@Override
	public List<ProveIt> getAll() {
		return proveItRepository.findAll();
	}

	@Override
	public ProveIt getById(int id) {
		return proveItRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(ProveIt proveIt) {
		proveItRepository.save(proveIt);
	}

	@Override
	public void delete(int id) {
		proveItRepository.deleteById(id);
	}
	@Override
	public List<ProveIt> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return proveItRepository.findByDateBetween(startDate, currentDate);
	}


	}
