package br.com.cineverse.CineVerse.model;

import java.time.LocalDateTime;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "users")

public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataCriacao = LocalDateTime.now();

        //setters 

    public void setId(Long id) { this.id = id;}
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email;}
    public void setSenha(String senha) { this.senha = senha;}
    public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao;}

        //Getters

    public Long getId() {  return id;}
    public String getNome() { return nome;}
    public String getEmail() {   return email;}
    public String getSenha() {  return senha; }
    public LocalDateTime getDataCriacao() {  return dataCriacao; }
}
