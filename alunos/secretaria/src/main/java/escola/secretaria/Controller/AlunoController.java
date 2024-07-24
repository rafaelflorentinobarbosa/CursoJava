package escola.secretaria.Controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import escola.secretaria.Model.Aluno;
import escola.secretaria.Repository.AlunoRepository;

@RestController
public class AlunoController {
    private AlunoRepository alunoRepository;

    @GetMapping("/lista")
    public List<Aluno> lista() {
        return alunoRepository.findAll();
    }

    @GetMapping("/teste")
    public String teste() {
        return "Ta rodando";
    }

    @GetMapping("/inserir")
    public Aluno inserirAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // @GetMapping("/inserirdisciplina")
    // public DisciplinasModel inserirDisciplina(@RequestBody DisciplinasModel disciplinas) {
    //     return DisciplinaRepository.save(disciplinas);
    // }

    
    

}
