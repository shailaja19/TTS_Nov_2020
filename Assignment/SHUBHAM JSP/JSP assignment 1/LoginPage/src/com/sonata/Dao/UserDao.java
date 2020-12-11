package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.User;

public interface UserDao {
	public int save(Object object);

	List<User> getData();
}
