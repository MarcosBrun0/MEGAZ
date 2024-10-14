package com.redesocial.redesocial.models;

import org.springframework.data.jpa.repository.JpaRepository;
import com.redesocial.redesocial.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
