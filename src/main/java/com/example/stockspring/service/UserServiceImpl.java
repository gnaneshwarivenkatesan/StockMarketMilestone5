package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.UserDao;
import com.example.stockspring.model.User;

	@Service
	public class UserServiceImpl implements UserService {

		@Autowired
		private UserDao userDao;
	
		@Override
		public User userLogin(User user) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public User registerUser(User user) throws SQLException {
			// TODO Auto-generated method stub
			return userDao.save(user);
		}

		@Override
		public List<User> findByuserName(String name) {
			// TODO Auto-generated method stub
			return userDao.findByuserName(name);
		}

}
