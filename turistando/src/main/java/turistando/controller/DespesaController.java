package turistando.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import turistando.model.DespesaModel;
import turistando.repository.DespesaRepository;

@RestController
public class DespesaController {

    @Autowired
    private DespesaRepository despesaRepository;

    @PostMapping("/cadastrardespesa")
    public DespesaModel cadastrarVeiculo(@RequestBody DespesaModel despesa) {    
        return despesaRepository.save(despesa);
    }

    @GetMapping("/mostrardespesa")
    public List<DespesaModel> listaDespesaModel() {
        return despesaRepository.findAll();
    }


}
