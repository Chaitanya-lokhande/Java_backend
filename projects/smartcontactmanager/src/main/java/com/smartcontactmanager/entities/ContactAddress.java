package com.smartcontactmanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class ContactAddress {

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @NotBlank (message = "Please enter House no./Building information")
    private String addressLine1;
    @NotBlank (message = "Please enter locality details")
    private String addressLine2;
    @NotBlank(message = "Please enter city")
    private String city;
    @NotBlank(message = "Select state")
    private String state;
    
    @Size(min = 6, max = 6, message = "Please enter correct six digit postal code")
    private String zipcode;

    @OneToOne(mappedBy = "contactAddress")
    private ContactInfo contactInfo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public ContactAddress(int id, String addressLine1, String addressLine2, String city, String state,
            @Size(min = 6, max = 6, message = "Please enter correct six digit postal code") String zipcode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    public ContactAddress() {
        super();
    }
    @Override
    public String toString() {
        return "ContactAddress [id=" + id + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
                + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
    }

    
}
