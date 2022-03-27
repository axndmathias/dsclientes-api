package com.axnd.dsclientesapi.services;

import java.util.List;

import com.axnd.dsclientesapi.entities.Client;
import com.axnd.dsclientesapi.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }
}
