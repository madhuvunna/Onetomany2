package com.ReactGrid.springboot.service;


import java.util.List;

import com.ReactGrid.springboot.model.Customers;

public interface CustomersService {

	public Customers createCustomer(Customers customer);

	public List<Customers> findAll();
}
