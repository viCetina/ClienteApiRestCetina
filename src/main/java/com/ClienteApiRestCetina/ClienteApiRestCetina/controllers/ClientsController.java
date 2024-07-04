package com.ClienteApiRestCetina.ClienteApiRestCetina.controllers;

import com.ClienteApiRestCetina.ClienteApiRestCetina.entities.Client;
import com.ClienteApiRestCetina.ClienteApiRestCetina.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/clients")

public class ClientsController {
    // agrego el servicio
    @Autowired private ClientService service;

    @PostMapping public ResponseEntity<Client> create(@RequestBody Client data) {
        try {
            // intento guardar el cliente
            Client client = service.save(data);
            return new ResponseEntity<>(client, HttpStatus.CREATED);
        } catch (Exception e) {
            // imprimo el error
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
