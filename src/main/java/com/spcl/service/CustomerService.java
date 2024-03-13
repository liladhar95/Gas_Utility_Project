package com.spcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spcl.customresponse.CustomResponse;
import com.spcl.entity.Customer;
import com.spcl.repo.CustomerRepo;

@Service
public interface CustomerService {

	Customer create(Customer customer);

	ResponseEntity<Customer> getById(Long id);


	
	
	

}
