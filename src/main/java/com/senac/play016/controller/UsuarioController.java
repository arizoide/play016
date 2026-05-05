package com.senac.play016.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UsuarioController {

    @GetMapping("/cad-usuario")
    public String abrirUsuario(@PathVariable String nome){
        return "cadastrar-usuario";
    }

}
