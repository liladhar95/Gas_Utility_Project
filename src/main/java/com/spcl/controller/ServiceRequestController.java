package com.spcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spcl.entity.Customer;
import com.spcl.entity.ServiceRequest;
import com.spcl.repo.ServiceRequRepo;
import com.spcl.service.ServiceRequestService;

import dto.RequestTrackingDTO;

@RestController
@RequestMapping("/requests")
public class ServiceRequestController {
	
	@Autowired
	private ServiceRequestService serviceRequestService;
	@Autowired
	private ServiceRequRepo serviceRequRepo;
	

	
	@PostMapping
	public ServiceRequest crateServiceReq(@RequestBody ServiceRequest serviceRequest)
	{
		return this.serviceRequestService.createReq(serviceRequest);
	}
	

	
	public ResponseEntity<ServiceRequest>ceateServiceReq(@RequestBody ServiceRequest serviceRequest)
	{
		return this.serviceRequestService.serviceReqCreate(serviceRequest);
	}
	

	 
	 
	 
	 
	 @PutMapping("/{id}")
	    public ResponseEntity<ServiceRequest> updateServiceRequest(@PathVariable Long id, @RequestBody ServiceRequest updatedRequest) {

		 return serviceRequestService.getServiceRequestById(id,updatedRequest);
		
	    }
	 
	 
	 @GetMapping("/customer/{customerId}")
	    public ResponseEntity<List<ServiceRequest>> getServiceRequestsByCustomer(@PathVariable Long customerId) {
	        List<ServiceRequest> serviceRequests = serviceRequRepo.findByCustomerId(customerId);
	        return new ResponseEntity<>(serviceRequests, HttpStatus.OK);
	    }
	 
	 
	 
 
	
	

	

}
