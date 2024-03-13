package com.spcl.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spcl.customresponse.CustomResponse;
import com.spcl.entity.Customer;
import com.spcl.exception.CustomException;
import com.spcl.repo.CustomerRepo;
import com.spcl.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	 private CustomerRepo customerRepo;
	
	@Override
	public Customer create(Customer customers) {
		if(!customers.equals(null))
		{
			return customerRepo.save(customers);
		}
		else
			throw new CustomException("enter proper data");

	}

	@Override
	public ResponseEntity<Customer> getById(Long id) {
		// TODO Auto-generated method stub
		
        Customer customer = customerRepo.findById(id).get();
  
        if(customer == null)
        {
        	return ResponseEntity.notFound().build();
        }
		return ResponseEntity.ok(customer);
	}





	

}
