package com.bootcamp.serviceproducto.repository;

import com.bootcamp.serviceproducto.entity.Activos;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ActivosRepository extends ReactiveMongoRepository<Activos, String> {
}
