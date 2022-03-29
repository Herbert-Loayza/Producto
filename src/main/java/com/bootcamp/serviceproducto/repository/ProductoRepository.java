package com.bootcamp.serviceproducto.repository;

import com.bootcamp.serviceproducto.entity.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends ReactiveMongoRepository<Producto, String> {

    public List<Producto> findByIdClient(String idCliente);

}
