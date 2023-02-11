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

import main.model.TrainingRecord;
import main.service.TrainingRecordService;

@Controller
public class TrainingRecordController {
	
	@Autowired
	private TrainingRecordService trainingRecordService;

	@GetMapping("/addTrainingRecord")
	public String showTrainingRecordForm(Model model) {
		model.addAttribute("trainingRecord", new TrainingRecord());
		return "formTrainingRecord";
	}
	
	@PostMapping("/processTrainingRecordForm")
	public String showTrainingRecordData(@Valid @ModelAttribute TrainingRecord trainingRecord, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formTrainingRecord";
		}
		trainingRecordService.saveOrUpdate(trainingRecord);
		return "redirect:/showTrainingRecord";
	}
	
	@GetMapping("/showTrainingRecord")
	public String getTrainingRecord(Model model) {
		List<TrainingRecord> trainingRecords = trainingRecordService.getAll();
		model.addAttribute("trainingRecords", trainingRecords);
		return "showTrainingRecord";
	}


	@GetMapping("/deleteTrainingRecord/{id}")
	public String deleteTrainingRecord(@PathVariable int id) {
		TrainingRecord trainingRecord = trainingRecordService.getById(id);
		if(trainingRecord != null) {
			trainingRecordService.delete(id);
		}
		return "redirect:/showTrainingRecord";
	}
	
	@GetMapping("/editTrainingRecord/{id}")
	public String editTrainingRecord(@PathVariable int id, Model model) {
		TrainingRecord trainingRecord = trainingRecordService.getById(id);
		if(trainingRecord != null) {
			model.addAttribute("trainingRecord", trainingRecord);
			return "formTrainingRecord";
		}
		return "redirect:/showTrainingRecord";
	}
	
	@GetMapping("/showTrainingRecordFromPastMonth")
	public String getTrainingRecordFromPastMonth(Model model) {
		List<TrainingRecord> trainingRecords = trainingRecordService.getAllForNextMonth();
		model.addAttribute("trainingRecords", trainingRecords);
		return "showTrainingRecord";
	}
	
}
