package turistando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import turistando.model.AbastecimentoModel;
import turistando.repository.AbastecimentoRepository;

@Service
public class VeiculoServices {

    // @Autowired
    // private VeiculoRepository veiculoRepository;

    @Autowired
    private AbastecimentoRepository abastecimentoRepository;

    public double ConsumoMedio(String placa) throws Exception {

      List<AbastecimentoModel> abastecimentos = abastecimentoRepository.findAll();

      if(abastecimentos.isEmpty() || abastecimentos.size() < 2){
        throw new Exception("Precisa de no mínimo 2 abastecimentos para calcular a média de consumo.");
      }

        return 0;


    }

}
