package com.demo.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.curd.model.Users;	


public interface UserRepository extends JpaRepository<Users, Long> {

}
	