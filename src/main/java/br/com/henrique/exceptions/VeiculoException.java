package br.com.henrique.exceptions;

public class VeiculoException extends Exception {

    private static final long serialVersionUID = 1L;

    public VeiculoException(String erro) {
        super(erro);
    }
}
