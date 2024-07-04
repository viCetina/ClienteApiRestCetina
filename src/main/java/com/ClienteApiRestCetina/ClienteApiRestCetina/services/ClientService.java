package com.ClienteApiRestCetina.ClienteApiRestCetina.services;

import com.ClienteApiRestCetina.ClienteApiRestCetina.entities.Client;
import com.ClienteApiRestCetina.ClienteApiRestCetina.repositories.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    // inyecto el repositorio para poder interactuar con la base de datos.
    @Autowired private ClientsRepository repository;

    // agrego los metodos para manipular la base de datos.
    public Client save(Client client) {
        return repository.save(client);
    }

    public List<Client> read() {
        return repository.findAll();
    }

    public Optional<Client> readOne(Long id) {
        return repository.findById(id);
    }

    public void deleteOne(Long id) {
        repository.deleteById(id);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}