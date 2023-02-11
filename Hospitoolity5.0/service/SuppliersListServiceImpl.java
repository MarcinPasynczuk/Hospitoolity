package main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.error.HospitoolityNotFoundException;
import main.model.SuppliersList;
import main.repository.SuppliersListRepository;


@Service
@Transactional
public class SuppliersListServiceImpl implements SuppliersListService{

	@Autowired
	private SuppliersListRepository suppliersListRepository;
	
	@Override
	public List<SuppliersList> getAll() {
		return suppliersListRepository.findAll();
	}

	@Override
	public SuppliersList getById(int id) {
		return suppliersListRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(SuppliersList suppliersList) {
		suppliersListRepository.save(suppliersList);
	}

	@Override
	public void delete(int id) {
		suppliersListRepository.deleteById(id);
	}


	}
