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

import main.model.Book2;
import main.service.Book2Service;



@Controller
public class Book2Controller {
	
	@Autowired
	private Book2Service book2Service;

	@GetMapping("/addBook2")
	public String showForm(Model model) {
		model.addAttribute("book2", new Book2());
		return "book2form";
	}
	
	@PostMapping("/processBook2Form")
	public String showBook2Data(@Valid @ModelAttribute Book2 book2, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "book2form";
		}
		book2Service.saveOrUpdate(book2);
		return "redirect:/showBook2";
	}
	
	@GetMapping("/showBook2")
	public String getBook2(Model model) {
		List<Book2> books2 = book2Service.getAll();
		model.addAttribute("books2", books2);
		return "showBook2";
	}


	@GetMapping("/deleteBook2/{id}")
	public String deleteBook2(@PathVariable int id) {
		Book2 book2 = book2Service.getById(id);
		if(book2 != null) {
			book2Service.delete(id);
		}
		return "redirect:/showBook2";
	}
	
	@GetMapping("/editBook2/{id}")
	public String editBook2(@PathVariable int id, Model model) {
		Book2 book2 = book2Service.getById(id);
		if(book2 != null) {
			model.addAttribute("book2", book2);
			return "book2form";
		}
		return "redirect:/showBook2";
	}
		
}
