package com.jichun.dao;

import com.jichun.domain.User;

public interface UserDao {
	
	public void insert_user(User user);  //这里的方法insert_user 和mapper中的方法要一样，不然报错

	public User get_User(String id);
	
	public void update_user_status(String id);
	
	
	public void  delete_user(String id);
}
