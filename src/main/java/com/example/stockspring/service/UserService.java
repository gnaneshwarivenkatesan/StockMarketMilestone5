package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.User;

public interface UserService {
	 public User userLogin(User user);
		
		
		public User registerUser(User user) throws SQLException ;
	List<User> findByuserName(String name);
}
