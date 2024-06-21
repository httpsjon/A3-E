package br.com.A3.literando.controller;

import br.com.A3.literando.dto.LivroDTO;
import br.com.A3.literando.model.Livro;
import br.com.A3.literando.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @PostMapping
    public LivroDTO cadastrarLivro(@RequestBody Livro livro) {
        return livroService.cadastrarLivro(livro);
    }

    @GetMapping("/{isbn}")
    public LivroDTO buscarLivroPorIsbn(@PathVariable String isbn) {
        return livroService.buscarLivroPorIsbn(isbn);
    }
}
