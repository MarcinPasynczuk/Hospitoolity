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
public class Opening {

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
	
	private String otherOpeningChecks;	
	
	private boolean OpeningFormQuestion1;
	
	private boolean OpeningFormQuestion2;
	
	private boolean OpeningFormQuestion3;
	
	private boolean OpeningFormQuestion4;
	
	private boolean OpeningFormQuestion5;
	
	private boolean OpeningFormQuestion6;
	
	private boolean OpeningFormQuestion7;
	
	private boolean OpeningFormQuestion8;
	
	private boolean OpeningFormQuestion9;
	
	
	
	@NotBlank(message = "Name field can not be blank.")
	@Pattern(regexp = "^[a-zA-Z\\s]{2,20}$", message = "Wrong pattern. Use just letters A-Z and spaces.")
	private String whoCheckedOpening;
	
	public Date getDate() {
		return date;
	}

		public void setDate(Date date) {
		this.date = date;
	}

		public String getOtherOpeningChecks() {
			return otherOpeningChecks;
		}

		public void setOtherOpeningChecks(String otherOpeningChecks) {
			this.otherOpeningChecks = otherOpeningChecks;
		}

		public String getWhoCheckedOpening() {
			return whoCheckedOpening;
		}

		public void setWhoCheckedOpening(String whoCheckedOpening) {
			this.whoCheckedOpening = whoCheckedOpening;
		}

		public boolean isOpeningFormQuestion1() {
			return OpeningFormQuestion1;
		}

		public void setOpeningFormQuestion1(boolean openingFormQuestion1) {
			OpeningFormQuestion1 = openingFormQuestion1;
		}

		public boolean isOpeningFormQuestion2() {
			return OpeningFormQuestion2;
		}

		public void setOpeningFormQuestion2(boolean openingFormQuestion2) {
			OpeningFormQuestion2 = openingFormQuestion2;
		}

		public boolean isOpeningFormQuestion3() {
			return OpeningFormQuestion3;
		}

		public void setOpeningFormQuestion3(boolean openingFormQuestion3) {
			OpeningFormQuestion3 = openingFormQuestion3;
		}

		public boolean isOpeningFormQuestion4() {
			return OpeningFormQuestion4;
		}

		public void setOpeningFormQuestion4(boolean openingFormQuestion4) {
			OpeningFormQuestion4 = openingFormQuestion4;
		}

		public boolean isOpeningFormQuestion5() {
			return OpeningFormQuestion5;
		}

		public void setOpeningFormQuestion5(boolean openingFormQuestion5) {
			OpeningFormQuestion5 = openingFormQuestion5;
		}

		public boolean isOpeningFormQuestion6() {
			return OpeningFormQuestion6;
		}

		public void setOpeningFormQuestion6(boolean openingFormQuestion6) {
			OpeningFormQuestion6 = openingFormQuestion6;
		}

		public boolean isOpeningFormQuestion7() {
			return OpeningFormQuestion7;
		}

		public void setOpeningFormQuestion7(boolean openingFormQuestion7) {
			OpeningFormQuestion7 = openingFormQuestion7;
		}

		public boolean isOpeningFormQuestion8() {
			return OpeningFormQuestion8;
		}

		public void setOpeningFormQuestion8(boolean openingFormQuestion8) {
			OpeningFormQuestion8 = openingFormQuestion8;
		}

		public boolean isOpeningFormQuestion9() {
			return OpeningFormQuestion9;
		}

		public void setOpeningFormQuestion9(boolean openingFormQuestion9) {
			OpeningFormQuestion9 = openingFormQuestion9;
		}

	

	
	
	


}
