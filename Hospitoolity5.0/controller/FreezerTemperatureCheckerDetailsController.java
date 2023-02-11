package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.model.FreezerTemperatureChecker;
import main.model.FreezerTemperatureCheckerDetails;
import main.service.FreezerTemperatureCheckerDetailsService;
import main.service.FreezerTemperatureCheckerService;

@Controller
public class FreezerTemperatureCheckerDetailsController {

	@Autowired
	private FreezerTemperatureCheckerService freezerTemperatureCheckerService;
	
	@Autowired
	private FreezerTemperatureCheckerDetailsService freezerTemperatureCheckerDetailsService;
	
	@GetMapping("/showFreezerTemperatureDetails/{freezerTemperatureId}")
	public String showFreezerTemperatureDetails(@PathVariable int freezerTemperatureId, Model model) {

		FreezerTemperatureChecker freezerTemperatureChecker = freezerTemperatureCheckerService.getById(freezerTemperatureId);
		if(freezerTemperatureChecker != null) {
			model.addAttribute("freezerTemperatureChecker", freezerTemperatureChecker);
			return "freezer-temperature-details";
		}
		return "redirect:/showFreezerTemperature";
	}
	
	
	
	@GetMapping("/editFreezerTemperatureDetails/{freezerTemperatureId}")
	public String editFreezerTemperatureDetails(@PathVariable int freezerTemperatureId, Model model) {
		FreezerTemperatureChecker freezerTemperatureChecker = freezerTemperatureCheckerService.getById(freezerTemperatureId);
		if(freezerTemperatureChecker != null) {
			model.addAttribute("freezerTemperatureCheckerDetails", freezerTemperatureChecker.getFreezerTemperatureCheckerDetails());
			return "form-freezer-temperature-details";
		}
		return "redirect:/showFreezerTemperature";
			
	}
	
	@PostMapping("/processFormFreezerTemperatureDetails")
	public String processFreezerTemperatureDetailsData(@ModelAttribute FreezerTemperatureCheckerDetails freezerTemperatureCheckerDetails) {
		freezerTemperatureCheckerDetailsService.saveOrUpdate(freezerTemperatureCheckerDetails);
		return "redirect:/showFreezerTemperature";
	}
	
}
