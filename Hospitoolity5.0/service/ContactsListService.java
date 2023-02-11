package main.service;

import java.util.List;

import main.model.ContactsList;



public interface ContactsListService {

	public List<ContactsList> getAll();
	
	public ContactsList getById(int id);
	
	public void saveOrUpdate(ContactsList contactsList);
	
	public void delete(int id);
	
}
