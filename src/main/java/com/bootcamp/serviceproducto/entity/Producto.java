package com.bootcamp.serviceproducto.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Producto  {

    @Id
    private String idProducto;
}
