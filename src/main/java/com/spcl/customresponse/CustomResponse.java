package com.spcl.customresponse;

public class CustomResponse<T> {
	
	private boolean success;
    private String message;
    private T data;
    
	public CustomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public CustomResponse(boolean success, String message, T data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	}
    
    
}
