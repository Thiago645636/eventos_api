package com.hellow.eventos.controller;



import com.hellow.eventos.EventosApplication;
import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
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
@RequestMapping(path="evento")
public class EventoController {
    @Autowired
    private EventoRepository eventoRepository;


    @GetMapping("todos")
    public List<Evento> getAllTipo(){

        return this.eventoRepository.findAll();
    }

    @PostMapping("add")
    public Evento addTipo(@RequestBody Evento evento){
        //System.out.println(tipo);
        this.eventoRepository.save (evento);
        return evento;
    }

}
