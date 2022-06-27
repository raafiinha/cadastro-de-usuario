package com.usuario.cadastro.service.validation;

import com.usuario.cadastro.model.Usuario;

public interface UsuarioValidator {

    void beforeCreate(Usuario usuario);

}
