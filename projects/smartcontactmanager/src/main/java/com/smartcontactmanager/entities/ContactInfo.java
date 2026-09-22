package com.smartcontactmanager.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class ContactInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contactId;
	@NotBlank (message = "First Name cannot be blank")
	private String firstName;
	@NotBlank (message = "Last Name cannot be blank")
	private String lastName;

	@Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message="Invalid Email Format!")
	private String email;
	@Size (max = 10, min = 10, message = "Enter 10-digit mobile number")
	private String mobileNumber;
	@NotBlank (message = "Please mention work details")
	private String work;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn (name = "address_id") 
	@Valid 
	private ContactAddress contactAddress;
	
	@NotBlank(message = "Please upload profile photo") 
	private String profileImage;
	
	@NotBlank 
	@Column(length = 5000)
	private String description;
	
	@ManyToOne()
	private User user;

	public int getContactId() {
		return contactId;
	}



	public void setContactId(int contactId) {
		this.contactId = contactId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getWork() {
		return work;
	}



	public void setWork(String work) {
		this.work = work;
	}



	public ContactAddress getContactAddress() {
		return contactAddress;
	}



	public void setContactAddress(ContactAddress contactAddress) {
		this.contactAddress = contactAddress;
	}



	public String getProfileImage() {
		return profileImage;
	}



	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public ContactInfo() {

	}



	public ContactInfo(int contactId, String firstName, String lastName,
			@Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Invalid Email!") String email,
			@Size(max = 10, min = 10, message = "Enter 10-digit mobile number") String mobileNumber, String work,
			ContactAddress contactAddress, String profileImage, String description, User user) {
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.work = work;
		this.contactAddress = contactAddress;
		this.profileImage = profileImage;
		this.description = description;
		this.user = user;
	}



	@Override
	public String toString() {
		return "ContactInfo [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", work=" + work + ", contactAddress="
				+ contactAddress + ", profileImage=" + profileImage + ", description=" + description + "]";
	}

	
}

