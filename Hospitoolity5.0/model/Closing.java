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
public class Closing {
	
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
	
	private String otherClosingChecks;	
	
	@NotBlank(message = "Field can not be blank.")
	@Pattern(regexp = "^[a-zA-Z\\s]{2,20}$", message = "Wrong pattern. Use just letters A-Z and spaces.")
	private String whoCheckedClosing;
	
	private boolean ClosingFormQuestion1;
	
	private boolean ClosingFormQuestion2;
	
	private boolean ClosingFormQuestion3;
	
	private boolean ClosingFormQuestion4;
	
	private boolean ClosingFormQuestion5;
	
	private boolean ClosingFormQuestion6;
	
	private boolean ClosingFormQuestion7;
	
	private boolean ClosingFormQuestion8;
	
	private boolean ClosingFormQuestion9;
	
		
	public boolean isClosingFormQuestion1() {
		return ClosingFormQuestion1;
	}

	public void setClosingFormQuestion1(boolean closingFormQuestion1) {
		ClosingFormQuestion1 = closingFormQuestion1;
	}

	public boolean isClosingFormQuestion2() {
		return ClosingFormQuestion2;
	}

	public void setClosingFormQuestion2(boolean closingFormQuestion2) {
		ClosingFormQuestion2 = closingFormQuestion2;
	}

	public boolean isClosingFormQuestion3() {
		return ClosingFormQuestion3;
	}

	public void setClosingFormQuestion3(boolean closingFormQuestion3) {
		ClosingFormQuestion3 = closingFormQuestion3;
	}

	public boolean isClosingFormQuestion4() {
		return ClosingFormQuestion4;
	}

	public void setClosingFormQuestion4(boolean closingFormQuestion4) {
		ClosingFormQuestion4 = closingFormQuestion4;
	}

	public boolean isClosingFormQuestion5() {
		return ClosingFormQuestion5;
	}

	public void setClosingFormQuestion5(boolean closingFormQuestion5) {
		ClosingFormQuestion5 = closingFormQuestion5;
	}

	public boolean isClosingFormQuestion6() {
		return ClosingFormQuestion6;
	}

	public void setClosingFormQuestion6(boolean closingFormQuestion6) {
		ClosingFormQuestion6 = closingFormQuestion6;
	}

	public boolean isClosingFormQuestion7() {
		return ClosingFormQuestion7;
	}

	public void setClosingFormQuestion7(boolean closingFormQuestion7) {
		ClosingFormQuestion7 = closingFormQuestion7;
	}

	public boolean isClosingFormQuestion8() {
		return ClosingFormQuestion8;
	}

	public void setClosingFormQuestion8(boolean closingFormQuestion8) {
		ClosingFormQuestion8 = closingFormQuestion8;
	}

	public boolean isClosingFormQuestion9() {
		return ClosingFormQuestion9;
	}

	public void setClosingFormQuestion9(boolean closingFormQuestion9) {
		ClosingFormQuestion9 = closingFormQuestion9;
	}

	public Date getDate() {
		return date;
	}

	
	public void setDate(Date date) {
		this.date = date;
	}

	public String getOtherClosingChecks() {
		return otherClosingChecks;
	}

	public void setOtherClosingChecks(String otherClosingChecks) {
		this.otherClosingChecks = otherClosingChecks;
	}

	public String getWhoCheckedClosing() {
		return whoCheckedClosing;
	}

	public void setWhoCheckedClosing(String whoCheckedClosing) {
		this.whoCheckedClosing = whoCheckedClosing;
	}

	


	
	
	


}
