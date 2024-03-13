package com.spcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spcl.service.ServiceRequestService;
@RestController
@RequestMapping("/history")
public class ServiceHistoryController {
	
	@Autowired
	private ServiceRequestService serviceRequestService;

}
