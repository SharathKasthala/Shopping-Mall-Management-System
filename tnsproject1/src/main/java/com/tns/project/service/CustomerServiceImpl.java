package com.tns.project.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.project.entity.Customer;
import com.tns.project.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> fetchCustomersList() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer fetchCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).get();
		
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerId);
	}

	@Override
	public Customer updateCustomer(Long customerId, Customer customer) {
		Customer customerDB = customerRepository.findById(customerId).get();
		
			if(Objects.nonNull(customer.getName())&&!"".equalsIgnoreCase(customer.getName())) {
				customerDB.setName(customer.getName());

			}
			if(Objects.nonNull(customer.getPhone())&&!"".equalsIgnoreCase(customer.getPhone())) {
				customerDB.setPhone(customer.getPhone());
			}
			if(Objects.nonNull(customer.getEmail())&&!"".equalsIgnoreCase(customer.getEmail())) {
				customerDB.setEmail(customer.getEmail());
			}
			
		return customerRepository.save(customerDB);	
	}
}