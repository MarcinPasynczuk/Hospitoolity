package main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class ProveIt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	private String saveMethod;	
	private String howDidYouProveIt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSaveMethod() {
		return saveMethod;
	}
	public void setSaveMethod(String saveMethod) {
		this.saveMethod = saveMethod;
	}
	public String getHowDidYouProveIt() {
		return howDidYouProveIt;
	}
	public void setHowDidYouProveIt(String howDidYouProveIt) {
		this.howDidYouProveIt = howDidYouProveIt;
	}


}
