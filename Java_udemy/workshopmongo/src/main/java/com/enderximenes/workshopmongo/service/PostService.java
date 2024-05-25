package com.enderximenes.workshopmongo.service;

import com.enderximenes.workshopmongo.domain.Post;
import com.enderximenes.workshopmongo.reposity.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository post;

    public Post findById(String id) {
        Optional<Post> user = post.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto Não Encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return post.searchTitle(text);
    }

}
