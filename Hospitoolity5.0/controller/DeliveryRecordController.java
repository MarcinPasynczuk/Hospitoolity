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

import main.model.DeliveryRecord;
import main.service.DeliveryRecordService;

@Controller
public class DeliveryRecordController {
	
	@Autowired
	private DeliveryRecordService deliveryRecordService;

	@GetMapping("/addDeliveryRecord")
	public String showForm(Model model) {
		model.addAttribute("deliveryRecord", new DeliveryRecord());
		return "formDeliveryRecord";
	}
	
	@PostMapping("/processDeliveryRecordForm")
	public String showTourData(@Valid @ModelAttribute DeliveryRecord deliveryRecord, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "formDeliveryRecord";
		}
		deliveryRecordService.saveOrUpdate(deliveryRecord);
		return "redirect:/showDeliveryRecord";
	}
	
	@GetMapping("/showDeliveryRecord")
	public String getDeliveryRecord(Model model) {
		List<DeliveryRecord> deliveryRecords = deliveryRecordService.getAll();
		model.addAttribute("deliveryRecords", deliveryRecords);
		return "showDeliveryRecord";
	}


	@GetMapping("/deleteDeliveryRecord/{id}")
	public String deleteDeliveryRecord(@PathVariable int id) {
		DeliveryRecord deliveryRecord = deliveryRecordService.getById(id);
		if(deliveryRecord != null) {
			deliveryRecordService.delete(id);
		}
		return "redirect:/showDeliveryRecord";
	}
	
	@GetMapping("/editDeliveryRecord/{id}")
	public String editDeliveryRecord(@PathVariable int id, Model model) {
		DeliveryRecord deliveryRecord = deliveryRecordService.getById(id);
		if(deliveryRecord != null) {
			model.addAttribute("deliveryRecord", deliveryRecord);
			return "formDeliveryRecord";
		}
		return "redirect:/showDeliveryRecord";
	}
	
	@GetMapping("/showDeliveryRecordFromPastMonth")
	public String getDeliveryRecordFromPastMonth(Model model) {
		List<DeliveryRecord> deliveryRecords = deliveryRecordService.getAllForNextMonth();
		model.addAttribute("deliveryRecords", deliveryRecords);
		return "showDeliveryRecord";
	}
	
	
}
