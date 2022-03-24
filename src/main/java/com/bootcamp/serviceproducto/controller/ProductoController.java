package com.bootcamp.serviceproducto.controller;

import com.bootcamp.serviceproducto.entity.Producto;
import com.bootcamp.serviceproducto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @GetMapping
    public Flux<Producto> findAll(){
        return productoService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Producto> findById(@PathVariable String id) {
        return productoService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Producto> save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @PutMapping
    public Mono<Producto> put(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return productoService.deleteById(id);
    }
}
