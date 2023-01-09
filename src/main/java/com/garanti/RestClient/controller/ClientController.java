package com.garanti.RestClient.controller;

import com.garanti.RestClient.model.Ogretmen;
import com.garanti.RestClient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    /*@GetMapping()
    public ResponseEntity< Ogretmen[] > getAll() {
        Ogretmen[] allOgretmen = clientService.getAllOgretmen();
        return new ResponseEntity<>(allOgretmen, HttpStatus.OK);
    }*/

    @GetMapping()
    public ResponseEntity< Ogretmen[] > getAll() {
        Ogretmen[] allOgretmen = clientService.getAllOgretmen();
        return new ResponseEntity<>(allOgretmen, HttpStatus.OK);
    }
}
