package com.spcl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spcl.entity.Customer;
import com.spcl.entity.ServiceRequest;

@Repository
public interface ServiceRequRepo extends JpaRepository<ServiceRequest,Long> {

	List<ServiceRequest> findByCustomer(Customer customer);

//	List<ServiceRequest> getServiceRequestsByCustomer(Customer customer);

	List<ServiceRequest> getServiceRequestsByCustomer(Customer customer);

	List<ServiceRequest> findByCustomerId(Long customerId);
	 

	

}
