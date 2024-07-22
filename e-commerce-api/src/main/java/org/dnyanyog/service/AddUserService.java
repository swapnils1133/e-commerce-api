package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtil;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.springframework.stereotype.Component;

@Component
public class AddUserService {
	
	public AddUserResponse addUser(AddUserRequest addUserRequest) throws SQLException {
		AddUserResponse addUserResponse = new AddUserResponse();
		String insertQuery = "insert into user(first_name,last_name,gender,age,email,password) values ('"+addUserRequest.first_name+"','"+addUserRequest.last_name+"','"+addUserRequest.gender+"','"+addUserRequest.age+"','"+addUserRequest.email+"','"+addUserRequest.password+"')";
		DBUtil.executequery(insertQuery);
		String selectQuery =  "select * from user where first_name='"+addUserRequest.first_name+"'";
		ResultSet result = DBUtil.executeSelectQuery(selectQuery);
		if(result.next()) {
			addUserResponse.errorCode="0000";
			addUserResponse.message="Add User Successfully";
			return addUserResponse;
		}
		
		else {
			addUserResponse.errorCode="911";
			addUserResponse.message="User Addition Failed";
			return addUserResponse;
		}
	}
}
