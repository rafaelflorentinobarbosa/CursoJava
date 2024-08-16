package turistando.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import turistando.model.VeiculoModel;
import turistando.repository.VeiculoRepository;

@RestController
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping("/cadastrarveiculo")
    public VeiculoModel cadastrarVeiculo(@RequestBody VeiculoModel veiculo) {    
        return veiculoRepository.save(veiculo);
    }

    @GetMapping("/mostrarveiculo")
    public List<VeiculoModel> listaVeiculoModel() {
        return veiculoRepository.findAll();
    }

    @PutMapping("/modificarveiculo/{id}")
    public VeiculoModel ModificaVeiculo(@PathVariable String id, @RequestBody VeiculoModel veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @DeleteMapping("apagarveiculo/{id}")
    public void apagaVeiculo(@PathVariable String id) {
        veiculoRepository.deleteById(id);
    }
   
}
