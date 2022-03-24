package com.bootcamp.serviceproducto.business;

import com.bootcamp.serviceproducto.entity.Producto;
import com.bootcamp.serviceproducto.product.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessImpl implements IBusiness {

    List productos = new ArrayList<Product>();
    Product p1 = new Product();





    @Override
    public Mono<Producto> save(Producto producto) {
        return null;
    }


}
