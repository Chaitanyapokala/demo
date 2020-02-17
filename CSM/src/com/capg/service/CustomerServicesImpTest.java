package com.capg.service;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.capg.beans.Customer;

class CustomerServicesImpTest {

	@Test
	void testAddCustomer() {

		Customer cust= new Customer();
		cust.setCid(505);
		cust.setCname("Tom");
	}

	@Test
	void testIsValidCid() {
		fail("Not yet implemented");
	}

	@Test
	void testIsValidCname() {
		fail("Not yet implemented");
	}

	@Test
	void testUserValidations() {
		fail("Not yet implemented");
	}

}
