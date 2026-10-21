package com.demo.curd.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.curd.model.Users;
import com.demo.curd.service.UserService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {

	private UserService UserService;

	@GetMapping("/")
	public String sayWelcome() {
		return "Welcome Lova Chittumuri ";
	}

	@GetMapping("/userData")
	public List<Users> userData() {
		return UserService.getUserData();
	}

	@GetMapping("/{id}")
	public Users userDataById(@PathVariable Long id) {
		return UserService.getDataById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		UserService.deleteUser(id);
	}

	@PutMapping("/updateUser")
	public Users updateUser(@RequestBody Users users) {
		return UserService.updateUser(users);
	}

	@PostMapping("/save")
	public Users saveUsers(@RequestBody Users users) {
		return UserService.saveUsers(users);
	}
	
	@PostMapping("/saveAll")
	public List<Users> saveUsers(@RequestBody List<Users> users) {
		return UserService.saveAllUsers(users);
	}

}
