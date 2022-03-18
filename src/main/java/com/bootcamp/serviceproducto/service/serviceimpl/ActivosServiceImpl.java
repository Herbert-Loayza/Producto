package com.bootcamp.serviceproducto.service.serviceimpl;

import com.bootcamp.serviceproducto.entity.Activos;
import com.bootcamp.serviceproducto.repository.ActivosRepository;
import com.bootcamp.serviceproducto.service.ActivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ActivosServiceImpl implements ActivosService {


    @Autowired
    private ActivosRepository activosRepository;


    public Flux<Activos> findAll() {
        return activosRepository.findAll();
    }

    public Mono<Activos> findById(String id) {
        return activosRepository.findById(id);
    }

    public Mono<Activos> save(Activos activos) {
        return activosRepository.save(activos);
    }

    public Mono<Void> deleteById(String id) {
        return activosRepository.deleteById(id);
    }
}
