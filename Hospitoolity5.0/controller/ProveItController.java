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

import main.model.ProveIt;
import main.service.ProveItService;

@Controller
public class ProveItController {
	
	@Autowired
	private ProveItService proveItService;

	@GetMapping("/addProveIt")
	public String showForm(Model model) {
		model.addAttribute("proveIt", new ProveIt());
		return "formProveIt";
	}
	
	@PostMapping("/processProveItForm")
	public String showTourData(@Valid @ModelAttribute ProveIt proveIt, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formProveIt";
		}
		proveItService.saveOrUpdate(proveIt);
		return "redirect:/showProveIt";
	}
	
	@GetMapping("/showProveIt")
	public String getProveIt(Model model) {
		List<ProveIt> proveIts = proveItService.getAll();
		model.addAttribute("proveIts", proveIts);
		return "showProveIt";
	}


	@GetMapping("/deleteProveIt/{id}")
	public String deleteProveIt(@PathVariable int id) {
		ProveIt proveIt = proveItService.getById(id);
		if(proveIt != null) {
			proveItService.delete(id);
		}
		return "redirect:/showProveIt";
	}
	
	@GetMapping("/editProveIt/{id}")
	public String editProveIt(@PathVariable int id, Model model) {
		ProveIt proveIt = proveItService.getById(id);
		if(proveIt != null) {
			model.addAttribute("proveIt", proveIt);
			return "formProveIt";
		}
		return "redirect:/showProveIt";
	}
	
	@GetMapping("/showProveItFromPastMonth")
	public String getProveItFromPastMonth(Model model) {
		List<ProveIt> proveIts = proveItService.getAllForNextMonth();
		model.addAttribute("proveIts", proveIts);
		return "showProveIt";
	}
	
	
}
