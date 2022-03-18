package com.bootcamp.serviceproducto.controller;

import com.bootcamp.serviceproducto.entity.Activos;
import com.bootcamp.serviceproducto.entity.Pasivos;
import com.bootcamp.serviceproducto.service.ActivosService;
import com.bootcamp.serviceproducto.service.PasivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/pasivos")
public class PasivosController {

    @Autowired
    private PasivosService pasivosService;


    @GetMapping
    public Flux<Pasivos> findAll(){
        return pasivosService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Pasivos> findById(@PathVariable String id) {
        return pasivosService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Pasivos> save(@RequestBody Pasivos pasivos) {
        return pasivosService.save(pasivos);
    }

    @PutMapping
    public Mono<Pasivos> put(@RequestBody Pasivos pasivos) {
        return pasivosService.save(pasivos);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return pasivosService.deleteById(id);
    }
}
