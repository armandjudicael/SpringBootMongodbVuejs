package com.spmgdb.backend.service;

import com.spmgdb.backend.entity.Product;
import com.spmgdb.backend.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements BasicServiceMethod<Product> {
    @Autowired
    private ProductRespository productRespository;

    @Override
    public Product create(Product object) {
        return productRespository.save(object);
    }
    @Override
    public Product updateById(String id) {
        return null;
    }

    @Override
    public Product update(Product object,String id) {
        Product product = findById(id);
        if (product!=null){
            object.setId(id);
           return productRespository.save(object);
        }
        return null;
    }

    @Override
    public Boolean deleteById(String id) {
        productRespository.deleteById(id);
        return true;
    }

    @Override
    public Boolean delete(Product obejct) {
        productRespository.delete(obejct);
        return true ;
    }

    @Override
    public List<Product> findAll() {
        return productRespository.findAll();
    }

    @Override
    public Product findById(String id) {
        return productRespository.findById(id).get();
    }
}
