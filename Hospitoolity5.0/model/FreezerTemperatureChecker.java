package main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class FreezerTemperatureChecker {
	
	
	public FreezerTemperatureChecker() {
		setFreezerTemperatureCheckerDetails(new FreezerTemperatureCheckerDetails());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Date can not be blank.")
	@Past(message = "It have to be current or past date.")
	private Date date;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String firstFreezerTemperatureMorning;	
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String firstFreezerTemperatureEvening;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String secondFreezerTemperatureMorning;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String secondFreezerTemperatureEvening;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String thirdFreezerTemperatureMorning;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String thirdFreezerTemperatureEvening;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String fourthFreezerTemperatureMorning;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String fourthFreezerTemperatureEvening;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String fifthFreezerTemperatureMorning;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "Not valid temperature format.")
	private String fifthFreezerTemperatureEvening;
	
	@NotBlank(message = "Name field can not be blank.")
	@Pattern(regexp = "^[a-zA-Z\\s]{2,20}$", message = "Wrong pattern. Use just letters A-Z and spaces.")
	private String whoCheckedFreezerTemperature;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "freezer_temperature_details_id")
	private FreezerTemperatureCheckerDetails freezerTemperatureCheckerDetails;
	
	public Date getDate() {
		return date;
	}

	public FreezerTemperatureCheckerDetails getFreezerTemperatureCheckerDetails() {
		return freezerTemperatureCheckerDetails;
	}

	public void setFreezerTemperatureCheckerDetails(FreezerTemperatureCheckerDetails freezerTemperatureCheckerDetails) {
		this.freezerTemperatureCheckerDetails = freezerTemperatureCheckerDetails;
	}

	

	public String getFirstFreezerTemperatureMorning() {
		return firstFreezerTemperatureMorning;
	}

	public void setFirstFreezerTemperatureMorning(String firstFreezerTemperatureMorning) {
		this.firstFreezerTemperatureMorning = firstFreezerTemperatureMorning;
	}

	public String getFirstFreezerTemperatureEvening() {
		return firstFreezerTemperatureEvening;
	}

	public void setFirstFreezerTemperatureEvening(String firstFreezerTemperatureEvening) {
		this.firstFreezerTemperatureEvening = firstFreezerTemperatureEvening;
	}

	public String getSecondFreezerTemperatureMorning() {
		return secondFreezerTemperatureMorning;
	}

	public void setSecondFreezerTemperatureMorning(String secondFreezerTemperatureMorning) {
		this.secondFreezerTemperatureMorning = secondFreezerTemperatureMorning;
	}

	public String getSecondFreezerTemperatureEvening() {
		return secondFreezerTemperatureEvening;
	}

	public void setSecondFreezerTemperatureEvening(String secondFreezerTemperatureEvening) {
		this.secondFreezerTemperatureEvening = secondFreezerTemperatureEvening;
	}

	public String getThirdFreezerTemperatureMorning() {
		return thirdFreezerTemperatureMorning;
	}

	public void setThirdFreezerTemperatureMorning(String thirdFreezerTemperatureMorning) {
		this.thirdFreezerTemperatureMorning = thirdFreezerTemperatureMorning;
	}

	public String getThirdFreezerTemperatureEvening() {
		return thirdFreezerTemperatureEvening;
	}

	public void setThirdFreezerTemperatureEvening(String thirdFreezerTemperatureEvening) {
		this.thirdFreezerTemperatureEvening = thirdFreezerTemperatureEvening;
	}

	public String getFourthFreezerTemperatureMorning() {
		return fourthFreezerTemperatureMorning;
	}

	public void setFourthFreezerTemperatureMorning(String fourthFreezerTemperatureMorning) {
		this.fourthFreezerTemperatureMorning = fourthFreezerTemperatureMorning;
	}

	public String getFourthFreezerTemperatureEvening() {
		return fourthFreezerTemperatureEvening;
	}

	public void setFourthFreezerTemperatureEvening(String fourthFreezerTemperatureEvening) {
		this.fourthFreezerTemperatureEvening = fourthFreezerTemperatureEvening;
	}

	public String getFifthFreezerTemperatureMorning() {
		return fifthFreezerTemperatureMorning;
	}

	public void setFifthFreezerTemperatureMorning(String fifthFreezerTemperatureMorning) {
		this.fifthFreezerTemperatureMorning = fifthFreezerTemperatureMorning;
	}

	public String getFifthFreezerTemperatureEvening() {
		return fifthFreezerTemperatureEvening;
	}

	public void setFifthFreezerTemperatureEvening(String fifthFreezerTemperatureEvening) {
		this.fifthFreezerTemperatureEvening = fifthFreezerTemperatureEvening;
	}

	public String getWhoCheckedFreezerTemperature() {
		return whoCheckedFreezerTemperature;
	}

	public void setWhoCheckedFreezerTemperature(String whoCheckedFreezerTemperature) {
		this.whoCheckedFreezerTemperature = whoCheckedFreezerTemperature;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	
	
	
	


}
