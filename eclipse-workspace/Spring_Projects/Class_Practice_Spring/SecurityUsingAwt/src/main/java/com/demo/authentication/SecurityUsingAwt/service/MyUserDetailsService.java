package com.demo.authentication.SecurityUsingAwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.authentication.SecurityUsingAwt.entity.User;
import com.demo.authentication.SecurityUsingAwt.repo.UserRepository;
//import com.sun.security.auth.UserPrincipal;  // this was wrong we had to create a class name Userprinciple to resolve this error

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		//import "User" from "import com.demo.authentication.SecurityUsingAwt.entity.User;"
		User user = repo.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found 601");
			
		}
		
		return new UserPrinciple(user);
	}

}
