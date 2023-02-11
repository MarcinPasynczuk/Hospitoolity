package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



@Entity
public class CleaningSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NotBlank(message = "Field can not be blank.")
	private String cleaningItem;	
	
	@NotBlank(message = "Field can not be blank.")
	private String cleaningFrequency;
	
	@NotBlank(message = "Field can not be blank.")
	private String cleaningPrecautions;

	@NotBlank(message = "Field can not be blank.")
	private String cleaningMethod;

	public String getCleaningItem() {
		return cleaningItem;
	}

	public void setCleaningItem(String cleaningItem) {
		this.cleaningItem = cleaningItem;
	}

	public String getCleaningFrequency() {
		return cleaningFrequency;
	}

	public void setCleaningFrequency(String cleaningFrequency) {
		this.cleaningFrequency = cleaningFrequency;
	}

	public String getCleaningPrecautions() {
		return cleaningPrecautions;
	}

	public void setCleaningPrecautions(String cleaningPrecautions) {
		this.cleaningPrecautions = cleaningPrecautions;
	}

	public String getCleaningMethod() {
		return cleaningMethod;
	}

	public void setCleaningMethod(String cleaningMethod) {
		this.cleaningMethod = cleaningMethod;
	}
		
	
	


}
