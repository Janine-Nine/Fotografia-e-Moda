package com.fotomoda.service;

import com.fotomoda.model.Foto;
import com.fotomoda.repository.FotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotoService {

    private final FotoRepository repository;

    public FotoService(FotoRepository repository) {
        this.repository = repository;
    }

    public List<Foto> listarFotos() {
        return repository.findAll();
    }

    public Foto salvar(Foto foto) {
        return repository.save(foto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}