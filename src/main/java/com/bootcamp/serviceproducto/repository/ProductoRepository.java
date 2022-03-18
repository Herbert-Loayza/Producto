package com.bootcamp.serviceproducto.repository;

import com.bootcamp.serviceproducto.entity.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoRepository extends ReactiveMongoRepository<Producto, String> {
}
