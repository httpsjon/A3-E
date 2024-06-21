package br.com.A3.literando.mapper;

import br.com.A3.literando.dto.LivroDTO;
import br.com.A3.literando.model.Livro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {
    LivroDTO toDto(Livro livro);
    Livro toEntity(LivroDTO livroDTO); // Added missing method implementation
}