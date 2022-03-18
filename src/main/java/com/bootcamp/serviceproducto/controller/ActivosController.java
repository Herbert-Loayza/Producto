package com.bootcamp.serviceproducto.controller;

import com.bootcamp.serviceproducto.entity.Activos;
import com.bootcamp.serviceproducto.service.ActivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/activos")
public class ActivosController {

    @Autowired
    private ActivosService activosService;


    @GetMapping
    public Flux<Activos> findAll(){
        return activosService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Activos> findById(@PathVariable String id) {
        return activosService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Activos> save(@RequestBody Activos activos) {
        return activosService.save(activos);
    }

    @PutMapping
    public Mono<Activos> put(@RequestBody Activos activos) {
        return activosService.save(activos);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return activosService.deleteById(id);
    }
}
