package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="username")
	
	@Pattern(regexp = "^[A-Za-z]+$", message = "Username should not contain numbers")
	private String userName;
	@Column(name="password")
	
	private String password;
	@Column(name="usertype")

	private String userType;
	@Column(name="email")
	
	private String email;
	@Column(name="mobilenumber")
	/*@NotEmpty(message = "Please enter Mobilenumber")*/
	
	private int mobileNumber;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	}

}
