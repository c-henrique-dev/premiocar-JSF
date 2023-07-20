package br.com.henrique.exceptions;

public class ReservaException extends Exception {

    private static final long serialVersionUID = 1L;

    public ReservaException(String erro) {
        super(erro);
    }

}
