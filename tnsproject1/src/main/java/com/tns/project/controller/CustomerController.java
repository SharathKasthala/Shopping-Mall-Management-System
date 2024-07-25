package com.tns.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.project.entity.Customer;
import com.tns.project.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
		
	}
	
	@GetMapping("/customers")
	public List<Customer>fetchCustomersList(){
		return customerService.fetchCustomersList();
		
	}
	@GetMapping("/customers/{id}")
	public Customer fetchCustomerById(@PathVariable("id") Long CustomerId) {
		return customerService.fetchCustomerById(CustomerId);
	}
	
	@DeleteMapping("/customers/{id}")
	public String delteCustomerById(@PathVariable("id") Long CustomerId) {
		customerService.deleteCustomerById(CustomerId);
		return "Customer Deleted Successfully";
	}
	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@PathVariable("id")Long customerId, @RequestBody Customer customer) {
		return customerService.updateCustomer(customerId, customer);
		
	}
}

