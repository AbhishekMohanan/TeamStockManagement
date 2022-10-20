package com.storemanagement.storemanagement.serviceclass;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.storemanagement.storemanagement.model.User;
import com.storemanagement.storemanagement.model.Role;
import com.storemanagement.storemanagement.repository.UserRepository;



@Service
public class Userservice implements UserDetailsService{


	    @Autowired
	    UserRepository repo;

	    @Override
	    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	        Optional<User> user = repo.findByUserName(userName);

	        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

	        return user.map(Role::new).get();
	    }
	}

	

