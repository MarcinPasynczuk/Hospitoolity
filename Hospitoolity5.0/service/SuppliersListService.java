package main.service;

import java.util.List;

import main.model.SuppliersList;



public interface SuppliersListService {

	public List<SuppliersList> getAll();
	
	public SuppliersList getById(int id);
	
	public void saveOrUpdate(SuppliersList suppliersList);
	
	public void delete(int id);
	
}
