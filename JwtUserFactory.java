package com.usuario.cadastro.security;

import com.usuario.cadastro.model.Usuario;
import com.usuario.cadastro.util.LocalDateUtil;

import java.util.ArrayList;
import java.util.Date;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(Usuario usuario) {

        return new JwtUser(
                usuario.getId(),
                usuario.getEmail(),
                usuario.getNome(),
                usuario.getToken(),
                usuario.getSenha(),
                new ArrayList<>(),
                true,
                usuario.getUltimoLogin()
        );
    }

}
