package com.axnd.dsclientesapi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.axnd.dsclientesapi.dto.ClientDTO;
import com.axnd.dsclientesapi.entities.Client;
import com.axnd.dsclientesapi.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
        List<Client> list = clientRepository.findAll();

        return list
                .stream()
                .map(x -> new ClientDTO(x))
                .collect(Collectors
                        .toList());
    }
}
