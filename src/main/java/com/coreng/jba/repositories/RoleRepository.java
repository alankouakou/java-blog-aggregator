package com.coreng.jba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coreng.jba.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	public Role findByName(String name);

}
