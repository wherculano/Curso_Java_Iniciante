package br.edu.fiap.banco;

import java.io.Serial;

public class ContaCorrente extends Conta implements Tributavel {

    @Serial
    private static final long serialVersionUID = 1L;
    private String tipo;
    private double chequeEspecial;

    public ContaCorrente(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel() {
        return super.getSaldo() + this.chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        valor += 0.5;
        return super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            super.saldo += valor;
        }
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

}
