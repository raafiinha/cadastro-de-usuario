package com.usuario.cadastro.service;

import com.usuario.cadastro.model.Usuario;
import com.usuario.cadastro.security.UsuarioAuthentication;

import java.util.Optional;

public interface UsuarioService {

    Usuario create(Usuario usuario);

    Usuario updateToken(UsuarioAuthentication usuarioAuthentication);

    Usuario getByEmailESenha(String email, String senha);

    Integer countByEmail(String email);

    Optional<Usuario> getByEmail(String email);

    Optional<Usuario> getUsuarioLogado();

    void validarTokenGravado(String email, String authToken);
