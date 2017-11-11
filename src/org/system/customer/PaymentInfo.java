package org.system.customer;

public class PaymentInfo {

	private String cardCompany;
	private String cardType;
	private String cardNumber;
	private int securityCode;
	private int expMonth;
	private int expYear;

	public PaymentInfo() {
		this.cardCompany = "Unknown";
		this.cardType = "Unknown";
		this.cardNumber = "0000000000000000";
		this.securityCode = 0;
		this.expMonth = 0;
		this.expYear = 0;
	}
	

	//Getters
	
	public String getCardCompany() {
		return this.cardCompany;
	}

	public String getCarType() {
		return this.cardType;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public int getSecurityCode() {
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

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
		
}
