package com.coreng.jba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coreng.jba.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
