package br.com.dcss.dashfel.dashfel.domain.model;

import br.com.dcss.dashfel.dashfel.domain.enums.Cambio;
import br.com.dcss.dashfel.dashfel.domain.enums.Combustivel;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Veiculo {
 
    @EqualsAndHashCode.Include
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String modelo;

    @Getter
    @Setter
    private String cor;

    @Getter
    @Setter
    private String ano;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private Cambio cambio;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private Combustivel combustivel;

    @Getter
    @Setter
    private String preco;    
    
}


