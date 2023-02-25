package com.legacy.dto;

public class UserDto {

	private Long user_idx;
	private String user_name;
	private String user_password;
	private String user_email;
	
	
	public Long getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(Long user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
}
