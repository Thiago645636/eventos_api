package com.hellow.eventos.controller;

import com.hellow.eventos.classes.tipo.Tipo;
import com.hellow.eventos.classes.tipo.TipoRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="tipo")
public class TipoController {
    @Autowired
  private TipoRepository tipoRepository;

    @GetMapping("todos")
    public List<Tipo> getAllTipo(){

        return this.tipoRepository.findAll();
    }

    @PostMapping("add")
    public Tipo addTipo(@RequestBody Tipo tipo){
        this.tipoRepository.save(tipo);
        return tipo;
    }

}
