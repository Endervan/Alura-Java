package com.enderximenes.workshopmongo.reposity;

import com.enderximenes.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    // gerando consult personalizadas // i => ignora maiscula e minuscula
    @Query("{'title': {$regex: ?0,$options: 'i'}}")
    List<Post> searchTitle(String text);

    // gerando consulta automaticas com spring
    List<Post> findByTitleIsContainingIgnoreCase(String text);

}
