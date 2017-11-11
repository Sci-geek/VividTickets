package org.system.event;

import org.system.customer.Customer;

public class Event {
	private String eventName;
	private Time eventTime;
	private Venue eventVenue;
	private String description;
	private double seatPrice;
	
	
	
	public Event() {
		this.setEventName("null");
		this.setEventTime(null);
		this.setEventVenue(null);
		this.setSeatPrice(-1);
	}
	
	public Event(String eventName, Venue eventVenue, Time eventTime, double seatPrice) {
		this.setEventName(eventName);
		this.setEventTime(eventTime);
		this.setSeatPrice(seatPrice);
		this.setEventVenue(eventVenue);
		
		buildSeats();
			
	}


	public Time getEventTime() {
		return eventTime;
	}

	public void setEventTime(Time eventTime) {
		this.eventTime = eventTime;
	}

	public Venue getEventVenue() {
		return eventVenue;
	}

	public void setEventVenue(Venue eventVenue) {
		this.eventVenue = eventVenue;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}

	private void buildSeats() {
		Venue v = this.getEventVenue();
		
		for (int i = 0; i < v.getNumRows(); i++) {
			for (int j = 0; j < v.getNumSeatsPerRow(); j++) {
				
				v.getSeats()[i][j] = new Seat(i, j, this.getSeatPrice(), new Customer(), this ) ;
			}
			
		}
	}
	
	
	

}


