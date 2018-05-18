package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.c_typeDao;
import com.test.model.c_type;
import com.test.service.c_typeService;

@Service
public class c_typeServiceImpl implements c_typeService {

	@Autowired
	private c_typeDao c_typeDao;
	
	@Override
	public void addc_type(c_type u) {
		
		c_typeDao.addc_type(u);
	}
	
	@Override
	public c_type findByID(int id) {
		
		return c_typeDao.findById(id);
	}

	@Override
	public c_type findByName(String name) {
		
		return c_typeDao.findByName(name);
	}

	@Override
	public void updatec_type(c_type u) {
		
		c_typeDao.updatec_type(u);
	}

	@Override
	public void deletec_type(String name) {
		
		c_typeDao.deletec_type(name);
	}

	@Override
	public List<c_type> findAll() {
		
		return c_typeDao.findAll();
	}

}
