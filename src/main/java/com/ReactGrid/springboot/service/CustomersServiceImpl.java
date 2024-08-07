package com.ReactGrid.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ReactGrid.springboot.dao.CustomersRepository;
import com.ReactGrid.springboot.model.Customers;

@Service
public class CustomersServiceImpl implements CustomersService {

	@Autowired
	//@Qualifier("CustomersRepository")
	private CustomersRepository customersRepository;

	
//	@Override
//	public Customers createCustomer(Customers customer) {
//		Customers customer1 = customersRepository.findByCustomersEmail(customer.getCustomersEmail());
//		
//		if(customer1==null) {
//			return customersRepository.save(customer);
//		}else {
//			return null;
//		}
//			
//		((Iterable<Customers>) customer).forEach(cust->
//		{
//			Customers customer1 = 	customersRepository.findByCustomersEmail(cust.getCustomersEmail());
//			if(customer1==null) {
//				customersRepository.save(cust);
//			}else {
//				cust.setCustomersId(customer1.getCustomersId());
//			
//			customersRepository.save(cust);
//			
//		}
//			
//		
//	});
//		return customer;
//	}

	@Override
	public List<Customers> findAll() {
		return  customersRepository.findAll();
	}

	@Override
	public Customers createCustomer(Customers customer) {
		
		return customersRepository.save(customer);
	}

}
