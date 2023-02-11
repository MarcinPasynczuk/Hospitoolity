package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.Book2;


@Repository
public interface Book2Repository extends JpaRepository<Book2, Integer>{
		
}
