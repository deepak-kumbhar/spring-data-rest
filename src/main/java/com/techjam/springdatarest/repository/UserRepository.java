package com.techjam.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techjam.springdatarest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(@Param("email") String email);

}
