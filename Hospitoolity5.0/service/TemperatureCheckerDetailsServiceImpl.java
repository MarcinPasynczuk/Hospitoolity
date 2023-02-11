package main.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.model.TemperatureCheckerDetails;
import main.repository.TemperatureCheckerDetailsRepository;


@Service
@Transactional
public class TemperatureCheckerDetailsServiceImpl implements TemperatureCheckerDetailsService {

	
	@Autowired
	private TemperatureCheckerDetailsRepository temperatureCheckerDetailsRepository;

	@Override
	public TemperatureCheckerDetails getById(int id) {
		return temperatureCheckerDetailsRepository.getOne(id);
	}

	@Override
	public void saveOrUpdate(TemperatureCheckerDetails temperatureCheckerDetails) {
		temperatureCheckerDetailsRepository.save(temperatureCheckerDetails);
		
	}

	@Override
	public void delete(int id) {
		temperatureCheckerDetailsRepository.deleteById(id);	
	}

}
