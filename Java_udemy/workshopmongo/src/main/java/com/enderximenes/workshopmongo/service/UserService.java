package com.enderximenes.workshopmongo.service;

import com.enderximenes.workshopmongo.domain.User;
import com.enderximenes.workshopmongo.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
