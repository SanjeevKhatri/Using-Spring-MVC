package edu.mum.springmvc.lab1.repository;

import edu.mum.springmvc.lab1.model.User;

public class UserRepository {
	User user = new User();

	public User getUserData() {
		user.setUser_name("admin");
		user.setPassword("test123");
		return user;
	}
}
