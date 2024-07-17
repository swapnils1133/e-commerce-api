package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dnyanyog.common.DBUtil;
import org.dnyanyog.dto.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class UserManagementService {
	
	public List<User> getAllUsers() throws SQLException{
		
		ArrayList<User> list = new ArrayList<>();
		
		String selectQuery = "select * from user";
		ResultSet result = DBUtil.executeSelectQuery(selectQuery);
		while(result.next()) {
		     User user = new User();
		     user.first_name = result.getString(1);
		     user.last_name = result.getString(2);
		     user.gender = result.getString(3);
		     user.age = result.getString(4);
		     user.email = result.getString(5);
		     user.password = result.getString(6);
		     
		     list.add(user);
		}
		
		return list;
	}

}
