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

import main.model.ContactsList;
import main.service.ContactsListService;

@Controller
public class ContactsListController {
	
	@Autowired
	private ContactsListService contactsListService;

	@GetMapping("/addContactsList")
	public String showContactsListForm(Model model) {
		model.addAttribute("contactsList", new ContactsList());
		return "formContactsList";
	}
	
	@PostMapping("/processContactsListForm")
	public String showContactsListData(@Valid @ModelAttribute ContactsList contactsList, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formContactsList";
		}
		contactsListService.saveOrUpdate(contactsList);
		return "redirect:/showContactsList";
	}
	
	@GetMapping("/showContactsList")
	public String getContactsList(Model model) {
		List<ContactsList> contactsLists = contactsListService.getAll();
		model.addAttribute("contactsLists", contactsLists);
		return "showContactsList";
	}


	@GetMapping("/deleteContactsList/{id}")
	public String deleteContactsList(@PathVariable int id) {
		ContactsList contactsList = contactsListService.getById(id);
		if(contactsList != null) {
			contactsListService.delete(id);
		}
		return "redirect:/showContactsList";
	}
	
	@GetMapping("/editContactsList/{id}")
	public String editContactsList(@PathVariable int id, Model model) {
		ContactsList contactsList = contactsListService.getById(id);
		if(contactsList != null) {
			model.addAttribute("contactsList", contactsList);
			return "formContactsList";
		}
		return "redirect:/showContactsList";
	}
	
		
}
