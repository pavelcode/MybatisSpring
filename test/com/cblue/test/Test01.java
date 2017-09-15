package com.cblue.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.dao.UserDao;
import com.cblue.entity.User;
import com.cblue.mapper.UserMapper;

public class Test01 {
	
	/**
	 * 原始的dao开发方式
	 */
	@Test
	public void testDao(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserDao userDao = (UserDao)context.getBean("userDao");
		User user = userDao.queryById(2);
		System.out.println(user);
	}
	
	/**
	 * 使用Mapper代理方式
	 */
	@Test
	public void testMapper(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserMapper userMapper = (UserMapper)context.getBean("userMapper");
		User user = userMapper.findUserById(2);
		System.out.println(user);
	}

}
