package com.jichun.domain;

import java.io.Serializable;




/**
 * 用户表
 * 
 * @author xbm
 * @date 2019年9月29日 下午3:11:19
 *
 */
public class User implements Serializable {
	private static final long serialVersionUID = 8294180014912103005L;

	private String user_id; // 用户编号
	private String user_password; // 用户密码，后面考虑加密
	private String user_valid_flag; // 用户有效标志，‘0’ 代表无效 ，‘1’代表有效，默认刚建立的用户是有效的
	private String user_regist_time; // 用户注册时间

	public User() {

	}

	public User(String user_id, String user_password, String user_valid_flag, String user_regist_time) {

		this.user_id = user_id;
		this.user_password = user_password;
		this.user_valid_flag = user_valid_flag;
		this.user_regist_time = user_regist_time;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_valid_flag() {
		return user_valid_flag;
	}

	public void setUser_valid_flag(String user_valid_flag) {
		this.user_valid_flag = user_valid_flag;
	}

	public String getUser_regist_time() {
		return user_regist_time;
	}

	public void setUser_regist_time(String user_regist_time) {
		this.user_regist_time = user_regist_time;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}