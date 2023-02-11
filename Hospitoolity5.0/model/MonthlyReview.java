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
public class MonthlyReview {

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
	private boolean reviewFormQuestion1;
	
	private String details;	
	private String whatYouDid;
	
	
	private boolean reviewFormQuestion2;
	private boolean reviewFormQuestion3;
	private boolean reviewFormQuestion4;
	private boolean reviewFormQuestion5;
	private boolean reviewFormQuestion6;
	private boolean reviewFormQuestion7;
	private boolean reviewFormQuestion8;
	private boolean reviewFormQuestion9;
	private boolean reviewFormQuestion10;
	private boolean reviewFormQuestion11;
	private boolean reviewFormQuestion12;
	private boolean reviewFormQuestion13;
	
	private String additionalDetails;
	
	
	@NotBlank(message = "Name field can not be blank.")
	@Pattern(regexp = "^[a-zA-Z\\s]{2,20}$", message = "Wrong pattern. Use just letters A-Z and spaces.")
	private String whoChecked;
	
	public Date getDate() {
		return date;
	}

		public void setDate(Date date) {
		this.date = date;
	}

		public boolean isReviewFormQuestion1() {
			return reviewFormQuestion1;
		}

		public void setReviewFormQuestion1(boolean reviewFormQuestion1) {
			this.reviewFormQuestion1 = reviewFormQuestion1;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public String getWhatYouDid() {
			return whatYouDid;
		}

		public void setWhatYouDid(String whatYouDid) {
			this.whatYouDid = whatYouDid;
		}

		public boolean isReviewFormQuestion2() {
			return reviewFormQuestion2;
		}

		public void setReviewFormQuestion2(boolean reviewFormQuestion2) {
			this.reviewFormQuestion2 = reviewFormQuestion2;
		}

		public boolean isReviewFormQuestion3() {
			return reviewFormQuestion3;
		}

		public void setReviewFormQuestion3(boolean reviewFormQuestion3) {
			this.reviewFormQuestion3 = reviewFormQuestion3;
		}

		public boolean isReviewFormQuestion4() {
			return reviewFormQuestion4;
		}

		public void setReviewFormQuestion4(boolean reviewFormQuestion4) {
			this.reviewFormQuestion4 = reviewFormQuestion4;
		}

		public boolean isReviewFormQuestion5() {
			return reviewFormQuestion5;
		}

		public void setReviewFormQuestion5(boolean reviewFormQuestion5) {
			this.reviewFormQuestion5 = reviewFormQuestion5;
		}

		public boolean isReviewFormQuestion6() {
			return reviewFormQuestion6;
		}

		public void setReviewFormQuestion6(boolean reviewFormQuestion6) {
			this.reviewFormQuestion6 = reviewFormQuestion6;
		}

		public boolean isReviewFormQuestion7() {
			return reviewFormQuestion7;
		}

		public void setReviewFormQuestion7(boolean reviewFormQuestion7) {
			this.reviewFormQuestion7 = reviewFormQuestion7;
		}

		public boolean isReviewFormQuestion8() {
			return reviewFormQuestion8;
		}

		public void setReviewFormQuestion8(boolean reviewFormQuestion8) {
			this.reviewFormQuestion8 = reviewFormQuestion8;
		}

		public boolean isReviewFormQuestion9() {
			return reviewFormQuestion9;
		}

		public void setReviewFormQuestion9(boolean reviewFormQuestion9) {
			this.reviewFormQuestion9 = reviewFormQuestion9;
		}

		public boolean isReviewFormQuestion10() {
			return reviewFormQuestion10;
		}

		public void setReviewFormQuestion10(boolean reviewFormQuestion10) {
			this.reviewFormQuestion10 = reviewFormQuestion10;
		}

		public boolean isReviewFormQuestion11() {
			return reviewFormQuestion11;
		}

		public void setReviewFormQuestion11(boolean reviewFormQuestion11) {
			this.reviewFormQuestion11 = reviewFormQuestion11;
		}

		public boolean isReviewFormQuestion12() {
			return reviewFormQuestion12;
		}

		public void setReviewFormQuestion12(boolean reviewFormQuestion12) {
			this.reviewFormQuestion12 = reviewFormQuestion12;
		}

		public boolean isReviewFormQuestion13() {
			return reviewFormQuestion13;
		}

		public void setReviewFormQuestion13(boolean reviewFormQuestion13) {
			this.reviewFormQuestion13 = reviewFormQuestion13;
		}

		public String getAdditionalDetails() {
			return additionalDetails;
		}

		public void setAdditionalDetails(String additionalDetails) {
			this.additionalDetails = additionalDetails;
		}

		public String getWhoChecked() {
			return whoChecked;
		}

		public void setWhoChecked(String whoChecked) {
			this.whoChecked = whoChecked;
		}

	

	
	
	


}
