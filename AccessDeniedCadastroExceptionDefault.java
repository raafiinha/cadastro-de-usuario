package com.usuario.cadastro.exception;

public class AccessDeniedCadastroExceptionDefault extends CadastroExceptionDefault implements CadastroException {

    public AccessDeniedCadastroExceptionDefault(String message) {
        super(message);
    }

}
