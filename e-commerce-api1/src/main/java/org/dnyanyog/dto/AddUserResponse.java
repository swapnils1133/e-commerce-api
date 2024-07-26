package org.dnyanyog.dto;

public class AddUserResponse {
	
	private String errorCode;
	private String message;
	private Integer id;
	private AddUserRequest request;

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

	public AddUserRequest getRequest() {
		return request;
	}
	
	public void setRequest(AddUserRequest request) {
		this.request = request;
	}

}
