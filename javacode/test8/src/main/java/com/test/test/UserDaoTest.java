package com.test.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.UserDao;
import com.test.model.User;

public class UserDaoTest extends BaseTest {

	@Autowired
	private UserDao userDao;
	
	@Test
	public void testQueryById() throws Exception {
		int id = 1;
		List<User> u = userDao.findByID(id);
		System.out.println(u);
		
	}
	
}
