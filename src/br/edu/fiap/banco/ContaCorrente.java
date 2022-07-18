package br.edu.fiap.banco;

public class ContaCorrente extends Conta {
	private String tipo;
	private double chequeEspecial;

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
	public void sacar(double valor) {
		valor += 10;
		super.sacar(valor);
	}

}
