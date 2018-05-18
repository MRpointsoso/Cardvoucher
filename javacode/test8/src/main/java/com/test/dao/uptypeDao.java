package com.test.dao;

import java.util.List;

import com.test.model.uptype;

public interface uptypeDao {
public void adduptype(uptype u);
	
	public uptype findById(int id);
	
	public uptype findByName(String name);
	
	public void updateuptype(uptype u);
	
	public void deleteuptype(String name);
	
	public List<uptype> findAll();
}
