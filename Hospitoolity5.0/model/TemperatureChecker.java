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
public class TemperatureChecker {
	
	
	public TemperatureChecker() {
		setTemperatureCheckerDetails(new TemperatureCheckerDetails());
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
	@NotNull(message = "{temperatureChecker.date.notnull}")
	@Past(message = "{temperatureChecker.date.past}")
	private Date date;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String firstFridgeTemperatureMorning;	
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String firstFridgeTemperatureEvening;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String secondFridgeTemperatureMorning;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String secondFridgeTemperatureEvening;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String thirdFridgeTemperatureMorning;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String thirdFridgeTemperatureEvening;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String fourthFridgeTemperatureMorning;
	private String fourthFridgeTemperatureEvening;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String fifthFridgeTemperatureMorning;
	
	@Pattern(regexp = "^(-?[0-9]+(?:\\.[0-9]+)?$)?", message = "{temperatureChecker.FridgeTemperature.pattern}")
	private String fifthFridgeTemperatureEvening;
	
	@NotBlank(message = "{temperatureChecker.whoCheckedTemperature.notblank}")
	@Pattern(regexp = "^[a-zA-Z\\s]{2,20}$", message = "{temperatureChecker.whoCheckedTemperature.pattern}")
	private String whoCheckedTemperature;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "temperature_details_id")
	private TemperatureCheckerDetails temperatureCheckerDetails;
	
	public Date getDate() {
		return date;
	}

	public TemperatureCheckerDetails getTemperatureCheckerDetails() {
		return temperatureCheckerDetails;
	}

	public void setTemperatureCheckerDetails(TemperatureCheckerDetails temperatureCheckerDetails) {
		this.temperatureCheckerDetails = temperatureCheckerDetails;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFirstFridgeTemperatureMorning() {
		return firstFridgeTemperatureMorning;
	}

	public void setFirstFridgeTemperatureMorning(String firstFridgeTemperatureMorning) {
		this.firstFridgeTemperatureMorning = firstFridgeTemperatureMorning;
	}

	public String getFirstFridgeTemperatureEvening() {
		return firstFridgeTemperatureEvening;
	}

	public void setFirstFridgeTemperatureEvening(String firstFridgeTemperatureEvening) {
		this.firstFridgeTemperatureEvening = firstFridgeTemperatureEvening;
	}

	public String getSecondFridgeTemperatureMorning() {
		return secondFridgeTemperatureMorning;
	}

	public void setSecondFridgeTemperatureMorning(String secondFridgeTemperatureMorning) {
		this.secondFridgeTemperatureMorning = secondFridgeTemperatureMorning;
	}

	public String getSecondFridgeTemperatureEvening() {
		return secondFridgeTemperatureEvening;
	}

	public void setSecondFridgeTemperatureEvening(String secondFridgeTemperatureEvening) {
		this.secondFridgeTemperatureEvening = secondFridgeTemperatureEvening;
	}

	public String getThirdFridgeTemperatureMorning() {
		return thirdFridgeTemperatureMorning;
	}

	public void setThirdFridgeTemperatureMorning(String thirdFridgeTemperatureMorning) {
		this.thirdFridgeTemperatureMorning = thirdFridgeTemperatureMorning;
	}

	public String getThirdFridgeTemperatureEvening() {
		return thirdFridgeTemperatureEvening;
	}

	public void setThirdFridgeTemperatureEvening(String thirdFridgeTemperatureEvening) {
		this.thirdFridgeTemperatureEvening = thirdFridgeTemperatureEvening;
	}

	public String getFourthFridgeTemperatureMorning() {
		return fourthFridgeTemperatureMorning;
	}

	public void setFourthFridgeTemperatureMorning(String fourthFridgeTemperatureMorning) {
		this.fourthFridgeTemperatureMorning = fourthFridgeTemperatureMorning;
	}

	public String getFourthFridgeTemperatureEvening() {
		return fourthFridgeTemperatureEvening;
	}

	public void setFourthFridgeTemperatureEvening(String fourthFridgeTemperatureEvening) {
		this.fourthFridgeTemperatureEvening = fourthFridgeTemperatureEvening;
	}

	public String getFifthFridgeTemperatureMorning() {
		return fifthFridgeTemperatureMorning;
	}

	public void setFifthFridgeTemperatureMorning(String fifthFridgeTemperatureMorning) {
		this.fifthFridgeTemperatureMorning = fifthFridgeTemperatureMorning;
	}

	public String getFifthFridgeTemperatureEvening() {
		return fifthFridgeTemperatureEvening;
	}

	public void setFifthFridgeTemperatureEvening(String fifthFridgeTemperatureEvening) {
		this.fifthFridgeTemperatureEvening = fifthFridgeTemperatureEvening;
	}

	public String getWhoCheckedTemperature() {
		return whoCheckedTemperature;
	}

	public void setWhoCheckedTemperature(String whoCheckedTemperature) {
		this.whoCheckedTemperature = whoCheckedTemperature;
	}


	
	
	


}
