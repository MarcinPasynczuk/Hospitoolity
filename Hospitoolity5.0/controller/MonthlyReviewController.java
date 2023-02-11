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

import main.model.MonthlyReview;
import main.service.MonthlyReviewService;

@Controller
public class MonthlyReviewController {
	
	@Autowired
	private MonthlyReviewService monthlyReviewService;

	@GetMapping("/addMonthlyReview")
	public String showForm(Model model) {
		model.addAttribute("monthlyReview", new MonthlyReview());
		return "formMonthlyReview";
	}
	
	@PostMapping("/processMonthlyReviewForm")
	public String showTourData(@Valid @ModelAttribute MonthlyReview monthlyReview, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formMonthlyReview";
		}
		monthlyReviewService.saveOrUpdate(monthlyReview);
		return "redirect:/showMonthlyReview";
	}
	
	@GetMapping("/showMonthlyReview")
	public String getMonthlyReview(Model model) {
		List<MonthlyReview> monthlyReviews = monthlyReviewService.getAll();
		model.addAttribute("monthlyReviews", monthlyReviews);
		return "showMonthlyReview";
	}


	@GetMapping("/deleteMonthlyReview/{id}")
	public String deleteMonthlyReview(@PathVariable int id) {
		MonthlyReview monthlyReview = monthlyReviewService.getById(id);
		if(monthlyReview != null) {
			monthlyReviewService.delete(id);
		}
		return "redirect:/showMonthlyReview";
	}
	
	@GetMapping("/editMonthlyReview/{id}")
	public String editMonthlyReview(@PathVariable int id, Model model) {
		MonthlyReview monthlyReview = monthlyReviewService.getById(id);
		if(monthlyReview != null) {
			model.addAttribute("monthlyReview", monthlyReview);
			return "formMonthlyReview";
		}
		return "redirect:/showMonthlyReview";
	}
		
}
