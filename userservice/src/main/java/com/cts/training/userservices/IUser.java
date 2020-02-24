package com.cts.training.userservices;

import java.util.List;


import com.cts.training.userservice.entity.User;

public interface IUser {
	
	List<User> findAllUsers();
	User findUserById(Integer id);
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(Integer id);


}
