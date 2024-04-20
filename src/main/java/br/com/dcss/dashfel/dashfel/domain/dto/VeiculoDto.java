package br.com.dcss.dashfel.dashfel.domain.dto;

import br.com.dcss.dashfel.dashfel.domain.enums.Cambio;
import br.com.dcss.dashfel.dashfel.domain.enums.Combustivel;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VeiculoDto {

    private Long id;
    private String nome;
    private String modelo;
    private String cor;
    private String ano;
    private Cambio cambio;
    private Combustivel combustivel;
    private String preco;        

}
