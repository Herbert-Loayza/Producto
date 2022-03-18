package com.bootcamp.serviceproducto.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "pasivos")
public class Pasivos {

    @Id
    private String id;
}
