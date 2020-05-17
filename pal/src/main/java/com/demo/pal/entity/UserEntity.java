package com.demo.pal.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(schema="", name="")
public class UserEntity {
//Generate the Id 
	
	public Integer UserId;
	public String userName;
	public String UserEmail;
	public String UserPassword;
	public Long userMobile;
	
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public Long getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(Long userMobile) {
		this.userMobile = userMobile;
	}
	
	
}
