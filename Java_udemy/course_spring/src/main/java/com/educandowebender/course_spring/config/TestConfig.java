package com.educandowebender.course_spring.config;

import com.educandowebender.course_spring.entities.User;
import com.educandowebender.course_spring.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria Brow","maria@email.com","5555555555","123478888");
        User u2 = new User(null,"joao Brow","joao@email.com","666666666","33333333333");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
