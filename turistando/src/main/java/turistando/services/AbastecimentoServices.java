package turistando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import turistando.model.AbastecimentoModel;
import turistando.model.VeiculoModel;
import turistando.repository.AbastecimentoRepository;
import turistando.repository.VeiculoRepository;

@Service
public class AbastecimentoServices {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private AbastecimentoRepository abastecimentoRepository;
    
    public AbastecimentoModel registrarAbastecimento(AbastecimentoModel abastecimento) throws Exception {


  
    if (abastecimento.getPlaca() == null) {
        throw new Exception("Veículo não informado ou inválido.");
    }   
    
    List <VeiculoModel> veiculos = veiculoRepository.findAll();

    for (VeiculoModel veiculo : veiculos) {
        if (veiculo.getPlaca().equals(abastecimento.getPlaca())) {
            veiculo.setAbastecimentos(abastecimento);
            
            return abastecimentoRepository.save(abastecimento);
        }
        else{
            throw new Exception("Veículo não informado ou inválido.");
        }
    }

    return abastecimentoRepository.save(abastecimento);

    }

}
