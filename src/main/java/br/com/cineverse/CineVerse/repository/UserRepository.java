package br.com.cineverse.CineVerse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cineverse.CineVerse.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository já fornece métodos básicos: findAll, findById, save, deleteById, existsById
}

