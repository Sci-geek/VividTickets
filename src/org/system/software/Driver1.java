package org.system.software;

import org.system.event.*;
import org.system.customer.*;


public class Driver1 
{

	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		Customer c2 = new Customer();

		Address a1 = new Address();
		Address a2 = new Address();
		
		PaymentInfo pay1 = new PaymentInfo();
		PaymentInfo pay2 = new PaymentInfo();
		
		a1.setStreet("182 Blink Street");
		a1.setCity("Tucson");
		a1.setState("AZ");
		a1.setZipCode(85716);
		a1.setCountry("USA");
		
		a2.setStreet("1400 Hooch Drive");
		a2.setCity("Tucson");
		a2.setState("Arizona");
		a2.setZipCode(85716);
		a2.setCountry("United States of America");
		
		pay1.setCardNumber("1234567890123456");
		pay1.setSecurityCode(012);
		pay1.setCardType("Visa");
		pay1.setExpMonth(01);
		pay1.setExpYear(19);
		pay1.setCardCompany("Chase");
		
		pay2.setCardNumber("6543210987654321");
		pay2.setSecurityCode(987);
		pay2.setCardType("MasterCard");
		pay2.setExpMonth(12);
		pay2.setExpYear(17);
		pay2.setCardCompany("Wells Fargo");

		c1.setName("Dude Duderson");
		c1.setEmail("dudeduderson@dude.dude");
		c1.setPhone("5203833766");
		c1.setAddress(a1);
		c1.setPaymentCard(pay1);
		
		c2.setName("Bob BillyBob");
		c2.setEmail("bob@billy.bob");
		c2.setPhone("5202622455");
		c2.setAddress(a2);
		c2.setPaymentCard(pay2);
		
		Venue v1 = new Venue();
		Venue v2 = new Venue();
		
		Address v1address = new Address();
		Address v2address = new Address();
		
		v1address.setStreet("136 N Park Ave");
		v1address.setCity("Tucson");
		v1address.setState("AZ");
		v1address.setZipCode(85719);
		v1address.setCountry("USA");
		
		v2address.setStreet("318 E Congress St");
		v2address.setCity("Tucson");
		v2address.setState("AZ");
		v2address.setZipCode(85701);
		v2address.setCountry("USA");
		
		Event e1 = new Event();
		Event e2 = new Event();
		
		Seat s1 = new Seat();
		Seat s2 = new Seat();
		
		Time t1 = new Time();
		Time t2 = new Time();
		
		t1.setDay(6);
		t1.setHour(18);
		t1.setMinute(6);
		t1.setMonth(6);
		t1.setYear(2017);

		t2.setDay(4);
		t2.setHour(23);
		t2.setMinute(0);
		t2.setMonth(7);
		t2.setYear(2018);
				
		v1.setVenueAddress(v1address);
		v1.setVenueName("The Rock");
		v1.setNumRows(10);
		v1.setNumSeatsPerRow(25);
		
		v2.setVenueAddress(v2address);
		v2.setVenueName("Rialto Theatre");
		v2.setNumRows(35);
		v2.setNumSeatsPerRow(70);
		
		e1.setEventName("Vildhjarta");
		e1.setDescription("With the sick breakdowns and thall that Vildhjarta have created in their latest album, death walls and moshes are to be expected. Bring a poncho");
		e1.setEventTime(t1);
		e1.setEventVenue(v1);
		e1.setSeatPrice(30.00);
		
		e2.setEventName("Nick Offerman's 4th Of July Special");
		e2.setDescription("Wrap some bacon around a hot dog and throw it on that steak. It's America's birthday presented by the most American American, Nick Offerman");
		e2.setEventTime(t1);
		e2.setEventVenue(v1);
		e2.setSeatPrice(100.00);
		
		s1.setSeatEventd(e1);
		s1.setSeatHolder(c1);
		s1.setSeatPrice(e1.getSeatPrice());
		s1.setRowNum(6);
		s1.setSeatNum(6);
		
		s2.setSeatEventd(e2);
		s2.setSeatHolder(c2);
		s2.setSeatPrice(e2.getSeatPrice());
		s2.setRowNum(7);
		s2.setSeatNum(4);
		
		c1.addSeat(s1);
		c2.addSeat(s2);
		
		
		System.out.println("First Customer");		
		System.out.println("Name: "+ c1.getName());
		System.out.println("Phone: " + c1.getPhone());
		System.out.println("Email: " + c1.getEmail());
		System.out.println("Address: \n"+ c1.getAddress().addressToString());
		System.out.println("Payment Card: \n" + c1.getPaymentCard().getCardCompany() + "\n" + c1.getPaymentCard().getCardNumber() + "\n" + c1.getPaymentCard().getExpMonth() + "\n" + c1.getPaymentCard().getExpYear() + "\n" + c1.getPaymentCard().getSecurityCode() + "\n" + c1.getPaymentCard().getCardType());
		for (int i = 0; i < c1.getSeatsList().size(); i++) {
			System.out.println("Event: " + c1.getSeatsList().get(i).getSeatEventd().getEventName());
			System.out.println("Event Description: " + c1.getSeatsList().get(i).getSeatEventd().getDescription());
			System.out.println("Event Time: " + c1.getSeatsList().get(i).getSeatEventd().getEventTime().dateToString() + ", " + c1.getSeatsList().get(i).getSeatEventd().getEventTime().timeToString());
			System.out.println("Seat: " + "Row " + c1.getSeatsList().get(i).getRowNum() + "Seat " + c1.getSeatsList().get(i).getSeatNum());
			System.out.println("Seat Price: " + c1.getSeatsList().get(i).getSeatPrice() + ", paid by " + c1.getSeatsList().get(i).getSeatHolder().getName());
			System.out.println("Venue: " + c1.getSeatsList().get(i).getSeatEventd().getEventVenue().getVenueName());
			System.out.println("Venue Address: \n" +  c1.getSeatsList().get(i).getSeatEventd().getEventVenue().getVenueAddress().addressToString());
		}
		
		System.out.println("Second Customer");		
		System.out.println("Name: "+ c2.getName());
		System.out.println("Phone: " + c2.getPhone());
		System.out.println("Email: " + c2.getEmail());
		System.out.println("Address: \n"+ c2.getAddress().addressToString());
		System.out.println("Payment Card: \n" + c2.getPaymentCard().getCardCompany() + "\n" + c2.getPaymentCard().getCardNumber() + "\n" + c2.getPaymentCard().getExpMonth() + "\n" + c2.getPaymentCard().getExpYear() + "\n" + c2.getPaymentCard().getSecurityCode() + "\n" + c2.getPaymentCard().getCardType());
		for (int i = 0; i < c2.getSeatsList().size(); i++) {
			System.out.println("Event: " + c2.getSeatsList().get(i).getSeatEventd().getEventName());
			System.out.println("Event Description: " + c2.getSeatsList().get(i).getSeatEventd().getDescription());
			System.out.println("Event Time: " + c2.getSeatsList().get(i).getSeatEventd().getEventTime().dateToString() + ", " + c2.getSeatsList().get(i).getSeatEventd().getEventTime().timeToString());
			System.out.println("Seat: " + "Row " + c2.getSeatsList().get(i).getRowNum() + "Seat " + c2.getSeatsList().get(i).getSeatNum());
			System.out.println("Seat Price: " + c2.getSeatsList().get(i).getSeatPrice() + ", paid by " + c2.getSeatsList().get(i).getSeatHolder().getName());
			System.out.println("Venue: " + c2.getSeatsList().get(i).getSeatEventd().getEventVenue().getVenueName());
			System.out.println("Venue Address: \n" +  c2.getSeatsList().get(i).getSeatEventd().getEventVenue().getVenueAddress().addressToString());
		}
	}
}