package turistando.turistando.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import turistando.turistando.repository.DespesaRepository;



@RestController
public class DespesaController {

    @Autowired
    private DespesaRepository despesaRepository;

    // @PostMapping("/cadastrardespesa")
    // public DespesaModel cadastrarVeiculo(@RequestBody DespesaModel despesa) {    
    //     return despesaRepository.save(despesa);
    // }

    // @GetMapping("/mostrardespesa")
    // public List<DespesaModel> listaDespesaModel() {
    //     return despesaRepository.findAll();
    // }


}
