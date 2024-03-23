package com.educandowebender.course_spring.resources;

import com.educandowebender.course_spring.entities.Product;
import com.educandowebender.course_spring.repositores.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductRepository service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() { // buscando todos users
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
        Optional<Product> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
