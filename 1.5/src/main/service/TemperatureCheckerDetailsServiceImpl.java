package main.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.dao.TemperatureCheckerDetailsDAO;
import main.model.TemperatureCheckerDetails;


@Service
@Transactional
public class TemperatureCheckerDetailsServiceImpl implements TemperatureCheckerDetailsService {

	
	@Autowired
	private TemperatureCheckerDetailsDAO temperatureCheckerDetailsDAO;

	@Override
	public TemperatureCheckerDetails getById(int id) {
		return temperatureCheckerDetailsDAO.getById(id);
	}

	@Override
	public void saveOrUpdate(TemperatureCheckerDetails temperatureCheckerDetails) {
		temperatureCheckerDetailsDAO.saveOrUpdate(temperatureCheckerDetails);
		
	}

	@Override
	public void delete(int id) {
		temperatureCheckerDetailsDAO.delete(id);		
	}


	
	



}
