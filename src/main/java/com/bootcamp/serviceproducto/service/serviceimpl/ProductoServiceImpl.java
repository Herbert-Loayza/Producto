package com.bootcamp.serviceproducto.service.serviceimpl;

import com.bootcamp.serviceproducto.business.IBusiness;
import com.bootcamp.serviceproducto.entity.Producto;
import com.bootcamp.serviceproducto.repository.ProductoRepository;
import com.bootcamp.serviceproducto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ProductoServiceImpl implements ProductoService {


    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private IBusiness bussinesImpl;

    public Flux<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Mono<Producto> findById(String id) {
        return productoRepository.findById(id);
    }

    public Mono<Producto> save(Producto producto) {
        return bussinesImpl.save(producto);
    }

    public Mono<Void> deleteById(String id) {
        return productoRepository.deleteById(id);
    }
}
