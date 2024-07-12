package escola.secretaria.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controller {

    @GetMapping("")
    public String mensagem(){
        return "Olá Mundo!";
    }

}
