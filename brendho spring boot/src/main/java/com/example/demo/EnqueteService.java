package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnqueteService {

    private final EnqueteRepository enqueteRepository;

    @Autowired
    public EnqueteService(EnqueteRepository enqueteRepository) {
        this.enqueteRepository = enqueteRepository;
    }

    public Enquete criarEnquete(Enquete enquete) {
        // Adicionar lógica de validação, se necessário
        return enqueteRepository.save(enquete);
    }

    public List<Enquete> listarEnquetes() {
        return enqueteRepository.findAll();
    }

    public Enquete buscarEnquetePorId(Long enqueteId) {
        return enqueteRepository.findById(enqueteId).orElse(null);
    }

    // Outros métodos para atualizar, excluir enquetes, etc.
}
