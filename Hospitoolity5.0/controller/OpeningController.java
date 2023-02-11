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

import main.model.Opening;
import main.service.OpeningService;

@Controller
public class OpeningController {
	
	@Autowired
	private OpeningService openingService;

	@GetMapping("/addOpening")
	public String showForm(Model model) {
		model.addAttribute("opening", new Opening());
		return "openingform";
	}
	
	@PostMapping("/processOpeningForm")
	public String showTourData(@Valid @ModelAttribute Opening opening, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "openingform";
		}
		openingService.saveOrUpdate(opening);
		return "redirect:/showOpening";
	}
	
	@GetMapping("/showOpening")
	public String getOpening(Model model) {
		List<Opening> openings = openingService.getAll();
		model.addAttribute("openings", openings);
		return "showOpening";
	}


	@GetMapping("/deleteOpening/{id}")
	public String deleteOpening(@PathVariable int id) {
		Opening opening = openingService.getById(id);
		if(opening != null) {
			openingService.delete(id);
		}
		return "redirect:/showOpening";
	}
	
	@GetMapping("/editOpening/{id}")
	public String editOpening(@PathVariable int id, Model model) {
		Opening opening = openingService.getById(id);
		if(opening != null) {
			model.addAttribute("opening", opening);
			return "openingform";
		}
		return "redirect:/showOpening";
	}
	
	@GetMapping("/showOpeningFromPastMonth")
	public String getOpeningFromPastMonth(Model model) {
		List<Opening> openings = openingService.getAllForNextMonth();
		model.addAttribute("openings", openings);
		return "showOpening";
	}
	
	
}
