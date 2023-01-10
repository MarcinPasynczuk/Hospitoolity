package main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import main.model.TemperatureChecker;

@Controller
public class HomeController {

	private List<TemperatureChecker> temperatureCheckers = new ArrayList<>();
	
	@RequestMapping("/")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/addTemperature")
	public String showForm(Model model) {
		model.addAttribute("temperatureChecker", new TemperatureChecker());
		return "form";
	}
	
	@PostMapping("/processForm")
	public String showTourData(@ModelAttribute TemperatureChecker temperatureChecker) {
		temperatureCheckers.add(temperatureChecker);
		return "redirect:showTemperature";
	}
	


@GetMapping("/showTemperature")
public String getTours(Model model) {
	model.addAttribute("temperatureCheckers", temperatureCheckers);
	return "showTemperature";
}

}

