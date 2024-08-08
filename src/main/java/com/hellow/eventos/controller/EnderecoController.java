package com.hellow.eventos.controller;


import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import com.hellow.eventos.classes.tipo.Tipo;
import com.hellow.eventos.classes.tipo.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="endereco")

public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("todos")
    public List<Endereco> getAllTipo() {

        return this.enderecoRepository.findAll();
    }


        @PostMapping("add")
    public Endereco addtipo(@RequestBody Endereco endereco){
            this.enderecoRepository.save(endereco);
            return endereco;
    }
}
