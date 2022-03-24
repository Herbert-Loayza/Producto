package com.bootcamp.serviceproducto.service;

import com.bootcamp.serviceproducto.entity.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {

    public Flux<Producto> findAll();
    public Mono<Producto> findById(String id);
    public Mono<Producto>save(Producto producto);
    public Mono<Void> deleteById(String id);
}
