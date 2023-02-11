package main.service;

import java.util.List;

import main.model.Book;





public interface BookService {

	public List<Book> getAll();
	
	public Book getById(int id);
	
	public void saveOrUpdate(Book book);
	
	public void delete(int id);
	
	
}
