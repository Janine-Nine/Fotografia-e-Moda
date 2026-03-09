package com.fotomoda.controller;

import com.fotomoda.model.Foto;
import com.fotomoda.service.FotoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fotos")
@CrossOrigin("*")
public class FotoController {

private final FotoService service;

public FotoController(FotoService service){
this.service = service;
}

@GetMapping
public List<Foto> listar(){
return service.listarFotos();
}

@PostMapping
public Foto criar(@RequestBody Foto foto){
return service.salvar(foto);
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id){
service.deletar(id);
}

}