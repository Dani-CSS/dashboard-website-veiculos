package br.com.dcss.dashfel.dashfel.domain.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuarioDto {

    private Long id;
    private String nome;

}
