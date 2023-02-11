package main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.Book2;
import main.repository.Book2Repository;


@Service
@Transactional
public class Book2ServiceImpl implements Book2Service{

	@Autowired
	private Book2Repository book2Repository;
	
	@Override
	public List<Book2> getAll() {
		return book2Repository.findAll();
	}

	@Override
	public Book2 getById(int id) {
		return book2Repository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(Book2 book2) {
		book2Repository.save(book2);
	}

	@Override
	public void delete(int id) {
		book2Repository.deleteById(id);
	}



	}
