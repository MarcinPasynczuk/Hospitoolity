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
import main.model.MonthlyProbe;
import main.service.MonthlyProbeService;

@Controller
public class MonthlyProbeController {
	
	@Autowired
	private MonthlyProbeService monthlyProbeService;

	@GetMapping("/addMonthlyProbe")
	public String showForm(Model model) {
		model.addAttribute("monthlyProbe", new MonthlyProbe());
		return "formMonthlyProbe";
	}
	
	@PostMapping("/processMonthlyProbeForm")
	public String showTourData(@Valid @ModelAttribute MonthlyProbe monthlyProbe, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formMonthlyProbe";
		}
		monthlyProbeService.saveOrUpdate(monthlyProbe);
		return "redirect:/showMonthlyProbe";
	}
	
	@GetMapping("/showMonthlyProbe")
	public String getMonthlyProbe(Model model) {
		List<MonthlyProbe> monthlyProbes = monthlyProbeService.getAll();
		model.addAttribute("monthlyProbes", monthlyProbes);
		return "showMonthlyProbe";
	}


	@GetMapping("/deleteMonthlyProbe/{id}")
	public String deleteMonthlyProbe(@PathVariable int id) {
		MonthlyProbe monthlyProbe = monthlyProbeService.getById(id);
		if(monthlyProbe != null) {
			monthlyProbeService.delete(id);
		}
		return "redirect:/showMonthlyProbe";
	}
	
	@GetMapping("/editMonthlyProbe/{id}")
	public String editMonthlyProbe(@PathVariable int id, Model model) {
		MonthlyProbe monthlyProbe = monthlyProbeService.getById(id);
		if(monthlyProbe != null) {
			model.addAttribute("monthlyProbe", monthlyProbe);
			return "formMonthlyProbe";
		}
		return "redirect:/showMonthlyProbe";
	}
	
	
}
