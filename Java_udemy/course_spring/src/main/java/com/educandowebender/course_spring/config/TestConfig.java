package com.educandowebender.course_spring.config;

import com.educandowebender.course_spring.entities.*;
import com.educandowebender.course_spring.entities.enums.OrderStatus;
import com.educandowebender.course_spring.repositores.*;
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
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the kings", "hhhhhhhhhhhhhhhhhhhhhhhh", 90.5, "");
        Product p2 = new Product(null, "Smart Tv", "xxxxxxxxxxxxxxx", 2125.5, "");
        Product p3 = new Product(null, "Pc Gamar", "ttttttttttttttttt", 1250.0, "");
        Product p4 = new Product(null, "Ralis for Dummies", "gggggggggggg", 100.99, "");
        Product p5 = new Product(null, "Mac Books", "iiiiiiiiiiiiii", 1100.99, "");


        User u1 = new User(null, "Maria Brow", "maria@email.com", "5555555555", "123478888");
        User u2 = new User(null, "joao Brow", "joao@email.com", "666666666", "33333333333");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-20T19:49:07Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-08-20T15:21:07Z"), OrderStatus.CANCELED, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p3, 1, p4.getPrice());
        OrderItem oi3 = new OrderItem(o2, p3, 2, p1.getPrice());
        OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));

        Payment pay1 = new Payment(null, Instant.parse("2019-07-20T21:49:07Z"), o2);
        o2.setPayment(pay1);

        orderRepository.save(o2);
    }
}
