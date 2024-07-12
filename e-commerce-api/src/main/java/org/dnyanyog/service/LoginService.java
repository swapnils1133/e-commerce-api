package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtil;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;

public class LoginService {
		
		public LoginResponse login( LoginRequest loginbody) throws SQLException {
		    
			LoginResponse loginResponse = new LoginResponse();
			
			String loginQuery = "select * from user where first_name='"+loginbody.user+"' and password='"+loginbody.password+"'";
			ResultSet result = DBUtil.executeSelectQuery(loginQuery);
            if(result.next()) {
            	loginResponse.errorCode = "0000";
            	loginResponse.message = "Login Successfull";
                 return loginResponse;
            }else {
             	loginResponse.errorCode = "911";
            	loginResponse.message = "Login failed";
			 return loginResponse;
		}
	}
}

                                     