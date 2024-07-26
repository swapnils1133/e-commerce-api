package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.dto.UpdateUserResponse;
import org.dnyanyog.service.AddUserService;
//import org.dnyanyog.service.UpdateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UpdateUserController {
	
//	@Autowired
//	UpdateUserService updateUserService;
//	
//	@PostMapping(path="/api/user/updateUser")
//	public UpdateUserResponse updateUser(@RequestBody UpdateUserRequest updateUserRequest) throws SQLException {
//		return updateUserService.updateUser(updateUserRequest);
//	}
}
