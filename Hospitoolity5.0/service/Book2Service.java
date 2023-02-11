package main.service;

import java.util.List;

import main.model.Book2;





public interface Book2Service {

	public List<Book2> getAll();
	
	public Book2 getById(int id);
	
	public void saveOrUpdate(Book2 book2);
	
	public void delete(int id);
	
	
}
