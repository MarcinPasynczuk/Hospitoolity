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

import main.model.Closing;
import main.service.ClosingService;

@Controller
public class ClosingCheckController {
	
	@Autowired
	private ClosingService closingService;

	@GetMapping("/addClosing")
	public String showForm(Model model) {
		model.addAttribute("closing", new Closing());
		return "closingform";
	}
	
	@PostMapping("/processClosingForm")
	public String showClosingData(@Valid @ModelAttribute Closing closing, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "closingform";
		}
		closingService.saveOrUpdate(closing);
		return "redirect:/showClosing";
	}
	
	@GetMapping("/showClosing")
	public String getClosing(Model model) {
		List<Closing> closings = closingService.getAll();
		model.addAttribute("closings", closings);
		return "showClosing";
	}


	@GetMapping("/deleteClosing/{id}")
	public String deleteClosing(@PathVariable int id) {
		Closing closing = closingService.getById(id);
		if(closing != null) {
			closingService.delete(id);
		}
		return "redirect:/showClosing";
	}
	
	@GetMapping("/editClosing/{id}")
	public String editClosing(@PathVariable int id, Model model) {
		Closing closing = closingService.getById(id);
		if(closing != null) {
			model.addAttribute("closing", closing);
			return "closingform";
		}
		return "redirect:/showClosing";
	}
	
	@GetMapping("/showClosingFromPastMonth")
	public String getClosingFromPastMonth(Model model) {
		List<Closing> closings = closingService.getAllForNextMonth();
		model.addAttribute("closings", closings);
		return "showClosing";
	}
	
}
