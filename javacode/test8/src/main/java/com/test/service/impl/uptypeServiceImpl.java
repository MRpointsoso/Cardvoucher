package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.uptypeDao;
import com.test.model.uptype;
import com.test.service.uptypeService;

@Service
public class uptypeServiceImpl implements uptypeService {

	@Autowired
	private uptypeDao uptypeDao;
	
	@Override
	public void adduptype(uptype u) {
		
		uptypeDao.adduptype(u);
	}
	
	@Override
	public uptype findByID(int id) {
		
		return uptypeDao.findById(id);
	}

	@Override
	public uptype findByName(String name) {
		
		return uptypeDao.findByName(name);
	}

	@Override
	public void updateuptype(uptype u) {
		
		uptypeDao.updateuptype(u);
	}

	@Override
	public void deleteuptype(String name) {
		
		uptypeDao.deleteuptype(name);
	}

	@Override
	public List<uptype> findAll() {
		
		return uptypeDao.findAll();
	}

}
