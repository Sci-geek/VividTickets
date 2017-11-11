package org.system.event;

import java.util.ArrayList;

import org.system.customer.*;

public class Venue {
	private String venueName;
	private Address venueAddress;
	private int numRows;
	private int numSeatsPerRow;
	private int capacity;
	private Seat[][] seats;
	private ArrayList<Event> eventList = new ArrayList<Event>();

	//Constructor
	public Venue(){
		this.venueName = "Unknown";
		this.venueAddress = new Address();
		this.numRows = 0;
		this.numSeatsPerRow = 0;
		this.capacity = 0;
		setSeats(new Seat[numRows][numSeatsPerRow]) ;
	}
	
	public Venue(String venueName, Address venueAddress, 
		int numRows, int numSeatsPerRow, int capacity){
		this.venueName = venueName;
		this.venueAddress = venueAddress;
		this.numRows = numRows;
		this.numSeatsPerRow = numSeatsPerRow;
		this.capacity = capacity;
		setSeats(new Seat[numRows][numSeatsPerRow]);
	}

	//getters and setters
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public Address getVenueAddress() {
		return venueAddress;
	}
	public void setVenueAddress(Address venueAddress) {
		this.venueAddress = venueAddress;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) { /////////////////////////// 
		this.capacity = numRows * numSeatsPerRow;
	}
	public int getNumRows() {
		return numRows;
	}
	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}
	public int getNumSeatsPerRow() {
		return numSeatsPerRow;
	}
	public void setNumSeatsPerRow(int numSeatsPerRow) {
		this.numSeatsPerRow = numSeatsPerRow;
	}
	
	/* ASSIGN EVENTS TO AN ARRAY LIST */
	public void addEvent(Event event){
		eventList.add(event);
	}
	
	public ArrayList<Event> getEventList(){
		return eventList;
	}
	
//	/* FINDS PRICE FOR SECTION */
//	public double findPrice(int sectionNum){
//		double price = 0.00;
//	
//		if(sectionNum == 101 || sectionNum == 122 || sectionNum == 201 || sectionNum == 230){
//			price = 150.00; // $150 for any seat in these sections
//		}
//		else if(sectionNum == 102 || sectionNum == 110 || sectionNum == 113 || sectionNum == 121){
//			price = 100.00; // $100 for any seat in these sections
//		} 
//		else if(sectionNum == 103 || sectionNum == 104 || sectionNum == 105 || sectionNum == 106 ||
//				sectionNum == 107 || sectionNum == 108 || sectionNum == 109 || sectionNum == 114 ||
//				sectionNum == 115 || sectionNum == 116 || sectionNum == 117 || sectionNum == 118 || 
//				sectionNum == 119){
//			price = 75.00; // $75 for any seat in these sections
//		}
//		else if(sectionNum == 201 || sectionNum == 215 || sectionNum == 216 || sectionNum == 230){
//			price = 50.00; // $50 for any seat in these sections
//		}
//		else if(sectionNum == 202 || sectionNum == 203 || sectionNum == 213 || sectionNum == 214 ||
//				sectionNum == 217 || sectionNum == 218 || sectionNum == 228 || sectionNum == 229 ||
//				sectionNum == 204 || sectionNum == 213 || sectionNum == 219 || sectionNum == 227){
//			price = 30.00; // $30 for any seat in these sections
//		}
//		else if(sectionNum == 205 || sectionNum == 206 || sectionNum == 207 || sectionNum == 208 ||
//				sectionNum == 209 || sectionNum == 210 || sectionNum == 211 || sectionNum == 220 ||
//				sectionNum == 221 || sectionNum == 222 || sectionNum == 223 || sectionNum == 224 || 
//				sectionNum == 225 || sectionNum == 226){
//			price = 15.00; // $15 for any seat in these sections
//		}
//		else{
//			// invalid section
//			price = 1000000; // $1,000,000 if we made a mistake
//		}
//		
//		return price;
//	}
		
	public int calculateSeatsAvailable(){
		return 0;
	}

	public Seat[][] getSeats() {
		
		return seats;
	}

	public void setSeats(Seat[][] seats) {
		this.seats = seats;
	}
	
	
}


