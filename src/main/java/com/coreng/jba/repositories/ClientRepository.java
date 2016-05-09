package com.coreng.jba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coreng.jba.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findById(Long id);

}
