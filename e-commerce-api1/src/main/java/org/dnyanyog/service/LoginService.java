package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.dao.Userdao;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {

		@Autowired
		Userdao userdao;
		
		public LoginResponse login( LoginRequest loginbody) {
			
			LoginResponse loginResponce = new LoginResponse();
			//Users users=userdao.findById(1).get();
			Users users = userdao.findByLoginName(loginbody.user);
			 //Users users = userdao.findByFirstName(loginbody.user);
			
			if(users.getLoginName().equals(loginbody.user) && users.getPassword().equals(loginbody.password)) {
				
				loginResponce.errorCode="0000";
				loginResponce.message="Login Success";
				loginResponce.id=users.getId();
				loginResponce.firstName=users.getFirstName();
				loginResponce.lastName=users.getLastName();
				loginResponce.password=users.getPassword();
				loginResponce.loginName=users.getLoginName();
				return loginResponce;
			}
			
				loginResponce.errorCode="9111";
				loginResponce.message="Login Failed";
				return loginResponce;
			
		}
}

                                     