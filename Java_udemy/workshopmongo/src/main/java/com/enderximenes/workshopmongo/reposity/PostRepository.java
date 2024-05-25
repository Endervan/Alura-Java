package com.enderximenes.workshopmongo.reposity;

import com.enderximenes.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


    // gerando consulta automaticas com spring
    List<Post> findByTitleIsContainingIgnoreCase(String text);

}
