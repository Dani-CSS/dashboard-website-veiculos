package br.com.dcss.dashfel.dashfel.service;

import java.util.List;

import br.com.dcss.dashfel.dashfel.domain.dto.VeiculoDto;

public interface VeiculoService {

    List<VeiculoDto> findAll();

    VeiculoDto findById(Long id) throws Exception;

    VeiculoDto saveOrUpdate(VeiculoDto veiculo);

    void delete(Long id);


    /* private Quarto localProcurarPeloId(String id){
        Optional<Quarto> quarto = getQuartoRepository().findById(id);
        return quarto.orElseThrow(() ->  new ModeloNaoEncontradoExcepetion(String.format("Objeto de id %s não encontrado", id)));
    } */
    
}
