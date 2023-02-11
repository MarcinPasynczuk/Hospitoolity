package main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Cleaning {
	
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
	private Date date;

	private boolean cleaningDaily;	
	private boolean cleaningWeekly;	
	private boolean cleaningMonthly;	
	private String cleaningInfo;
	private String whoPutData;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isCleaningDaily() {
		return cleaningDaily;
	}

	public void setCleaningDaily(boolean cleaningDaily) {
		this.cleaningDaily = cleaningDaily;
	}

	public boolean isCleaningWeekly() {
		return cleaningWeekly;
	}

	public void setCleaningWeekly(boolean cleaningWeekly) {
		this.cleaningWeekly = cleaningWeekly;
	}

	public boolean isCleaningMonthly() {
		return cleaningMonthly;
	}

	public void setCleaningMonthly(boolean cleaningMonthly) {
		this.cleaningMonthly = cleaningMonthly;
	}

	public String getCleaningInfo() {
		return cleaningInfo;
	}

	public void setCleaningInfo(String cleaningInfo) {
		this.cleaningInfo = cleaningInfo;
	}

	public String getWhoPutData() {
		return whoPutData;
	}

	public void setWhoPutData(String whoPutData) {
		this.whoPutData = whoPutData;
	}
	

	
	


}
