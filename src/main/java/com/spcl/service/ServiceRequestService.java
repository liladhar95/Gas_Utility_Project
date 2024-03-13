package com.spcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spcl.entity.ServiceRequest;
import com.spcl.repo.ServiceRequRepo;

import dto.RequestTrackingDTO;

@Service
public interface ServiceRequestService {

	ServiceRequest createReq(ServiceRequest serviceRequest);

	ResponseEntity<ServiceRequest> serviceReqCreate(ServiceRequest serviceRequest);



	ResponseEntity<ServiceRequest> getServiceRequestById(Long id, ServiceRequest updatedRequest);


	
	
	  

}
