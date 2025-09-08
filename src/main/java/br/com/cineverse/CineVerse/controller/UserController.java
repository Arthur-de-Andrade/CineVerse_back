package br.com.cineverse.CineVerse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cineverse.CineVerse.model.User;
import br.com.cineverse.CineVerse.service.UserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    UserService service;
    
    @GetMapping
    public List<User> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public User criar(@RequestBody User usuario) {
        return service.salvar(usuario);
    }

    @GetMapping("/{id}")
    public User buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

}
