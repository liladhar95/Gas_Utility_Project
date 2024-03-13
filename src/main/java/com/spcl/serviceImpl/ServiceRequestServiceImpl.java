package com.spcl.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spcl.entity.Customer;
import com.spcl.entity.ServiceRequest;
import com.spcl.exception.CustomException;
import com.spcl.repo.ServiceRequRepo;
import com.spcl.service.ServiceRequestService;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

	
	@Autowired
	private ServiceRequRepo serviceRequRepo;

	@Override
	public ServiceRequest createReq(ServiceRequest serviceRequest) {
		// TODO Auto-generated method stub
		
		if(!serviceRequest.equals(null))
		{
			return serviceRequRepo.save(serviceRequest);
		}
		else
			throw new CustomException("enter proper data");

	}

	@Override
	public ResponseEntity<ServiceRequest> serviceReqCreate(ServiceRequest serviceRequest) {
		// TODO Auto-generated method stub
		ServiceRequest newServiceReq=serviceRequRepo.save(serviceRequest);
		
		return new ResponseEntity<>(newServiceReq, HttpStatus.CREATED);  
	}



	@Override
	public ResponseEntity<ServiceRequest> getServiceRequestById(Long id, ServiceRequest updatedRequest) {
		// TODO Auto-generated method stub
	ServiceRequest existingRequest = serviceRequRepo.findById(id).get();
        if (existingRequest == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Update fields of existingRequest with fields from updatedRequest
        existingRequest.setType(updatedRequest.getType());
        
        existingRequest.setDetails(updatedRequest.getDetails());
        
        existingRequest.setModify_date(updatedRequest.getModify_date());
        existingRequest.setStatus(updatedRequest.getStatus());
//        // Update other fields as needed

        ServiceRequest updatedServiceRequest = serviceRequRepo.save(existingRequest);

        return new ResponseEntity<>(updatedServiceRequest, HttpStatus.OK);

		
	}

}
	
	

	
	
	

