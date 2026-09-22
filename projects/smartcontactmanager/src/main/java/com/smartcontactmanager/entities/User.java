package com.smartcontactmanager.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank(message = "Please add your name.")
	private String name;
	
	@Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message="Invalid Email!")
	@Column(unique = true)
	private String email;
	
	private String password;
	
	private String role;
	
	private boolean enabled;
	
	@Column(length = 500)
	@Size(max = 100, min = 20, message="Add info about yourself in 100 scharacters")
	private String description;
	
	private String imageUrl;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<ContactInfo> listOfContacts = new ArrayList<ContactInfo>();

	public User(int id, String name, String email, String password, String role, boolean enabled, String description,
			String imageUrl, List<ContactInfo> listOfContacts) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
		this.description = description;
		this.imageUrl = imageUrl;
		this.listOfContacts = listOfContacts;
	}

	public List<ContactInfo> getListOfContacts() {
		return listOfContacts;
	}

	public void setListOfContacts(List<ContactInfo> listOfContacts) {
		this.listOfContacts = listOfContacts;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", enabled=" + enabled + ", description=" + description + ", listOfContacts=" + listOfContacts + "]";
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
