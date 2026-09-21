package com.smartcontactmanager.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ContactInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contactId;
	private String firstName;
	private String lastEmail;
	private String nickName;
	private String work;
	private String mobileNumber;
	private String profileImage;
	
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

	public String getLastEmail() {
		return lastEmail;
	}

	public void setLastEmail(String lastEmail) {
		this.lastEmail = lastEmail;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	@Override
	public String toString() {
		return "ContactInfo [contactId=" + contactId + ", firstName=" + firstName + ", lastEmail=" + lastEmail
				+ ", nickName=" + nickName + ", work=" + work + ", mobileNumber=" + mobileNumber + ", profileImage="
				+ profileImage + ", description=" + description + ", user=" + user + "]";
	}

	public ContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

