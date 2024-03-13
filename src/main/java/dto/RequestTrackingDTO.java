package dto;

import java.time.LocalDateTime;

import com.spcl.enums.Status;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class RequestTrackingDTO {
	
	
	private Long id;
	@Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime submittedDateTime;
    private LocalDateTime resolvedDateTime;
    
	public RequestTrackingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RequestTrackingDTO(Long id, Status status, LocalDateTime submittedDateTime, LocalDateTime resolvedDateTime) {
		super();
		this.id = id;
		this.status = status;
		this.submittedDateTime = submittedDateTime;
		this.resolvedDateTime = resolvedDateTime;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public LocalDateTime getSubmittedDateTime() {
		return submittedDateTime;
	}
	
	public void setSubmittedDateTime(LocalDateTime submittedDateTime) {
		this.submittedDateTime = submittedDateTime;
	}
	
	public LocalDateTime getResolvedDateTime() {
		return resolvedDateTime;
	}
	public void setResolvedDateTime(LocalDateTime resolvedDateTime) {
		this.resolvedDateTime = resolvedDateTime;
	}
    
    

}
