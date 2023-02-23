package com.spmgdb.backend.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(collection = "products")
@Getter
@Setter
public class Product {

    @Id
    private String id;
    private String name;

    private Double price;

    private String description;

}
