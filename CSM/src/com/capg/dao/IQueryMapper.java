package com.capg.dao;

public interface IQueryMapper {

	String INSERT_CUST_QUERY = "insert into customer values(?,?,?,SYSDATE)";
	
}