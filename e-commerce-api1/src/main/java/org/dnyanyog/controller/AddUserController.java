package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.dto.UpdateUserResponse;
import org.dnyanyog.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	
	@Autowired
	AddUserService addUserService;
	
	@PostMapping(path="/api/user/addUser")
	public AddUserResponse addUser(@RequestBody AddUserRequest addUserRequest) throws SQLException {
		return addUserService.addUser(addUserRequest);
	}
	@PostMapping(path="/api/user/updateUser")
	public UpdateUserResponse updateUser(@RequestBody UpdateUserRequest updateUserRequest)  {
		return addUserService.updateUser(updateUserRequest);
	}
		
}
