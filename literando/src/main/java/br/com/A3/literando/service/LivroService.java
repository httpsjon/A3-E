package br.com.A3.literando.service;

import br.com.A3.literando.dto.LivroDTO;
import br.com.A3.literando.mapper.LivroMapper;
import br.com.A3.literando.model.Livro;
import br.com.A3.literando.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private LivroMapper livroMapper;

    public LivroDTO cadastrarLivro(Livro livro2) {
        Livro livro = livroMapper.toEntity(livro2);
        Livro salvo = livroRepository.save(livro);
        return livroMapper.toDto(salvo);
    }

    public LivroDTO buscarLivroPorIsbn(String isbn) {
        Livro livro = livroRepository.findByIsbn(isbn);
        return livroMapper.toDto(livro);
    }}

