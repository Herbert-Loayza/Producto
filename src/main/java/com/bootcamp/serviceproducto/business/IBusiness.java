package com.bootcamp.serviceproducto.business;

import com.bootcamp.serviceproducto.entity.Producto;
import reactor.core.publisher.Mono;

public interface IBusiness {

    public Mono<Producto> save(Producto producto);
}
