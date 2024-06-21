package br.com.A3.literando.repository;

import br.com.A3.literando.model.Livro; // Corrected import statement
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    Livro findByIsbn(String isbn);
}

