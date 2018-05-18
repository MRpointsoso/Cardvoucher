package com.test.service;

import java.util.List;

import com.test.model.uptype;

public interface uptypeService {
	public void adduptype(uptype c);
	public uptype findByID(int id);
	public uptype findByName(String name);
	public void updateuptype(uptype c);
	public void deleteuptype(String name);
	public List<uptype> findAll();
}
