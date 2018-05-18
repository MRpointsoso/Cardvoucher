package com.test.dao;

import java.util.List;

import com.test.model.c_type;

public interface c_typeDao {
	public void addc_type(c_type u);
	
	public c_type findById(int id);
	
	public c_type findByName(String name);
	
	public void updatec_type(c_type u);
	
	public void deletec_type(String name);
	
	public List<c_type> findAll();
}
