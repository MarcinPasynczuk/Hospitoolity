package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.SuppliersList;

@Repository
public interface SuppliersListRepository extends JpaRepository<SuppliersList, Integer>{

	
}
