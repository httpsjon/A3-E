package br.com.A3.literando.dto;

import lombok.Data;

@Data
public class AvaliacaoDTO {
    private Long id;
    private int nota;
    private String comentario;
    private Long livroId;
}