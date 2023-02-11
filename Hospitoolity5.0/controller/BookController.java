package main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.model.Book;
import main.service.BookService;



@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/addBook")
	public String showForm(Model model) {
		model.addAttribute("book", new Book());
		return "bookform";
	}
	
	@PostMapping("/processBookForm")
	public String showBookData(@Valid @ModelAttribute Book book, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "bookform";
		}
		bookService.saveOrUpdate(book);
		return "redirect:/showBook";
	}
	
	@GetMapping("/showBook")
	public String getBook(Model model) {
		List<Book> books = bookService.getAll();
		model.addAttribute("books", books);
		return "showBook";
	}


	@GetMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		Book book = bookService.getById(id);
		if(book != null) {
			bookService.delete(id);
		}
		return "redirect:/showBook";
	}
	
	@GetMapping("/editBook/{id}")
	public String editBook(@PathVariable int id, Model model) {
		Book book = bookService.getById(id);
		if(book != null) {
			model.addAttribute("book", book);
			return "bookform";
		}
		return "redirect:/showBook";
	}
		
}
