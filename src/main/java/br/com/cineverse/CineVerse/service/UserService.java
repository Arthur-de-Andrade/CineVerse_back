package br.com.cineverse.CineVerse.service;

import br.com.cineverse.CineVerse.model.User;
import br.com.cineverse.CineVerse.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // Listar todos os usuários
    public List<User> listarTodos() {
        return repository.findAll();
    }

    // Buscar usuário por ID
    public Optional<User> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Salvar ou atualizar usuário
    public User salvar(User user) {
        return repository.save(user);
    }

    // Deletar usuário por ID
    public boolean deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}


