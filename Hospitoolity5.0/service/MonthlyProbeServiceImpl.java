package main.service;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.error.HospitoolityNotFoundException;
import main.model.MonthlyProbe;
import main.repository.MonthlyProbeRepository;


@Service
@Transactional
public class MonthlyProbeServiceImpl implements MonthlyProbeService{

	@Autowired
	private MonthlyProbeRepository monthlyProbeRepository;
	
	@Override
	public List<MonthlyProbe> getAll() {
		return monthlyProbeRepository.findAll();
	}

	@Override
	public MonthlyProbe getById(int id) {
		return monthlyProbeRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(MonthlyProbe monthlyProbe) {
		monthlyProbeRepository.save(monthlyProbe);
	}

	@Override
	public void delete(int id) {
		monthlyProbeRepository.deleteById(id);
	}

	}
