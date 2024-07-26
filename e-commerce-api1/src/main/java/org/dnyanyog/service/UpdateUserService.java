//package org.dnyanyog.service;
//
//import org.dnyanyog.dao.Userdao;
//import org.dnyanyog.dto.UpdateUserRequest;
//import org.dnyanyog.dto.UpdateUserResponse;
//import org.dnyanyog.entity.Users;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UpdateUserService {
//	
//	@Autowired
//	Userdao userdao;
//	
//	public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest)  {
//		
//		UpdateUserResponse response = new UpdateUserResponse();
//		
//	    if(updateUserRequest.getId() == null) {
//	    	response.setErrorCode("911");
//			response.setMessage("User not Found");
//			return response;
//	    }
//	    
//	    Users user = new Users();
//	    user.setFirstName(updateUserRequest.getFirsName());
//	    user.setLastName(updateUserRequest.getLastName());
//	    user.setLoginName(updateUserRequest.getLoginName());
//	    user.setId(updateUserRequest.getId());
//	    user.setPassword(updateUserRequest.getPassword());
//	    
//	    userdao.save(user);
//	    response.setErrorCode("0000");
//	    response.setRequest(updateUserRequest);
//	    return response;
//	}
//
//}
