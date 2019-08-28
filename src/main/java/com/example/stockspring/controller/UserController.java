package com.example.stockspring.controller;

import java.sql.SQLException;

import org.springframework.ui.ModelMap;


import com.example.stockspring.model.User;

public interface UserController {
	public String insert(ModelMap model);
	public String login(ModelMap model);
	public String registerUser(User user) throws SQLException;
    public User loginUser(User user);
}
