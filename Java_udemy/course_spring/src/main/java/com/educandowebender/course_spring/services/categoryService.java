package com.educandowebender.course_spring.services;

import com.educandowebender.course_spring.entities.Category;
import com.educandowebender.course_spring.repositores.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class categoryService {

    @Autowired
    private CategoryRepository repository;


    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
