package com.bootcamp.serviceproducto.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "producto")
public class Producto {

    @Id
    private String id;
    private String nombre;
    private String tipo;
    private String subTipo;

}
