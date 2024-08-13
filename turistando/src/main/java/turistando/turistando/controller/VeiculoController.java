package turistando.turistando.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import turistando.turistando.model.VeiculoModel;
import turistando.turistando.repository.VeiculoRepository;


@RestController
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping("/cadastrarveiculo")
    public VeiculoModel cadastrarVeiculo(@RequestBody VeiculoModel veiculo) {    
        return veiculoRepository.save(veiculo);
    }

    @GetMapping("/mostrarVeiculo")
    public List<VeiculoModel> listaVeiculoModel() {
        return veiculoRepository.findAll();
    }
    

}
