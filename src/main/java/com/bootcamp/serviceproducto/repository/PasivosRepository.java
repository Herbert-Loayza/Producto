package com.bootcamp.serviceproducto.repository;

import com.bootcamp.serviceproducto.entity.Activos;
import com.bootcamp.serviceproducto.entity.Pasivos;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PasivosRepository extends ReactiveMongoRepository<Pasivos, String> {
}
