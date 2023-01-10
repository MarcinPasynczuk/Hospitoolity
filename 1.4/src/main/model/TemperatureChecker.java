package main.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TemperatureChecker {
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	private byte firstFridgeTemperature;
	
	private byte secondFridgeTemperature;
	
	private byte thirdFridgeTemperature;
	
	private byte fourthFridgeTemperature;
	
	private byte fifthFridgeTemperature;
	
	private String whoCheckedTemperature;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte getFirstFridgeTemperature() {
		return firstFridgeTemperature;
	}

	public void setFirstFridgeTemperature(byte firstFridgeTemperature) {
		this.firstFridgeTemperature = firstFridgeTemperature;
	}

	public byte getSecondFridgeTemperature() {
		return secondFridgeTemperature;
	}

	public void setSecondFridgeTemperature(byte secondFridgeTemperature) {
		this.secondFridgeTemperature = secondFridgeTemperature;
	}

	public byte getThirdFridgeTemperature() {
		return thirdFridgeTemperature;
	}

	public void setThirdFridgeTemperature(byte thirdFridgeTemperature) {
		this.thirdFridgeTemperature = thirdFridgeTemperature;
	}

	public byte getFourthFridgeTemperature() {
		return fourthFridgeTemperature;
	}

	public void setFourthFridgeTemperature(byte fourthFridgeTemperature) {
		this.fourthFridgeTemperature = fourthFridgeTemperature;
	}

	public byte getFifthFridgeTemperature() {
		return fifthFridgeTemperature;
	}

	public void setFifthFridgeTemperature(byte fifthFridgeTemperature) {
		this.fifthFridgeTemperature = fifthFridgeTemperature;
	}

	public String getWhoCheckedTemperature() {
		return whoCheckedTemperature;
	}

	public void setWhoCheckedTemperature(String whoCheckedTemperature) {
		this.whoCheckedTemperature = whoCheckedTemperature;
	}

}
