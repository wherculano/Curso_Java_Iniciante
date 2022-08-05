package br.edu.fiap.banco.model;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String msg) {
        super(msg);
    }
}
