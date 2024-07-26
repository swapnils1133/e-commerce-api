package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtil;
import org.dnyanyog.dao.Userdao;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.dto.UpdateUserResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddUserService {
	
	@Autowired
	Userdao userdao;
	
	public AddUserResponse addUser(AddUserRequest addUserRequest)  {
		
		Users user = new Users();
		
		user.setFirstName(addUserRequest.getFirstName());
		user.setLastName(addUserRequest.getLastName());
		user.setLoginName(addUserRequest.getLoginName());
		user.setPassword(addUserRequest.getPassword());
		user.setId(addUserRequest.getId());
		
		Users userInsertedValue = userdao.save(user);
		
		AddUserResponse addUserResponse = new AddUserResponse();
		
		addUserResponse.setErrorCode("0000");
		addUserResponse.setMessage("User Added Successfully");
		addUserResponse.setRequest(addUserRequest);
		addUserResponse.setId(userInsertedValue.getId());
		
		return addUserResponse;

	}
	
public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest)  {
		
		UpdateUserResponse response = new UpdateUserResponse();
		
	    if(updateUserRequest.getId() == null) {
	    	response.setErrorCode("911");
			response.setMessage("User not Found");
			return response;
	    }
	    
	    Users user = new Users();
	    user.setFirstName(updateUserRequest.getFirstName());
	    user.setLastName(updateUserRequest.getLastName());
	    user.setLoginName(updateUserRequest.getLoginName());
	    user.setId(updateUserRequest.getId());
	    user.setPassword(updateUserRequest.getPassword());
	    
	    userdao.save(user);
	    response.setErrorCode("0000");
	    response.setRequest(updateUserRequest);
	    return response;
	}
}
