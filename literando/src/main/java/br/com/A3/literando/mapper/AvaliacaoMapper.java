package br.com.A3.literando.mapper;

import br.com.A3.literando.dto.AvaliacaoDTO;
import br.com.A3.literando.model.Avaliacao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AvaliacaoMapper {
    @Mapping(source = "livro.id", target = "livroId")
    AvaliacaoDTO toDto(Avaliacao avaliacao);

    @Mapping(source = "livroId", target = "livro.id")
    Avaliacao toEntity(AvaliacaoDTO avaliacaoDTO);
}