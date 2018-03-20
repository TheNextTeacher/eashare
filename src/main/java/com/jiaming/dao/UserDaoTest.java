package com.jiaming.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jiaming.entity.User;
import com.jiaming.util.BaseTest;

public class UserDaoTest extends BaseTest{

	@Autowired
	UserDao userDao;
	@Test
	public void testQueryUserById() {
		String userId = "000120180320";
		User user = userDao.queryUserById(userId);
		System.out.println("name = "+user.getUserName());
	}

}
