package com.jichun.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jichun.dao.UserDao;
import com.jichun.domain.User;

@Service
public class UserService implements UserDao {
	

	@Autowired
	UserDao dao;

	public void insert_user(User user) {
		dao.insert_user(user);
	}

	public User get_User(String id) {
//		System.out.println("dao:" + dao);
		User user = dao.get_User(id);
		System.out.println(user);
		return user;
	}

	public void update_user_status(String id) {
		dao.update_user_status(id);
	}

	public void delete_user(String id) {
		dao.delete_user(id);
	}

}
