package com.usuario.cadastro.security.service;

import com.usuario.cadastro.exception.UnauthorizedCadastroExceptionDefault;
import com.usuario.cadastro.model.Usuario;
import com.usuario.cadastro.security.UsuarioAuthentication;
import com.usuario.cadastro.security.component.JwtTokenUtil;
import com.usuario.cadastro.service.UsuarioService;
import com.usuario.cadastro.service.component.CodificadorComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationRestServiceProvider implements AuthenticationRestService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private CodificadorComponent codificadorComponent;

    public void createAuthentication(UsuarioAuthentication usuario) throws AuthenticationException {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(usuario.getEmail(), usuario.getSenha());

        try {
            final Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (BadCredentialsException e) {
            throw new UnauthorizedCadastroExceptionDefault("Usuário e/ou senha inválidos");
        }
    }

    public Usuario createAuthenticationToken(UsuarioAuthentication usuarioAuthentication) throws AuthenticationException {
        return usuarioService.updateToken(usuarioAuthentication);
    }

}
