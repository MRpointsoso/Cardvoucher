package com.test.dao;

import java.util.List;

import com.test.model.User;

public interface UserDao {
	
	public void addUser(User u);
	
	public List<User> findByID(int id);
	
	public User findByName(String name);
	
	public void updateUser(User u);
	
	public void deleteUser(String name);
	
	public List<User> findAll();
	
}
