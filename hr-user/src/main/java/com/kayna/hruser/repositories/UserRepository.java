package com.kayna.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayna.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
