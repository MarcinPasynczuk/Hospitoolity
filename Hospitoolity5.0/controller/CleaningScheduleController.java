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

import main.model.CleaningSchedule;
import main.service.CleaningScheduleService;

@Controller
public class CleaningScheduleController {
	
	@Autowired
	private CleaningScheduleService cleaningScheduleService;

	@GetMapping("/addCleaningSchedule")
	public String showForm(Model model) {
		model.addAttribute("cleaningSchedule", new CleaningSchedule());
		return "formCleaningSchedule";
	}
	
	@PostMapping("/processCleaningScheduleForm")
	public String showTourData(@Valid @ModelAttribute CleaningSchedule cleaningSchedule, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formCleaningSchedule";
		}
		cleaningScheduleService.saveOrUpdate(cleaningSchedule);
		return "redirect:/showCleaningSchedule";
	}
	
	@GetMapping("/showCleaningSchedule")
	public String getCleaningSchedule(Model model) {
		List<CleaningSchedule> cleaningSchedules = cleaningScheduleService.getAll();
		model.addAttribute("cleaningSchedules", cleaningSchedules);
		return "showCleaningSchedule";
	}


	@GetMapping("/deleteCleaningSchedule/{id}")
	public String deleteCleaningSchedule(@PathVariable int id) {
		CleaningSchedule cleaningSchedule = cleaningScheduleService.getById(id);
		if(cleaningSchedule != null) {
			cleaningScheduleService.delete(id);
		}
		return "redirect:/showCleaningSchedule";
	}
	
	@GetMapping("/editCleaningSchedule/{id}")
	public String editCleaningSchedule(@PathVariable int id, Model model) {
		CleaningSchedule cleaningSchedule = cleaningScheduleService.getById(id);
		if(cleaningSchedule != null) {
			model.addAttribute("cleaningSchedule", cleaningSchedule);
			return "formCleaningSchedule";
		}
		return "redirect:/showCleaningSchedule";
	}
	
	
	
}
