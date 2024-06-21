package br.com.A3.literando.controller;

import br.com.A3.literando.dto.AvaliacaoDTO;
import br.com.A3.literando.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {
    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping
    public AvaliacaoDTO avaliarLivro(@RequestParam String isbn, @RequestParam int nota, @RequestParam String comentario) {
        return avaliacaoService.avaliarLivro(isbn, nota, comentario);
    }

    @GetMapping
    public List<AvaliacaoDTO> visualizarAvaliacoes(@RequestParam(required = false) String isbn) {
        return avaliacaoService.visualizarAvaliacoes(isbn);
    }
}