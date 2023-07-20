package br.com.henrique.exceptions;

public class EnderecoException extends Exception {

    private static final long serialVersionUID = 1L;

    public EnderecoException(String erro) {
        super(erro);
    }

}
