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

import main.model.FreezerTemperatureChecker;
import main.service.FreezerTemperatureCheckerService;


@Controller
public class FreezerTemperatureCheckerController {
	
	@Autowired
	private FreezerTemperatureCheckerService freezerTemperatureCheckerService;

	@GetMapping("/addFreezerTemperature")
	public String showForm(Model model) {
		model.addAttribute("freezerTemperatureChecker", new FreezerTemperatureChecker());
		return "freezerform";
	}
	
	@PostMapping("/processFreezerForm")
	public String showFreezerTemperatureData(@Valid @ModelAttribute FreezerTemperatureChecker freezerTemperatureChecker, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "freezerform";
		}
		freezerTemperatureCheckerService.saveOrUpdate(freezerTemperatureChecker);
		return "redirect:/showFreezerTemperature";
	}
	
	@GetMapping("/showFreezerTemperature")
	public String getFreezerTemperatures(Model model) {
		List<FreezerTemperatureChecker> freezerTemperatureCheckers = freezerTemperatureCheckerService.getAll();
		model.addAttribute("freezerTemperatureCheckers", freezerTemperatureCheckers);
		return "showFreezerTemperature";
	}


	@GetMapping("/deleteFreezerTemperature/{id}")
	public String deleteFreezerTemperature(@PathVariable int id) {
		FreezerTemperatureChecker freezerTemperatureChecker = freezerTemperatureCheckerService.getById(id);
		if(freezerTemperatureChecker != null) {
			freezerTemperatureCheckerService.delete(id);
		}
		return "redirect:/showFreezerTemperature";
	}
	
	@GetMapping("/editFreezerTemperature/{id}")
	public String editFreezerTemperature(@PathVariable int id, Model model) {
		FreezerTemperatureChecker freezerTemperatureChecker = freezerTemperatureCheckerService.getById(id);
		if(freezerTemperatureChecker != null) {
			model.addAttribute("freezerTemperatureChecker", freezerTemperatureChecker);
			return "freezerform";
		}
		return "redirect:/showFreezerTemperature";
	}
	
	@GetMapping("/showFreezerTemperatureFromPastMonth")
	public String getFreezerTemperatureFromPastMonth(Model model) {
		List<FreezerTemperatureChecker> freezerTemperatureCheckers = freezerTemperatureCheckerService.getAllForNextMonth();
		model.addAttribute("freezerTemperatureCheckers", freezerTemperatureCheckers);
		return "showFreezerTemperature";
	}
	
}
