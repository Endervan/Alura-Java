package com.enderximenes.workshopmongo.config;

import com.enderximenes.workshopmongo.domain.User;
import com.enderximenes.workshopmongo.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // limpando dados no Mongo
        userRepository.deleteAll();

        User maria = new User(null, "marian", "mariaMaio@email.com");
        User joao = new User(null, "joao", "joao@email.com");
        User charles = new User(null, "charles ", "charles@email.com");

        userRepository.saveAll(Arrays.asList(maria,joao,charles));
    }
}
