package org.system.customer;

import java.util.*;

import org.system.event.*;

public class Customer {

<<<<<<< HEAD
	​private String name; 
	​private Address address;​
	private String phone;
	private ​String email;
	private ​PaymentInfo paymentCard;
	​private ArrayList<Seat> seatsPurchased;​

	
	private Customer() {
=======
	private String name;
	private Address address;
	private String phone;
	private String email;
	private PaymentInfo paymentCard;
	private ArrayList<Seat> seatsPurchased;
	
	public Customer() {
>>>>>>> finn
		this.name = "Unknown";
		this.address = new Address();
		this.phone = "0000000000";
		this.email = "none@none.com";
		this.paymentCard = new PaymentInfo();
		this.seatsPurchased = new ArrayList<Seat>();
	}

<<<<<<< HEAD
=======
	
	
>>>>>>> finn
	//Getters

	public String getName() {
		return this.name;
	}
	
	public Address getAddress() {
		return this.address;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getEmail() {
		return this.email;
	}

	public PaymentInfo getPaymentCard() {
		return this.paymentCard;
	}

<<<<<<< HEAD
	public ArrayList<Seat> getSeatsPurchased() {
		return this.seatsPurchased;
	}
=======
	public ArrayList<Seat> getSeatsList() {
		return this.seatsPurchased;
	}

>>>>>>> finn
	
	//Setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void setPaymentCard(PaymentInfo paymentCard) {
		this.paymentCard = paymentCard;
	}
<<<<<<< HEAD

	public void setSeatsPurchased(ArrayList<Seat> seatsPurchased) {
		this.seatsPurchased = seatsPurchased;
	}
	
=======
	
	//Misc
	public void addSeat(Seat seat) {
		this.seatsPurchased.add(seat);
	}

>>>>>>> finn
}
