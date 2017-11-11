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
	}
}