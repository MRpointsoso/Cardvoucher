package com.test.service;

import java.util.List;

import com.test.model.c_type;

public interface c_typeService {
	public void addc_type(c_type c);
	public c_type findByID(int id);
	public c_type findByName(String name);
	public void updatec_type(c_type c);
	public void deletec_type(String name);
	public List<c_type> findAll();
}
