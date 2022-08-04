package br.edu.fiap.banco;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
