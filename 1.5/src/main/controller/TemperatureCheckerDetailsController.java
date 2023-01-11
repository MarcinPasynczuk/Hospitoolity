package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.model.TemperatureChecker;
import main.model.TemperatureCheckerDetails;
import main.service.TemperatureCheckerDetailsService;
import main.service.TemperatureCheckerService;

@Controller
public class TemperatureCheckerDetailsController {

	@Autowired
	private TemperatureCheckerService temperatureCheckerService;
	
	@Autowired
	private TemperatureCheckerDetailsService temperatureCheckerDetailsService;
	
	@GetMapping("/showTemperatureDetails/{temperatureId}")
	public String showTemperatureDetails(@PathVariable int temperatureId, Model model) {

		TemperatureChecker temperatureChecker = temperatureCheckerService.getById(temperatureId);
		if(temperatureChecker != null) {
			temperatureCheckerService.addTemperatureCheckerDetailsIfNotExists(temperatureChecker);
			model.addAttribute("temperatureChecker", temperatureChecker);
			return "temperature-details";
		}
		return "redirect:/showTemperature";
	}
	
	
	
	@GetMapping("/editTemperatureDetails/{temperatureId}")
	public String editTemperatureDetails(@PathVariable int temperatureId, Model model) {
		TemperatureChecker temperatureChecker = temperatureCheckerService.getById(temperatureId);
		if(temperatureChecker != null) {
			temperatureCheckerService.addTemperatureCheckerDetailsIfNotExists(temperatureChecker);
			model.addAttribute("temperatureCheckerDetails", temperatureChecker.getTemperatureCheckerDetails());
			return "form-temperature-details";
		}
		return "redirect:/showTemperature";
			
	}
	
	@PostMapping("/processFormTemperatureDetails")
	public String processTourDetailsData(@ModelAttribute TemperatureCheckerDetails temperatureCheckerDetails) {
		temperatureCheckerDetailsService.saveOrUpdate(temperatureCheckerDetails);
		return "redirect:/showTemperature";
	}
	
}
