package br.edu.fiap.banco;

public class ContaPoupanca extends Conta {
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
}
