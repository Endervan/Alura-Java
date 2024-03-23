package com.educandowebender.course_spring.repositores;

import com.educandowebender.course_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
