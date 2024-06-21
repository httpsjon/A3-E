package br.com.A3.literando.service;

import br.com.A3.literando.dto.AvaliacaoDTO;
import br.com.A3.literando.mapper.AvaliacaoMapper;
import br.com.A3.literando.model.Avaliacao;
import br.com.A3.literando.model.Livro;
import br.com.A3.literando.repository.AvaliacaoRepository;
import br.com.A3.literando.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private AvaliacaoMapper avaliacaoMapper;

    public AvaliacaoDTO avaliarLivro(String isbn, int nota, String comentario) {
        Livro livro = livroRepository.findByIsbn(isbn);
        if (livro != null) {
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.setNota(nota);
            avaliacao.setComentario(comentario);
            avaliacao.setLivro(livro);
            Avaliacao salvo = avaliacaoRepository.save(avaliacao);
            return avaliacaoMapper.toDto(salvo);
        } else {
            throw new RuntimeException("Livro não encontrado!");
        }
    }

    public List<AvaliacaoDTO> visualizarAvaliacoes(String isbn) {
        List<Avaliacao> avaliacoes;
        if (isbn.isEmpty()) {
            avaliacoes = avaliacaoRepository.findAll();
        } else {
            avaliacoes = avaliacaoRepository.findByLivroIsbn(isbn);
        }
        return avaliacoes.stream().map(avaliacaoMapper::toDto).collect(Collectors.toList());
    }
}