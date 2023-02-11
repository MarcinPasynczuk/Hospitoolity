package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



@Entity
public class ContactsList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NotBlank(message = "Field can not be blank.")
	private String contactName;	
	
	@NotBlank(message = "Field can not be blank.")
	private String contactTelephone;
	
	@NotBlank(message = "Field can not be blank.")
	private String contactEmail;

	@NotBlank(message = "Field can not be blank.")
	private String contactAddress;
	
	@NotBlank(message = "Field can not be blank.")
	private String contactUsefulForAdviceOn;

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTelephone() {
		return contactTelephone;
	}

	public void setContactTelephone(String contactTelephone) {
		this.contactTelephone = contactTelephone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactUsefulForAdviceOn() {
		return contactUsefulForAdviceOn;
	}

	public void setContactUsefulForAdviceOn(String contactUsefulForAdviceOn) {
		this.contactUsefulForAdviceOn = contactUsefulForAdviceOn;
	}
	
	
	
	

	


	
	
	


}
