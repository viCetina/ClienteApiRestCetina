package com.ClienteApiRestCetina.ClienteApiRestCetina.repositories;

import com.ClienteApiRestCetina.ClienteApiRestCetina.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// extiendo JpaRepository, que hereda varios métodos para la persistencia de datos
@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> { }
