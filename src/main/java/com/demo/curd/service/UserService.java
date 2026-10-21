package com.demo.curd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.curd.model.Users;
import com.demo.curd.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

	private UserRepository userRepository;

	public List<Users> getUserData() {
		return userRepository.findAll();
	}

	public Users getDataById(Long id) {
		return userRepository.findById(id).get();
	}

	public void deleteUser(Long id) {
		userRepository.delete(getDataById(id));
	}
	
	public Users updateUser(Users users) {
		return userRepository.save(users);
	}
	
	public Users saveUsers(Users users) {
		return userRepository.save(users);
	}
	
	public List<Users> saveAllUsers(List<Users> users) {
		return userRepository.saveAll(users);
	}
	
	
}
