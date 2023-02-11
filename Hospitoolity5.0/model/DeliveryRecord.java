package main.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class DeliveryRecord {

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
	
	private String supplier;
	
	private String product;	
	
	private String temperature;	
	
	private boolean accepted;
	
	private String comments;	
	
	
	@NotBlank(message = "Name field can not be blank.")
	@Pattern(regexp = "^[a-zA-Z\\s]{2,20}$", message = "Wrong pattern. Use just letters A-Z and spaces.")
	private String whoChecked;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getWhoChecked() {
		return whoChecked;
	}

	public void setWhoChecked(String whoChecked) {
		this.whoChecked = whoChecked;
	}

	
	


}
