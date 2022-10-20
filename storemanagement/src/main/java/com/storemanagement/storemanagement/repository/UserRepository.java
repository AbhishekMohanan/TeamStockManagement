package com.storemanagement.storemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storemanagement.storemanagement.model.User;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {
	Optional<User> findByUserName(String userName);

	}


