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

import main.model.TemperatureChecker;
import main.service.TemperatureCheckerService;

@Controller
public class TemperatureCheckerController {
	
	@Autowired
	private TemperatureCheckerService temperatureCheckerService;

	@GetMapping("/addTemperature")
	public String showForm(Model model) {
		model.addAttribute("temperatureChecker", new TemperatureChecker());
		return "form";
	}
	
	@PostMapping("/processForm")
	public String showTourData(@Valid @ModelAttribute TemperatureChecker temperatureChecker, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "form";
		}
		temperatureCheckerService.saveOrUpdate(temperatureChecker);
		return "redirect:/showTemperature";
	}
	
	@GetMapping("/showTemperature")
	public String getTours(Model model) {
		List<TemperatureChecker> temperatureCheckers = temperatureCheckerService.getAll();
		model.addAttribute("temperatureCheckers", temperatureCheckers);
		return "showTemperature";
	}


	@GetMapping("/deleteTemperature/{id}")
	public String deleteTemperature(@PathVariable int id) {
		TemperatureChecker temperatureChecker = temperatureCheckerService.getById(id);
		if(temperatureChecker != null) {
			temperatureCheckerService.delete(id);
		}
		return "redirect:/showTemperature";
	}
	
	@GetMapping("/editTemperature/{id}")
	public String editTemperature(@PathVariable int id, Model model) {
		TemperatureChecker temperatureChecker = temperatureCheckerService.getById(id);
		if(temperatureChecker != null) {
			model.addAttribute("temperatureChecker", temperatureChecker);
			return "form";
		}
		return "redirect:/showTemperature";
	}
	
	@GetMapping("/showTemperatureFromPastMonth")
	public String getTemperatureFromPastMonth(Model model) {
		List<TemperatureChecker> temperatureCheckers = temperatureCheckerService.getAllForNextMonth();
		model.addAttribute("temperatureCheckers", temperatureCheckers);
		return "showTemperature";
	}
	
}
