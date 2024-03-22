package com.educandowebender.course_spring.repositores;

import com.educandowebender.course_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
