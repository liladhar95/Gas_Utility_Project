package com.spcl.entity;

import java.time.LocalDateTime;

import com.spcl.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceRequestHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "serviceReq_id")
	private ServiceRequest serviceRequest;
	
	@Enumerated(EnumType.STRING)
    private Status status;
	private String cretaed_by;
	private LocalDateTime created_date;
	private LocalDateTime modify_date;
	private String modify_by;
	public ServiceRequestHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceRequestHistory(Long id, ServiceRequest serviceRequest, Status status, String cretaed_by,
			LocalDateTime created_date, LocalDateTime modify_date, String modify_by) {
		super();
		this.id = id;
		this.serviceRequest = serviceRequest;
		this.status = status;
		this.cretaed_by = cretaed_by;
		this.created_date = created_date;
		this.modify_date = modify_date;
		this.modify_by = modify_by;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}
	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status  status) {
		this.status = status;
	}
	public String getCretaed_by() {
		return cretaed_by;
	}
	public void setCretaed_by(String cretaed_by) {
		this.cretaed_by = cretaed_by;
	}
	public LocalDateTime getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}
	public LocalDateTime getModify_date() {
		return modify_date;
	}
	public void setModify_date(LocalDateTime modify_date) {
		this.modify_date = modify_date;
	}
	public String getModify_by() {
		return modify_by;
	}
	public void setModify_by(String modify_by) {
		this.modify_by = modify_by;
	}
	
	
	
	

}
