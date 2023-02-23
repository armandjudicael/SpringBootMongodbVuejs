package com.spmgdb.backend.ressources;


import com.spmgdb.backend.entity.Product;
import com.spmgdb.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class ProductRessource implements BasicControllerMethod<Product> {
    /**
     * @param entity 
     * @return
     */
    @Autowired
    private ProductService productService;

    @Override
    @PostMapping("/products")
    public ResponseEntity<Object> create( @RequestBody Product entity) {
        return new ResponseEntity<>(productService.create(entity), HttpStatus.CREATED);
    }

    /**
     * @return 
     */
    @Override
    @GetMapping("/products")
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<>(productService.findAll(),HttpStatus.CREATED);
    }

    /**
     * @param newEntity 
     * @param id
     * @return
     */
    @Override
    @PutMapping("/products/{id}")
    public ResponseEntity<Object> updateById(@RequestBody Product newEntity,@PathVariable(name = "id") String id) {
        return null;
    }

    /**
     * @param id 
     * @return
     */
    @Override
    @GetMapping("/products/{id}")
    public ResponseEntity<Object> findById(@PathVariable(name = "id")  String id) {
        return new ResponseEntity<>(productService.findById(id),HttpStatus.OK);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    @DeleteMapping("/products/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return new ResponseEntity<>(productService.deleteById(id),HttpStatus.OK) ;
    }
}
