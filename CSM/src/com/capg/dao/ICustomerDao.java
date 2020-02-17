package com.capg.dao;

import java.util.List;

import com.capg.beans.Customer;

public interface ICustomerDao {

	int addCustomer(Customer c);

	int updateCustomer(Customer c);

	Customer getCustomerById(int cid);

	int deleteCustomerById(int cid);

	List<Customer> getAllCustomer();
	
}
