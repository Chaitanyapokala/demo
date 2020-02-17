package com.capg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.capg.beans.Customer;

public class CustomerDao implements ICustomerDao {

	Connection conn = DBUtil.getDBConnection();
	
	@Override
	public int addCustomer(Customer c) {
		
		int count=0;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(IQueryMapper.INSERT_CUST_QUERY);
			pstmt.setInt(1, c.getCid());
			pstmt.setString(2, c.getCname());
			pstmt.setDouble(3, c.getAmount());
			count = pstmt.executeUpdate();
			System.out.println("Customer Added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				System.out.println("Connection Closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return count;
	}

	@Override
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomerById(int cid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}