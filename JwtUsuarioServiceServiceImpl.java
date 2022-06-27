package com.usuario.cadastro.security.service;

import com.usuario.cadastro.exception.UnauthorizedCadastroExceptionDefault;
import com.usuario.cadastro.model.Usuario;
import com.usuario.cadastro.security.JwtUserFactory;
import com.usuario.cadastro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class JwtUsuarioServiceServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String email) {
        Usuario usuario = usuarioService
                .getByEmail(email)
                .orElseThrow(() -> {
                    return new UnauthorizedCadastroExceptionDefault("Usuário e/ou senha inválidos");
                });

        return JwtUserFactory.create(usuario);
    }

}
