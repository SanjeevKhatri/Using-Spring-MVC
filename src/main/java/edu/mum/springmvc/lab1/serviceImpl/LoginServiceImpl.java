package edu.mum.springmvc.lab1.serviceImpl;

import edu.mum.springmvc.lab1.model.User;
import edu.mum.springmvc.lab1.repository.UserRepository;
import edu.mum.springmvc.lab1.service.LoginService;

public class LoginServiceImpl implements LoginService {

	UserRepository userRepository = new UserRepository();

	@Override
	public Boolean loginVerification(String username, String password) {
		User user = userRepository.getUserData();
		if (username.equals(user.getUser_name()) && password.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}

	}
}
