package com.JavaEE_day01.day01_homework.beans;

import java.io.Serializable;

public class User implements Serializable{

	private String userName;
	private String userPwd;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	
}
