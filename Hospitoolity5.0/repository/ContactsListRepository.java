package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.ContactsList;

@Repository
public interface ContactsListRepository extends JpaRepository<ContactsList, Integer>{
		
}
