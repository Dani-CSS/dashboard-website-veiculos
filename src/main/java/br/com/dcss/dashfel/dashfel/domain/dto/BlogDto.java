package br.com.dcss.dashfel.dashfel.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BlogDto {

    private Long id;
    private int data;
    private String titulo;
    private String conteudo;      

}
