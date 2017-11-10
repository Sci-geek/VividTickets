package org.system.customer;

public class Address {

	private String street;
	private String city;
	private String state;
	private String country;
	private int zipCode;

	public Address() {​ 
		this.street = "Unknown";
		this.city = "Unknown";
		this.state = "Unknown";
		this.country = "Unknown";
		this.zipCode = 0;
	}
	
	//Getters
	public String getStreet() {
		return this.street;
	}
	
	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getCountry() {
		return this.country;
	}

	public int getZipCode() {
		return this.zipCode;
	}

	
	//Setters
	
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	
}
