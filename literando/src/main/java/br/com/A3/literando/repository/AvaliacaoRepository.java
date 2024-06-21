package br.com.A3.literando.repository;

import br.com.A3.literando.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findByLivroIsbn(String isbn);
}