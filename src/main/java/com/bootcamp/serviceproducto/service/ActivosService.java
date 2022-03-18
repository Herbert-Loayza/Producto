package com.bootcamp.serviceproducto.service;

import com.bootcamp.serviceproducto.entity.Activos;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ActivosService {

    public Flux<Activos> findAll();
    public Mono<Activos> findById(String id);
    public Mono<Activos>save(Activos activos);
    public Mono<Void> deleteById(String id);
}
