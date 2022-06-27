package com.usuario.cadastro.security.service;

import com.usuario.cadastro.model.Usuario;
import com.usuario.cadastro.security.UsuarioAuthentication;
import org.springframework.security.core.AuthenticationException;

public interface AuthenticationRestService {

    void createAuthentication(UsuarioAuthentication usuario) throws AuthenticationException;

    Usuario createAuthenticationToken(UsuarioAuthentication usuarioAuthentication) throws AuthenticationException;

}
