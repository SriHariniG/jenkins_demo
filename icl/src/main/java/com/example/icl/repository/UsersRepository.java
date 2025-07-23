package com.example.icl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icl.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
