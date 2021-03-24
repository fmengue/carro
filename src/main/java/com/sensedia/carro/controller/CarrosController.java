package com.sensedia.carro.controller;

import com.sensedia.carro.model.Carro;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarrosController {

    @Autowired
    private CarrosRepository carrosRepository;

    @GetMapping("/carros")
    public ResponseEntity<?> getAllCarros() {
        return new ResponseEntity<List<Carro>>(carrosRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/carros/{id}")
    public ResponseEntity<?> getCarro(@PathVariable Integer id) {
        return new ResponseEntity<Carro>(carrosRepository.findById(id).get(), HttpStatus.OK);
//        return new ResponseEntity<String>(carrosRepository.findById(id).get().toString(), HttpStatus.OK);
    }

    @PostMapping(value = "/carros")
    public ResponseEntity<?> saveCarro(@RequestBody Carro carro) {
        try {
            return new ResponseEntity<Carro>(carrosRepository.save(carro), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<Carro>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
