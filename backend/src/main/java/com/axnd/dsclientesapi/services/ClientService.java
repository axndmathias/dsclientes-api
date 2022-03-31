package com.axnd.dsclientesapi.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.axnd.dsclientesapi.dto.ClientDTO;
import com.axnd.dsclientesapi.entities.Client;
import com.axnd.dsclientesapi.repositories.ClientRepository;
import com.axnd.dsclientesapi.services.exceptions.ResourceNotFoundException;

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

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> obj = clientRepository.findById(id);
        Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));

        return new ClientDTO(entity);
    }

    @Transactional
    public ClientDTO insert(ClientDTO dto) {
        Client entity = new Client();
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
        clientRepository.save(entity);

        return new ClientDTO(entity);
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto) {
        try {
            Client entity = clientRepository.getOne(id);
            entity.setName(dto.getName());
            entity.setCpf(dto.getCpf());
            entity.setIncome(dto.getIncome());
            entity.setBirthDate(dto.getBirthDate());
            entity.setChildren(dto.getChildren());
            clientRepository.save(entity);

            return new ClientDTO(entity);
        } catch (javax.persistence.EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id not found " + id);
        }
    }
}
