package com.spcl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spcl.repo.ServiceRquesHistotyRepo;

@Service
public class ServiceRequestHistoryImpl {

	
	@Autowired
	private ServiceRquesHistotyRepo serviceRquesHistotyRepo;
	
	
}
