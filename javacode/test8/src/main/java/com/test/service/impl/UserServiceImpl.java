package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User u) {
		
		userDao.addUser(u);
	}
	
	@Override
	public List<User> findByID(int id) {
		
		return userDao.findByID(id);
	}

	@Override
	public User findByName(String name) {
		
		return userDao.findByName(name);
	}

	@Override
	public void updateUser(User u) {
		
		userDao.updateUser(u);
	}

	@Override
	public void deleteUser(String name) {
		
		userDao.deleteUser(name);
	}

	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

}
