package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.MusicApp.model.User;
import com.xoriant.MusicApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addUser(User User) {
		// TODO Auto-generated method stub
		userRepository.save(User);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findAllByName(name);
	}

	@Override
	public void updateUser(User User) {
		// TODO Auto-generated method stub
		userRepository.save(User);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
}
