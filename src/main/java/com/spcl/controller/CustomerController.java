package com.spcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spcl.customresponse.CustomResponse;
import com.spcl.entity.Customer;
import com.spcl.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
@Autowired
	private CustomerService customerService;


@PostMapping	
public Customer createCategory(@RequestBody Customer customer)
{
	return this.customerService.create(customer);
}



@GetMapping("/{id}")
public  ResponseEntity<Customer> getCustomerById(@PathVariable Long id)
{
	return this.customerService.getById(id);	
}



}





