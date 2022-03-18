package com.bootcamp.serviceproducto.service.serviceimpl;

import com.bootcamp.serviceproducto.entity.Activos;
import com.bootcamp.serviceproducto.entity.Pasivos;
import com.bootcamp.serviceproducto.repository.ActivosRepository;
import com.bootcamp.serviceproducto.repository.PasivosRepository;
import com.bootcamp.serviceproducto.service.PasivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class PasivosServiceImpl implements PasivosService {


    @Autowired
    private PasivosRepository pasivosRepository;


    public Flux<Pasivos> findAll() {
        return pasivosRepository.findAll();
    }

    public Mono<Pasivos> findById(String id) {
        return pasivosRepository.findById(id);
    }

    public Mono<Pasivos> save(Pasivos pasivos) {
        return pasivosRepository.save(pasivos);
    }

    public Mono<Void> deleteById(String id) {
        return pasivosRepository.deleteById(id);
    }
}
