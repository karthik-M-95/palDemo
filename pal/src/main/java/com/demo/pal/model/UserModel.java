package com.demo.pal.model;

public class UserModel {

//	public Integer UserId;
	public String userName;
	public String UserEmail;
	public String UserPassword;
	public String userPassCheck;
	public Long mobileNo;
	public String dateOfBirth;
	
	
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
//	public Integer getUserId() {
//		return UserId;
//	}
//	public void setUserId(Integer userId) {
//		UserId = userId;
//	}
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
	public String getUserPassCheck() {
		return userPassCheck;
	}
	public void setUserPassCheck(String userPassCheck) {
		this.userPassCheck = userPassCheck;
	}
	public Long getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(Long userMobile) {
		this.userMobile = userMobile;
	}
	public Long userMobile;
	
}
