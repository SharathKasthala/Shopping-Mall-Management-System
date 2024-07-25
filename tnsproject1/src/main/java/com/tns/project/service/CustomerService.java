package com.tns.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tns.project.entity.Customer;

@Service
public interface CustomerService {

	Customer saveCustomer(Customer customer);

	List<Customer> fetchCustomersList();

	Customer fetchCustomerById(Long customerId);

	void deleteCustomerById(Long customerId);

	Customer updateCustomer(Long customerId, Customer customer);


}
