package br.com.dcss.dashfel.dashfel.service.impl;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import br.com.dcss.dashfel.dashfel.domain.dto.VeiculoDto;
import br.com.dcss.dashfel.dashfel.domain.model.Veiculo;
import br.com.dcss.dashfel.dashfel.repository.VeiculoRepository;
import br.com.dcss.dashfel.dashfel.service.VeiculoService;
import lombok.Getter;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Getter
    private VeiculoRepository veiculoRepository;
    
    public VeiculoServiceImpl(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public List<VeiculoDto> findAll() {       
        List<Veiculo> veiculos = getVeiculoRepository().findAll();
        return veiculos.stream().map(veiculo -> entidadeParaDto(veiculo)).toList();
    }

    @Override
    public VeiculoDto findById(Long id) throws Exception {
        return entidadeParaDto(getVeiculoRepository().findById(id).orElseThrow(()-> new Exception("Objeto não encontrado")));
    }

    @Override
    public VeiculoDto saveOrUpdate(VeiculoDto veiculo) {
        return null;
    }

    @Override
    public void delete(Long id) {                
    }
    
    private VeiculoDto entidadeParaDto(Veiculo veiculo){
        return VeiculoDto.builder()
            .id(veiculo.getId())
            .nome(veiculo.getNome())
            .modelo(veiculo.getModelo())
            .cor(veiculo.getCor())
            .ano(veiculo.getAno())
            .cambio(veiculo.getCambio())
            .combustivel(veiculo.getCombustivel())
            .preco(veiculo.getPreco()) 
            .build();
    }
}
