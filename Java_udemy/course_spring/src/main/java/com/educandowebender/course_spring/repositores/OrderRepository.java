package com.educandowebender.course_spring.repositores;

import com.educandowebender.course_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
