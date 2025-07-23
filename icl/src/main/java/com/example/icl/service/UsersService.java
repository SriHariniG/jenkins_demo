package com.example.icl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.icl.entity.Users;
import com.example.icl.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository usersRepository;

	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}

	public Users createUser(Users user) {
		return usersRepository.save(user);
	}
	
	public Users getUserById(int id) {
		Users user = new Users();
		
		Optional<Users> usr = usersRepository.findById(id);
		if(usr !=null) {
			user = usr.get();
		}
		return user;
	}

}
