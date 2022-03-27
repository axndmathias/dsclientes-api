package com.axnd.dsclientesapi.repositories;

import com.axnd.dsclientesapi.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
