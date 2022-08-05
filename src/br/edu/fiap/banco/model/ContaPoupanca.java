package br.edu.fiap.banco.model;

import java.io.Serial;

public class ContaPoupanca extends Conta {
    @Serial
    private static final long serialVersionUID = 1L;

    public ContaPoupanca(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            super.saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{
        super.sacar(valor);
    }

    @Override
    public String toString() {
        return String.format(
                "Conta Poupanca(agencia: %d, numero: %d, saldo: %.2f)",
                this.getAgencia(), this.getNumero(), this.getSaldo()
        );
    }
}
