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
public class Problem {

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
	
	private String problemOrChanges;	
	
	@NotBlank(message = "Name field can not be blank.")
	@Pattern(regexp = "^[a-zA-Z\\s]{2,20}$", message = "Wrong pattern. Use just letters A-Z and spaces.")
	private String whoReported;
	
	public Date getDate() {
		return date;
	}

		public void setDate(Date date) {
		this.date = date;
	}

		public String getProblemOrChanges() {
			return problemOrChanges;
		}

		public void setProblemOrChanges(String problemOrChanges) {
			this.problemOrChanges = problemOrChanges;
		}

		public String getWhoReported() {
			return whoReported;
		}

		public void setWhoReported(String whoReported) {
			this.whoReported = whoReported;
		}

			

	
	
	


}
