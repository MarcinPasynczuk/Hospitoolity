package main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.error.HospitoolityNotFoundException;
import main.model.Book;
import main.repository.BookRepository;


@Service
@Transactional
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book getById(int id) {
		return bookRepository.findById(id).orElseThrow(() -> new HospitoolityNotFoundException("Id " + id + " not found"));
	}

	@Override
	public void saveOrUpdate(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void delete(int id) {
		bookRepository.deleteById(id);
	}



	}
