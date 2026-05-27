package com.senac.play016.controller;

import com.senac.play016.entidade.Usuario;
import com.senac.play016.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cad-usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping
    public String abrirUsuario(Usuario usuario){
        return "cadastrar-usuario";
    }

    @GetMapping("/admin")
    public String abrirCadAdmin(){
        return "cadastrar-usuario-admin";
    }

    @PostMapping
    public String salvarUsuario(Usuario usuario){
        usuarioRepositorio.save(usuario);
        return "cadastrar-usuario";
    }

}
