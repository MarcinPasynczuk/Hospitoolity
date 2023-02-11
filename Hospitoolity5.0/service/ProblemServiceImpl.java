package main.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.Problem;
import main.repository.ProblemRepository;


@Service
@Transactional
public class ProblemServiceImpl implements ProblemService{

	@Autowired
	private ProblemRepository problemRepository;
	
	@Override
	public List<Problem> getAll() {
		return problemRepository.findAll();
	}

	@Override
	public Problem getById(int id) {
		return problemRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(Problem problem) {
		problemRepository.save(problem);
	}

	@Override
	public void delete(int id) {
		problemRepository.deleteById(id);
	}

	@Override
	public List<Problem> getAllForNextMonth() {
	    Date currentDate = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(currentDate);
	    calendar.add(Calendar.MONTH, -1);
	    Date startDate = calendar.getTime();
	    return problemRepository.findByDateBetween(startDate, currentDate);
	}


	}
