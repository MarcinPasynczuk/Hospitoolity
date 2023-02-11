package main.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.error.HospitoolityNotFoundException;
import main.model.ContactsList;
import main.repository.ContactsListRepository;


@Service
@Transactional
public class ContactsListServiceImpl implements ContactsListService{

	@Autowired
	private ContactsListRepository contactsListRepository;
	
	@Override
	public List<ContactsList> getAll() {
		return contactsListRepository.findAll();
	}

	@Override
	public ContactsList getById(int id) {
		return contactsListRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(ContactsList contactsList) {
		contactsListRepository.save(contactsList);
	}

	@Override
	public void delete(int id) {
		contactsListRepository.deleteById(id);
	}

	}
