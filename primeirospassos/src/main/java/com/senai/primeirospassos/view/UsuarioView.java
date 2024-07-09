package com.senai.primeirospassos.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.senai.primeirospassos.model.Usuario;
import com.sun.source.doctree.SystemPropertyTree;

@Repository
public class UsuarioView {

    public void save(Usuario usuario){
        System.out.println("Salvar - Recebendo um novo usuário");
        System.out.println(usuario);
    }

    public List<Usuario> listAll(){
        List <Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario ("Damarcones", "1234"));
        return usuarios;
    }
}
