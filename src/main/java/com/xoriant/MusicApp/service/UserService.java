package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.MusicApp.model.User;

public interface UserService {
void addUser(User user);
	
	//Get All Users
	List<User> getUsers();
	
	//Search
		//Get User by Id
		Optional<User> getUserById(int id);
		//Get User by User name
		User getUserByName(String name);
	
	//Update User
	void updateUser(User user);
//		// Update a User by Id
//		void updateUserById(int id);
//		// Update User by name
//		void updateUserByName(String name);
	
	//Delete User
	void deleteUser(int id);
}
