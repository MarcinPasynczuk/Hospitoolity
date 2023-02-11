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

import main.model.SuppliersList;
import main.service.SuppliersListService;

@Controller
public class SuppliersListController {
	
	@Autowired
	private SuppliersListService suppliersListService;

	@GetMapping("/addSuppliersList")
	public String showSuppliersListForm(Model model) {
		model.addAttribute("suppliersList", new SuppliersList());
		return "formSuppliersList";
	}
	
	@PostMapping("/processSuppliersListForm")
	public String showSuppliersListData(@Valid @ModelAttribute SuppliersList suppliersList, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formSuppliersList";
		}
		suppliersListService.saveOrUpdate(suppliersList);
		return "redirect:/showSuppliersList";
	}
	
	@GetMapping("/showSuppliersList")
	public String getSuppliersList(Model model) {
		List<SuppliersList> suppliersLists = suppliersListService.getAll();
		model.addAttribute("suppliersLists", suppliersLists);
		return "showSuppliersList";
	}


	@GetMapping("/deleteSuppliersList/{id}")
	public String deleteSuppliersList(@PathVariable int id) {
		SuppliersList suppliersList = suppliersListService.getById(id);
		if(suppliersList != null) {
			suppliersListService.delete(id);
		}
		return "redirect:/showSuppliersList";
	}
	
	@GetMapping("/editSuppliersList/{id}")
	public String editSuppliersList(@PathVariable int id, Model model) {
		SuppliersList suppliersList = suppliersListService.getById(id);
		if(suppliersList != null) {
			model.addAttribute("suppliersList", suppliersList);
			return "formSuppliersList";
		}
		return "redirect:/showSuppliersList";
	}
	
	}
