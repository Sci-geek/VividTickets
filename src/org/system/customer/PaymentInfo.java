package org.system.customer;

public class PaymentInfo {

	private String cardCompany;
	private String carType;
	private double cardNumber;
	private double securityCode;
	private int expMonth;
	private int expYear;

	public PaymentInfo() {
		this.cardCompany = "Unknown";
		this.carType = "Unknown";
		this.cardNumber = 0.00;
		this.securityCode = 0.00;
		this.expMonth = 0;
		this.expYear = 0;
	}
	

	//Getters
	
	public String getCardCompany() {
		return this.cardCompany;
	}

	public String getCarType() {
		return this.carType;
	}

	public double getCardNumber() {
		return this.cardNumber;
	}

	public double getSecurityCode() {
		return this.securityCode;
	}

	public int getExpMonth() {
		return this.expMonth;
	}

	public int getExpYear() {
		return this.expYear;
	}
	
	
	//Setters

	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setCardNumber(double cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setSecurityCode(double securityCode) {
		this.securityCode = securityCode;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
		
}
