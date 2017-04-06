package com.JavaEE_day01.day01_homework.service.impl;

import com.JavaEE_day01.day01_homework.beans.UserInfo;
import com.JavaEE_day01.day01_homework.dao.IUserInfoDao;
import com.JavaEE_day01.day01_homework.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserInfoDao dao;
	
	public void setDao(IUserInfoDao dao) {
		this.dao = dao;
	}

	public void saveUserInfo(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		dao.saveUserInfo(user);
	}

	public void updateUserInfo(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		dao.updateUserInfo(user);
	}

}
