package org.dnyanyog.dao;

import org.dnyanyog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface Userdao extends JpaRepository<Users, Integer> {
	public Users findByLoginName(String loginName);
	public Users findByFirstName(String firstName);
}
