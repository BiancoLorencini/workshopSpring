package com.projetoSpringPort.cursoSpring.resources;

import com.projetoSpringPort.cursoSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UseResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@example.com", "999999999", "988888888");

        return ResponseEntity.ok().body(u);
    }
}
