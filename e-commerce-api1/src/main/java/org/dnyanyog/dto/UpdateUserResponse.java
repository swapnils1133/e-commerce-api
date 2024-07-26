package org.dnyanyog.dto;

public class UpdateUserResponse {
	
	private String errorCode;
	private String message;
	private Integer id;
	private UpdateUserRequest request;
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public UpdateUserRequest getRequest() {
		return request;
	}
	
	public void setRequest(UpdateUserRequest request) {
		this.request = request;
	}

}
