package br.com.henrique.exceptions;

public class UsuarioException extends Exception {

    private static final long serialVersionUID = 1L;

    public UsuarioException(String erro) {
        super(erro);

    }
}
