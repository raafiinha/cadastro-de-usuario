package com.usuario.cadastro.security.controller;

import com.usuario.cadastro.api.v1.usuario.controller.UsuarioController;
import com.usuario.cadastro.model.Usuario;
import com.usuario.cadastro.security.JwtAuthenticationRequest;
import com.usuario.cadastro.security.service.AuthenticationRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class AuthenticationRestController {

    @Autowired
    private AuthenticationRestService authenticationRestService;

    @RequestMapping(value = "${jwt.route.authentication.path}", method = RequestMethod.POST)
    public ResponseEntity<Resource<Usuario>> createAuthenticationToken(@RequestBody JwtAuthenticationRequest authenticationRequest) throws AuthenticationException {
        return ResponseEntity.ok(new Resource<>(authenticationRestService.createAuthenticationToken(authenticationRequest), linkTo(UsuarioController.class).withSelfRel()));
    }

}
