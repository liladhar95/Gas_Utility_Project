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
public class ServiceRequest {
	
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String type;
	    private String name;
	    private String details;
	    @ManyToOne
	    @JoinColumn(name = "customer_id")
	    private Customer customer;
	    private String created_by;
	    private String location;
	    @Enumerated(EnumType.STRING)
	    private Status status;
	    private LocalDateTime created_date;
	    private LocalDateTime modify_date;
	    private String modify_by;
		public ServiceRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ServiceRequest(Long id, String type, String name, String details, Customer customer, String created_by,
				String location, Status status, LocalDateTime created_date, LocalDateTime modify_date,
				String modify_by) {
			super();
			this.id = id;
			this.type = type;
			this.name = name;
			this.details = details;
			this.customer = customer;
			this.created_by = created_by;
			this.location = location;
			this.status = status;
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
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDetails() {
			return details;
		}
		public void setDetails(String details) {
			this.details = details;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public String getCreated_by() {
			return created_by;
		}
		public void setCreated_by(String created_by) {
			this.created_by = created_by;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Status getStatus() {
			return status;
		}
		public void setStatus(Status status) {
			this.status = status;
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
		@Override
		public String toString() {
			return "ServiceRequest [id=" + id + ", type=" + type + ", name=" + name + ", details=" + details
					+ ", customer=" + customer + ", created_by=" + created_by + ", location=" + location + ", status="
					+ status + ", created_date=" + created_date + ", modify_date=" + modify_date + ", modify_by="
					+ modify_by + "]";
		}
		
		
		
		
	    
	    

}
