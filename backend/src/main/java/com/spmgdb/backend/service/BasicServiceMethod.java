package com.spmgdb.backend.service;

import java.util.List;

public interface BasicServiceMethod<T>{
   T create(T object);
   T updateById (String id);

   T update(T object,String id);

   Boolean deleteById(String id);

   Boolean delete(T obejct);
   List<T> findAll();

   T findById(String id);
}
