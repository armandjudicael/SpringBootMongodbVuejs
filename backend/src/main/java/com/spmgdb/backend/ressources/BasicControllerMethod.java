package com.spmgdb.backend.ressources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface BasicControllerMethod <T>{
    ResponseEntity<Object> create(@RequestBody T entity);
    ResponseEntity<Object> findAll();
    ResponseEntity<Object> updateById(@RequestBody T newEntity , @PathVariable String id );
    ResponseEntity<Object>  findById(@PathVariable String id);
    ResponseEntity<Boolean> delete(@PathVariable  String id);
}
