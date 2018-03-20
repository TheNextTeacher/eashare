package com.jiaming.entity;

import java.util.Date;

public class User {
	
	private String userName;
	
	private String userPwd;
	 
	private Date usreDate;
	
	private String userTel;

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

	public Date getUsreDate() {
		return usreDate;
	}

	public void setUsreDate(Date usreDate) {
		this.usreDate = usreDate;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

}
