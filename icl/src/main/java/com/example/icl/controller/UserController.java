package com.example.icl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.icl.entity.Users;
import com.example.icl.service.UsersService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	UsersService usersService;

	@GetMapping("/getAll")
	public List<Users> getAll() {
		return usersService.getAllUsers();
	}

	@PostMapping("/save")
	public Users create(@RequestBody Users user) {
		return usersService.createUser(user);
	}

	@GetMapping("/getUserById")
	public Users getUserById(int id) {
		return usersService.getUserById(id);
	}

}
