package br.com.A3.literando.dto;

import lombok.Data;

@Data
public class LivroDTO {
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private String genero;
}