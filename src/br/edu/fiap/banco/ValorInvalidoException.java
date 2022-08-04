package br.edu.fiap.banco;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String msg) {
        super(msg);
    }
}
