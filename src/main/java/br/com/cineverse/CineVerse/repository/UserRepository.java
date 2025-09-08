package br.com.cineverse.CineVerse.repository;

import org.springframework.stereotype.Repository;

import br.com.cineverse.CineVerse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

}
