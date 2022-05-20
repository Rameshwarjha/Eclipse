package com.demo.authentication.SecurityUsingAwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.authentication.SecurityUsingAwt.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
}
