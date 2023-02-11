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

import main.model.Cleaning;
import main.service.CleaningService;

@Controller
public class CleaningController {
	
	@Autowired
	private CleaningService cleaningService;

	@GetMapping("/addCleaning")
	public String showForm(Model model) {
		model.addAttribute("cleaning", new Cleaning());
		return "formCleaning";
	}
	
	@PostMapping("/processCleaningForm")
	public String showTourData(@Valid @ModelAttribute Cleaning cleaning, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formCleaning";
		}
		cleaningService.saveOrUpdate(cleaning);
		return "redirect:/showCleaning";
	}
	
	@GetMapping("/showCleaning")
	public String getCleaning(Model model) {
		List<Cleaning> cleanings = cleaningService.getAll();
		model.addAttribute("cleanings", cleanings);
		return "showCleaning";
	}


	@GetMapping("/deleteCleaning/{id}")
	public String deleteCleaning(@PathVariable int id) {
		Cleaning cleaning = cleaningService.getById(id);
		if(cleaning != null) {
			cleaningService.delete(id);
		}
		return "redirect:/showCleaning";
	}
	
	@GetMapping("/editCleaning/{id}")
	public String editCleaning(@PathVariable int id, Model model) {
		Cleaning cleaning = cleaningService.getById(id);
		if(cleaning != null) {
			model.addAttribute("cleaning", cleaning);
			return "formCleaning";
		}
		return "redirect:/showCleaning";
	}
	
	@GetMapping("/showCleaningFromPastMonth")
	public String getCleaningFromPastMonth(Model model) {
		List<Cleaning> cleanings = cleaningService.getAllForNextMonth();
		model.addAttribute("cleanings", cleanings);
		return "showCleaning";
	}
	
	
}
