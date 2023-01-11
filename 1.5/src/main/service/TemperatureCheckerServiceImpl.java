package main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.dao.TemperatureCheckerDAO;
import main.model.TemperatureChecker;
import main.model.TemperatureCheckerDetails;

@Service
@Transactional
public class TemperatureCheckerServiceImpl implements TemperatureCheckerService{

	@Autowired
	private TemperatureCheckerDAO temperatureCheckerDAO;
	
	@Override
	public List<TemperatureChecker> getAll() {
		return temperatureCheckerDAO.getAll();
	}

	@Override
	public TemperatureChecker getById(int id) {
		return temperatureCheckerDAO.getById(id);
	}

	@Override
	public void saveOrUpdate(TemperatureChecker temperatureChecker) {
		temperatureCheckerDAO.saveOrUpdate(temperatureChecker);
	}

	@Override
	public void delete(int id) {
		temperatureCheckerDAO.delete(id);
	}

	@Override
	public void addTemperatureCheckerDetailsIfNotExists(TemperatureChecker temperatureChecker) {
		if(temperatureChecker.getTemperatureCheckerDetails() == null) {
			temperatureChecker.setTemperatureCheckerDetails(new TemperatureCheckerDetails());
			saveOrUpdate(temperatureChecker);
		
	}}
	}
