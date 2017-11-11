package org.system.event;
import org.system.customer.*;



public class Seat {
	
	private int rowNum;
	private int seatNum;
	private double seatPrice;
	private Customer seatHolder;
	private Event seatEventd;
	
	
	
	
	public Seat() {
		this.setRowNum(-1);
		this.setSeatNum(-1);
		this.setSeatPrice(-1);
		this.setSeatHolder(new Customer());
		this.setSeatEventd(new Event());	
	}
	
	
	public Seat(int rowNum, int seatNum) {
		this.setRowNum(rowNum);
		this.setSeatNum(seatNum);
		this.setSeatPrice(-1);
		this.setSeatHolder(new Customer());
		this.setSeatEventd(new Event());	
	}
	
	public Seat(int rowNum, int seatNum, double seatPrice, Customer seatHolder, Event seatEventd ) {
		this.setRowNum(rowNum);
		this.setSeatNum(seatNum);
		this.setSeatPrice(seatPrice);
		this.setSeatHolder(seatHolder);
		this.setSeatEventd(seatEventd);	
	}


	public int getRowNum() {
		return rowNum;
	}


	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}


	public int getSeatNum() {
		return seatNum;
	}


	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}


	public double getSeatPrice() {
		return seatPrice;
	}


	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}


	public Customer getSeatHolder() {
		return seatHolder;
	}


	public void setSeatHolder(Customer seatHolder) {
		this.seatHolder = seatHolder;
	}


	public Event getSeatEventd() {
		return seatEventd;
	}


	public void setSeatEventd(Event seatEventd) {
		this.seatEventd = seatEventd;
	}
	
	

}

