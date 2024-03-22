package com.educandowebender.course_spring.config;

import com.educandowebender.course_spring.entities.Category;
import com.educandowebender.course_spring.entities.Order;
import com.educandowebender.course_spring.entities.User;
import com.educandowebender.course_spring.entities.enums.OrderStatus;
import com.educandowebender.course_spring.repositores.CategoryRepository;
import com.educandowebender.course_spring.repositores.OrderRepository;
import com.educandowebender.course_spring.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");


        User u1 = new User(null, "Maria Brow", "maria@email.com", "5555555555", "123478888");
        User u2 = new User(null, "joao Brow", "joao@email.com", "666666666", "33333333333");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-20T19:49:07Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-08-20T15:21:07Z"), OrderStatus.CANCELED, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
