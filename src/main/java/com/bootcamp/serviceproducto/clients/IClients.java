package com.bootcamp.serviceproducto.clients;

import ch.qos.logback.core.net.server.Client;
import com.bootcamp.serviceproducto.clients.model.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface IClients {

    public Flux<Cliente> getClientByTipNum(String tipo, String numDoc);
}
