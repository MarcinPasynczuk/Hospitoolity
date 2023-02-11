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

import main.model.Problem;
import main.service.ProblemService;

@Controller
public class ProblemController {
	
	@Autowired
	private ProblemService problemService;

	@GetMapping("/addProblem")
	public String showForm(Model model) {
		model.addAttribute("problem", new Problem());
		return "formProblem";
	}
	
	@PostMapping("/processProblemForm")
	public String showTourData(@Valid @ModelAttribute Problem problem, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formProblem";
		}
		problemService.saveOrUpdate(problem);
		return "redirect:/showProblem";
	}
	
	@GetMapping("/showProblem")
	public String getProblem(Model model) {
		List<Problem> problems = problemService.getAll();
		model.addAttribute("problems", problems);
		return "showProblem";
	}


	@GetMapping("/deleteProblem/{id}")
	public String deleteProblem(@PathVariable int id) {
		Problem problem = problemService.getById(id);
		if(problem != null) {
			problemService.delete(id);
		}
		return "redirect:/showProblem";
	}
	
	@GetMapping("/editProblem/{id}")
	public String editProblem(@PathVariable int id, Model model) {
		Problem problem = problemService.getById(id);
		if(problem != null) {
			model.addAttribute("problem", problem);
			return "formProblem";
		}
		return "redirect:/showProblem";
	}
	
	@GetMapping("/showProblemFromPastMonth")
	public String getProblemFromPastMonth(Model model) {
		List<Problem> problems = problemService.getAllForNextMonth();
		model.addAttribute("problems", problems);
		return "showProblem";
	}
	
	
}
