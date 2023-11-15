package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enquetes")
public class EnqueteController {

    private final EnqueteService enqueteService;

    @Autowired
    public EnqueteController(EnqueteService enqueteService) {
        this.enqueteService = enqueteService;
    }

    @PostMapping
    public ResponseEntity<Enquete> criarEnquete(@RequestBody Enquete enquete) {
        Enquete novaEnquete = enqueteService.criarEnquete(enquete);
        return new ResponseEntity<>(novaEnquete, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Enquete>> listarEnquetes() {
        List<Enquete> enquetes = enqueteService.listarEnquetes();
        return new ResponseEntity<>(enquetes, HttpStatus.OK);
    }

    @GetMapping("/{enqueteId}")
    public ResponseEntity<Enquete> buscarEnquetePorId(@PathVariable Long enqueteId) {
        Enquete enquete = enqueteService.buscarEnquetePorId(enqueteId);
        if (enquete != null) {
            return new ResponseEntity<>(enquete, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Outros endpoints para manipulação de enquetes, opções e votos
}
