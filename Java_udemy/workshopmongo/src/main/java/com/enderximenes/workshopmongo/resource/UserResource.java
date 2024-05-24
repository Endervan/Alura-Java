package com.enderximenes.workshopmongo.resource;


import com.enderximenes.workshopmongo.domain.User;
import com.enderximenes.workshopmongo.dto.UserDTO;
import com.enderximenes.workshopmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll() {

        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(UserDTO::new).toList();
        return ResponseEntity.ok().body(listDto);
    }

    // @PathVariable  faz casamento entre "/{id}" e id da funcao abaixo
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {
       User obj = service.findById(id);
        return ResponseEntity.ok().body(new UserDTO(obj));
    }


    @RequestMapping( method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody UserDTO objDto) {
       User obj = service.fromDTO(objDto);
       obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri(); // url do novo recurso criado
        return ResponseEntity.created(uri).build();
    }
}
