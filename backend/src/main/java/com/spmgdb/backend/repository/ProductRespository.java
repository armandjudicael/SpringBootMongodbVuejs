package com.spmgdb.backend.repository;

import com.spmgdb.backend.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends MongoRepository<Product ,String> {

}
