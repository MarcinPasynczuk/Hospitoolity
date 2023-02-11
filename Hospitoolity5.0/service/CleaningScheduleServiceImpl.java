package main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.error.HospitoolityNotFoundException;
import main.model.CleaningSchedule;
import main.repository.CleaningScheduleRepository;


@Service
@Transactional
public class CleaningScheduleServiceImpl implements CleaningScheduleService{

	@Autowired
	private CleaningScheduleRepository cleaningScheduleRepository;
	
	@Override
	public List<CleaningSchedule> getAll() {
		return cleaningScheduleRepository.findAll();
	}

	@Override
	public CleaningSchedule getById(int id) {
		return cleaningScheduleRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(CleaningSchedule cleaningSchedule) {
		cleaningScheduleRepository.save(cleaningSchedule);
	}

	@Override
	public void delete(int id) {
		cleaningScheduleRepository.deleteById(id);
	}


	}
