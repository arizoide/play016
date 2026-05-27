package com.senac.play016.repositorio;

import com.senac.play016.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends
        JpaRepository<Usuario, Integer> {
}
