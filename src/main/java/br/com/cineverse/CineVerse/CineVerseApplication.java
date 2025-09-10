package br.com.cineverse.CineVerse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.cineverse.CineVerse.model")
@EnableJpaRepositories(basePackages = "br.com.cineverse.CineVerse.repository")
public class CineVerseApplication {
    public static void main(String[] args) {
        SpringApplication.run(CineVerseApplication.class, args);
    }
}


