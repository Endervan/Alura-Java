package com.enderximenes.workshopmongo.reposity;

import com.enderximenes.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    // gerando consult personalizadas // i => ignora maiscula e minuscula
    @Query("{'title': {$regex: ?0,$options: 'i'}}")
    List<Post> searchTitle(String text);

    // gerando consulta automaticas com spring
    List<Post> findByTitleIsContainingIgnoreCase(String text);

    @Query("{$and: [{date:{$gte:?1 }},{date:{$lte:?2 }},{$or: [{'title': {$regex: ?0,$options: 'i'}},{'body': {$regex: ?0,$options: 'i'}},{'comments.texto': {$regex: ?0,$options: 'i'}}]}]}")
    List<Post> fullSearch(String text, Date minDate, Date maxDate);

}
