package com.spmgdb.backend;

import com.spmgdb.backend.entity.Product;
import com.spmgdb.backend.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import java.util.List;
@SpringBootApplication
@EnableMongoRepositories
public class BackendApplication implements CommandLineRunner {
    @Autowired
    private ProductRespository productRespository;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    /**
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        List<Product> products = List.of(
                Product.builder().name("vary").price(15000D).description(" Vary makalioka ").build(),
                Product.builder().name("Sira").price(5000D).description(" Sira avy any diego ").build(),
                Product.builder().name("Siramamy").price(15000D).description(" Sucre d'ambilobe ").build(),
                Product.builder().name("Bougie").price(15000D).description(" Bougie importé d'Inde ").build()
        );

        if (productRespository.findAll().isEmpty()){
            productRespository.saveAll(products);
        }
    }
}
