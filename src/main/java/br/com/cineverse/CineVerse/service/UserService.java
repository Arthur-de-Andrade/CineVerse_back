package br.com.cineverse.CineVerse.service;

import org.springframework.stereotype.Service;
import java.util.List;

import br.com.cineverse.CineVerse.model.User;
import br.com.cineverse.CineVerse.repository.UserRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Service
public class UserService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserRepository getRepository() {
        return repository;
    }

    public List<User> listarTodos() {
        return repository.findAll();
    }

    public User salvar(User user) {
        return repository.save(user);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public User buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }


}
