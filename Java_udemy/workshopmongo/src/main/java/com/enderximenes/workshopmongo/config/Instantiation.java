package com.enderximenes.workshopmongo.config;

import com.enderximenes.workshopmongo.domain.Post;
import com.enderximenes.workshopmongo.domain.User;
import com.enderximenes.workshopmongo.dto.AuthorDTO;
import com.enderximenes.workshopmongo.dto.CommentDTO;
import com.enderximenes.workshopmongo.reposity.PostRepository;
import com.enderximenes.workshopmongo.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;


    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        // limpando dados no Mongo
        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "marian", "mariaMaio@email.com");
        User joao = new User(null, "joao", "joao@email.com");
        User charles = new User(null, "charles ", "charles@email.com");
        userRepository.saveAll(Arrays.asList(maria, joao, charles));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viajem", "vou viajar pra sao paulo", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom", "Acordei feliz hoje", new AuthorDTO(maria));

        CommentDTO c1 = new CommentDTO("Boa viajem mano", sdf.parse("21/12/2018"), new AuthorDTO(joao));
        CommentDTO c2 = new CommentDTO("Aproveita", sdf.parse("23/03/2018"), new AuthorDTO(maria));
        CommentDTO c3 = new CommentDTO("Tenha Um otino dia ", sdf.parse("23/03/2018"), new AuthorDTO(joao));

        post1 .getComments().add(c2);
        post2.getComments().addAll(Arrays.asList(c1,c3));

        postRepository.saveAll(Arrays.asList(post1, post2));

        maria.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(maria);
    }
}
