package com.JavaEE_day01.day01_homework.service;

import com.JavaEE_day01.day01_homework.beans.UserInfo;

public interface IUserService {
	/**
	 * �����û�
	 * @param user
	 * @throws Exception
	 */
	public void saveUserInfo(UserInfo user) throws Exception;
	/**
	 * �����û�
	 * @param user
	 * @throws Exception
	 */
	public void updateUserInfo(UserInfo user) throws Exception;
	
	
}
