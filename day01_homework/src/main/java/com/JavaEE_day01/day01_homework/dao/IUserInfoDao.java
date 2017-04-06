package com.JavaEE_day01.day01_homework.dao;

import com.JavaEE_day01.day01_homework.beans.UserInfo;

public interface IUserInfoDao {

	public void saveUserInfo(UserInfo user) throws Exception;
	
	public void updateUserInfo(UserInfo user) throws Exception;
}
