package main.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.FreezerTemperatureCheckerDetails;
import main.repository.FreezerTemperatureCheckerDetailsRepository;






@Service
@Transactional
public class FreezerTemperatureCheckerDetailsServiceImpl implements FreezerTemperatureCheckerDetailsService {

	
	@Autowired
	private FreezerTemperatureCheckerDetailsRepository freezerTemperatureCheckerDetailsRepository;

	@Override
	public FreezerTemperatureCheckerDetails getById(int id) {
		return freezerTemperatureCheckerDetailsRepository.getOne(id);
	}

	@Override
	public void saveOrUpdate(FreezerTemperatureCheckerDetails freezerTemperatureCheckerDetails) {
		freezerTemperatureCheckerDetailsRepository.save(freezerTemperatureCheckerDetails);
		
	}

	@Override
	public void delete(int id) {
		freezerTemperatureCheckerDetailsRepository.deleteById(id);	
	}


}
