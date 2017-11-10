package org.system.event;

public class Event {
	private String eventName;
	private Time eventTime;
	private Venue eventVenue;
	private String description;
	
	
	public Event() {
		this.setEventName("null");
		this.setEventTime(null);
		this.setEventVenue(null);
	}
	
	public Event(String eventName, Venue eventVenue, Time eventTime) {
		this.setEventName(eventName);
		this.setEventTime(eventTime);
		this.setEventVenue(eventVenue);
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
	

}


