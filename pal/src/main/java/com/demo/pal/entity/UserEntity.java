package com.demo.pal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="pal_demo1", name="user_table")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class UserEntity {
//Generate the Id 
	
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")	
	@Id
	@Column(name="user_id")
	public Integer UserId;
	@Column(name="user_name")
	public String userName;
	@Column(name="user_email")
	public String UserEmail;
	@Column(name="user_password")
	public String UserPassword;
	@Column(name="user_mobile")
	public String userMobile;
	@Column(name="user_dob")
	public Date userDOB;
	@Column(name="user_role")
	public String user_role;
	
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
	
	
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public Date getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	
	
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	@Override
	public String toString() {
		return "UserEntity [UserId=" + UserId + ", userName=" + userName + ", UserEmail=" + UserEmail
				+ ", UserPassword=" + UserPassword + ", userMobile=" + userMobile + ", userDOB=" + userDOB + "]";
	}

	
	
}
