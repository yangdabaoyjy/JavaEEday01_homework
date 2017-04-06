package com.JavaEE_day01.test.pojos;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.JavaEE_day01.day01_homework.beans.UserInfo;
import com.JavaEE_day01.day01_homework.service.IUserService;

public class TestUserInfoService {

	private ApplicationContext ac;
	private IUserService userService;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		userService = (IUserService) ac.getBean("userInfoServiceImpl");
	}
	@Test
	public void testUserInfoService(){
		UserInfo user = new UserInfo(null, "Ð¡»Æ", 8);
		try {
			userService.saveUserInfo(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
