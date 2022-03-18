package com.bootcamp.serviceproducto.service;

import com.bootcamp.serviceproducto.entity.Activos;
import com.bootcamp.serviceproducto.entity.Pasivos;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PasivosService {

    public Flux<Pasivos> findAll();
    public Mono<Pasivos> findById(String id);
    public Mono<Pasivos>save(Pasivos pasivos);
    public Mono<Void> deleteById(String id);
}
